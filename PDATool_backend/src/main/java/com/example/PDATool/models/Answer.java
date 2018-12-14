package com.example.PDATool.models;


import javax.persistence.*;

@Entity
@Table(name="answers")
public class Answer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String evidenceImageProvided;

    @Column
    private String evidenceTextProvided;

    @Column
    private Long questionId;

    @Column
    private String kanbanStatus;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;



    public Answer(Long questionId, Student student) {
        this.evidenceImageProvided = null;
        this.evidenceTextProvided = null;
        this.kanbanStatus = null;
        this.questionId = questionId;
        this.student = student;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
