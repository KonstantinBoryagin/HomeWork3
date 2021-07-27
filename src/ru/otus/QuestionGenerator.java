package ru.otus;


public class QuestionGenerator {
    static int countOfQuestions;

    static Question questionOne = Question.QUESTION_ONE;
    static Question questionTwo = Question.QUESTION_TWO;
    static Question questionThree = Question.QUESTION_THREE;

    public static int countQuestions() {
        Question[] questions = Question.values();
        countOfQuestions = questions.length;
        return countOfQuestions;
    }
}
