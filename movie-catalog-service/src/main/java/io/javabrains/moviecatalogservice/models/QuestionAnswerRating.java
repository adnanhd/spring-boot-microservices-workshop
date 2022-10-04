package io.javabrains.moviecatalogservice.models;

import java.util.Arrays;
import java.util.List;

public class QuestionAnswerRating {

    private String userId;
    private List<QuestionAnswer> questionAnswers;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<QuestionAnswer> getRatings() {
        return questionAnswers;
    }

    public void setRatings(List<QuestionAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

}
