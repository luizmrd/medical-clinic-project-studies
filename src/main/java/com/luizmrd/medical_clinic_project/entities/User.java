package com.luizmrd.medical_clinic_project.entities;

import com.luizmrd.medical_clinic_project.entities.enuns.EmployeeType;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer phone;

    private Integer cpf;

    private String email;


    private Integer employeeType;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;


    public User(Long id, String name,EmployeeType employeeType,  Integer phone, Integer cpf, String email) {
        this.id = id;
        this.name = name;
        setEmployeeType(employeeType);
        this.phone = phone;
        this.cpf = cpf;
        this.email = email;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeType getEmployeeType() {
        return EmployeeType.valueOf(employeeType);
    }

    public void setEmployeeType(EmployeeType employeeType) {
        if (employeeType != null){
            this.employeeType = employeeType.getCode();
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
