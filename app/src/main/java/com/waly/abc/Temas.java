package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Temas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);
    }
    public void btnVocales(View view) {
        final Intent i = new Intent(this,Vocales.class);
        startActivity(i);
    }
    public void btnSimple(View view) {
        final Intent i = new Intent(this,SilabasSimples.class);
        startActivity(i);
    }
    public void btnInversa(View view) {
        final Intent i = new Intent(this,Inversa.class);
        startActivity(i);
    }
    public void btnCompuesta(View view) {
        final Intent i = new Intent(this,SilabasCompuestas.class);
        startActivity(i);
    }
    public void btnx(View view) {finish();
    }
}