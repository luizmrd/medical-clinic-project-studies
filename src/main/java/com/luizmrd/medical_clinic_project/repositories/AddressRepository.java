package com.luizmrd.medical_clinic_project.repositories;

import com.luizmrd.medical_clinic_project.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
