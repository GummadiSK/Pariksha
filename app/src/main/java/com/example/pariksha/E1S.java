package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E1S extends AppCompatActivity {

    private Button e1s1;
    private Button e1s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1_s);
        e1s1=findViewById(R.id.E1S1);
        e1s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E1S.this, E1S1M.class);
                startActivity(intent);
            }
        });

        e1s2=findViewById(R.id.E1S2);
        e1s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E1S.this, E1S2M.class);
                startActivity(intent);
            }
        });
    }
}