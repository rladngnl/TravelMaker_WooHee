package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class boracay_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boracay_layout);


    }

    public void onClicked(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.boracay_info_btn:
                intent = new Intent(boracay_layout.this,boracay_info.class);
                startActivity(intent);
                break;
            case R.id.boracay_info2_btn:
                intent = new Intent(boracay_layout.this,boracay_info2.class);
                startActivity(intent);
                break;
            case R.id.boracay_info3_btn:
                intent = new Intent(boracay_layout.this,boracay_info3.class);
                startActivity(intent);
        }

    }
}