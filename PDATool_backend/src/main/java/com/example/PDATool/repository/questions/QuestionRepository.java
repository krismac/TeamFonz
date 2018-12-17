package com.example.PDATool.repository.questions;

import com.example.PDATool.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>, QuestionRepositoryCustom {

}
