package ru.otus;

import java.util.ArrayList;

public class UserAnswersProcessing {
    private int countOfCorrect;
    private static String playerName;
    private ArrayList<String> answers = new ArrayList<>();

    public void saveAnswers(int answer, Question question) {
        if (answer == question.getCorrect()) {
            answers.add("правильно - " + "\"" + question.getAnswerOptions()[question.getCorrect() - 1] + "\"");
            countOfCorrect++;
        } else {
            answers.add("ошибка. Правильный ответ - " + "\"" + question.getAnswerOptions()[question.getCorrect() - 1] + "\"");
        }
    }

    public void checkAnswers() {
        System.out.println("");
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + "-й вопрос: " + answers.get(i));
        }
    }

    public void resultOfGame() {
        System.out.println("\nИтого верных ответов - " + countOfCorrect);
        switch (countOfCorrect) {
            case 3:
                System.out.println(playerName + ", отлично, на " + calculateResult() + "% правильно");
                break;
            case 2:
                System.out.println(playerName + ", хорошо, на " + calculateResult() + "% правильно");
                break;
            case 1:
                System.out.println(playerName + ", ужасно, на " + calculateResult() + "% правильно");
                break;
            default:
                System.out.println(playerName + ", не отчаивайтесь");
        }
    }

    private int calculateResult() {
        int countAll = QuestionGenerator.countQuestions();
        return (countOfCorrect * 100) / countAll;
    }

    public void clearArrayListWithPlayerAnswers() {
        answers.clear();
    }

    public void resetCountOfCorrect() {
        countOfCorrect = 0;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
