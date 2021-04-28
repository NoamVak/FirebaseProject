package com.example.firebaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.firebaseproject.FBref.refStudents;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText stuName1,etStuClass;
    Spinner stuGrade;

    Student student;
    Vinfo1 v1=null;
    Vinfo2 v2=null;

    String[] arr={" ","7","8","9","10","11","12"};
    int grade,strClass,pos=0;
    String strName,location,date1;
    ArrayAdapter<String> adp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stuName1=(EditText)findViewById(R.id.stuName1);
        etStuClass=(EditText)findViewById(R.id.etStuClass);
        stuGrade=(Spinner) findViewById(R.id.stuGrade);

        stuGrade.setOnItemSelectedListener(this);


        adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,arr);
        stuGrade.setAdapter(adp);


    }

    public void submit(View view) {
        if(stuName1.getText().toString().equals("")||etStuClass.getText().toString().equals("")||pos==0) {
            Toast.makeText(this, "fill the missing areas", Toast.LENGTH_SHORT).show();
        }
        else {
            strName = stuName1.getText().toString();
            strClass = Integer.parseInt(etStuClass.getText().toString());
            grade = Integer.parseInt(arr[pos]);

            student = new Student(strName, grade, strClass,v1,v2);
            refStudents.child(strName).setValue(student);
            stuName1.setText("");
            etStuClass.setText("");
            stuGrade.setSelection(0);

        }

    }

    public void vacAct(View view) {
        Intent in = new Intent(this, VaccineData.class);
        startActivity(in);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        pos=position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}