package ru.otus;

public class QuestionGenerator {
    int trueAnswer;
    String question;
    String[] answerOptions;
    static int countOfQuestions;

    public QuestionGenerator(int trueAnswer, String question, String[] answerOptions) {
        this.trueAnswer = trueAnswer;
        this.question = question;
        this.answerOptions = answerOptions;
        countOfQuestions++;
    }


    static QuestionGenerator stepOne = new QuestionGenerator(QuestionsDictionary.trueFirst, QuestionsDictionary.questionOne, QuestionsDictionary.answerOptionsFirst);
    static QuestionGenerator stepTwo = new QuestionGenerator(QuestionsDictionary.trueSecond, QuestionsDictionary.questionTwo, QuestionsDictionary.answerOptionsSecond);
    static QuestionGenerator stepThree = new QuestionGenerator(QuestionsDictionary.trueThird, QuestionsDictionary.questionThree, QuestionsDictionary.answerOptionsThird);
}
