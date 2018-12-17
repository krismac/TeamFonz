package com.example.PDATool.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;


public class Module {

    private Long id;

    private Long questionId;

    private Long answerId;

    private Long studentId;

    public Module(Question question, Answer answer, Student student) {
        this.questionId = question.getId();
        this.answerId = answer.getId();
        this.studentId = student.getId();
    }

    public Module() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    //get all modules for a student
    //student list of modules

    //JoinTable
    //QID/AID/

    //module class that joins attributes of answer and question and student ID







}
