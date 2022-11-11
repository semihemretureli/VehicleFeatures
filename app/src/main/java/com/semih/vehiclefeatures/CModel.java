package com.semih.vehiclefeatures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CModel extends AppCompatActivity {
    private Button btnC5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmodel);
        btnC5 = (Button) findViewById(R.id.btnC5);

        btnC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnC5=new Intent(CModel.this,C5.class);
                startActivity(btnC5);
            }
        });
    }
}