package com.example.coinconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class ToEuroDollarConverterActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro_dollar_converter);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        Button convertDollarToReal = findViewById(R.id.convertDollarToReal);
        Button convertEuroToReal = findViewById(R.id.convertEuroToReal);
        EditText textField = findViewById(R.id.textField);
        TextView conversionResult = findViewById(R.id.conversionResult);

        double dollarValue = 2.99;
        double euroValue = 6.50;

        convertDollarToReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = textField.getText().toString();

                String result;
                result = decimalFormat.format((Double.parseDouble(inputValue) / dollarValue));
                conversionResult.setText("Seu valor em real será : " + result + " rs.");

            }
        });

        convertEuroToReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = textField.getText().toString();

                String result;
                result = decimalFormat.format((Double.parseDouble(inputValue) / euroValue));
                conversionResult.setText("Seu valor em real será : " + result + " reais.");

            }
        });
    }
}
