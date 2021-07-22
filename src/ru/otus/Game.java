package ru.otus;

public class Game {

    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        System.out.println("Введите \"start\" что бы начать!");

        if (quiz.input.next().equals("start")) {
            QuestionGenerator stepOne = new QuestionGenerator(Questions.trueFirst, Questions.questionOne, Questions.answerOptionsFirst);
            quiz.quiz(stepOne);
            quiz.result();
        } else {
            System.out.println("Как хотите.");
        }


    }
}
