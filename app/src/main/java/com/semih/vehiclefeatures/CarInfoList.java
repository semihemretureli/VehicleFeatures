package com.semih.vehiclefeatures;

import java.io.Serializable;
import java.util.ArrayList;

public class CarInfoList implements Serializable {
    private ArrayList<CarInfo> carList ;

    public ArrayList<CarInfo> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<CarInfo> carList) {
        this.carList = carList;

    }

    @Override
    public String toString() {
        return "CarInfoList{" +
                "carList=" + carList +
                '}';
    }
}
