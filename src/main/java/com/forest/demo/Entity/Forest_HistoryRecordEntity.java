package com.forest.demo.Entity;

import lombok.Data;

@Data
public class Forest_HistoryRecordEntity {
    private int forest_HistoryRecord_ID;
    private int forest_User_ID;
    private int forest_Pets_ID;
    private Forest_PetsEntity pet;
    private Forest_userEntity user;
    private String forest_User_Pets_Time;
    private int num;
    private int size;
    private String forest_User_Name;
}
