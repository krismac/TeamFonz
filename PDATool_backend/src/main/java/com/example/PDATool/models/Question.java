package com.example.PDATool.models;


import javax.persistence.*;


@Entity
@Table(name="questions")
public class Question{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String reference;

    @Column
    private String unit;

    @Column
    private String evidenceRequired;



    public Question(String reference, String unit, String evidenceRequired) {
        this.reference = reference;
        this.unit = unit;
        this.evidenceRequired = evidenceRequired;
    }

    public Question() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
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
