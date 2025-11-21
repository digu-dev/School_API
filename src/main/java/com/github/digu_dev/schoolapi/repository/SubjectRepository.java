package com.github.digu_dev.schoolapi.repository;

import com.github.digu_dev.schoolapi.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
