package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaPontuacaoFinal extends AppCompatActivity {

    /*
    * TODO:
    * Fazer com que nessa activity apareça a pontuação final dele (ou seja, os acertos)
    * e também apareça seu nome
    */
    Funcoes func = new Funcoes();

    TextView txtPontuacao;
    Button   btnRestart;
    Button   btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pontuacao_final);

        txtPontuacao = findViewById(R.id.txtPontuacao);
        btnRestart = findViewById(R.id.btnRestart);
        btnSair    = findViewById(R.id.btnSair);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");

        String mensagemPontuacao = "Confira sua pontuação: " + jogador.getAcertos();
        txtPontuacao.setText(mensagemPontuacao);


        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func.irPara(TelaPontuacaoFinal.this, MainActivity.class, new Jogador("", 0));
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}