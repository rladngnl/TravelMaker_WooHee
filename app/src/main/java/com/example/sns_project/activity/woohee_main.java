package com.example.sns_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sns_project.R;
import com.example.sns_project.fragment.HomeFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class woohee_main extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.woohee_main);


        findViewById(R.id.main_to_menu).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(woohee_main.this,
                                menu.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.main_to_besttrip).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(woohee_main.this,
                                best_trip.class);
                        startActivity(intent);
                    }
                });


        findViewById(R.id.main_to_upreview).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(woohee_main.this,
                                WritePostActivity.class);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.main_to_review).setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(woohee_main.this,
                                MainActivity.class );
                        startActivity(intent);
                    }
                });
    }




    private void myStartActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivityForResult(intent, 1);
    }
}
