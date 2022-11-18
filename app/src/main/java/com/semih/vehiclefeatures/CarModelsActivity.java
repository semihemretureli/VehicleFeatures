package com.semih.vehiclefeatures;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
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
        getSupportActionBar().setTitle(brandCar.getBrand());
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to return to the previous page?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}