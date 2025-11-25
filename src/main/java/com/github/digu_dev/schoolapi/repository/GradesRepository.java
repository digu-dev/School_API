package com.github.digu_dev.schoolapi.repository;

import com.github.digu_dev.schoolapi.model.Grades;
import com.github.digu_dev.schoolapi.model.Registration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends JpaRepository<Grades, Long> {

    Page<Grades> findByRegistrationId(Long id, Pageable pageable);



}
