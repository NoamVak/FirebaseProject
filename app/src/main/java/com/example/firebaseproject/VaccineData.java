package com.example.firebaseproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static com.example.firebaseproject.FBref.refStudents;

public class VaccineData extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Vinfo1 v1;
    Vinfo2 v2;
    Student student;

    ArrayList<String> stuList = new ArrayList<String>();
    ArrayList<Student> stuValues = new ArrayList<Student>();
    ArrayAdapter<String> adp;
    Spinner nameList;
    RadioButton rb1,rb2,rb3;
    EditText loc,date;
    String str1,str2,strLoc,strDate,strName;
    DataSnapshot dS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vaccine_data);

        loc=(EditText)findViewById(R.id.loc);
        date=(EditText)findViewById(R.id.date);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        nameList=(Spinner)findViewById(R.id.namesList);


        refStudents.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot data : dS.getChildren()) {
                    student = data.getValue(Student.class);
                    stuValues.add(student);
                    stuList.add(student.getStuName());
                }
                adp = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, stuList);
                nameList.setAdapter(adp);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        nameList.setOnItemSelectedListener(this);


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