package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TelaPergunta5 extends AppCompatActivity {

    Funcoes func = new Funcoes();

    TextView txtNomeJogador;
    RadioGroup rgpPergunta5;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta5);

        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        rgpPergunta5 = findViewById(R.id.rgpPergunta5);
        btnAvancar   = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());


        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 func.manipularClick(
                     rgpPergunta5, // radio group
                     "questao-05", // questão a se obter a resposta
                     jogador, // objeto do jogador
                     TelaPergunta5.this, // activity atual
                     TelaPergunta6.class  // activity de destino
                 );

            }
        });
        
    }
}