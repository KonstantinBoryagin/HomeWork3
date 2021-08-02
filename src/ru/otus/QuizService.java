package ru.otus;

public class QuizService {
    private static String playerName;
    public void resultOfGame() {
        int countOfCorrect = UserAnswersProcessing.getCountOfCorrect();
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
        int countAll = QuizGenerator.getCountOfQuestions();
        int countOfCorrect = UserAnswersProcessing.getCountOfCorrect();
        return (countOfCorrect * 100) / countAll;
    }


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
