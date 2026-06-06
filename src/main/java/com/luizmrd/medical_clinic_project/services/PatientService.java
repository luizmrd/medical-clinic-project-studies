package com.luizmrd.medical_clinic_project.services;

import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public List<Patient> findAll(){
        return repository.findAll();
    }

    public Patient findById(Long id){
        Optional<Patient> obj = repository.findById(id);
        return obj.get();
    }
}
