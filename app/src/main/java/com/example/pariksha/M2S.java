package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M2S extends AppCompatActivity {

    private Button m2s1;
    private Button m2s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2_s);

        m2s1=findViewById(R.id.M2S1);
        m2s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M2S.this, M2S1M.class);
                startActivity(intent);
            }
        });

        m2s2=findViewById(R.id.M2S2);
        m2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M2S.this, M2S2M.class);
                startActivity(intent);
            }
        });
    }
}