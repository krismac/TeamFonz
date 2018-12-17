package com.example.PDATool;

import com.example.PDATool.models.Question;
import com.example.PDATool.repository.questions.QuestionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionTest {

    Question question;

    @Autowired
    QuestionRepository questionRepository;

    @Before
    public void before(){
        question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
                "*An array in a program\n" +
                "*A function that uses the array\n" +
                "*The result of the function running", 2);
        questionRepository.save(question);
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void canGetUnit() {
        assertEquals("I&T", question.getUnit());
    }

    @Test
    public void canGetReference() {
        assertEquals("I.T.5", question.getReference());
    }

    @Test
    public void canGetEvidenceRequired() {
        assertEquals("Demonstrate the use of an array in a program. Take screenshots of: \n" +
                "*An array in a program\n" +
                "*A function that uses the array\n" +
                "*The result of the function running", question.getEvidenceRequired());
    }
}
