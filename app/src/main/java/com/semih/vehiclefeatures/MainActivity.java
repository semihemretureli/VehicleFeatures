package com.semih.vehiclefeatures;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private Button mercedes;
//    private Button citroen;
    CarInfoList cars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mercedes = (Button) findViewById(R.id.btnMercedes);
        //citroen = (Button) findViewById(R.id.btnCitroen);
        cars=getAllCars();
        System.out.println(cars.toString());
       /* mercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnMercedes = new Intent(MainActivity.this, MercedesModel.class);
                btnMercedes.putExtra("carInfo", new CarInfo("mercedes", "190E"));
                startActivity(btnMercedes);
            }
        });
        citroen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnCitroen = new Intent(MainActivity.this, CModel.class);
                btnCitroen.putExtra("carInfo", new CarInfo("citroen", "c5AirCross"));
                startActivity(btnCitroen);
            }
        });*/
    }

    private CarInfoList getAllCars() {
        InputStream is = getResources().openRawResource(R.raw.cars);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);

            }
            is.close();
        } catch (Exception e){

        }
            finally {
            //is.close();
        }

        String jsonString = writer.toString();
        Gson gson=new GsonBuilder().create();
       CarInfoList cars1 = gson.fromJson(jsonString,CarInfoList.class);
       return cars1;
    }
}