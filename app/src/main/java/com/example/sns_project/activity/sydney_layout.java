package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;

public class sydney_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sydney_layout);
    }

    public void onClicked(View v){
        Intent intent;
        switch(v.getId()){
            case R.id.sydney_info1_btn:
                intent = new Intent(sydney_layout.this,sydeny_info.class);
                startActivity(intent);
                break;

            case R.id.sydney_info2_btn:
                intent = new Intent(sydney_layout.this,sydeny_info2.class);
                startActivity(intent);
                break;

            case R.id.sydney_info3_btn:
                intent = new Intent(sydney_layout.this,sydney_info3.class);
                startActivity(intent);
                break;

        }
    }
}