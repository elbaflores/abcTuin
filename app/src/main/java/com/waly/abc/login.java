package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void btnx(View view) {
        finish();
    }

    public void btnIngresar(View view) {
        final Intent i = new Intent(this,Temas.class);
        startActivity(i);
    }

    public void btnRegistro(View view) {
       // final Intent i = new Intent(this,Registro.class);
       // startActivity(i);
    }
}