package com.example.PDATool.models;


import com.example.PDATool.interfaces.IModule;

import javax.persistence.*;

@Entity
@Table(name="answers")
public class Answer implements IModule {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long Id;

    @Column
    private String evidenceImageProvided;

    @Column
    private String evidenceTextProvided;

    @Column
    private long questionId;

    @Column
    private String kanbanStatus;
//    Backlog/ In Progress / Done / Blocked

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;



    public Answer(long questionId, Student student) {
        this.evidenceImageProvided = null;
        this.evidenceTextProvided = null;
        this.kanbanStatus = null;
        this.questionId = questionId;
        this.student = student;
    }

    public Answer() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
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

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getKanbanStatus() {
        return kanbanStatus;
    }

    public void setKanbanStatus(String kanbanStatus) {
        this.kanbanStatus = kanbanStatus;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
