package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M4S extends AppCompatActivity {
    private Button m4s1;
    private Button m4s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4_s);
        m4s1=findViewById(R.id.M4S1);
        m4s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M4S.this, M4S1M.class);
                startActivity(intent);
            }
        });

        m4s2=findViewById(R.id.M4S2);
        m4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M4S.this, M4S2M.class);
                startActivity(intent);
            }
        });
    }
}