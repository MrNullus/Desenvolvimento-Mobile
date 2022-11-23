package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class TelaPergunta4 extends AppCompatActivity {

    Funcoes func = new Funcoes();
    
    RadioGroup rgpPergunta4;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta4);
        
        rgpPergunta4 = findViewById(R.id.rgpPergunta4);
        btnAvancar   = findViewById(R.id.btnAvancar);
        
        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");
                
                int respostaCorreta = R.id.rdbQuestao04RespostaC;
                int opcaoSelecionada = rgpPergunta4.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    jogador.setAcertos(1);

                    Intent telaPergunta5 = new Intent(TelaPergunta4.this, TelaPergunta5.class);
                    telaPergunta5.putExtra("jogador", jogador);

                    startActivity(telaPergunta5);
                } else {
                    Intent telaPergunta5 = new Intent(TelaPergunta4.this, TelaPergunta5.class);
                    telaPergunta5.putExtra("jogador", jogador);

                    startActivity(telaPergunta5);
                }
                
            }
        });
        
    }
}