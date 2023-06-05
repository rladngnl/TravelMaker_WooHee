package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class osaka_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osaka_layout);
    }

    public void onClicked(View v){
        Intent intent;
        switch(v.getId()){
            case R.id.osaka_info1_btn:
            intent = new Intent(osaka_layout.this,osaka_info.class);
            startActivity(intent);
            break;
            case R.id.osaka_info2_btn:
                intent = new Intent(osaka_layout.this,osaka_info2.class);
                startActivity(intent);
                break;
        }
    }
}