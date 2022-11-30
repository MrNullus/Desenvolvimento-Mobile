package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TelaPergunta1 extends AppCompatActivity {

    Funcoes func = new Funcoes();
    
    RadioGroup rgpPergunta1;
    Button btnAvancar;
    TextView txtNomeJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta1);

        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        rgpPergunta1   = findViewById(R.id.rgpPergunta1);
        btnAvancar     = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());

        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func.manipularClick(
                    rgpPergunta1, // radio group
                    "questao-01", // questão a se obter a resposta
                    jogador, // objeto do jogador
                    TelaPergunta1.this, // activity atual
                    TelaPergunta2.class  // activity de destino
                );

                // int respostaCorreta = func.obterRespostaCorreta("questao-01");
                // int opcaoSelecionada = rgpPergunta1.getCheckedRadioButtonId();

                // if (opcaoSelecionada == -1) {
                //     String text = "Por favor, escolha uma alternativa";
                //     Toast.makeText(TelaPergunta2.this, text, Toast.LENGTH_SHORT).show();
                // } else {
                //     if (opcaoSelecionada == respostaCorreta) {
                //         jogador.setAcertos(1);
                //     }

                //     func.irPara(TelaPergunta1.this, TelaPergunta2.class, jogador);
                // }
            }
        });

    }
}