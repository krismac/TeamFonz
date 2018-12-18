package com.example.PDATool.repository.questions;

import com.example.PDATool.models.Question;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Question> getById(long question_id) {

        List<Question> questions = null;
        Session session = entityManager.unwrap(Session.class);
            Criteria cr = session.createCriteria(Question.class);
            cr.add(Restrictions.eq("id", question_id));
            questions = cr.list();
        return questions;

//        List<Question> questions = null;
//        Session session = entityManager.unwrap(Session.class);
//        try {
//            Criteria cr = session.createCriteria(Question.class);
//            cr.add(Restrictions.eq("id", question_id));
//            questions = cr.list();
//        } catch (HibernateException ex){
//            ex.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return questions;

    }

}
