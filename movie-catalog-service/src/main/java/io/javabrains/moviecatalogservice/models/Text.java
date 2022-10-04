package io.javabrains.moviecatalogservice.models;

public class Text {
    private String textId;
    private String title;
    private String content;

    public Text() {}

    public Text(String textId, String title, String content) {
        this.textId = textId;
        this.title = title;
        this.content = content;
    }

    public String getTextId() {
        return this.textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content)  { this.content = content; }
}
