package ru.otus;

import java.util.Scanner;

public class QuizGenerator {
    private static int countOfQuestions;
    private final Scanner input = new Scanner(System.in);
    private final UserAnswersProcessing userAnswersProcessing = new UserAnswersProcessing();
    private final QuizService quizService = new QuizService();

    public Scanner getInput() {
        return input;
    }

    public void quiz() {
        askQuestions();
        resultForQuiz();
        displayAnswerStatistic();
        resetCounters();
    }

    private void askQuestions() {
        Question[] questionsArray = Question.values();
        for (int i = 0; i < questionsArray.length; i++) {
            Question question = Question.values()[i];
            qenerateQuestion(question);
            countOfQuestions++;
        }
    }

    private void qenerateQuestion(Question question) {
        question.printQuestion();
        System.out.print("Введите номер ответа - ");

        checkPlayerAnswers(question);
    }

    private void checkPlayerAnswers(Question question) {
        while (true) {
            if (input.hasNextInt()) {
                int playerAnswer = input.nextInt();
                if (playerAnswer > 0 && playerAnswer <= question.answerOptionsLength()) {
                    userAnswersProcessing.saveAnswers(playerAnswer, question);
                    return;
                }
                System.out.println("Такого варианта ответа нет, введите номер ответа еще раз!");
                continue;
            } else {
                System.out.println(input.next() + " - это даже не цифра, давайте попробуем еще раз!");
            }
        }
    }

    private void resultForQuiz() {
        System.out.println("\n Конец!");
        quizService.resultOfGame();
    }

    private void displayAnswerStatistic() {
        System.out.println("\n Введите \"S\" для отображения статистики, либо что угодно для продолжения");
        if (input.next().equalsIgnoreCase("S")){
            userAnswersProcessing.checkAnswers();
        }
    }

    private void resetCounters() {
        userAnswersProcessing.clearArrayListWithPlayerAnswers();
        userAnswersProcessing.resetCountOfCorrect();
    }

    public static int getCountOfQuestions() {
        return countOfQuestions;
    }
}
