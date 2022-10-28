package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M4S2M extends AppCompatActivity {

    private Button m4s2m1;
    private Button m4s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4_s2_m);
        m4s2m1=findViewById(R.id.M4S2M1);
        m4s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M4S2M.this, M4S2M1.class);
                startActivity(intent);
            }
        });

        m4s2m2=findViewById(R.id.M4S2M2);
        m4s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M4S2M.this, M4S2M2.class);
                startActivity(intent);
            }
        });
    }
}