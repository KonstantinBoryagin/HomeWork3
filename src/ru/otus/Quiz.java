package ru.otus;

public class Quiz {

    public static void main(String[] args) {

        QuizGenerator quizGenerator = new QuizGenerator();
        QuestionGenerator questionGenerator = new QuestionGenerator();
        QuizService quizService = new QuizService();

        System.out.println("Мини векторина!");
        System.out.println("Введите Ваше имя что бы начать!");
        quizService.setPlayerName(quizGenerator.input.nextLine());

        while (true) {
            quizGenerator.quiz(questionGenerator.questionOne);
            quizGenerator.quiz(questionGenerator.questionTwo);
            quizGenerator.quiz(questionGenerator.questionThree);
            quizGenerator.result();
            quizGenerator.resetCounters();

            System.out.println("\n Что бы выйти введите \"Q\" или что либо другое для повтора");
            if (quizGenerator.input.next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }
    }
}
