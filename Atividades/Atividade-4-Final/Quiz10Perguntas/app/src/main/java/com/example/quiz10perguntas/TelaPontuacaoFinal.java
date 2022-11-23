package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Button;
import android.view.View;
import android.widget.TextView;

public class TelaPontuacaoFinal extends AppCompatActivity {

    /*
    * TODO:
    * Fazer com que nessa activity apareça a pontuação final dele (ou seja, os acertos)
    * e também apareça seu nome
    */
    Funcoes func = new Funcoes();

    TextView txtMensagemFinal;
    Button   btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pontuacao_final);

        txtMensagemFinal = findViewById(R.id.txtMensagemFinal);

        String mensagemFinal = "Parabéns! " + jogador.getNome() + " você teve uma pontuação de: " + jogador.getAcertos();
        txtMensagemFinal.setText(mensagemFinal);


        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func.irPara(TelaPontuacaoFinal.this, MainActivity.class, new Jogador());
            }
        }

    }
}