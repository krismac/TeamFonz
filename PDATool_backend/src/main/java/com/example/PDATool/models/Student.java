package com.example.PDATool.models;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Long Id;
    private String name;
    private List <Answer> answers;

    public Student(String name) {
        this.name = name;
        this.answers = new ArrayList<>();
    }

    public Student() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
