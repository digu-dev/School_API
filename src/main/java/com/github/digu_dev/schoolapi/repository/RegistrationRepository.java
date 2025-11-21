package com.github.digu_dev.schoolapi.repository;

import com.github.digu_dev.schoolapi.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
