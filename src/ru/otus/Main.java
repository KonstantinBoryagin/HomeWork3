package ru.otus;

import java.util.Scanner;

public class Main {
    static int answerOne;
    static int answerTwo;

  /*  static void firstQuestion() {
        for (String element : Questions.questionTwo) {
            System.out.println(element);
        }
        answerTwo = input.nextInt();
    }*/

    public static void main(String[] args) {
        int countOfCorrect;
        Scanner input = new Scanner(System.in);
        System.out.println("Нажмите Enter что бы начать!");
        if (input.hasNext()) {
            System.out.println("123");
        }


        for (String element : Questions.questionTwo) {
            System.out.println(element);
        }
        answerTwo = input.nextInt();

    }
}
