package io.javabrains.moviecatalogservice.models;

public class QuestionAnswer {

    private enum answerType {FillInTheBlank, MultipleChoice, TrueFalse};
    private String questionAnswerId, question, passageId, answer, title;
    private Integer rating;

    public QuestionAnswer() {}

    public QuestionAnswer(String questionAnswerId, String question, String answer, String passageId) {
        this.questionAnswerId = questionAnswerId;
        this.question = question;
        this.answer = answer;
        this.passageId = passageId;
    }

    public String getQuestionAnswerId() {
        return questionAnswerId;
    }

    public void setQuestionAnswerId(String questionAnswerId) { this.questionAnswerId = questionAnswerId; }

    public String getQuestion() { return this.question; }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) { this.answer = answer; }

    public String getPassage() {
        return this.passageId;
    }

    public void setPassage(String passageId) { this.passageId = passageId; }
}
