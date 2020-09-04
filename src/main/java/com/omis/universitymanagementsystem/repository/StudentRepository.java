package com.omis.universitymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.omis.universitymanagementsystem.model.Student;

/**
 * Interact with the student table
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
