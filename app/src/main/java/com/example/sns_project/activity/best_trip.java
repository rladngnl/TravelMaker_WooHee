package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class best_trip extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.best_trip);

        findViewById(R.id.best_trip_boracay).setOnClickListener
                                    (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(best_trip.this,
                                        boracay_layout.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.best_trip_sydney).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                sydney_layout.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.best_trip_paris).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                paris_layout.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.best_trip_czech).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                czech_layout.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.best_trip_china).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                china_layout.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.best_trip_osaka).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                osaka_layout.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.best_trip_singapore).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                singapore_layout.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.best_trip_hawaii).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(best_trip.this,
                                hawaii_layout.class);
                        startActivity(intent);
                    }
                });

    }



}