package com.example.hp.respo;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button loginbtn;
    TextInputLayout til1,til2;
    TextInputEditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getSupportActionBar().hide();
        loginbtn = findViewById(R.id.btn1);
        edit1 = findViewById(R.id.et1);
        til1 = findViewById(R.id.til1);
        til2 = findViewById(R.id.til2);
        edit2 = findViewById(R.id.et2);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String text1 = edit1.getText().toString();
                 String text2 = edit2.getText().toString();
                if (text1.equals("")) {

                    til1.setError("Please enter username");

                }
                if(text2.equals("")){

                    til2.setError("Please enter password");

                }
                Intent intent = new Intent(Login.this,Waiter.class);
                startActivity(intent);
            }
        });

        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.equals(null)) ;
                else
                {
                    til1.setError(null);
                }
            }
        });
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit2.equals(null)) ;
                else
                {
                    til2.setError(null);
                }
            }
        });
    }


}
