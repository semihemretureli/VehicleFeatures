package com.semih.vehiclefeatures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.semih.vehiclefeatures.adapters.CarBrandAdapter;
import com.semih.vehiclefeatures.databinding.ActivityCarModelsBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarModelsActivity extends BaseActivity {
    ActivityCarModelsBinding binding;
    CarInfoList cars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarModelsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        CarInfo brandCar = (CarInfo) intent.getExtras().get("carInfo");
        cars = getAllCars();
        List<CarInfo> carList = new ArrayList<>();
        for (CarInfo item: cars.getCarList()) {
            if(item.getBrand().equals(brandCar.getBrand())){
                carList.add(item);
            }
        }
        CarBrandAdapter adapter = new CarBrandAdapter(carList, this, true);

        binding.rvCarBrand.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(CarModelsActivity.this);
        binding.rvCarBrand.setLayoutManager(layoutManager);
        binding.rvCarBrand.setHasFixedSize(true);
    }
}