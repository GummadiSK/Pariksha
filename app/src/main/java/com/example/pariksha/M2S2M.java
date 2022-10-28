package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M2S2M extends AppCompatActivity {

    private Button m2s2m1;
    private Button m2s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2_s2_m);

        m2s2m1=findViewById(R.id.M2S2M1);
        m2s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M2S2M.this, M2S2M1.class);
                startActivity(intent);
            }
        });

        m2s2m2=findViewById(R.id.M2S2M2);
        m2s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(M2S2M.this, M2S2M2.class);
                startActivity(intent);
            }
        });
    }
}