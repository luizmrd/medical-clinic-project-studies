package com.luizmrd.medical_clinic_project.test;

import com.luizmrd.medical_clinic_project.entities.Address;
import com.luizmrd.medical_clinic_project.entities.Patient;
import com.luizmrd.medical_clinic_project.entities.User;
import com.luizmrd.medical_clinic_project.entities.enuns.EmployeeType;
import com.luizmrd.medical_clinic_project.repositories.AddressRepository;
import com.luizmrd.medical_clinic_project.repositories.PatientRepository;
import com.luizmrd.medical_clinic_project.repositories.UserRepository;
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

        @Autowired
        private UserRepository userRepository;


        public void run(String... args) throws Exception {

        Patient p1 = new Patient(null,"Roberto","2323233",3136666,"roberto@gmail.com");

        patientRepository.saveAll(Arrays.asList(p1));



        Address a1 = new Address(null,"Ponte Beatriz",null,"11090",18537-592,"Arapongas","Minas Gerais");
        Address a2 = new Address(null, "Avenida Paulista", "Apto 42", "1200", 1311-200, "São Paulo", "São Paulo");
        Address a3 = new Address(null, "Rua das Flores", null, "45", 89201-20, "Joinville", "Santa Catarina");
        Address a4 = new Address(null, "Praça da República", "Bloco B", "10", 20211-350, "Rio de Janeiro", "Rio de Janeiro");

        addressRepository.saveAll(Arrays.asList(a1,a2,a3,a4));

            User u1 = new User(null, "Sabrina", EmployeeType.SECRETARIA ,12545,121212,"joao@gmail.com" );
            User u2 = new User(null, "Fernando", EmployeeType.MEDICO ,12545,321212,"fernando@gmail.com" );
            User u3 = new User(null, "Aline", EmployeeType.ADMIN ,12545,521212,"aline@gmail.com" );

            userRepository.saveAll(Arrays.asList(u1,u2,u3));


            p1.setAddress(a1);
            a1.setPatient(p1);

            u2.setAddress(a3);
            a3.setUser(u2);

            u3.setAddress(a4);
            a4.setUser(u3);

            u1.setAddress(a2);
            a2.setUser(u1);
            userRepository.saveAll(Arrays.asList(u1,u2,u3));

            patientRepository.save(p1);



        }


}
