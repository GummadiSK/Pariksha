package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CIVIL extends AppCompatActivity {

    private Button cv1;
    private Button cv2;
    private Button cv3;
    private Button cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        cv1=findViewById(R.id.CV1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CIVIL.this, CV1S.class);
                startActivity(intent);
            }
        });

        cv2=findViewById(R.id.CV2);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CIVIL.this, CV2S.class);
                startActivity(intent);
            }
        });

        cv3=findViewById(R.id.CV3);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CIVIL.this, CV3S.class);
                startActivity(intent);
            }
        });

        cv4=findViewById(R.id.CV4);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CIVIL.this, CV4S.class);
                startActivity(intent);
            }
        });
    }
}