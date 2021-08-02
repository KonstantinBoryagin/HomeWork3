package ru.otus;


public class Quiz {
    public static String name;

    public static void main(String[] args) {

        QuizGenerator quiz = new QuizGenerator();
        QuestionGenerator questionGenerator = new QuestionGenerator();

        System.out.println("Мини векторина!");
        System.out.println("Введите Ваше имя что бы начать!");
        name = quiz.input.nextLine();

        while (true) {
            quiz.quiz(questionGenerator.questionOne);
            quiz.quiz(questionGenerator.questionTwo);
            quiz.quiz(questionGenerator.questionThree);
            quiz.result();
            quiz.resetCounters();

            System.out.println("\n Что бы выйти введите \"Q\" или что либо другое для повтора");
            if (quiz.input.next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }
    }
}
