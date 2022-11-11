package com.semih.vehiclefeatures;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class BaseActivity extends AppCompatActivity {

    public CarInfoList getAllCars() {
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
