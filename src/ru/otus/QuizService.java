package ru.otus;

public class QuizService {
    private static String playerName;

    public void resultOfGame() {
        int countOfCorrect = UserAnswersProcessing.getCountOfCorrect();
        System.out.println("\nИтого верных ответов - " + countOfCorrect);
        switch (countOfCorrect) {
            case 3:
                System.out.println(playerName + ", отлично, на " + calculatePercentOfTrueAnswers() + "% правильно");
                break;
            case 2:
                System.out.println(playerName + ", хорошо, на " + calculatePercentOfTrueAnswers() + "% правильно");
                break;
            case 1:
                System.out.println(playerName + ", ужасно, на " + calculatePercentOfTrueAnswers() + "% правильно");
                break;
            default:
                System.out.println(playerName + ", не отчаивайтесь");
        }
    }

    private int calculatePercentOfTrueAnswers() {
        int countOfAllAnswers = QuizGenerator.getCountOfQuestions();
        int countOfCorrectAnswers = UserAnswersProcessing.getCountOfCorrect();
        int percentOfTruAnswers = (countOfCorrectAnswers * 100) / countOfAllAnswers;
        return percentOfTruAnswers;
    }


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
