package ru.otus;

public enum Question {
    QUESTION_ONE (3, "Сколько примитивных типов данных в Java?",
            new String[] {"Десять", "Пять", "Восемь"}),
    QUESTION_TWO (4, "Какой из советских фильмов получил Оскар?",
            new String[] {"Кин-Дза-Дза","Сталкер", "Солярис", "Москва слезам не верит"}),
    QUESTION_THREE (1, "Чем является Milky Way",
            new String[] {"Галактика", "Скопление звёзд", "Парад планет", "Солнечная система", "Шоколодка"});


    private final int correct;
    private final String question;
    private final String[] answerOptions;

    Question (int correct, String question, String[] answerOptions) {
        this.correct = correct;
        this.question = question;
        this.answerOptions = answerOptions;
    }

    public void printQuestion() {
        System.out.println("\n" + question);
        int formatOutput = 0;
        for (int i = 0; i < answerOptions.length; i++) {
            System.out.printf("%3d"+ ". " + "%-20s", (i + 1), answerOptions[i]);
            formatOutput++;
            if (formatOutput % 2 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public int answerOptionsLength() {
        return answerOptions.length;
    }

    public int getCorrect() {
        return correct;
    }

    public String[] getAnswerOptions() {
        return answerOptions;
    }
}
