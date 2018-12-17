//package com.example.PDATool;
//
//import com.example.PDATool.modules.Answer;
//import com.example.PDATool.modules.Question;
//import com.example.PDATool.modules.Student;
//import com.example.PDATool.repository.answers.AnswerRepository;
//import com.example.PDATool.repository.questions.QuestionRepository;
//import com.example.PDATool.repository.students.StudentRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.assertEquals;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class PdaToolApplicationTests {
//
//	Student student;
//
//	@Autowired
//	AnswerRepository answerRepository;
//
//	@Autowired
//	QuestionRepository questionRepository;
//
//	@Autowired
//	StudentRepository studentRepository;
//
//	@Before
//	public void before(){
//		Student student = new Student("Jean Claude", "Junker", "E27");
//		studentRepository.save(student);
//	}
//
//	@Test
//	public void contextLoads() {
//	}
//
//	@Test
//	public void canCreateStudent() {
//		assertEquals("Jean Claude", student.getFirstName());
//		Student test = studentRepository.getOne(student.getId());
//		assertEquals("Jean Claude", test.getFirstName());
//	}
//
//	@Test
//	public void studentHasAllAttributes(){
//
//	}
//
//	@Test
//	public void canCreateQuestion(){
//		Question question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
//				"*An array in a program\n" +
//				"*A function that uses the array\n" +
//				"*The result of the function running");
//		questionRepository.save(question);
//		assertEquals("I&T", question.getUnit());
//	}
//
//	@Test
//	public void canCreateAnswer(){
//		Question question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
//				"*An array in a program\n" +
//				"*A function that uses the array\n" +
//				"*The result of the function running");
//		questionRepository.save(question);
//		Answer answer = new Answer(question.getId(), student);
//		answerRepository.save(answer);
//		answer.setEvidenceImageProvided("TEST URL");
//		answer.setEvidenceTextProvided("Test Text");
//		assertEquals("TEST URL" ,answer.getEvidenceImageProvided());
//	}
//
//}
//
