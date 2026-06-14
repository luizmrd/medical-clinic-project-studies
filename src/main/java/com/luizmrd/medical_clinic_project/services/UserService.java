package com.luizmrd.medical_clinic_project.services;

import com.luizmrd.medical_clinic_project.entities.User;
import com.luizmrd.medical_clinic_project.entities.enuns.EmployeeType;
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

    public List<User> getUserByType(Integer employeeType) {
        return repository.findByEmployeeType(employeeType);
    }


    public User insert(User obj){
        return repository.save(obj);
    }
}
