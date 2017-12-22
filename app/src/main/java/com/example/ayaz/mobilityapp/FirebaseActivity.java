package com.example.ayaz.mobilityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseActivity extends AppCompatActivity {
 private FirebaseAuth mAuth;
 private FirebaseDatabase mDatabase;
 private DatabaseReference mReference;
 FirebaseUser mUser;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        if(mAuth!=null) {
            mUser=mAuth.getCurrentUser();
            Toast.makeText(this, mUser.getEmail(), Toast.LENGTH_LONG).show();




        }





    }
}
