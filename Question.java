package com.bignerdranch.android.geoquiz.app;

/**
 * Created by jdosornio on 11/03/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}