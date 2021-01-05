package com.forest.demo.Entity;

import com.forest.demo.Mapper.Forest_PetsMapper;
import lombok.Data;

@Data
public class Forest_Customer_PetsEntity {
    private int forest_Customer_Pets_ID;
    private int forest_Customer_ID;
    private int forest_Pets_ID;
    private Forest_PetsEntity pet;
    private Forest_CustomerEntity customer;
    private String forest_Customer_Pets_Time;
    private int num;
    private int size;
}
