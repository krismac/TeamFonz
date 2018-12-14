package com.example.PDATool;

import com.example.PDATool.models.Answer;
import com.example.PDATool.models.Question;
import com.example.PDATool.models.Student;
import com.example.PDATool.repository.answers.AnswerRepository;
import com.example.PDATool.repository.questions.QuestionRepository;
import com.example.PDATool.repository.students.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void canCreateStudent() {
		Student student = new Student("Jean Claude Junker");
		studentRepository.save(student);
		assertEquals("Jean Claude Junker", student.getName());
		Student test = studentRepository.getOne(student.getId());
		assertEquals("Jean Claude Junker", test.getName());
	}

	@Test
	public void canCreateQuestion(){
		Question question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
				"*An array in a program\n" +
				"*A function that uses the array\n" +
				"*The result of the function running");
		questionRepository.save(question);
		assertEquals("I&T", question.getUnit());
	}

	@Test
	public void canCreateAnswer(){
		Question question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
				"*An array in a program\n" +
				"*A function that uses the array\n" +
				"*The result of the function running");
		questionRepository.save(question);
		Student student = new Student("Jean Claude Junker");
		studentRepository.save(student);
		Answer answer = new Answer(question.getId(), student);
		answerRepository.save(answer);
		answer.setEvidenceImageProvided("TEST URL");
		answer.setEvidenceTextProvided("Test Text");
		assertEquals("TEST URL" ,answer.getEvidenceImageProvided());
	}

}

