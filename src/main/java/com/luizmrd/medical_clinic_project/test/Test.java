package com.luizmrd.medical_clinic_project.test;

import com.luizmrd.medical_clinic_project.entities.Address;
import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.repositories.AddressRepository;
import com.luizmrd.medical_clinic_project.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

    import java.util.Arrays;

    @Configuration
    public class Test implements CommandLineRunner {
        @Autowired
        private PatientRepository patientRepository;

        @Autowired
        private AddressRepository addressRepository;


        public void run(String... args) throws Exception {

        Patient p1 = new Patient(null,"Roberto","2323233",3136666,"roberto@gmail.com");

        patientRepository.saveAll(Arrays.asList(p1));



        Address a1 = new Address(null,"Ponte Beatriz","null","11090",18537-592,"Arapongas","Minas Gerais");


        addressRepository.saveAll(Arrays.asList(a1));


            p1.setAddress(a1);
            a1.setPatient(p1);

            patientRepository.save(p1);



        }


}
