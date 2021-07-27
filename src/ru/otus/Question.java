package ru.otus;

public enum Question {
    QUESTION_ONE (3, "Сколько примитивных типов данных в Java?",
            new String[]{"1.  Десять", "2.  Пять", "3.  Восемь"}),
    QUESTION_TWO (4, "Какой из советских фильмов получил Оскар?",
            new String[] {"1.  Кин-Дза-Дза","2.  Сталкер", "3.  Солярис", "4.  Москва слезам не верит"}),
    QUESTION_THREE (1, "Чем является Milky Way",
            new String[] {"1.  Галактика", "2.  Скопление звёзд", "3.  Парад планет", "4.  Солнечная система", "5.  Шоколодка"});


    private int correct;
    private String question;
    private String[] answerOptions;

    Question (int correct, String question, String[] answerOptions) {
        this.correct = correct;
        this.question = question;
        this.answerOptions = answerOptions;
    }
}
