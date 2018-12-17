package com.example.PDATool.repository.students;

import com.example.PDATool.models.Student;
import com.example.PDATool.projections.StudentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

        //StudentRepositoryCustom {
}
