package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Evaluacion2 extends AppCompatActivity {
    int Indice = 1;
    Metodos objE2 = new Metodos();
    int[] vimg1E2 = objE2.SSDImg();
    String [] vpalabraE2 = objE2.SSDPalabra();
    private Button txtE2P1,txtE2P2,txtE2P3,txtE2P4,txtE2P5;
    //habla
    private Button hablarAhoraBoto[]=new Button[100];
    //private ImageButton hablaImg[]=new ImageButton[100];
    TTSManager ttsManager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion2);
        //Inserta imagen
        ImageView ping = (ImageView) findViewById(R.id.idBTNimgE2);
        ping.setImageResource(vimg1E2[1]);
        //Inserta palabra
        txtE2P1 = findViewById(R.id.idtxtE2P1);
        txtE2P2 = findViewById(R.id.idtxtE2P2);
        txtE2P3 = findViewById(R.id.idtxtE2P3);
        txtE2P4 = findViewById(R.id.idtxtE2P4);
        txtE2P5 = findViewById(R.id.idtxtE2P5);
        txtE2P1.setText(vpalabraE2[1]);
        txtE2P2.setText(vpalabraE2[2]);
        txtE2P3.setText(vpalabraE2[3]);
        txtE2P4.setText(vpalabraE2[4]);
        txtE2P5.setText(vpalabraE2[5]);
        //Inserta palabra
        //txtE2P1.setText(vpalabraE2[1]);
        //habla imagen
        //hablarAhoraBoto[1]= findViewById(R.id.idtxtE2P1);
        //habla(vpalabraE2[1],1);

    }

    public void btnContinuar(View view) {
        Intent a = new Intent(Evaluacion2.this,Evaluacion3.class);
        startActivity(a);
    }
    public void btnImgE2(View view) {
        Indice++;
        if(Indice==6)
            Indice=1;
        ImageView ping = (ImageView) findViewById(R.id.idBTNimgE2);
        ping.setImageResource(vimg1E2[Indice]);

    }

    public void habla(String silaba, int i){
        hablarAhoraBoto[i].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = editText.getText().toString();
                ttsManager.initQueue(silaba);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }
    public void btnxE2(View view) {finish(); }
}