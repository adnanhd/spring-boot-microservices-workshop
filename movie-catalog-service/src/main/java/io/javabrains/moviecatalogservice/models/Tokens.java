package io.javabrains.moviecatalogservice.models;

import java.lang.reflect.Array;
import java.util.List;

public class Tokens {
    private QuestionAnswer questionAnswer;
    private Text text;
    private List<Integer> tokens;

    public Tokens() {}

    public Tokens(QuestionAnswer questionAnswer, Text text, List<Integer> tokens) {
        this.questionAnswer = questionAnswer;
        this.text = text;
        this.tokens = tokens;
    }

    public QuestionAnswer getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(QuestionAnswer questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Integer> getTokens() {
        return tokens;
    }

    public void setRating(List<Integer> tokens) {
        this.tokens = tokens;
    }
}
