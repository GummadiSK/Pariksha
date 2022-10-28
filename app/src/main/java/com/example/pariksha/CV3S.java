package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV3S extends AppCompatActivity {

    private Button cv3s1;
    private Button cv3s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv3s);
        cv3s1=findViewById(R.id.CV3S1);
        cv3s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV3S.this, CV3S1M.class);
                startActivity(intent);
            }
        });

        cv3s2=findViewById(R.id.CV3S2);
        cv3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV3S.this, CV3S2M.class);
                startActivity(intent);
            }
        });
    }
}