package ru.otus;

import java.util.Scanner;

public class QuizGenerator {
    private int playerAnswer;
    Scanner input = new Scanner(System.in);

    public void quiz(Question question) {
        question.printQuestion();
        System.out.print("Введите номер ответа - ");

        while (true) {
            if (input.hasNextInt()) {
                playerAnswer = input.nextInt();
                if (playerAnswer > 0 && playerAnswer <= question.answerOptionsLength()) {
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
        System.out.println("\n Конец!");
        QuizService.resultOfGame();
        System.out.println("\n Введите \"S\" для отображения статистики, либо что угодно для продолжения");
        if (input.next().equalsIgnoreCase("S")){
            QuizService.checkAnswers();
        } else {

        }

    }
}
