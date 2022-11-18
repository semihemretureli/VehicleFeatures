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
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to exit the program?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}