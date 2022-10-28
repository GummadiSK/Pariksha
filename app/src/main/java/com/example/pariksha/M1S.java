package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M1S extends AppCompatActivity {

    private Button m1s1;
    private Button m1s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_s);

        m1s1=findViewById(R.id.M1S1);
        m1s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M1S.this, M1S1M.class);
                startActivity(intent);
            }
        });

        m1s2=findViewById(R.id.M1S2);
        m1s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M1S.this, M1S2M.class);
                startActivity(intent);
            }
        });
    }
}