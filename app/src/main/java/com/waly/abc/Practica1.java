package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Practica1 extends AppCompatActivity {
    private EditText txtMayuscula,txtMinuscula,text1,text2,text3,text4,text5;
    Metodos obj = new Metodos();
    String[] vtext =obj.SSDirecta();
    String[] vmm = obj.SSDMayMin();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica1);
        txtMayuscula = findViewById(R.id.idtxtMayuscula);
        txtMinuscula = findViewById(R.id.idtxtMinuscula);
        text1 = findViewById(R.id.idtxt1);
        text2 = findViewById(R.id.idtxt2);
        text3 = findViewById(R.id.idtxt3);
        text4 = findViewById(R.id.idtxt4);
        text5 = findViewById(R.id.idtxt5);

        txtMayuscula.setText(vmm[3]);
        txtMinuscula.setText(vmm[4]);
        text1.setText(vtext[6]);
        text2.setText(vtext[7]);
        text3.setText(vtext[8]);
        text4.setText(vtext[9]);
        text5.setText(vtext[10]);

    }


    public void btnContinuar(View view) {
        Intent a = new Intent(Practica1.this,Practica2.class);
        startActivity(a);
    }

    public void btnx(View view) {finish();
    }
}