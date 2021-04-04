package com.example.firebaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.firebaseproject.FBref.refStudents;

public class VaccineData extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Vinfo1 v1;
    Vinfo2 v2;
    Student student;

    RadioButton rb1,rb2,rb3;
    EditText loc,date;
    String strLoc,strDate,strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vaccine_data);

        loc=(EditText)findViewById(R.id.loc);
        date=(EditText)findViewById(R.id.date);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);

        Intent gi=getIntent();



    }

    public void submit(View view) {



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}