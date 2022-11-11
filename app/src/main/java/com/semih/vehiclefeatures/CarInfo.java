package com.semih.vehiclefeatures;

import java.io.Serializable;

public class CarInfo implements Serializable {
    private String brand;
    private String model;
    private String motorType;
    private String maxSpeed;
    private String zeroToHundredSpeed;
    private String gearType;
    private String wheelSize;
    private String bodyType;
    private String energyType;
    private double bodyWeight;
    private String productionYears;
    private int euroNcapPoint;
    private String pullType;


    public CarInfo(String brand, String model, String motorType, String maxSpeed, String zeroToHundredSpeed, String gearType, String wheelSize, String bodyType, String energyType, double bodyWeight, String productionYears, int euroNcapPoint, String pullType) {
        this.brand = brand;
        this.model = model;
        this.motorType = motorType;
        this.maxSpeed = maxSpeed;
        this.zeroToHundredSpeed = zeroToHundredSpeed;
        this.gearType = gearType;
        this.wheelSize = wheelSize;
        this.bodyType = bodyType;
        this.energyType = energyType;
        this.bodyWeight = bodyWeight;
        this.productionYears = productionYears;
        this.euroNcapPoint = euroNcapPoint;
        this.pullType = pullType;
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

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getZeroToHundredSpeed() {
        return zeroToHundredSpeed;
    }

    public void setZeroToHundredSpeed(String zeroToHundredSpeed) {
        this.zeroToHundredSpeed = zeroToHundredSpeed;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getProductionYears() {
        return productionYears;
    }

    public void setProductionYears(String productionYears) {
        this.productionYears = productionYears;
    }

    public int getEuroNcapPoint() {
        return euroNcapPoint;
    }

    public void setEuroNcapPoint(int euroNcapPoint) {
        this.euroNcapPoint = euroNcapPoint;
    }

    public String getPullType() {
        return pullType;
    }

    public void setPullType(String pullType) {
        this.pullType = pullType;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", motorType='" + motorType + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", zeroToHundredSpeed='" + zeroToHundredSpeed + '\'' +
                ", gearType='" + gearType + '\'' +
                ", wheelSize='" + wheelSize + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", energyType='" + energyType + '\'' +
                ", bodyWeight=" + bodyWeight +
                ", productionYears='" + productionYears + '\'' +
                ", euroNcapPoint=" + euroNcapPoint +
                ", pullType='" + pullType + '\'' +
                '}';
    }
}
