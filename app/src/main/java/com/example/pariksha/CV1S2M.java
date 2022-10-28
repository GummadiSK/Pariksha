package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV1S2M extends AppCompatActivity {

    private Button cv1s2m1;
    private Button cv1s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv1_s2_m);
        cv1s2m1=findViewById(R.id.CV1S2M1);
        cv1s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV1S2M.this, CV1S2M1.class);
                startActivity(intent);
            }
        });

        cv1s2m2=findViewById(R.id.CV1S2M2);
        cv1s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV1S2M.this, CV1S2M2.class);
                startActivity(intent);
            }
        });
    }
}