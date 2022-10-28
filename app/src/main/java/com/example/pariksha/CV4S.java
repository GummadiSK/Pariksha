package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV4S extends AppCompatActivity {

    private Button cv4s1;
    private Button cv4s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv4s);
        cv4s1=findViewById(R.id.CV4S1);
        cv4s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV4S.this, CV4S1M.class);
                startActivity(intent);
            }
        });

        cv4s2=findViewById(R.id.CV4S2);
        cv4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV4S.this, CV4S2M.class);
                startActivity(intent);
            }
        });
    }
}