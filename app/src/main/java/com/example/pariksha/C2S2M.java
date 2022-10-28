package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C2S2M extends AppCompatActivity {

    private Button c2s2m1;
    private Button c2s2m2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_s2_m);

        c2s2m1=findViewById(R.id.C2S2M1);
        c2s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C2S2M.this, C2S2M1.class);
                startActivity(intent);
            }
        });

        c2s2m2=findViewById(R.id.C2S2M2);
        c2s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C2S2M.this, C2S2M2.class);
                startActivity(intent);
            }
        });
    }
}