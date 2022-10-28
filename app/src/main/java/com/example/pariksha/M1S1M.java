package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M1S1M extends AppCompatActivity {

    private Button m1s1m1;
    private Button m1s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_s1_m);

        m1s1m1=findViewById(R.id.M1S1M1);
        m1s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M1S1M.this, M1S1M1.class);
                startActivity(intent);
            }
        });

        m1s1m2=findViewById(R.id.M1S1M2);
        m1s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M1S1M.this, M1S1M2.class);
                startActivity(intent);
            }
        });
    }
}