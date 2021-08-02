package ru.otus;


public class QuestionGenerator {
    private static int countOfQuestions;

    Question questionOne = Question.QUESTION_ONE;
    Question questionTwo = Question.QUESTION_TWO;
    Question questionThree = Question.QUESTION_THREE;

    public static int countQuestions() {
        Question[] questions = Question.values();
        countOfQuestions = questions.length;
        return countOfQuestions;
    }
}
