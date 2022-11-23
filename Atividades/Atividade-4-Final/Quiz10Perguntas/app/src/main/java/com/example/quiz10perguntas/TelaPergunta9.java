package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TelaPergunta9 extends AppCompatActivity {

    Funcoes func = new Funcoes();

    TextView txtNomeJogador;
    RadioGroup rgpPergunta9;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta9);

        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        rgpPergunta9   = findViewById(R.id.rgpPergunta9);
        btnAvancar     = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());


        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");

                int respostaCorreta  = func.obterRespostaCorreta("questao-09");
                int opcaoSelecionada = rgpPergunta9.getCheckedRadioButtonId();

                if (respostaCorreta != -1) {
                    if (opcaoSelecionada == respostaCorreta) {
                        jogador.setAcertos(1);
                    }

                    func.irPara(TelaPergunta9.this, TelaPergunta10.class, jogador);
                }
            }
        });
    }
}