package com.luizmrd.medical_clinic_project.entities.enuns;

public enum EmployeeType {
    ADMIN(1),
    SECRETARIA(2),
    MEDICO(3),
    PATIENT(4);

    private int code;

    private EmployeeType (int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }

    public static EmployeeType valueOf(int code){
        for(EmployeeType value : EmployeeType.values()){
            if (value.getCode() == code){
                return value;
            }
        }throw new IllegalArgumentException("Code invalid!!");
    }

}
