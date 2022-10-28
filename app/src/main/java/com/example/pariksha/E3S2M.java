package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E3S2M extends AppCompatActivity {

    private Button e3s2m1;
    private Button e3s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3_s2_m);
        e3s2m1=findViewById(R.id.E3S2M1);
        e3s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E3S2M.this, E3S2M1.class);
                startActivity(intent);
            }
        });

        e3s2m2=findViewById(R.id.E3S2M2);
        e3s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E3S2M.this, E3S2M2.class);
                startActivity(intent);
            }
        });
    }
}