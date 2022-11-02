package com.QuickPoll.Quick.Poll.domain;

public class Poll {

    private Long id;
    private String question;
    private String options;
    private String value;

    public Poll(Long id, String question, String options, String value) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options='" + options + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
