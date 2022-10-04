package io.javabrains.movieinfoservice.models;

public class QuestionAnswer {

    private enum answerType {FillInTheBlank, MultipleChoice, TrueFalse};
    private String questionAnswerId, question, passage, answer, title;
    private Integer rating;

    public QuestionAnswer() {}

    public QuestionAnswer(String questionAnswerId, Integer rating, String question, String answer, String passage, String title) {
        this.questionAnswerId = questionAnswerId;
        this.question = question;
        this.answer = answer;
        this.rating = rating;
        this.passage = passage;
        this.title = title;
    }

    public String getQuestionAnswerId() {
        return questionAnswerId;
    }

    public void setQuestionAnswerId(String questionAnswerId) { this.questionAnswerId = questionAnswerId; }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getQuestion() { return this.question; }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) { this.answer = answer; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassage() {
        return this.passage;
    }

    public void setPassage(String passage) { this.passage = passage; }
}
