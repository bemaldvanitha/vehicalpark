package com.company;

import java.util.Date;

public class motorbike extends vehicals {

    String idPlateNum;
    String brand;
    Date entryTimeDate;
    int enginesize;

    public motorbike() {
    }

    public motorbike(String idPlateNum, String brand, Date entryTimeDate, int enginesize) {
        super(idPlateNum,brand,entryTimeDate);
        this.idPlateNum = idPlateNum;
        this.brand = brand;
        this.entryTimeDate = entryTimeDate;
        this.enginesize = enginesize;
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

    public int getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(int enginesize) {
        this.enginesize = enginesize;
    }
}
