package com.example.PDATool.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;


public class Module {

    private String unit;
    private String reference;
    private String evidenceRequired;
    private int weekNumber;

    private long answerId;
    private String imageEvidence;
    private String textEvidence;
    private String kanbanStatus;

    public Module(Question question, Answer answer) {
        this.unit = question.getUnit();
        this.reference = question.getReference();
        this.evidenceRequired = question.getEvidenceRequired();
        this.weekNumber = question.getWeekNumber();

        this.answerId = answer.getId();
        this.imageEvidence = answer.getEvidenceImageProvided();
        this.textEvidence = answer.getEvidenceTextProvided();
        this.kanbanStatus = answer.getKanbanStatus();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEvidenceRequired() {
        return evidenceRequired;
    }

    public void setEvidenceRequired(String evidenceRequired) {
        this.evidenceRequired = evidenceRequired;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public String getImageEvidence() {
        return imageEvidence;
    }

    public void setImageEvidence(String imageEvidence) {
        this.imageEvidence = imageEvidence;
    }

    public String getTextEvidence() {
        return textEvidence;
    }

    public void setTextEvidence(String textEvidence) {
        this.textEvidence = textEvidence;
    }

    public String getKanbanStatus() {
        return kanbanStatus;
    }

    public void setKanbanStatus(String kanbanStatus) {
        this.kanbanStatus = kanbanStatus;
    }
}
