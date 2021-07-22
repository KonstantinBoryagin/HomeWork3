package ru.otus;

public class Program {

    public static void main(String[] args) {

        QuizGenerator quiz = new QuizGenerator();
        QuestionGenerator stepOne = new QuestionGenerator(Questions.trueFirst, Questions.questionOne, Questions.answerOptionsFirst);
        QuestionGenerator stepTwo = new QuestionGenerator(Questions.trueSecond, Questions.questionTwo, Questions.answerOptionsSecond);
        QuestionGenerator stepThree = new QuestionGenerator(Questions.trueThird, Questions.questionThree, Questions.answerOptionsThird);

        System.out.println("Мини векторина!");
        System.out.println("Введите \"start\" что бы начать!");

        if (quiz.input.next().equals("start")) {
            quiz.quiz(stepOne);
            quiz.quiz(stepTwo);
            quiz.quiz(stepThree);
            quiz.result();
        } else {
            System.out.println("Как хотите.");
        }


    }
}
