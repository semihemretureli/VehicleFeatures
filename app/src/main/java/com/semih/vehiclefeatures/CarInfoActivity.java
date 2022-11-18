package com.semih.vehiclefeatures;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.semih.vehiclefeatures.databinding.ActivityCarInfoBinding;

public class CarInfoActivity extends BaseActivity{
    ActivityCarInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCarInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        CarInfo carInfo = (CarInfo) intent.getExtras().get("carInfo");
        binding.setCarInfo(carInfo);
        getSupportActionBar().setTitle(carInfo.getBrand()+" -> "+carInfo.getModel());

    }
    @Override    public void onBackPressed() {
        this.showAlertDialogForTogActivities("Do you want to return to the previous page?");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.onBackPressed();
//        if (item.getItemId() == android.R.id.home) {
//            finish();
//        }
        return super.onOptionsItemSelected(item);
    }
}