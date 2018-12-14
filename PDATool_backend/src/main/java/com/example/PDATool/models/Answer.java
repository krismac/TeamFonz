package com.example.PDATool.models;

public class Answer {

    private Long Id;
    private String evidenceImageProvided;
    private String evidenceTextProvided;
    private Long questionId;
    private String kanbanStatus;

    public Answer(Long questionId) {
        this.evidenceImageProvided = null;
        this.evidenceTextProvided = null;
        this.kanbanStatus = "backlog";
        this.questionId = questionId;
    }

    public Answer() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEvidenceImageProvided() {
        return evidenceImageProvided;
    }

    public void setEvidenceImageProvided(String evidenceImageProvided) {
        this.evidenceImageProvided = evidenceImageProvided;
    }

    public String getEvidenceTextProvided() {
        return evidenceTextProvided;
    }

    public void setEvidenceTextProvided(String evidenceTextProvided) {
        this.evidenceTextProvided = evidenceTextProvided;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getKanbanStatus() {
        return kanbanStatus;
    }

    public void setKanbanStatus(String kanbanStatus) {
        this.kanbanStatus = kanbanStatus;
    }
}
