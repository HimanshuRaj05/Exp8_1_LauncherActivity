package com.intreve.launcheractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {
    ConstraintLayout launcherLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        launcherLayout=findViewById(R.id.launcherLayout);
        launcherLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}