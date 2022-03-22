package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inpute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonUpdate(View view) {

        try {

            inpute = (EditText) findViewById(R.id.editTextTextPersonName);
            String value= inpute.getText().toString();

            final int BASE = 32;
            final double CONVERSION_FACTOR = 5.0 / 9.0;
            double celsiusTemp;
            int fahrenheitTemp = Integer.parseInt(value);  // value to convert
            celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR ;

            String str = String.valueOf(celsiusTemp);
            System.out.println("clicked "+ celsiusTemp);
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}