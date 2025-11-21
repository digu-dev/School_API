package com.github.digu_dev.schoolapi.repository;

import com.github.digu_dev.schoolapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
