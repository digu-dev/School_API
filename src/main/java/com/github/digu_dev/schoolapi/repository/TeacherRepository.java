package com.github.digu_dev.schoolapi.repository;

import com.github.digu_dev.schoolapi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}
