package com.example.PDATool.models;
import javax.persistence.*;

@Entity
@Table(name= "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String reference;

    @Column
    private String unit;

    @Column
    private String evidenceRequired;

    @Column
    private int weekNumber;

    public Question(String reference, String unit, String evidenceRequired, int weekNumber) {
        this.reference = reference;
        this.unit = unit;
        this.evidenceRequired = evidenceRequired;
        this.weekNumber = weekNumber;
    }

    public Question() {
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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
