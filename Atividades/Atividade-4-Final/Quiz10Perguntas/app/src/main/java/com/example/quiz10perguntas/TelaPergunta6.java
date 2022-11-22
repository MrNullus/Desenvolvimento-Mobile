package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class TelaPergunta6 extends AppCompatActivity {

    Funcoes func = new Funcoes();
    
    RadioGroup rgpPergunta6;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta6);
        
        rgpPergunta6 = findViewById(R.id.rgpPergunta6);
        btnAvancar   = findViewById(R.id.btnAvancar);
        
        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");
                
                /*
                TODO:
                - Fazer uma função para retornar a resposta correta
                ex |> func.obterRespostaCorreta('questao-01');
                */
                int respostaCorreta  =  R.id.rdbQuestao06RespostaA;
                // int respostaCorreta = func.obterRespostaCorreta('questao-06');
                int opcaoSelecionada = rgpPergunta6.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    jogador.setAcertos(1);
                    
                    func.irPara(
                        TelaPergunta6.this,
                        TelaPergunta7.class,
                        jogador
                    );
                } else {
                    func.irPara(
                        TelaPergunta6.this,
                        TelaPergunta7.class,
                        jogador
                    );
                }
                
            }
        });
        
    }
}