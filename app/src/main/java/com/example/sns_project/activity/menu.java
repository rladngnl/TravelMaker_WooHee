package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        findViewById(R.id.menu_to_myreview).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(menu.this,
                                myreview.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.menu_to_upreview).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(menu.this,
                                WritePostActivity.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.menu_to_review).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(menu.this,
                                MainActivity.class); // 리뷰 보는 xml 받아야함
                        startActivity(intent);
                    }
                });

        findViewById(R.id.menu_to_besttrip).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(menu.this,
                                best_trip.class);
                        startActivity(intent);
                    }
                });
    }
}