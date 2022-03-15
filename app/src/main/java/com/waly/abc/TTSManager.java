package com.waly.abc;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Locale;

public class TTSManager {private TextToSpeech mTts = null;
    private boolean isLoaded = false;

    public void init(Context context){
        try{
            mTts = new TextToSpeech(context, onInitListener);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener(){
        @Override
        public void onInit(int status){
            Locale spanish = new Locale("es","ES");
            if(status == TextToSpeech.SUCCESS){
                int result = mTts.setLanguage(spanish);
                isLoaded =true;

                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                    Log.e("error" ,"este lenguaje no esta permitido");
                }else{
                    Log.e("error", "fallo al iniciar");
                }
            }
        }
    };

    public void shutDown(){
        mTts.shutdown();
    }
    public void addQueue(String text){
        if(isLoaded)
            mTts.speak(text,TextToSpeech.QUEUE_ADD,null);
        else
            Log.e("error","TTs no inicializado");
    }

    public  void initQueue(String text){
        if(isLoaded)
            mTts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        else
            Log.e("error", "TTs initialized");
    }
}

