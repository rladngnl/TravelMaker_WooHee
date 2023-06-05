package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class paris_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paris_layout);
    }

    public void onClicked(View v){
        Intent intent;
        switch(v.getId()){
            case R.id.paris_info1_btn:
                intent = new Intent(paris_layout.this,paris_info.class);
                startActivity(intent);
                break;
            case R.id.paris_info2_btn:
                intent = new Intent(paris_layout.this,paris_info2.class);
                startActivity(intent);
                break;
            case R.id.paris_info3_btn:
                intent = new Intent(paris_layout.this,paris_info3.class);
                startActivity(intent);
                break;
        }
    }
}