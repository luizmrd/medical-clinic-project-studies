package com.luizmrd.medical_clinic_project.repositories;

import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
