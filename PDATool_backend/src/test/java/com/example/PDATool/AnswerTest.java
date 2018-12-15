package com.example.PDATool;


import com.example.PDATool.models.Answer;
import com.example.PDATool.models.Question;
import com.example.PDATool.models.Student;
import com.example.PDATool.repository.answers.AnswerRepository;
import com.example.PDATool.repository.questions.QuestionRepository;
import com.example.PDATool.repository.students.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnswerTest {

    Question question;
    Answer answer;
    Student student;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    StudentRepository studentRepository;

    @Before
    public void before(){
        student = new Student("Jean Claude", "Junker", "E27");
        studentRepository.save(student);
        question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
                "*An array in a program\n" +
                "*A function that uses the array\n" +
                "*The result of the function running");
        questionRepository.save(question);
        answer = new Answer(question.getId(), student);
        answerRepository.save(answer);
        answer.setEvidenceImageProvided("TEST URL");
        answer.setEvidenceTextProvided("Test Text");
        answer.setKanbanStatus("Blocked");
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void canGetQuestionID(){
        assertEquals(1L,answer.getQuestionId());
    }

    @Test
    public void canGetStudentID(){
        Student test = answer.getStudent();
        assertEquals(1L, test.getId());
    }

    @Test
    public void canGetEvidenceImageProvided(){
        assertEquals("TEST URL" ,answer.getEvidenceImageProvided());
    }

    @Test
    public void canGetEvidenceTextProvided(){
        assertEquals("Test Text" ,answer.getEvidenceTextProvided());
    }

    @Test
    public void canGetKanbanStatus(){
        assertEquals("Blocked" ,answer.getKanbanStatus());
    }


}
