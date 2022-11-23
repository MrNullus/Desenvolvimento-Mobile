package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TelaPergunta6 extends AppCompatActivity {

    Funcoes func = new Funcoes();

    TextView txtNomeJogador;
    RadioGroup rgpPergunta6;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta6);

        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        rgpPergunta6 = findViewById(R.id.rgpPergunta6);
        btnAvancar   = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());


        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");

                int respostaCorreta = func.obterRespostaCorreta("questao-06");
                int opcaoSelecionada = rgpPergunta6.getCheckedRadioButtonId();

                if (respostaCorreta != -1) {
                    if (opcaoSelecionada == respostaCorreta) {
                        jogador.setAcertos(1);
                    }

                    func.irPara(TelaPergunta6.this, TelaPergunta7.class, jogador);
                }
            }
        });
        
    }
}