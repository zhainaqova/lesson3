package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public
class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText number1,number2;
    Button btnplus,btnminus;
    Button btnmultiple,btndivision;
    TextView tvResult;


    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        number1 = findViewById ( R.id.et_number1 );
        number2 = findViewById ( R.id.et_number2 );

        btnplus = findViewById ( R.id.btnPlus );
        btnminus = findViewById ( R.id.btnMinus );
        btnmultiple = findViewById ( R.id.btnMultiple );
        btndivision = findViewById ( R.id.btnDivide );
        tvResult = findViewById ( R.id.textResult );
        btnplus.setOnClickListener ( this );
        btnminus.setOnClickListener ( this );
        btnmultiple.setOnClickListener ( this );
        btndivision.setOnClickListener ( this );
    }
    @Override
    public void onClick(View view){
        int r = 0;
        if (view.getId ()== R.id.btnPlus){
            r = Integer.parseInt ( number1.getText().toString())+
                    Integer.parseInt (number2.getText().toString());
        }else if (view.getId () == R.id.btnMinus){
            r = Integer.parseInt ( number1.getText().toString())-
                    Integer.parseInt (number2.getText().toString());
        }else if (view.getId () == R.id.btnMultiple){
            r = Integer.parseInt ( number1.getText().toString())*
                    Integer.parseInt (number2.getText().toString());
        }else view.getId () == R.id.btnDivide){
            r = Integer.parseInt ( number1.getText().toString())/
                    Integer.parseInt (number2.getText().toString());
    }
    tvResult.setText("Result"+ )
        public void btnPlusClicked (View view){
    int r = Integer.parseInt ( number1.getText ().toString () )+
            Integer.parseInt (number2.getText().toString());
    tvResult.setText ("Result"+r); }
        public void btnMinusClicked (View view){
            int r = Integer.parseInt ( number1.getText ().toString () )+
                    Integer.parseInt (number2.getText().toString());
            tvResult.setText ("Result"+r); }
        public void btnMultipleClicked (View view){
            int r = Integer.parseInt ( number1.getText ().toString () )+
                    Integer.parseInt (number2.getText().toString());
            tvResult.setText ("Result"+r); }
        public void btnDivisionClicked (View view){
            int r = Integer.parseInt ( number1.getText ().toString () )+
                    Integer.parseInt (number2.getText().toString());
            tvResult.setText ("Result"+r); }
    }