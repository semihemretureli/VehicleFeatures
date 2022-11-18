package com.semih.vehiclefeatures;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.semih.vehiclefeatures.databinding.ActivityCarInfoBinding;

public class CarInfoActivity extends AppCompatActivity {
    ActivityCarInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCarInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        CarInfo carInfo = (CarInfo) intent.getExtras().get("carInfo");
        binding.setCarInfo(carInfo);
        getSupportActionBar().setTitle(carInfo.getBrand()+" "+carInfo.getModel());

    }
    @Override    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to return to the previous page?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override            public void onClick(DialogInterface dialog, int which) {
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