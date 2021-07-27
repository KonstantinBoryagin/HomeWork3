package ru.otus;

import java.util.Arrays;

public enum Question {
    QUESTION_ONE (3, "Сколько примитивных типов данных в Java?",
            new String[] {"Десять", "Пять", "Восемь"}),
    QUESTION_TWO (4, "Какой из советских фильмов получил Оскар?",
            new String[] {"Кин-Дза-Дза","Сталкер", "Солярис", "Москва слезам не верит"}),
    QUESTION_THREE (1, "Чем является Milky Way",
            new String[] {"Галактика", "Скопление звёзд", "Парад планет", "Солнечная система", "Шоколодка"});


    private int correct;
    private String question;
    private String[] answerOptions;

    Question (int correct, String question, String[] answerOptions) {
        this.correct = correct;
        this.question = question;
        this.answerOptions = answerOptions;
    }

    public void printQuestion() {
        System.out.println(question);
        int formater = 0;
        for (int i = 0; i < answerOptions.length; i++) {
            System.out.printf("%3d"+ ". " + "%-20s", i + 1, answerOptions[i]);
            formater++;
            if (formater % 2 == 0) {
                System.out.println();
            }
        }
        //System.out.println();
    }

//    private int maxLength(String[] answerOptions) {
//        int maxLength = 0;
//        for (String string : answerOptions) {
//            if (string.length() > maxLength) {
//                maxLength = string.length();
//            }
//        }
//        return maxLength;
//    }

    @Override
    public String toString() {
        return question + "\n" + Arrays.toString(answerOptions);
    }
    public int getCorrect() {
        return correct;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswerOptions() {
        return answerOptions;
    }
}
