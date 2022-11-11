package com.semih.vehiclefeatures;

import java.io.Serializable;

public class CarInfo implements Serializable {
    private String brand;
    private String model;

    public CarInfo(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public CarInfo() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "marka='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
