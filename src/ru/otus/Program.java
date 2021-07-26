package ru.otus;

public class Program {
    public static String name;

    public static void main(String[] args) {

        QuizGenerator quiz = new QuizGenerator();

        System.out.println("Мини векторина!");
        System.out.println("Введите Ваше имя что бы начать!");
        name = quiz.input.nextLine();

        while (true) {
            quiz.quiz(QuestionGenerator.stepOne);
            quiz.quiz(QuestionGenerator.stepTwo);
            quiz.quiz(QuestionGenerator.stepThree);
            quiz.result();

            System.out.println("Что бы выйти введите \"Q\" или что либо другое для повтора");
            if (quiz.input.next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }

    }
}
