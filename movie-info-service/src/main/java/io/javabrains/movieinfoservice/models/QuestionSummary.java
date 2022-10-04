package io.javabrains.movieinfoservice.models;

public class QuestionSummary {

    private String answerId;
    private String questionId;
    private String answer;

    public String getId() {
        return answerId;
    }

    public void setId(String answerId) {
        this.answerId = answerId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setTitle(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setOverview(String answer) {
        this.answer = answer;
    }
}
