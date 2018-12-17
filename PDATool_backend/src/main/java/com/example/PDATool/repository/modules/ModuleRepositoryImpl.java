package com.example.PDATool.repository.modules;

import com.example.PDATool.models.Answer;
import com.example.PDATool.models.Module;
import com.example.PDATool.models.Question;
import com.example.PDATool.models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class ModuleRepositoryImpl implements ModuleRespositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public Module  getFirstModuleForStudent(Long student_id) {

//        query to get students first answer
        List<Answer> answers = null;

        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Answer.class);
            cr.add(Restrictions.eq("student", student_id));
            answers = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        Answer answer = answers.get(0);

//        query to get students first question
        List<Question> questions = null;

        Session session1 = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Question.class);
            cr.add(Restrictions.eq("id", answer.getQuestionId()));
            questions = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        Question question = questions.get(0);

//        query to get student
        List<Student> students = null;

        Session session2 = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("id", student_id));
            students = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        Student student = students.get(0);

//        new instance of module, pass in above data.
        Module newModule = new Module(question, answer, student);
        return newModule;

    }

}
