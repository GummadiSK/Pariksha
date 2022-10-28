package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV1S1M extends AppCompatActivity {

    private Button cv1s1m1;
    private Button cv1s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv1_s1_m);

        cv1s1m1=findViewById(R.id.CV1S1M1);
        cv1s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV1S1M.this, CV1S1M1.class);
                startActivity(intent);
            }
        });

        cv1s1m2=findViewById(R.id.CV1S1M2);
        cv1s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV1S1M.this, CV1S1M2.class);
                startActivity(intent);
            }
        });
    }
}