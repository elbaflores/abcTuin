package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Evaluacion1 extends AppCompatActivity {

    private Button textE1P1,textE1P2,textE1P3,textE1P4,textE1P5;
    private ImageButton img1E1,img2E1,img3E1,img4E1,img5E1;
    Metodos objE1 = new Metodos();
    int[] vimgE1 = objE1.SSDImg();
    String[] vpalabraE1 = objE1.SSDPalabra();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion1);
/*
        img1E1 = findViewById(R.id.idimg1);
        img2E1 = findViewById(R.id.idimg2);
        img3E1 = findViewById(R.id.idimg3);
        img4E1 = findViewById(R.id.idimg4);
        img5E1 = findViewById(R.id.idimg5);
        textE1P1 = findViewById(R.id.idtxtP1);
        textE1P2 = findViewById(R.id.idtxtP2);
        textE1P3 = findViewById(R.id.idtxtP3);
        textE1P4 = findViewById(R.id.idtxtP4);
        textE1P5 = findViewById(R.id.idtxtP5);

        //imagen
        img1E1.setImageResource(vimgE1[1]);
        img2E1.setImageResource(vimgE1[2]);
        img3E1.setImageResource(vimgE1[3]);
        img4E1.setImageResource(vimgE1[4]);
        img5E1.setImageResource(vimgE1[5]);
        //palabra
        textE1P1.setText(vpalabraE1[6]);
        textE1P2.setText(vpalabraE1[7]);
        textE1P3.setText(vpalabraE1[8]);
        textE1P4.setText(vpalabraE1[9]);
        textE1P5.setText(vpalabraE1[10]);*/
    }

    public void btnContinuarE2(View view) {
        Intent a = new Intent(Evaluacion1.this,Evaluacion2.class);
        startActivity(a);
    }

    public void btnxE1(View view) {finish(); }
}