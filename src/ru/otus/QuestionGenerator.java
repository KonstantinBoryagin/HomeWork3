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




    public static void main(String[] args) {
        Question questionOne = Question.QUESTION_ONE;
        Question questionTwo = Question.QUESTION_TWO;
        Question questionThree = Question.QUESTION_THREE;
        questionOne.printQuestion();
        questionTwo.printQuestion();
        questionThree.printQuestion();
        questionTwo.
    }
    static QuestionGenerator stepOne = new QuestionGenerator(QuestionsDictionary.trueFirst, QuestionsDictionary.questionOne, QuestionsDictionary.answerOptionsFirst);
    static QuestionGenerator stepTwo = new QuestionGenerator(QuestionsDictionary.trueSecond, QuestionsDictionary.questionTwo, QuestionsDictionary.answerOptionsSecond);
    static QuestionGenerator stepThree = new QuestionGenerator(QuestionsDictionary.trueThird, QuestionsDictionary.questionThree, QuestionsDictionary.answerOptionsThird);
}
