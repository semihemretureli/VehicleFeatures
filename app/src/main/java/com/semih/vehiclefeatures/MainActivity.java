package com.semih.vehiclefeatures;


import androidx.appcompat.app.AlertDialog;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;

import android.os.Bundle;

import android.widget.Toolbar;


import com.semih.vehiclefeatures.adapters.CarBrandAdapter;
import com.semih.vehiclefeatures.databinding.ActivityMainBinding;


import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    CarInfoList cars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cars = getAllCars();
        HashMap<String, CarInfo> carMap = new HashMap<>();
        for (CarInfo item : cars.getCarList()) {
            carMap.put(item.getBrand(), item);
        }
        CarBrandAdapter adapter = new CarBrandAdapter(new ArrayList<CarInfo>(carMap.values()), this, false);

        binding.rvCarBrand.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(MainActivity.this);
        binding.rvCarBrand.setLayoutManager(layoutManager);
        binding.rvCarBrand.setHasFixedSize(true);
        adapter.notifyDataSetChanged();
        System.out.println(cars.toString());
        getSupportActionBar().setTitle("Car Features");


    }

    @Override
    public void onBackPressed() {
        this.showAlertDialogForTogActivities("Do you want to exit the program?");
    }

}