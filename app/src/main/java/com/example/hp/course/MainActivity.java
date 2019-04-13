package com.example.hp.course;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_fname;
    EditText et_lname;
    EditText et_db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_Register =findViewById(R.id.btn_register);
          et_fname =findViewById(R.id.et_fname);
          et_lname =findViewById(R.id.et_lname);
          et_db =findViewById(R.id.et_db);

        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getBaseContext(),Main2Activity.class);
                i.putExtra("fname",et_fname.getText().toString());
                i.putExtra("lname",et_lname.getText().toString());
                i.putExtra("db",et_db.getText().toString());
                startActivity(i);


            }
        });

    }
}
