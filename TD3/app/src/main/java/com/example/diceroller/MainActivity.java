package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int nbFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.btnLance); //Le bouton pour lancer le dé
        final TextView affichageResult = (TextView) findViewById(R.id.tv); // TextView
        final TextView affichageResult2 = (TextView) findViewById(R.id.tv2); // TextView

        final EditText choixNbFace = (EditText) findViewById(R.id.nbFaceTexte); // choix du nombre de face


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nbFace = Integer.parseInt(String.valueOf(choixNbFace.getText()));

                Random rand = new Random();
                Random rand2 = new Random();

                int resultDe = rand.nextInt(nbFace) + 1;
                int resDe2 = rand2.nextInt(nbFace)+1;

                affichageResult.setText(resultDe+"");
                affichageResult.setTextSize(40);

                affichageResult2.setText(resDe2+"");
                affichageResult2.setTextSize(40);
            }
        });
    }



}
