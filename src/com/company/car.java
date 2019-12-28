package com.company;

import java.util.Date;

public class car extends  vehicals{

    String idPlateNum;
    String brand;
    Date entryTimeDate;
    int numDoors;
    String colors;

    public car() {
    }

    public car(String idPlateNum, String brand, Date entryTimeDate, int numDoors, String colors) {
        super(idPlateNum,brand,entryTimeDate);
        this.idPlateNum = idPlateNum;
        this.brand = brand;
        this.entryTimeDate = entryTimeDate;
        this.numDoors = numDoors;
        this.colors = colors;
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

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
}
