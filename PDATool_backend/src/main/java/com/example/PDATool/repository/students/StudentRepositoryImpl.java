package com.example.PDATool.repository.students;

        import com.example.PDATool.models.Student;
        import org.hibernate.Criteria;
        import org.hibernate.HibernateException;
        import org.hibernate.Session;
        import org.springframework.beans.factory.annotation.Autowired;

        import javax.persistence.EntityManager;
        import javax.transaction.Transactional;
        import java.util.List;

public class StudentRepositoryImpl implements StudentRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Student> allStudents(){
        List<Student> students = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Student.class);
            students = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return students;
    }
}
