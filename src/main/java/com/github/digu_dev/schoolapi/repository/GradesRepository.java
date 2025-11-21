package com.github.digu_dev.schoolapi.repository;

import com.github.digu_dev.schoolapi.model.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<Grades, Long> {
}
