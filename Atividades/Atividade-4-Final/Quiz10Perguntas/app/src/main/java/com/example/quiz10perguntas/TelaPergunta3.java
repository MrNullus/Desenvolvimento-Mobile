package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class TelaPergunta3 extends AppCompatActivity {
    
    Funcoes func = new Funcoes();
    
    RadioGroup rgpPergunta3;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta3);
        
        rgpPergunta3 = findViewById(R.id.rgpPergunta3);
        btnAvancar = findViewById(R.id.btnAvancar);
        
        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");
                
                int respostaCorreta = R.id.rdbQuestao03RespostaD;
                int opcaoSelecionada = rgpPergunta3.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    jogador.setAcertos(1);
                    
                    func.irPara(
                        TelaPergunta3.this,
                        TelaPergunta4.class,
                        jogador
                    );
                } else {
                    func.irPara(
                        TelaPergunta3.this,
                        TelaPergunta4.class,
                        jogador
                    );
                }
                
            }
        });
        
    }
}