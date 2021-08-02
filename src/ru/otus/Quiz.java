package ru.otus;

public class Quiz {
    private static QuizGenerator quizGenerator;
    private static QuizService quizService;

    /**
     *
     */
    private static void init(){
        quizGenerator = new QuizGenerator();
        quizService = new QuizService();
    }


    public static void main(String[] args) {

        init();

        System.out.println("Добро пожаловать! Введите Ваше имя что бы начать!");
        quizService.setPlayerName(quizGenerator.getInput().nextLine());

        while (true) {
            quizGenerator.quiz();

            System.out.println("\n Что бы выйти введите \"Q\" или что либо другое для повтора");
            if (quizGenerator.getInput().next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }
    }
}
