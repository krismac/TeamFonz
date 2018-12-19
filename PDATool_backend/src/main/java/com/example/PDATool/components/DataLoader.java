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
        Student student3 = new Student("Butch", "Coolidge", "E30");
        studentRepository.save(student);
        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

        Question questionIT5 = new Question("I.T.5", "I&T", "Demonstrate the use of an array in a program. Take screenshots of: \n" +
                "*An array in a program\n" +
                "*A function that uses the array\n" +
                "*The result of the function running", 2);
        questionRepository.save(questionIT5);

        Answer answerIT5 = new Answer(questionIT5.getId(), student3);
        answerIT5.setEvidenceImageProvided("https://res.cloudinary.com/fonz/image/upload/v1545240658/Screen_Shot_2018-12-19_at_17.30.19.png");
        answerIT5.setEvidenceTextProvided("The find_and_delete method finds the stop, deletes from the list and prints out the new list.");
        answerIT5.setKanbanStatus("Done");
        answerRepository.save(answerIT5);

        Question questionIT6 = new Question("I.T.6", "I&T", "Demonstrate the use of a hash in a program. Take screenshots of: \n" +
                "*A hash in a program\n" +
                "*A function that uses the hash\n" +
                "*The result of the function running", 2);
        questionRepository.save(questionIT6);

        Answer answerIT6 = new Answer(questionIT6.getId(), student3);
        answerIT6.setEvidenceImageProvided("https://res.cloudinary.com/fonz/image/upload/v1545240999/Screen_Shot_2018-12-19_at_17.36.10.png");
        answerIT6.setEvidenceTextProvided("The ‘find_artist’ method looks through the hash entries for the song name and returns the artist if the song title is found.");
        answerIT6.setKanbanStatus("Done");
        answerRepository.save(answerIT6);

        Question questionIT3 = new Question("I.T.3", "I&T", "Demonstrate searching data in a program. Take screenshots of: \n" +
                "*Function that searches data \n" +
                "*The result of the function running", 3);
        questionRepository.save(questionIT3);

        Answer answerIT3 = new Answer(questionIT3.getId(), student3);
        answerIT3.setEvidenceImageProvided("https://res.cloudinary.com/fonz/image/upload/v1545241283/Screen_Shot_2018-12-19_at_17.40.48.png");
        answerIT3.setEvidenceTextProvided("find_artist takes a play list (as a hash of hashes) and a song title and returns the artist.");
        answerIT3.setKanbanStatus("Done");
        answerRepository.save(answerIT3);

        Question questionIT4 = new Question("I.T.4", "I&T", "Demonstrate sorting data in a program. Take screenshots of:\n" +
                "*Function that sorts data\n" +
                "*The result of the function running", 3);
        questionRepository.save(questionIT4);

        Answer answerIT4 = new Answer(questionIT4.getId(), student3);
        answerIT4.setEvidenceImageProvided("https://www.google.com/search?q=pulp+fiction+cast&oq=pulp+fiction+c&aqs=chrome.1.69i59j0l2j69i57j0l2.5356j0j7&sourceid=chrome&ie=UTF-8");
        answerIT4.setEvidenceTextProvided("Other Test Text");
        answerIT4.setKanbanStatus("Blocked");
        answerRepository.save(answerIT4);

        Question questionAD1 = new Question("A.D.1", "A&D", "A Use Case Diagram", 6);
        questionRepository.save(questionAD1);

        Answer answerAD1= new Answer(questionAD1.getId(), student3);
        answerAD1.setEvidenceImageProvided("");
        answerAD1.setEvidenceTextProvided("");
        answerAD1.setKanbanStatus("Backlog");
        answerRepository.save(answerAD1);

        Question questionAD2 = new Question("A.D.2", "A&D", "A Class Diagram", 6);
        questionRepository.save(questionAD2);

        Answer answerAD2= new Answer(questionAD2.getId(), student3);
        answerAD2.setEvidenceImageProvided("");
        answerAD2.setEvidenceTextProvided("");
        answerAD2.setKanbanStatus("Backlog");
        answerRepository.save(answerAD2);

        Question questionAD3 = new Question("A.D.3", "A&D", "An Object Diagram", 6);
        questionRepository.save(questionAD3);

        Answer answerAD3= new Answer(questionAD3.getId(), student3);
        answerAD3.setEvidenceImageProvided("");
        answerAD3.setEvidenceTextProvided("");
        answerAD3.setKanbanStatus("Backlog");
        answerRepository.save(answerAD3);

        Question questionAD4 = new Question("A.D.4", "A&D", "An Activity Diagram", 6);
        questionRepository.save(questionAD4);

        Answer answerAD4= new Answer(questionAD4.getId(), student3);
        answerAD4.setEvidenceImageProvided("");
        answerAD4.setEvidenceTextProvided("");
        answerAD4.setKanbanStatus("Backlog");
        answerRepository.save(answerAD4);

        Question questionAD6 = new Question("A.D.6", "A&D", "Produce an Implementations Constraints plan detailing the following factors:\n" +
                "*Hardware and software platforms\n" +
                "*Performance requirements\n" +
                "*Persistent storage and transactions\n" +
                "*Usability\n" +
                "*Budgets\n" +
                "*Time", 6);
        questionRepository.save(questionAD6);

        Answer answerAD6= new Answer(questionAD6.getId(), student3);
        answerAD6.setEvidenceImageProvided("");
        answerAD6.setEvidenceTextProvided("");
        answerAD6.setKanbanStatus("Backlog");
        answerRepository.save(answerAD6);

        Question questionP5 = new Question("P.5", "P", "User Site Map", 6);
        questionRepository.save(questionP5);

        Answer answerP5= new Answer(questionP5.getId(), student3);
        answerP5.setEvidenceImageProvided("");
        answerP5.setEvidenceTextProvided("");
        answerP5.setKanbanStatus("Backlog");
        answerRepository.save(answerP5);

        Question questionP6 = new Question("P.6", "P", "2 Wireframe Diagrams", 6);
        questionRepository.save(questionP6);

        Answer answerP6= new Answer(questionP6.getId(), student3);
        answerP6.setEvidenceImageProvided("");
        answerP6.setEvidenceTextProvided("");
        answerP6.setKanbanStatus("Backlog");
        answerRepository.save(answerP6);

        Question questionP10 = new Question("P.10", "P", "Example of Pseudocode used for a method", 6);
        questionRepository.save(questionP10);

        Answer answerP10= new Answer(questionP10.getId(), student3);
        answerP10.setEvidenceImageProvided("");
        answerP10.setEvidenceTextProvided("");
        answerP10.setKanbanStatus("Backlog");
        answerRepository.save(answerP10);

        Question questionP13 = new Question("P.13", "P", "Show user input being processed according to design requirements. Take a screenshot of:\n" +
                "* The user inputting something into your program\n" +
                "* The user input being saved or used in some way", 6);
        questionRepository.save(questionP13);

        Answer answerP13= new Answer(questionP13.getId(), student3);
        answerP13.setEvidenceImageProvided("");
        answerP13.setEvidenceTextProvided("");
        answerP13.setKanbanStatus("Backlog");
        answerRepository.save(answerP13);

        Question questionP14 = new Question("P.14", "P", "Show an interaction with data persistence. Take a screenshot of:\n" +
                "* Data being inputted into your program\n" +
                "* Confirmation of the data being saved", 6);
        questionRepository.save(questionP14);

        Answer answerP14= new Answer(questionP14.getId(), student3);
        answerP14.setEvidenceImageProvided("");
        answerP14.setEvidenceTextProvided("");
        answerP14.setKanbanStatus("Backlog");
        answerRepository.save(answerP14);

        Question questionP15 = new Question("P.15", "P", "Show the correct output of results and feedback to user. Take a screenshot of:\n" +
                "* The user requesting information or an action to be performed\n" +
                "* The user request being processed correctly and demonstrated in the program", 6);
        questionRepository.save(questionP15);

        Answer answerP15= new Answer(questionP15.getId(), student3);
        answerP15.setEvidenceImageProvided("");
        answerP15.setEvidenceTextProvided("");
        answerP15.setKanbanStatus("Backlog");
        answerRepository.save(answerP15);

        Question questionP11 = new Question("P.11", "P", "Take a screenshot of one of your projects where you"+
                " have worked alone and attach the Github link.", 6);
        questionRepository.save(questionP11);

        Answer answerP11= new Answer(questionP11.getId(), student3);
        answerP11.setEvidenceImageProvided("");
        answerP11.setEvidenceTextProvided("Some stuff, but not all of it yet...");
        answerP11.setKanbanStatus("In Progress");
        answerRepository.save(answerP11);

        Question questionP12 = new Question("P.12", "P", "Take screenshots or photos of your planning "+
                "and the different stages of development to show changes. ", 6);
        questionRepository.save(questionP12);

        Answer answerP12= new Answer(questionP12.getId(), student3);
        answerP12.setEvidenceImageProvided("");
        answerP12.setEvidenceTextProvided("Nailed it :-) ");
        answerP12.setKanbanStatus("Done");
        answerRepository.save(answerP12);

        Question questionP16 = new Question("P.16", "P", "Show an API being used within your program. Take a screenshot of:\n" +
                "* The code that uses or implements the API\n" +
                "* The API being used by the program whilst running", 7);
        questionRepository.save(questionP16);

        Answer answerP16= new Answer(questionP16.getId(), student3);
        answerP16.setEvidenceImageProvided("");
        answerP16.setEvidenceTextProvided("Some opaque stuff...");
        answerP16.setKanbanStatus("Blocked");
        answerRepository.save(answerP16);

        Question questionP18 = new Question("P.18", "P", "Demonstrate testing in your program. Take screenshots of:\n" +
                "* Example of test code\n" +
                "* The test code failing to pass\n" +
                "* Example of the test code once errors have been corrected\n" +
                "* The test code passing", 7);
        questionRepository.save(questionP18);

        Answer answerP18= new Answer(questionP18.getId(), student3);
        answerP18.setEvidenceImageProvided("");
        answerP18.setEvidenceTextProvided("");
        answerP18.setKanbanStatus("Backlog");
        answerRepository.save(answerP18);

        Question questionP1 = new Question("P.1", "P", "Take a screenshot of the contributor’s page" +
                " on Github from your group project to show the team you worked with.", 9);
        questionRepository.save(questionP1);

        Answer answerP1= new Answer(questionP1.getId(), student3);
        answerP1.setEvidenceImageProvided("");
        answerP1.setEvidenceTextProvided("");
        answerP1.setKanbanStatus("Backlog");
        answerRepository.save(answerP1);

        Question questionP2 = new Question("P.2", "P", "Take a screenshot of the project brief from your group project.", 9);
        questionRepository.save(questionP2);

        Answer answerP2= new Answer(questionP2.getId(), student3);
        answerP2.setEvidenceImageProvided("");
        answerP2.setEvidenceTextProvided("");
        answerP2.setKanbanStatus("Backlog");
        answerRepository.save(answerP2);

        Question questionP3 = new Question("P.3", "P", "Provide a screenshot of the planning you completed during your group project, "+
                "e.g. Trello MOSCOW board.", 9);
        questionRepository.save(questionP3);

        Answer answerP3= new Answer(questionP3.getId(), student3);
        answerP3.setEvidenceImageProvided("");
        answerP3.setEvidenceTextProvided("");
        answerP3.setKanbanStatus("Backlog");
        answerRepository.save(answerP3);

        Question questionP4 = new Question("P.4", "P", "Write an acceptance criteria and test plan.", 9);
        questionRepository.save(questionP4);

        Answer answerP4= new Answer(questionP4.getId(), student3);
        answerP4.setEvidenceImageProvided("");
        answerP4.setEvidenceTextProvided("");
        answerP4.setKanbanStatus("Backlog");
        answerRepository.save(answerP4);

        Question questionP7 = new Question("P.7", "P", "Produce two system interaction diagrams (sequence and/or collaboration diagrams).", 9);
        questionRepository.save(questionP7);

        Answer answerP7= new Answer(questionP7.getId(), student3);
        answerP7.setEvidenceImageProvided("");
        answerP7.setEvidenceTextProvided("");
        answerP7.setKanbanStatus("Backlog");
        answerRepository.save(answerP7);

        Question questionP8 = new Question("P.8", "P", "Produce two object diagrams.", 9);
        questionRepository.save(questionP8);

        Answer answerP8= new Answer(questionP8.getId(), student3);
        answerP8.setEvidenceImageProvided("");
        answerP8.setEvidenceTextProvided("");
        answerP8.setKanbanStatus("Backlog");
        answerRepository.save(answerP8);

        Question questionP17 = new Question("P.17", "P", "Produce a bug tracking report.", 9);
        questionRepository.save(questionP17);

        Answer answerP17= new Answer(questionP17.getId(), student3);
        answerP17.setEvidenceImageProvided("");
        answerP17.setEvidenceTextProvided("");
        answerP17.setKanbanStatus("Backlog");
        answerRepository.save(answerP17);

        Question questionIT7 = new Question("I.T.7", "I&T", "The use of Polymorphism in a program and what it is doing.", 12);
        questionRepository.save(questionIT7);

        Answer answerIT7= new Answer(questionIT7.getId(), student3);
        answerIT7.setEvidenceImageProvided("");
        answerIT7.setEvidenceTextProvided("");
        answerIT7.setKanbanStatus("Backlog");
        answerRepository.save(answerIT7);

        Question questionAD5 = new Question("A.D.5", "A&D", "An Inheritance Diagram", 12);
        questionRepository.save(questionAD5);

        Answer answerAD5= new Answer(questionAD5.getId(), student3);
        answerAD5.setEvidenceImageProvided("");
        answerAD5.setEvidenceTextProvided("");
        answerAD5.setKanbanStatus("Backlog");
        answerRepository.save(answerAD5);

        Question questionIT1 = new Question("I.T.1", "I&T", "The use of Encapsulation in a program and what it is doing.", 12);
        questionRepository.save(questionIT1);

        Answer answerIT1= new Answer(questionIT1.getId(), student3);
        answerIT1.setEvidenceImageProvided("");
        answerIT1.setEvidenceTextProvided("");
        answerIT1.setKanbanStatus("Backlog");
        answerRepository.save(answerIT1);

        Question questionIT2 = new Question("I.T.2", "I&T", "Take a screenshot of the use of Inheritance in a program. Take screenshots of:  \n" +
                "*A Class\n" +
                "*A Class that inherits from the previous class\n" +
                "*An Object in the inherited class\n" +
                "*A Method that uses the information inherited from another class.", 12);
        questionRepository.save(questionIT2);

        Answer answerIT2= new Answer(questionIT2.getId(), student3);
        answerIT2.setEvidenceImageProvided("");
        answerIT2.setEvidenceTextProvided("");
        answerIT2.setKanbanStatus("Backlog");
        answerRepository.save(answerIT2);

        Question questionP9 = new Question("P.9", "P", "Select two algorithms you have written (NOT the group project)."+
                " Take a screenshot of each and write a short statement on why you have chosen to use those algorithms.", 12);
        questionRepository.save(questionP9);

        Answer answerP9= new Answer(questionP9.getId(), student3);
        answerP9.setEvidenceImageProvided("");
        answerP9.setEvidenceTextProvided("");
        answerP9.setKanbanStatus("Backlog");
        answerRepository.save(answerP9);

    }
}
