package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV2S1M extends AppCompatActivity {

    private Button cv2s1m1;
    private Button cv2s1m2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv2_s1_m);

        cv2s1m1=findViewById(R.id.CV2S1M1);
        cv2s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV2S1M.this, CV2S1M1.class);
                startActivity(intent);
            }
        });

        cv2s1m2=findViewById(R.id.CV2S1M2);
        cv2s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV2S1M.this, CV2S1M2.class);
                startActivity(intent);
            }
        });
    }
}