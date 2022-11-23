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
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta1);

        /*
        * TODO:
        *  Fazer com que tenha uma plain text que receba o nome do jogador
        *  vindo do objeto Jogador
        * */

        rgpPergunta1 = findViewById(R.id.rgpPergunta1);
        btnAvancar   = findViewById(R.id.btnAvancar);
        txt          = findViewById(R.id.textView3);

        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Jogador jogador = getIntent().getExtras().getParcelable("jogador");
                
                int respostaCorreta = R.id.rdbQuestao01RespostaC;
                int opcaoSelecionada = rgpPergunta1.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    jogador.setAcertos(1);

                    Intent telaPergunta2 = new Intent(TelaPergunta1.this, TelaPergunta2.class);
                    telaPergunta2.putExtra("jogador", jogador);

                    /*startActivity(telaPergunta2);*/
                } else {
                    Intent telaPergunta2 = new Intent(TelaPergunta1.this, TelaPergunta2.class);
                    telaPergunta2.putExtra("jogador", jogador);

                    /*startActivity(telaPergunta2);*/
                }

                txt.setText(jogador.getNome() + jogador.getAcertos());
            }
        });

    }
}