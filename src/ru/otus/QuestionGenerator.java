package ru.otus;

public class QuestionGenerator {
    int trueAnswer;
    String question;
    String[] answerOptions;

    public QuestionGenerator(int trueAnswer, String question, String[] answerOptions) {
        this.trueAnswer = trueAnswer;
        this.question = question;
        this.answerOptions = answerOptions;
    }
}
