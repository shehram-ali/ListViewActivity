package com.example.myapplication.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText person,searchPerson;
    Button btn1,btn2,btn3,btn4;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void settingUpListerners() {
        btn1.setOnClickListener(view -> {


        });
    }
    private void initComponents() {
        person=findViewById(R.id.person);
        searchPerson=findViewById(R.id.searchPerson);
        btn1=findViewById(R.id.btn2);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        list=findViewById(R.id.list);

    }
}