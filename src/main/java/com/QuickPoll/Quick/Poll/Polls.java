package com.QuickPoll.Quick.Poll;

public class Polls {
    private Long id;
    private String options;
    private String questions;

    public Polls(Long id, String options, String questions) {
        this.id = id;
        this.options = options;
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Polls{" +
                "id=" + id +
                ", options='" + options + '\'' +
                ", questions='" + questions + '\'' +
                '}';
    }
}
