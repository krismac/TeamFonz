package com.example.PDATool.repository.answers;

import com.example.PDATool.models.Answer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class AnswerRepositoryImpl implements AnswerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

//    @Transactional
//    public List<Answer> getByQuestionId(long question_id) {
//
//        List<Answer> answers = null;
//        Session session = entityManager.unwrap(Session.class);
//            Criteria cr = session.createCriteria(Answer.class);
//            cr.add(Restrictions.eq("questionId", question_id));
//            answers = cr.list();
//
//        return answers;

//        List<Answer> answers = null;
//        Session session = entityManager.unwrap(Session.class);
//        try {
//            Criteria cr = session.createCriteria(Answer.class);
//            cr.add(Restrictions.eq("questionId", question_id));
//            answers = cr.list();
//        } catch (HibernateException ex){
//            ex.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return answers;

//    }

}
