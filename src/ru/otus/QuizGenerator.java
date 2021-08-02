package ru.otus;

import java.util.Scanner;

public class QuizGenerator {
    private int playerAnswer;
    Scanner input = new Scanner(System.in);
    QuizService quizService = new QuizService();

    public void askQuestion(Question question) {
        question.printQuestion();
        System.out.print("Введите номер ответа - ");

        playerInputValidation(question);
    }

    public void resultForQuiz() {
        System.out.println("\n Конец!");
        quizService.resultOfGame();
    }

    public void resetCounters() {
        quizService.clearArrayListWithPlayerAnswers();
        quizService.resetCountOfCorrect();
    }

    private void playerInputValidation(Question question) {
        while (true) {
            if (input.hasNextInt()) {
                playerAnswer = input.nextInt();
                if (playerAnswer > 0 && playerAnswer <= question.answerOptionsLength()) {
                    quizService.saveAnswers(playerAnswer, question);
                    return;
                }
                System.out.println("Такого варианта ответа нет, введите номер ответа еще раз!");
                continue;
            } else {
                System.out.println(input.next() + " - это даже не цифра, давайте попробуем еще раз!");
            }
        }
    }

    public void displayAnswerStatistic() {
        System.out.println("\n Введите \"S\" для отображения статистики, либо что угодно для продолжения");
        if (input.next().equalsIgnoreCase("S")){
            quizService.checkAnswers();
        }
    }
}
