package com.example.strewldengland.caklontong;

/**
 * Created by Strewld England on 2/19/2017.
 */

public class Question {
    private String mCorrectAnswer;
    private int mQuestions;
    private int mClues;

    public Question(int question, String correctAnswer){
        mQuestions = question;
        mCorrectAnswer = correctAnswer;
    }

    public int getQuestion(){
        return mQuestions;
    }

    public void setQuestion(int question){
        mQuestions = question;
    }

    public String isCorrectAnswer(){
        return mCorrectAnswer;
    }

    public void setCorrectAnswer (String correctAnswer) {
        mCorrectAnswer = correctAnswer;
    }

}
