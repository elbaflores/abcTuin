package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Practica3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica3);
    }

    public void btnContinuar(View view) {
        Intent a = new Intent(Practica3.this,Evaluacion1.class);
        startActivity(a);
    }

    public void btnx(View view) {finish(); }
}