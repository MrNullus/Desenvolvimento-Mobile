package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class TelaPergunta2 extends AppCompatActivity {

    Funcoes func = new Funcoes();
    
    RadioGroup rgpPergunta2;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta2);
        
        rgpPergunta2 = findViewById(R.id.rgpPergunta2);
        btnAvancar   = findViewById(R.id.btnAvancar);
        
        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");
                
                int respostaCorreta = R.id.rdbQuestao02RespostaB;
                int opcaoSelecionada = rgpPergunta2.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    jogador.setAcertos(1);
                    
                    func.irPara(
                        TelaPergunta2.this,
                        TelaPergunta3.class,
                        jogador
                    );
                } else {
                    func.irPara(
                        TelaPergunta2.this,
                        TelaPergunta3.class,
                        jogador
                    );
                }
                
            }
        });
        
    }
}