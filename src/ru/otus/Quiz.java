package ru.otus;

public class Quiz {

    public static void main(String[] args) {

        QuizGenerator quizGenerator = new QuizGenerator();
        QuestionGenerator questionGenerator = new QuestionGenerator();
        UserAnswersProcessing userAnswersProcessing = new UserAnswersProcessing();

        System.out.println("Мини векторина!");
        System.out.println("Введите Ваше имя что бы начать!");
        userAnswersProcessing.setPlayerName(quizGenerator.input.nextLine());

        while (true) {
            quizGenerator.askQuestion(questionGenerator.questionOne);
            quizGenerator.askQuestion(questionGenerator.questionTwo);
            quizGenerator.askQuestion(questionGenerator.questionThree);
            quizGenerator.resultForQuiz();
            quizGenerator.displayAnswerStatistic();
            quizGenerator.resetCounters();

            System.out.println("\n Что бы выйти введите \"Q\" или что либо другое для повтора");
            if (quizGenerator.input.next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }
    }
}
