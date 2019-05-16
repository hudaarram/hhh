package com.example.hp.course;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv_name;
    TextView tv_db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_name =findViewById(R.id.tv_name);
        tv_db =findViewById(R.id.tv_db);
        Intent i=getIntent();
        String fname =i.getStringExtra("fname");
        String lname =i.getStringExtra("lname");
        String db =i.getStringExtra("db");
        tv_name.setText(fname+" "+lname);
        tv_db.setText(db);
    }
}
