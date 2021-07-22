package ru.otus;

import java.util.ArrayList;

public class Answers {
    static int countOfCorrect;
    static ArrayList<String> answers = new ArrayList<>();


    static void saveAnswers(int answer, QuestionGenerator question) {
        if (answer == question.trueAnswer) {
            answers.add("верно" + question.answerOptions[question.trueAnswer - 1]);
            countOfCorrect++;
        } else {
            answers.add("не верно, правильный ответ - " + question.answerOptions[question.trueAnswer - 1]);
        }
    }

    static void checkAnswers() {
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + "-й ответ -- " + answers.get(i));
        }
    }

    static void resultOfGame() {
        System.out.print("\nИтого верных ответов - " + countOfCorrect);
        switch (countOfCorrect) {
            case 1:
                System.out.println("Отлично на " + calculateResult() + " правильно");
        }
    }

    static String calculateResult(){
        int countAll = QuestionGenerator.countOfQuestions;
        return (countAll/countOfCorrect) * 100 + "%";
    }
}
