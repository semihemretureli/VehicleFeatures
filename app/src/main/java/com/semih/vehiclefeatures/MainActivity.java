package com.semih.vehiclefeatures;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.semih.vehiclefeatures.adapters.CarBrandAdapter;
import com.semih.vehiclefeatures.databinding.ActivityMainBinding;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
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
        for (CarInfo item: cars.getCarList()) {
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

    }


}