package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;;

public class TelaPergunta10 extends AppCompatActivity {

    Funcoes func = new Funcoes();

    TextView txtNomeJogador;
    RadioGroup rgpPergunta10;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta10);

        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        rgpPergunta10  = findViewById(R.id.rgpPergunta10);
        btnAvancar     = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());


        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int respostaCorreta  = func.obterRespostaCorreta("questao-10");
                int opcaoSelecionada = rgpPergunta10.getCheckedRadioButtonId();

                if (opcaoSelecionada == -1) {
                    String text = "Por favor, escolha uma alternativa";
                    Toast.makeText(TelaPergunta10.this, text, Toast.LENGTH_SHORT).show();
                } else {
                    if (opcaoSelecionada == respostaCorreta) {
                        jogador.setAcertos(1);
                    }

                    func.irPara(TelaPergunta9.this, TelaPergunta10.class, jogador);
                }
            }
        });
    }
}