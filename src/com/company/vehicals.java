package com.company;

import java.util.Date;


public abstract class vehicals {

    String idPlateNum;
    String brand;
    Date entryTimeDate;

    public vehicals() {
    }

    public vehicals(String idPlateNum, String brand, Date entryTimeDate) {
        this.idPlateNum = idPlateNum;
        this.brand = brand;
        this.entryTimeDate = entryTimeDate;
    }

    public String getIdPlateNum() {
        return idPlateNum;
    }

    public void setIdPlateNum(String idPlateNum) {
        this.idPlateNum = idPlateNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getEntryTimeDate() {
        return entryTimeDate;
    }

    public void setEntryTimeDate(Date entryTimeDate) {
        this.entryTimeDate = entryTimeDate;
    }
}
