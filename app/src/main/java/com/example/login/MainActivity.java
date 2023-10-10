package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ET1, ET2;
    Button B1, B2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referencing
        ET1=(EditText) findViewById(R.id.etEmail);
        ET2=( EditText) findViewById(R.id.etPass);

        B1=(Button) findViewById(R.id.signinBtn);
        B2=(Button) findViewById(R.id.signupBtn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login Button Selected.",

                        Toast.LENGTH_LONG).show();
                String textN=ET1.getText().toString();
                String textP=ET2.getText().toString();
                if((textN.equals("mahafuj")) && (textP.equals("123"))){
                    Intent intent = new Intent(getApplicationContext(),
                            temp.class);
                    startActivity(intent);
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Signup Button Selected.",

                        Toast.LENGTH_LONG).show();
            } });

    }
}