package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Weight;
    EditText Height;
    TextView display;
    TextView display2;
    Button Enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=findViewById(R.id.txtName);
        Weight=findViewById(R.id.txtWeight);
        Height=findViewById(R.id.txtHeight);
        display=findViewById(R.id.txtDisplay1);
        display2=findViewById(R.id.txtDisplay2);
        Enter=findViewById(R.id.btnEnter);

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strName;
                String strWeight;
                String strHeight;

                strName = Name.getText().toString();
                strWeight = Weight.getText().toString();
                strHeight = Height.getText().toString();

                double num1 = Double.parseDouble(strWeight);
                double num2 = Double.parseDouble(strHeight);

                double bmi = num1 / (num2 * num2);

                display.setText("Name: " + strName);
                display2.setText("Body Mass Index: " + bmi);
            }
        });
    }
}