package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MECH extends AppCompatActivity {

    private Button m1;
    private Button m2;
    private Button m3;
    private Button m4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
        m1=findViewById(R.id.M1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MECH.this, M1S.class);
                startActivity(intent);
            }
        });

        m2=findViewById(R.id.M2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MECH.this, M2S.class);
                startActivity(intent);
            }
        });

        m3=findViewById(R.id.M3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MECH.this, M3S.class);
                startActivity(intent);
            }
        });

        m4=findViewById(R.id.M4);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MECH.this, M4S.class);
                startActivity(intent);
            }
        });
    }
}