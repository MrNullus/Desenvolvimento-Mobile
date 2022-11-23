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
        /*
        * TODO:
        *  - Validar se o usuario pressionou algum radio button, para só então ir para outra telau sando
        *  if (respostaCorreta != -1)
        * */

        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int respostaCorreta = func.obterRespostaCorreta("questao-01");
                int opcaoSelecionada = rgpPergunta1.getCheckedRadioButtonId();

                if (respostaCorreta != -1) {
                    if (opcaoSelecionada == respostaCorreta) {
                        jogador.setAcertos(1);

                        func.irPara(TelaPergunta1.this, TelaPergunta2.class, jogador);
                    }

                    func.irPara(TelaPergunta1.this, TelaPergunta2.class, jogador);
                }
            }
        });

    }
}