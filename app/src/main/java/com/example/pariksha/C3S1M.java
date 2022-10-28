package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C3S1M extends AppCompatActivity {
    private Button c3s1m1;
    private Button c3s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_s1_m);
        c3s1m1=findViewById(R.id.C3S1M1);
        c3s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C3S1M.this, C3S1M1.class);
                startActivity(intent);
            }
        });

        c3s1m2=findViewById(R.id.C3S1M2);
        c3s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C3S1M.this, C3S1M2.class);
                startActivity(intent);
            }
        });
    }
}