package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public
class MenuActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_menu2 );
        btnBack = findViewById ( R.id.menu1 );
        btnBack = onClick ( this);
    }

    @Override
    public void onClick(View view) {
        Intent menu1 == new Intent ( this , MenuActivity.class );
        startActivity ( menu1 );
    }
}