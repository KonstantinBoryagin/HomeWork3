package ru.otus;

public class Program {

    public static void main(String[] args) {

        QuizGenerator quiz = new QuizGenerator();


        System.out.println("Мини векторина!");
        System.out.println("Введите \"start\" что бы начать!");

        while (!quiz.input.next().equalsIgnoreCase("stop")) {
            //if (quiz.input.next().equalsIgnoreCase("start")) {
                quiz.quiz(QuestionGenerator.stepOne);
                quiz.quiz(QuestionGenerator.stepTwo);
                quiz.quiz(QuestionGenerator.stepThree);
                quiz.result();

           /* } else {
                System.out.println("Как хотите.");
            }*/
        }

    }
}
