package com.example.PDATool;

import com.example.PDATool.repository.answers.AnswerRepository;
import com.example.PDATool.repository.questions.QuestionRepository;
import com.example.PDATool.repository.students.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PdaToolApplicationTests {

	@Autowired
	AnswerRepository answerRepository;

	@Autowired
	QuestionRepository questionRepository;

	@Autowired
	StudentRepository studentRepository;

	@Test
	public void contextLoads() {
	}

}

