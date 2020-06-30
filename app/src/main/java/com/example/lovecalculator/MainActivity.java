package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
   // TODO  definizione variabili link ai widgets (mRisultato variabile di tipo membro)
    TextView mRisultato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                      //funzione init() per linkare tutti i widgets che ci serviranno al codice java
        init();       // cliccando sulla lampadina o "more action" di init() possiamo creare il suo metodo velocemente)
    }
   // TODO creazione di una funzione per inizializzare i componenti di un interfaccia
    private void init() {
        mRisultato = (TextView)findViewById(R.id.GOresult);        //colleghiamo il widgets GOresult usando findViewById
    }

    //TODO metodo di gestione del click sul cuore

    public void LoveCalculator(View view) {
        Log.d("Love calculator","click OK!");

        //TODO generiamo un numero random e lo visualizziamo nella var mRisultato

        Random random = new Random();                          //oggetto di tipo random
        int loveMeter = random.nextInt(100);           // variabile intera ed numero random da 0 a 100
        mRisultato.setText(Integer.toString(loveMeter));

        if(loveMeter >=80){
          //  Toast.makeText(getApplicationContext(), "WOW!! GREAT", Toast.LENGTH_LONG).show();
            testoPopup("WOW!! GREAT");
        }
        else if((loveMeter>=50) && (loveMeter<80)){
          //  Toast.makeText(getApplicationContext(), " maybe there is hope", Toast.LENGTH_LONG).show();
            testoPopup("maybe there is hope");         //al posto di richiamare toast.makeText 3 volte
        }
        else{
          //  Toast.makeText(getApplicationContext(), "there is no hope", Toast.LENGTH_LONG).show();
            testoPopup("there is no hope");


    }



}
    // questo metodo lo uso per non  richiamare toast.makeText 3 volte  vedi sopra
    private void testoPopup(String msg) {
       Toast.makeText(getApplicationContext() , msg , LENGTH_LONG).show();
    }
}
