package com.luizmrd.medical_clinic_project.repositories;

import com.luizmrd.medical_clinic_project.entities.User;
import com.luizmrd.medical_clinic_project.entities.enuns.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmployeeType(Integer employeeType);
}
