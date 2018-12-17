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

        Student student = new Student("Mia", "Wallace", "E27");
        Student student1 = new Student("Vincent", "Vaga", "E29");
        Student student2 = new Student("Marcellus", "Wallace", "E30");
        Student student3 = new Student("Mr", "Wolf", "E30");
        studentRepository.save(student);
        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

        Question questionIT5 = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
                "*An array in a program\n" +
                "*A function that uses the array\n" +
                "*The result of the function running", 2);
        questionRepository.save(questionIT5);

        Question questionIT6 = new Question("I.T.6", "I&T", "Demonstrate the use of a hash in a program. Take screenshots of: \n" +
                "*A hash in a program\n" +
                "*A function that uses the hash\n" +
                "*The result of the function running", 2);
        questionRepository.save(questionIT6);

        Question questionIT3 = new Question("I.T.3", "I&T", "Demonstrate searching data in a program. Take screenshots of: \n" +
                "*Function that searches data \n" +
                "*The result of the function running", 3);
        questionRepository.save(questionIT3);

        Question questionIT4 = new Question("I.T.4", "I&T", "Demonstrate sorting data in a program. Take screenshots of:\n" +
                "*Function that sorts data\n" +
                "*The result of the function running", 3);
        questionRepository.save(questionIT4);

        Question questionAD1 = new Question("A.D.1", "A&D", "A Use Case Diagram", 6);
        questionRepository.save(questionAD1);

        Question questionAD2 = new Question("A.D.2", "A&D", "A Class Diagram", 6);
        questionRepository.save(questionAD2);

        Question questionAD3 = new Question("A.D.3", "A&D", "An Object Diagram", 6);
        questionRepository.save(questionAD3);

        Question questionAD4 = new Question("A.D.4", "A&D", "An Activity Diagram", 6);
        questionRepository.save(questionAD4);

        Question questionAD6 = new Question("A.D.6", "A&D", "Produce an Implementations Constraints plan detailing the following factors:\n" +
                "*Hardware and software platforms\n" +
                "*Performance requirements\n" +
                "*Persistent storage and transactions\n" +
                "*Usability\n" +
                "*Budgets\n" +
                "*Time", 6);
        questionRepository.save(questionAD6);

        Question questionP5 = new Question("P.5", "P", "User Site Map", 6);
        questionRepository.save(questionP5);

        Question questionP6 = new Question("P.6", "P", "2 Wireframe Diagrams", 6);
        questionRepository.save(questionP6);

        Question questionP10 = new Question("P.10", "P", "Example of Pseudocode used for a method", 6);
        questionRepository.save(questionP10);

        Question questionP13 = new Question("P.13", "P", "Show user input being processed according to design requirements. Take a screenshot of:\n" +
                "* The user inputting something into your program\n" +
                "* The user input being saved or used in some way", 6);
        questionRepository.save(questionP13);

        Question questionP14 = new Question("P.14", "P", "Show an interaction with data persistence. Take a screenshot of:\n" +
                "* Data being inputted into your program\n" +
                "* Confirmation of the data being saved", 6);
        questionRepository.save(questionP14);

        Question questionP15 = new Question("P.15", "P", "Show the correct output of results and feedback to user. Take a screenshot of:\n" +
                "* The user requesting information or an action to be performed\n" +
                "* The user request being processed correctly and demonstrated in the program", 6);
        questionRepository.save(questionP15);

        Question questionP11 = new Question("P.11", "P", "Take a screenshot of one of your projects where you"+
                " have worked alone and attach the Github link.", 6);
        questionRepository.save(questionP11);

        Question questionP12 = new Question("P.12", "P", "Take screenshots or photos of your planning "+
                "and the different stages of development to show changes. ", 6);
        questionRepository.save(questionP12);

        Question questionP16 = new Question("P.16", "P", "Show an API being used within your program. Take a screenshot of:\n" +
                "* The code that uses or implements the API\n" +
                "* The API being used by the program whilst running", 7);
        questionRepository.save(questionP16);

        Question questionP18 = new Question("P.18", "P", "Demonstrate testing in your program. Take screenshots of:\n" +
                "* Example of test code\n" +
                "* The test code failing to pass\n" +
                "* Example of the test code once errors have been corrected\n" +
                "* The test code passing", 7);
        questionRepository.save(questionP18);

        Question questionP1 = new Question("P.1", "P", "Take a screenshot of the contributor’s page" +
                " on Github from your group project to show the team you worked with.", 9);
        questionRepository.save(questionP1);

        Question questionP2 = new Question("P.2", "P", "Take a screenshot of the project brief from your group project.", 9);
        questionRepository.save(questionP2);

        Question questionP3 = new Question("P.3", "P", "Provide a screenshot of the planning you completed during your group project, "+
                "e.g. Trello MOSCOW board.", 9);
        questionRepository.save(questionP3);

        Question questionP4 = new Question("P.4", "P", "Write an acceptance criteria and test plan.", 9);
        questionRepository.save(questionP4);

        Question questionP7 = new Question("P.7", "P", "Produce two system interaction diagrams (sequence and/or collaboration diagrams).", 9);
        questionRepository.save(questionP7);

        Question questionP8 = new Question("P.8", "P", "Produce two object diagrams.", 9);
        questionRepository.save(questionP8);

        Question questionP17 = new Question("P.17", "P", "Produce a bug tracking report.", 9);
        questionRepository.save(questionP17);

        Question questionIT7 = new Question("I.T.7", "I&T", "The use of Polymorphism in a program and what it is doing.", 12);
        questionRepository.save(questionIT7);

        Question questionAD5 = new Question("A.D.5", "A&D", "An Inheritance Diagram", 12);
        questionRepository.save(questionAD5);

        Question questionIT1 = new Question("I.T.1", "I&T", "The use of Encapsulation in a program and what it is doing.", 12);
        questionRepository.save(questionIT1);

        Question questionIT2 = new Question("I.T.2", "I&T", "Take a screenshot of the use of Inheritance in a program. Take screenshots of:  \n" +
                "*A Class\n" +
                "*A Class that inherits from the previous class\n" +
                "*An Object in the inherited class\n" +
                "*A Method that uses the information inherited from another class.", 12);
        questionRepository.save(questionIT2);

        Question questionP9 = new Question("P.9", "P", "Select two algorithms you have written (NOT the group project)."+
                " Take a screenshot of each and write a short statement on why you have chosen to use those algorithms.", 12);
        questionRepository.save(questionP9);

        Answer answer = new Answer(questionAD6.getId(), student3);
        answer.setEvidenceImageProvided("Pretty 'king please with a cherry on top");
        answer.setEvidenceTextProvided("What's the situation?");
        answer.setKanbanStatus("Backlog");
        answerRepository.save(answer);

        Answer answer1 = new Answer(questionIT3.getId(), student2);
        answer1.setEvidenceImageProvided("TEST URL");
        answer1.setEvidenceTextProvided("Test Text");
        answer1.setKanbanStatus("In Progress");
        answerRepository.save(answer1);

        Answer answer2 = new Answer(questionAD2.getId(), student);
        answer2.setEvidenceImageProvided("https://www.google.com/search?q=pulp+fiction+cast&oq=pulp+fiction+c&aqs=chrome.1.69i59j0l2j69i57j0l2.5356j0j7&sourceid=chrome&ie=UTF-8");
        answer2.setEvidenceTextProvided("Other Test Text");
        answer2.setKanbanStatus("Blocked");
        answerRepository.save(answer2);



    }
}
