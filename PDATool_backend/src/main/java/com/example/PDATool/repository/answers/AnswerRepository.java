package com.example.PDATool.repository.answers;

import com.example.PDATool.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>, AnswerRepositoryCustom  {

    Answer findDistinctByQuestionId(long question_id);

    List<Answer> findByKanbanStatus(String kanbanStatus);

}
