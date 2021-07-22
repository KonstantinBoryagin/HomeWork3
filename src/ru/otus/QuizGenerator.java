package ru.otus;

import java.util.Scanner;

public class QuizGenerator {



  Scanner input = new Scanner(System.in);

  public void quiz (QuestionGenerator question) {
      System.out.println(question.question);
      for (String elem : question.answerOptions) {
          System.out.println(elem);
      }
      System.out.print("Введите номер ответа - ");
      Answers.saveAnswers(input.nextInt(), question);
  }

    public void result() {
        System.out.println("Конец!");

    }



}
