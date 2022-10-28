package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M3S2M extends AppCompatActivity {

    private Button m3s2m1;
    private Button m3s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3_s2_m);
        m3s2m1=findViewById(R.id.M3S2M1);
        m3s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M3S2M.this, M3S2M1.class);
                startActivity(intent);
            }
        });

        m3s2m2=findViewById(R.id.M3S2M2);
        m3s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M3S2M.this, M3S2M2.class);
                startActivity(intent);
            }
        });
    }
}