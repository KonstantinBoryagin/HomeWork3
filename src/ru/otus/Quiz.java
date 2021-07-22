package ru.otus;

import java.util.Scanner;

public class Quiz {
    static int countOfCorrect;
    static String[] results = new String[5];
    static int countForResults;

  Scanner input = new Scanner(System.in);

  public void quiz (QuestionGenerator question) {
      System.out.println(question.question);
      for (String elem : question.answerOptions) {
          System.out.println(elem);
      }
      System.out.print("Введите номер ответа - ");
      int answer = input.nextInt();
      if (answer == question.trueAnswer) {
          countOfCorrect++;
          results[countForResults] = "верно - " + question.answerOptions[question.trueAnswer - 1];
          countForResults++;
      } else {
          results[countForResults] = "не верно, правильный ответ - " + question.answerOptions[question.trueAnswer - 1];
          countForResults++;
      }
  }

    public void result() {
        System.out.println("Конец! Правильных ответов - " + countOfCorrect);
        for (int i = 0; i < countForResults; i++) {
            System.out.println((i + 1) + "-й ответ - " + results[i]);
        }
    }



}
