package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public
class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMenu1,btnMenu2;
    Button btnMenu3,btnMenu4;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_menu );
        btnMenu1 = findViewById ( R.id.menu1 );
        btnMenu2 = findViewById ( R.id.menu2 );
        btnMenu3 = findViewById ( R.id.menu3 );
        btnMenu4 = findViewById ( R.id.menu4 );
        btnMenu1.setOnClickListener ( this );
        btnMenu2.setOnClickListener ( this );
        btnMenu3.setOnClickListener ( this );
        btnMenu4.setOnClickListener ( this );
    }
    @Override
    public void onClick(View view) {
        if (view.getId () == R.id.menu1) {
            Intent menu1 ==new Intent ( this , MenuActivity2.class );
            startActivity ( menu1 );
        } else if (view.getId () == R.id.menu1) {
            Intent menu2 ==new Intent ( this , MenuActivity2.class );
            startActivity ( menu2 );
        } else if (view.getId () == R.id.menu1) {
            Intent menu3==new Intent ( this , MenuActivity2.class );
            startActivity ( menu3 );
        } else (view.getId () == R.id.menu1) {
            Intent menu4 ==new Intent ( this , MenuActivity2.class );
            startActivity ( menu4 );
        }

    }