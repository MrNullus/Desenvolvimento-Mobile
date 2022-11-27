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
        rgpPergunta6   = findViewById(R.id.rgpPergunta6);
        btnAvancar     = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());


        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // func.manipularClick(
                //     rgpPergunta6, // radio group
                //     "questao-06", // questão a se obter a resposta
                //     jogador, // objeto do jogador
                //     TelaPergunta6.class, // activity atual
                //     TelaPergunta7.class  // activity de destino                    
                // );

                int respostaCorreta  = func.obterRespostaCorreta("questao-06");
                int opcaoSelecionada = rgpPergunta6.getCheckedRadioButtonId();

                if (opcaoSelecionada == -1) {
                    String text = "Por favor, escolha uma alternativa";
                    Toast.makeText(TelaPergunta6.this, text, Toast.LENGTH_SHORT).show();
                } else {
                    if (opcaoSelecionada == respostaCorreta) {
                        jogador.setAcertos(1);
                    }

                    func.irPara(TelaPergunta6.this, TelaPergunta7.class, jogador);
                }
            }
        });
        
    }
}