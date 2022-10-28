package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E1S2M extends AppCompatActivity {

    private Button e1s2m1;
    private Button e1s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1_s2_m);
        e1s2m1=findViewById(R.id.E1S2M1);
        e1s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E1S2M.this, E1S2M1.class);
                startActivity(intent);
            }
        });

        e1s2m2=findViewById(R.id.E1S2M2);
        e1s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E1S2M.this, E1S2M2.class);
                startActivity(intent);
            }
        });
    }
}