package com.example.coinconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class ToRealConverterActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_converter);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        EditText textField = findViewById(R.id.textField);
        TextView conversionResult = findViewById(R.id.conversionResult);

        Button convertToDollar = findViewById(R.id.convertRealToDollar);
        Button convertToEuro = findViewById(R.id.convertRealToEuro);

        double dollarValue = 2.99;
        double euroValue = 6.50;

        convertToDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String inputValue = textField.getText().toString();

                String result;
                result = decimalFormat.format((Double.parseDouble(inputValue) * dollarValue));
                conversionResult.setText("Seu valor em dólar será : " + result + " dólares.");

            }
        });

        convertToEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = textField.getText().toString();

                String result;
                result = decimalFormat.format((Double.parseDouble(inputValue) * euroValue));
                conversionResult.setText("Seu valor em euro será : " + result + " euros.");

            }
        });


    }
}
