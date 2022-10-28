package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C4S1M extends AppCompatActivity {

    private Button c4s1m1;
    private Button c4s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4_s1_m);
        c4s1m1=findViewById(R.id.C4S1M1);
        c4s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C4S1M.this, C4S1M1.class);
                startActivity(intent);
            }
        });

        c4s1m2=findViewById(R.id.C4S1M2);
        c4s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C4S1M.this, C4S1M2.class);
                startActivity(intent);
            }
        });
    }
}