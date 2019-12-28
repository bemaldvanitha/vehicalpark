package com.company;

import java.util.Date;

public class van extends vehicals{

    String idPlateNum;
    String brand;
    Date entryTimeDate;
    double cargoVolumn;

    public van() {
    }

    public van(String idPlateNum, String brand, Date entryTimeDate, double cargoVolumn) {
        super(idPlateNum,brand,entryTimeDate);
        this.idPlateNum = idPlateNum;
        this.brand = brand;
        this.entryTimeDate = entryTimeDate;
        this.cargoVolumn = cargoVolumn;
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

    public double getCargoVolumn() {
        return cargoVolumn;
    }

    public void setCargoVolumn(double cargoVolumn) {
        this.cargoVolumn = cargoVolumn;
    }
}
