package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TelaPergunta7 extends AppCompatActivity {

    Funcoes func = new Funcoes();

    TextView txtNomeJogador;
    RadioGroup rgpPergunta7;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta7);

        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        rgpPergunta7   = findViewById(R.id.rgpPergunta7);
        btnAvancar     = findViewById(R.id.btnAvancar);

        Jogador jogador = getIntent().getExtras().getParcelable("jogador");
        txtNomeJogador.setText(jogador.getNome());


        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // func.manipularClick(
                //     rgpPergunta7, // radio group
                //     "questao-07", // questão a se obter a resposta
                //     jogador, // objeto do jogador
                //     TelaPergunta7.class, // activity atual
                //     TelaPergunta8.class  // activity de destino                    
                // );

                int respostaCorreta  = func.obterRespostaCorreta("questao-07");
                int opcaoSelecionada = rgpPergunta7.getCheckedRadioButtonId();

                if (opcaoSelecionada == -1) {
                    String text = "Por favor, escolha uma alternativa";
                    Toast.makeText(TelaPergunta7.this, text, Toast.LENGTH_SHORT).show();
                } else {
                    if (opcaoSelecionada == respostaCorreta) {
                        jogador.setAcertos(1);
                    }

                    func.irPara(TelaPergunta7.this, TelaPergunta8.class, jogador);
                }
            }
        });

    }
}