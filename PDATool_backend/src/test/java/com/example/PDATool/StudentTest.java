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

    Student student2;

    @Autowired
    StudentRepository studentRepository;

    @Before
    public void before(){
        student2 = new Student("Jean Claude", "Van Damme", "E30");
        studentRepository.save(student2);
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void canGetFirstName() {
        assertEquals("Jean Claude", student2.getFirstName());
        Student test = studentRepository.getOne(student2.getId());
        assertEquals("Jean Claude", test.getFirstName());
    }

    @Test
    public void canGetLastName() {
        assertEquals("Van Damme", student2.getLastName());
        Student test = studentRepository.getOne(student2.getId());
        assertEquals("Van Damme", test.getLastName());
    }

    @Test
    public void canGetChort() {
        assertEquals("E30", student2.getCohort());
        Student test = studentRepository.getOne(student2.getId());
        assertEquals("E30", test.getCohort());
    }
}
