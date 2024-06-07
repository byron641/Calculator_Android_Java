package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class MainActivity extends AppCompatActivity {

    Double numero1, numero2, total;
    String temp, Soperacion;
    int Temporal, operacion;
    TextView TxtViewCalculadora, TxtViewOperacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TxtViewCalculadora = findViewById(R.id.TxtViewCalculadora);
        TxtViewCalculadora.setText(String.valueOf(Temporal));
        TxtViewOperacion = findViewById(R.id.TextViewOperacion);
        Button Btn9 = findViewById(R.id.Btn9);
        Button Btn8 = findViewById(R.id.Btn8);
        Button Btn7 = findViewById(R.id.Btn7);
        Button Btn6 = findViewById(R.id.Btn6);
        Button Btn5 = findViewById(R.id.Btn5);
        Button Btn4 = findViewById(R.id.Btn4);
        Button Btn3 = findViewById(R.id.Btn3);
        Button Btn2 = findViewById(R.id.Btn2);
        Button Btn1 = findViewById(R.id.Btn1);
        Button Btn0 = findViewById(R.id.Btn0);
        Button BtnSumar = findViewById(R.id.BtnSumar);
        Button BtnRestar = findViewById(R.id.BtnRestar);
        Button BtnMulti = findViewById(R.id.BtnMulti);
        Button BtnDividir = findViewById(R.id.BtnDividir);
        Button BtnIgual = findViewById(R.id.BtnIgual);
        Button BtnDel = findViewById(R.id.BtnDel);

        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "9";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "8";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "7";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "6";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "5";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "4";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "3";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "2";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "1";
                TxtViewCalculadora.setText(temp);
            }
        });
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = TxtViewCalculadora.getText().toString() + "0";
                TxtViewCalculadora.setText(temp);
            }
        });
        BtnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble((String) TxtViewCalculadora.getText());
                temp="";
                TxtViewCalculadora.setText(temp);
                operacion=1;
                Soperacion="Suma";
                TxtViewOperacion.setText(Soperacion);
            }
        });
        BtnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble((String) TxtViewCalculadora.getText());
                temp="";
                TxtViewCalculadora.setText(temp);
                operacion=2;
                Soperacion="Resta";
                TxtViewOperacion.setText(Soperacion);
            }
        });
        BtnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble((String) TxtViewCalculadora.getText());
                temp="";
                TxtViewCalculadora.setText(temp);
                operacion=3;
                Soperacion="Multiplicación";
                TxtViewOperacion.setText(Soperacion);
            }
        });
        BtnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble((String) TxtViewCalculadora.getText());
                temp="";
                TxtViewCalculadora.setText(temp);
                operacion=4;
                Soperacion="Dividir";
                TxtViewOperacion.setText(Soperacion);
            }
        });
        BtnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero2 = Double.parseDouble((String) TxtViewCalculadora.getText());
                temp="";
                TxtViewCalculadora.setText(temp);
                switch (operacion) {
                    case 1:
                        total=numero1+numero2;
                        TxtViewCalculadora.setText(String.valueOf(total));
                        Soperacion="Resultado";
                        TxtViewOperacion.setText(Soperacion);
                        break;
                    case 2:
                        total=numero1-numero2;
                        TxtViewCalculadora.setText(String.valueOf(total));
                        Soperacion="Resultado";
                        TxtViewOperacion.setText(Soperacion);
                        break;
                    case 3:
                        total=numero1*numero2;
                        TxtViewCalculadora.setText(String.valueOf(total));
                        Soperacion="Resultado";
                        TxtViewOperacion.setText(Soperacion);
                        break;
                    case 4:
                        total=numero1/numero2;
                        TxtViewCalculadora.setText(String.valueOf(total));
                        Soperacion="Resultado";
                        TxtViewOperacion.setText(Soperacion);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
        BtnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena;
                cadena=TxtViewCalculadora.getText().toString();
                cadena = cadena.substring(0, cadena.length() - 1);
                TxtViewCalculadora.setText(cadena);

            }
        });
    }
}