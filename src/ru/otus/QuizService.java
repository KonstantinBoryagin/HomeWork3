package ru.otus;

import java.util.ArrayList;

public class QuizService {
    static int countOfCorrect;
    static ArrayList<String> answers = new ArrayList<>();

    static void saveAnswers(int answer, QuestionGenerator question) {
        if (answer == question.trueAnswer) {
            answers.add("верно " + question.answerOptions[question.trueAnswer - 1]);
            countOfCorrect++;
        } else {
            answers.add("не верно, правильный ответ - " + question.answerOptions[question.trueAnswer - 1]);
        }
    }

    static void checkAnswers() {
        System.out.println("");
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + "-й ответ -- " + answers.get(i));
        }
    }

    static void resultOfGame() {
        System.out.println("\nИтого верных ответов - " + countOfCorrect);
        switch (countOfCorrect) {
            case 1:
                System.out.println(Program.name + ", отлично, на " + calculateResult() + "% правильно");
                break;
            case 2:
                System.out.println(Program.name + ", хорошо, на " + calculateResult() + "% правильно");
                break;
            case 3:
                System.out.println(Program.name + ", ужасно, на " + calculateResult() + "% правильно");
                break;
            default:
                System.out.println(Program.name + ", не отчаивайтесь");
        }
    }

    private static int calculateResult(){
        int countAll = QuestionGenerator.countOfQuestions;
        return (countOfCorrect * 100)/countAll;
    }
}
