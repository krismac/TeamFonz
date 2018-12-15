package com.example.PDATool;


import com.example.PDATool.models.Student;
import com.example.PDATool.repository.students.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

    Student student;

    @Autowired
    StudentRepository studentRepository;

    @Before
    public void before(){
        student = new Student("Jean Claude", "Junker", "E27");
        studentRepository.save(student);
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void canGetFirstName() {
        assertEquals("Jean Claude", student.getFirstName());
        Student test = studentRepository.getOne(student.getId());
        assertEquals("Jean Claude", test.getFirstName());
    }

    @Test
    public void canGetLastName() {
        assertEquals("Junker", student.getLastName());
        Student test = studentRepository.getOne(student.getId());
        assertEquals("Junker", test.getLastName());
    }

    @Test
    public void canGetChort() {
        assertEquals("E27", student.getCohort());
        Student test = studentRepository.getOne(student.getId());
        assertEquals("E27", test.getCohort());
    }
}
