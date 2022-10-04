package io.javabrains.ratingsdataservice.model;

public class Rating {

    private String questionId;
    private int rating;

    public Rating(String questionId, int rating) {
        this.questionId = questionId;
        this.rating = rating;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
