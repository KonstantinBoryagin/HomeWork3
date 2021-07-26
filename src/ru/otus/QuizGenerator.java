package ru.otus;

import java.sql.SQLOutput;
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

        while (true) {
            if (input.hasNextInt()) {
                playerAnswer = input.nextInt();
                if (playerAnswer > 0 && playerAnswer <= question.answerOptions.length) {
                    QuizService.saveAnswers(playerAnswer, question);
                    return;
                }
                System.out.println("Такого варианта ответа нет, введите номер ответа еще раз!");
                continue;
            } else {
                System.out.println(input.next() + " - это даже не цифра, давайте попробуем еще раз!");
            }
        }
    }


    public void result() {
        System.out.println("Конец!");
        QuizService.resultOfGame();
        QuizService.checkAnswers();
    }
}
