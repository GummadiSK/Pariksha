package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E2S1M extends AppCompatActivity {

    private Button e2s1m1;
    private Button e2s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2_s1_m);

        e2s1m1=findViewById(R.id.E2S1M1);
        e2s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E2S1M.this, E2S1M1.class);
                startActivity(intent);
            }
        });

        e2s1m2=findViewById(R.id.E2S1M2);
        e2s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E2S1M.this, E2S1M2.class);
                startActivity(intent);
            }
        });
    }
}