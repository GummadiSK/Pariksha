package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button cse;
    private Button ece;
    private Button civil;
    private Button mech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ece=findViewById(R.id.ECE);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ECE.class);
                startActivity(intent);
            }
        });
        cse=findViewById(R.id.CSE);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CSE.class);
                startActivity(intent);
            }
        });
        civil=findViewById(R.id.CIVIL);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CIVIL.class);
                startActivity(intent);
            }
        });
        mech=findViewById(R.id.MECH);
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MECH.class);
                startActivity(intent);
            }
        });
    }


}