package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Practica2 extends AppCompatActivity {
    private Button hablarAhoraBoto[]=new Button[100];
    private ImageButton hablaImg[]=new ImageButton[100];
    //private EditText editText;
    TTSManager ttsManager=null;
    //String letraaa[]=new String[1];

    private Button text1,text2,text3,text4,text5;
    private Button textP1,textP2,textP3,textP4,textP5;
    private ImageButton img1,img2,img3,img4,img5;
    Metodos obj = new Metodos();
    private String[] vtext =obj.SSDirecta();
    private int[] vimg = obj.SSDImg();
    private String[] vpalabra = obj.SSDPalabra();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica2);

        ttsManager= new TTSManager();
        ttsManager.init(this);
        //habla silaba
        hablarAhoraBoto[1]=findViewById(R.id.idtxt1);
        hablarAhoraBoto[2]=findViewById(R.id.idtxt2);
        hablarAhoraBoto[3]=findViewById(R.id.idtxt3);
        hablarAhoraBoto[4]=findViewById(R.id.idtxt4);
        hablarAhoraBoto[5]=findViewById(R.id.idtxt5);
        habla(vtext[6],1);
        habla(vtext[7],2);
        habla(vtext[8],3);
        habla(vtext[9],4);
        habla(vtext[10],5);
        //habla en palabra
        hablarAhoraBoto[6]=findViewById(R.id.idtxtP1);
        hablarAhoraBoto[7]=findViewById(R.id.idtxtP2);
        hablarAhoraBoto[8]=findViewById(R.id.idtxtP3);
        hablarAhoraBoto[9]=findViewById(R.id.idtxtP4);
        hablarAhoraBoto[10]=findViewById(R.id.idtxtP5);
        habla(vpalabra[6],6);
        habla(vpalabra[7],7);
        habla(vpalabra[8],8);
        habla(vpalabra[9],9);
        habla(vpalabra[10],10);
        //habla en imagen
        hablaImg[1]= findViewById(R.id.idimg1);
        hablaImg[2]= findViewById(R.id.idimg2);
        hablaImg[3]= findViewById(R.id.idimg3);
        hablaImg[4]= findViewById(R.id.idimg4);
        hablaImg[5]= findViewById(R.id.idimg5);
        hablaImg(vpalabra[6],1);
        hablaImg(vpalabra[7],2);
        hablaImg(vpalabra[8],3);
        hablaImg(vpalabra[9],4);
        hablaImg(vpalabra[10],5);

        text1 = findViewById(R.id.idtxt1);
        text2 = findViewById(R.id.idtxt2);
        text3 = findViewById(R.id.idtxt3);
        text4 = findViewById(R.id.idtxt4);
        text5 = findViewById(R.id.idtxt5);
        img1 = findViewById(R.id.idimg1);
        img2 = findViewById(R.id.idimg2);
        img3 = findViewById(R.id.idimg3);
        img4 = findViewById(R.id.idimg4);
        img5 = findViewById(R.id.idimg5);
        textP1 = findViewById(R.id.idtxtP1);
        textP2 = findViewById(R.id.idtxtP2);
        textP3 = findViewById(R.id.idtxtP3);
        textP4 = findViewById(R.id.idtxtP4);
        textP5 = findViewById(R.id.idtxtP5);
        //Inserta silabas
        text1.setText(vtext[6]);
        text2.setText(vtext[7]);
        text3.setText(vtext[8]);
        text4.setText(vtext[9]);
        text5.setText(vtext[10]);
        //Inserta imagen
        img1.setImageResource(vimg[1]);
        img2.setImageResource(vimg[2]);
        img3.setImageResource(vimg[3]);
        img4.setImageResource(vimg[4]);
        img5.setImageResource(vimg[5]);
        //Inserta palabra
        textP1.setText(vpalabra[6]);
        textP2.setText(vpalabra[7]);
        textP3.setText(vpalabra[8]);
        textP4.setText(vpalabra[9]);
        textP5.setText(vpalabra[10]);
    }


    public void hablaImg(String silaba, int i){
        hablaImg[i].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = editText.getText().toString();
                ttsManager.initQueue(silaba);
            }
        });
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




    public void btnContinuarE1(View view) {
        Intent a = new Intent(Practica2.this,Evaluacion1.class);
        startActivity(a);
    }
    public void clikVideo(View view) {
        Intent a = new Intent(Practica2.this,Practica3.class);
        startActivity(a);
    }
    public void btnx(View view) {finish(); }
}