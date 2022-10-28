package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M3S extends AppCompatActivity {

    private Button m3s1;
    private Button m3s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3_s);
        m3s1=findViewById(R.id.M3S1);
        m3s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M3S.this, M3S1M.class);
                startActivity(intent);
            }
        });

        m3s2=findViewById(R.id.M3S2);
        m3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M3S.this, M3S2M.class);
                startActivity(intent);
            }
        });
    }
}