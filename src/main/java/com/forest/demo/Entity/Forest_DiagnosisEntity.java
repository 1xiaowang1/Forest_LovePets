package com.forest.demo.Entity;

import lombok.Data;

@Data
public class Forest_DiagnosisEntity {
    private int forest_Diagnosis_ID;
    private int forest_Diagnosis_Style;
    private String forest_Diagnosis_Detail;
    private int forest_Pets_ID;
    private int forest_VetDoctor_ID;
    private String  forest_Diagnosis_Time;
    private Forest_PetsEntity pet;
    private Forest_VetDoctorEntity doctor;
    private int num;
    private int size;
    private String forest_VetDoctor_Card;
    private String forest_VetDoctor_Name;
    private int forest_Customer_ID;
}
