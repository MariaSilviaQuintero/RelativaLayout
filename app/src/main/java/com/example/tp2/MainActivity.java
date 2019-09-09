package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convertir);
    }

    public void elegir(View vista1) {

        RadioButton btn1 = findViewById(R.id.rbDolar);
        RadioButton btn2 = findViewById(R.id.rbEuro);
        EditText txdolar = findViewById(R.id.etDolares);
        EditText txeuro = findViewById(R.id.etEuros);

        if (btn1.isChecked()==true) {
            txdolar.setEnabled(true);
            txeuro.setEnabled(false);
            txeuro.setText("");
        } else if (btn2.isChecked()==true) {
            txeuro.setEnabled(true);
            txdolar.setEnabled(false);
            txdolar.setText("");
        }
    }


    public void convertir(View vista2) {

        RadioButton btn1 = findViewById(R.id.rbDolar);
        EditText txdolar = findViewById(R.id.etDolares);
        EditText txeuro = findViewById(R.id.etEuros);
        EditText txtotal = findViewById(R.id.etTotal);

        double dolar = 1.50;
        double euro = 1.00;

        if(btn1.isChecked())
        {
            double total = Double.parseDouble(txdolar.getText().toString()) / dolar;
            txtotal.setText(String.valueOf(total));
        }
        else
        {
            double total = Double.parseDouble(txeuro.getText().toString()) / euro;
            txtotal.setText(String.valueOf(total));
        }
    }
}
