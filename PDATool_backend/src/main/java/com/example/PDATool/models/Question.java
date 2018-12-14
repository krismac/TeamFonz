package com.example.PDATool.models;

public class Question {

    private Long Id;
    private String reference;
    private String unit;
    private String evidenceRequired;

    public Question(String reference, String unit, String evidenceRequired) {
        this.reference = reference;
        this.unit = unit;
        this.evidenceRequired = evidenceRequired;
    }

    public Question() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEvidenceRequired() {
        return evidenceRequired;
    }

    public void setEvidenceRequired(String evidenceRequired) {
        this.evidenceRequired = evidenceRequired;
    }
}
