package ru.otus;

import java.util.ArrayList;

public class QuizService {
    static int countOfCorrect;
    static ArrayList<String> answers = new ArrayList<>();

    static void saveAnswers(int answer, Question question) {
        if (answer == question.getCorrect()) {
            answers.add("правильно - " + "\"" + question.getAnswerOptions()[question.getCorrect() - 1] + "\"");
            countOfCorrect++;
        } else {
            answers.add("ошибка. Правильный ответ - " + "\"" + question.getAnswerOptions()[question.getCorrect() - 1] + "\"");
        }
    }

    static void checkAnswers() {
        System.out.println("");
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + "-й вопрос: " + answers.get(i));
        }
    }

    static void resultOfGame() {
        System.out.println("\nИтого верных ответов - " + countOfCorrect);
        switch (countOfCorrect) {
            case 3:
                System.out.println(Program.name + ", отлично, на " + calculateResult() + "% правильно");
                break;
            case 2:
                System.out.println(Program.name + ", хорошо, на " + calculateResult() + "% правильно");
                break;
            case 1:
                System.out.println(Program.name + ", ужасно, на " + calculateResult() + "% правильно");
                break;
            default:
                System.out.println(Program.name + ", не отчаивайтесь");
        }
    }

    private static int calculateResult() {
        int countAll = QuestionGenerator.countQuestions();
        return (countOfCorrect * 100) / countAll;
    }

    static void resetCountOfCorrect() {
        countOfCorrect = 0;
    }
}
