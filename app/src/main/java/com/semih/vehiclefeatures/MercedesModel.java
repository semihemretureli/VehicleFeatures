package com.semih.vehiclefeatures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MercedesModel extends AppCompatActivity {

    private Button btnAmgGt;
    private Button btn190E;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercedes_model);
        btnAmgGt=(Button) findViewById(R.id.btnAmgGt);
        btn190E=(Button) findViewById(R.id.btn190E);

        btn190E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnMercedes=new Intent(MercedesModel.this,mercedes.class);
                startActivity(btnMercedes);
            }
        });
        btnAmgGt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnMercedes=new Intent(MercedesModel.this,MercedesAmgGt.class);
                startActivity(btnMercedes);
            }
        });
    }
}