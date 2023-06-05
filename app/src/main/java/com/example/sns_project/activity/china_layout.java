package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class china_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.china_layout);
    }

    public void onClicked(View v){
        Intent intent;
        switch(v.getId()){
            case R.id.china_info1_btn:
                intent = new Intent(china_layout.this,china_info.class);
                startActivity(intent);
                break;
        }
    }
}