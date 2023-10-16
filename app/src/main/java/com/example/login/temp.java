package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class temp extends AppCompatActivity {
    Button ansBtn,again;
    TextView showAns;
    EditText inputNum;
    RadioButton c2f,f2c;
    Double x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        ansBtn = (Button) findViewById(R.id.ansBtn);
        showAns = (TextView) findViewById(R.id.showAns);
        inputNum = (EditText) findViewById(R.id.inputNum);
        c2f = (RadioButton) findViewById(R.id.c2f);
        f2c = (RadioButton) findViewById(R.id.f2c);
        again = (Button) findViewById(R.id.again);

        ansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    showAns.setText("Please give temp");
                }
                else {
                    x = Double.parseDouble(String.valueOf(inputNum.getText()));

                    if (c2f.isChecked()){
                        x = (x*9)/5+32;

                        x = Double.parseDouble(new DecimalFormat("##.###").format(x));
                        showAns.setText(String.valueOf(x) + " °F");
                    }

                    else if (f2c.isChecked()){
                        x = (x-32)*5/9;
                        x = Double.parseDouble(new DecimalFormat("##.###").format(x));
                        showAns.setText(String.valueOf(x) + " °C");
                    }

                    else {
                        showAns.setText("Please select an option!");
                    }
                }
            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAns.setText("0.0");
                inputNum.setText("");
                c2f.setChecked(false);
                f2c.setChecked(false);
            }
        });
    }
}