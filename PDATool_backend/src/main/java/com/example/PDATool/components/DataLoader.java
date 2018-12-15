package com.example.PDATool.components;

import com.example.PDATool.models.Answer;
import com.example.PDATool.models.Question;
import com.example.PDATool.models.Student;
import com.example.PDATool.repository.answers.AnswerRepository;
import com.example.PDATool.repository.questions.QuestionRepository;
import com.example.PDATool.repository.students.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Student student = new Student("Jean Claude", "Junker", "E27");
        Student student1 = new Student("Johnny", "Dawes", "E29");
        Student student2 = new Student("Jean Claude", "Van Damme", "E30");
        studentRepository.save(student);
        studentRepository.save(student1);
        studentRepository.save(student2);

        Question question = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
                "*An array in a program\n" +
                "*A function that uses the array\n" +
                "*The result of the function running");
        questionRepository.save(question);

        Answer answer = new Answer(question.getId(), student);
        Answer answer1 = new Answer(question.getId(), student1);
        Answer answer2 = new Answer(question.getId(), student2);
        answerRepository.save(answer);
        answerRepository.save(answer1);
        answerRepository.save(answer2);

    }
}
