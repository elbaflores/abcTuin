package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Evaluacion extends AppCompatActivity {
    private int presCounter = 0;
    private int maxPresCounter = 4;
    //eleccion de palabras
    private String[] keys = {"R", "I", "B", "D", "X"};
    //palabra correcta
    private String textAnswer = "BIRD";
    Animation smallbigforth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion);
        //IMAGEN RANDOM DE IMAGEN
        ImageButton btnImg = findViewById(R.id.btnImgCE);
        Metodos obj = new Metodos();
        int [] vimg = obj.SSDImg();
        btnImg.setImageResource(vimg[1]);

        //PALABRA ALEATORIA PARA LEER Y COMPAR
        TextView txtMostrar = findViewById(R.id.txtCEMuestra);
        String[] vPal = obj.SSDPalabra();
        txtMostrar.setText(vPal[3].toString());
        /*
        //Juego de palabras
        smallbigforth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth);
        keys = shuffleArray(keys);

        for (String key : keys) {
            //adiciona la palabra al edit text
            addView(((LinearLayout) findViewById(R.id.layoutParent)), key, ((EditText) findViewById(R.id.editText)));
        }
        //opciones de pulsación*/
        maxPresCounter = 4;
        smallbigforth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth);
        keys = shuffleArray(keys);

        for (String key : keys) {
            //adiciona la palabra al edit text
            addView(((LinearLayout) findViewById(R.id.layoutParent)), key, ((EditText) findViewById(R.id.editText)));
        }
        //opciones de pulsación
        maxPresCounter = 4;
    }
    //random de palabras
    private String[] shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }


    private void addView(LinearLayout viewParent, final String text, final EditText editText) {
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        linearLayoutParams.rightMargin = 30;

        final TextView textView = new TextView(this);

        textView.setLayoutParams(linearLayoutParams);
        textView.setBackground(this.getResources().getDrawable(R.drawable.bgpink));
        textView.setTextColor(this.getResources().getColor(R.color.colorPurple));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setTextSize(32);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");

        editText.setTypeface(typeface);
        textView.setTypeface(typeface);

        textView.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(presCounter < maxPresCounter) {
                    if (presCounter == 0)
                        editText.setText("");

                    //para darle espacio a las palabras de silabas
                    editText.setText(editText.getText().toString() + text);
                    textView.startAnimation(smallbigforth);
                    textView.animate().alpha(0).setDuration(300);
                    presCounter++;

                    if (presCounter == maxPresCounter)
                        doValidate();
                }
            }
        });


        viewParent.addView(textView);


    }


    private void doValidate() {
        presCounter = 0;

        EditText editText = findViewById(R.id.editText);
        LinearLayout linearLayout = findViewById(R.id.layoutParent);

        if(editText.getText().toString().equals(textAnswer)) {
            Toast.makeText(Evaluacion.this, "Correcto!!", Toast.LENGTH_SHORT).show();

            //Intent a = new Intent(MainActivity.this,BossAct.class);
            //startActivity(a);

            editText.setText("");
        } else {
            Toast.makeText(Evaluacion.this, "Incorrecto", Toast.LENGTH_SHORT).show();
            editText.setText("");
        }

        keys = shuffleArray(keys);
        linearLayout.removeAllViews();
        for (String key : keys) {
            addView(linearLayout, key, editText);
        }

    }

    public void btnx(View view) {finish(); }
}