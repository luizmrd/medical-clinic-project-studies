package com.luizmrd.medical_clinic_project.entities;

import com.luizmrd.medical_clinic_project.entities.enuns.EmployeeType;

public class Medical extends User{

        private String crm;
        private String specialty;

        public Medical(Long id, String name, EmployeeType employeeType, Integer phone, Integer cpf, String email, String crm, String specialty) {
                super(id, name, employeeType, phone, cpf, email);
                this.crm = crm;
                this.specialty = specialty;
        }

        public Medical() {

        }

        public String getCrm() {
                return crm;
        }

        public void setCrm(String crm) {
                this.crm = crm;
        }

        public String getSpecialty() {
                return specialty;
        }

        public void setSpecialty(String specialty) {
                this.specialty = specialty;
        }
}
