package com.waly.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SilabasSimples extends AppCompatActivity {
    private String[] SSimples={"M","P","L","S","T","N"};
    private String[] Vocales={"a","e","i","o","u"};
    private String[] SCompuestas={"CH","RR","LL","BR"};
    private String[] Inversa={"n","l","s","r"};
    public String[] silabaM = {"M","m","ma","me","mi","mo","mu"};
    public String[] palabra ={"mamá","mesa","mina","moto","muro"};
    public String[] oracion ={"mi mamá me mima"};

    private EditText txtMayuscula,txtMinuscula,text1,text2,text3,text4,text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silabas_simples);

    }

    public void btnx(View view) {
        finish();
    }

    public void btnM(View view) {
        //Enviamos a otra actividad
        final Intent i = new Intent(this,Evaluacion.class);
        startActivity(i);
    }

    public void btnP(View view) {
        /*txtMayuscula = findViewById(R.id.btnMayuscula);
        txtMinuscula = findViewById(R.id.btnMinuscula);
        text1 = findViewById(R.id.boton1);
        text2 = findViewById(R.id.boton2);
        text3 = findViewById(R.id.boton3);
        text4 = findViewById(R.id.boton4);
        text5 = findViewById(R.id.boton5);
        Metodos objP = new Metodos();
        String[] vsilabaP = objP.SSD();
        txtMayuscula.setText(vsilabaP[7].toString());
        txtMinuscula.setText(vsilabaP[8].toString());
        text1.setText(vsilabaP[9].toString());
        text2.setText(vsilabaP[10].toString());
        text3.setText(vsilabaP[11].toString());
        text4.setText(vsilabaP[12].toString());
        text5.setText(vsilabaP[13].toString());*/

        //Enviamos a otra actividad
        final Intent i = new Intent(this,Evaluacion.class);
        startActivity(i);
    }

    public void clikInformacionSSD(View view) {
    }
}