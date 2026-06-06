package com.luizmrd.medical_clinic_project.controllers;

import com.luizmrd.medical_clinic_project.entities.Address;
import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.repositories.AddressRepository;
import com.luizmrd.medical_clinic_project.services.AddressService;
import com.luizmrd.medical_clinic_project.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService service;

    @GetMapping
    public ResponseEntity<List<Address>> findAll(){
    List<Address> list = service.findAll();
    return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id){
        Address obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
