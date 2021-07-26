package ru.otus;

import java.util.Scanner;

public class QuizGenerator {
    private int playerAnswer;
    Scanner input = new Scanner(System.in);

    public void quiz(QuestionGenerator question) {
        System.out.println("\n" + question.question);
        for (String elem : question.answerOptions) {
            System.out.println(elem);
        }
        System.out.print("Введите номер ответа - ");

        if (input.hasNextInt()) {
            playerAnswer = input.nextInt();
            QuizService.saveAnswers(playerAnswer, question);
            return;
        } else {
            System.out.println("Это даже не цифра, попытайтесь в следующий раз");

        }
    }


    public void result() {
        System.out.println("Конец!");
        QuizService.resultOfGame();
        QuizService.checkAnswers();
    }
}
