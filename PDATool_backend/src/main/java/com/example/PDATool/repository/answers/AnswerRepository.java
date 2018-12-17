package com.example.PDATool.repository.answers;

import com.example.PDATool.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long>, AnswerRepositoryCustom  {


}
