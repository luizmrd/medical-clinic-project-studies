package com.luizmrd.medical_clinic_project.services;

import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.entities.User;
import com.luizmrd.medical_clinic_project.repositories.PatientRepository;
import com.luizmrd.medical_clinic_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
