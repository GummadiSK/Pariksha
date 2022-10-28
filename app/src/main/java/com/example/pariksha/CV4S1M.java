package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV4S1M extends AppCompatActivity {

    private Button cv4s1m1;
    private Button cv4s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv4_s1_m);
        cv4s1m1=findViewById(R.id.CV4S1M1);
        cv4s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV4S1M.this, CV4S1M1.class);
                startActivity(intent);
            }
        });

        cv4s1m2=findViewById(R.id.CV4S1M2);
        cv4s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV4S1M.this, CV4S1M2.class);
                startActivity(intent);
            }
        });
    }
}