package com.example.PDATool.repository.questions;

import com.example.PDATool.models.Question;

import java.util.List;

public interface QuestionRepositoryCustom {

    List<Question> getById(long question_id);

}
