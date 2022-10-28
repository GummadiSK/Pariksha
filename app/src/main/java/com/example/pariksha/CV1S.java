package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV1S extends AppCompatActivity {

    private Button cv1s1;
    private Button cv1s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv1s);
        cv1s1=findViewById(R.id.CV1S1);
        cv1s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV1S.this, CV1S1M.class);
                startActivity(intent);
            }
        });

        cv1s2=findViewById(R.id.CV1S2);
        cv1s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV1S.this, CV1S2M.class);
                startActivity(intent);
            }
        });
    }
}