package com.luizmrd.medical_clinic_project.services;

import com.luizmrd.medical_clinic_project.entities.Address;
import com.luizmrd.medical_clinic_project.repositories.AddressRepository;
import com.luizmrd.medical_clinic_project.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    public List<Address> findAll(){
        return repository.findAll();
    }

    public Address findById(Long id){
        Optional<Address> obj = repository.findById(id);
        return obj.get();
    }
}
