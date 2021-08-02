package ru.otus;

public class Quiz {

    public static void main(String[] args) {

        QuizGenerator quizGenerator = new QuizGenerator();
        QuizService quizService = new QuizService();

        System.out.println("Добро пожаловать! Введите Ваше имя что бы начать!");
        quizService.setPlayerName(quizGenerator.input.nextLine());

        while (true) {
            quizGenerator.quiz();

            System.out.println("\n Что бы выйти введите \"Q\" или что либо другое для повтора");
            if (quizGenerator.input.next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }
    }
}
