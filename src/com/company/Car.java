package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String carBrand;
    private String carNumber;
    private int carCreationYear;
    private String carOwner;
    private List<String> ownersHistoryList = new ArrayList<>();

    public Car(String carBrand, String carNumber, int carCreationYear, String carOwner) {
        this.carBrand = carBrand;
        this.carNumber = carNumber;
        this.carCreationYear = carCreationYear;
        this.carOwner = carOwner;
        ownersHistoryList.add(carOwner);
    }

    public String getCarBrand() {
        return carBrand;
    }


    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getCarCreationYear() {
        return carCreationYear;
    }


    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
        ownersHistoryList.add(carOwner);
    }

    public List<String> getOwners() {
        return ownersHistoryList;
    }

    private String testMethod() {
        return "Private value";
    }

    private String testMethod(String a) {
        return a;
    }
}
