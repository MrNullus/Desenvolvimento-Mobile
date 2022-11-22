package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class TelaPergunta5 extends AppCompatActivity {

    Funcoes func = new Funcoes();
    
    RadioGroup rgpPergunta5;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta5);
        
        rgpPergunta5 = findViewById(R.id.rgpPergunta5);
        btnAvancar   = findViewById(R.id.btnAvancar);
        
        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");
                
                int respostaCorreta = R.id.rdbQuestao05RespostaD;
                int opcaoSelecionada = rgpPergunta5.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    jogador.setAcertos(1);
                    
                    func.irPara(
                        TelaPergunta5.this,
                        TelaPergunta6.class,
                        jogador
                    );
                } else {
                    func.irPara(
                        TelaPergunta5.this,
                        TelaPergunta6.class,
                        jogador
                    );
                }
                
            }
        });
        
    }
}