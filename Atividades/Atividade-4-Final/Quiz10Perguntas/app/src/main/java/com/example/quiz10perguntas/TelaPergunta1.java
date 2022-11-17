package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class TelaPergunta1 extends AppCompatActivity {

    Funcoes func = new Funcoes();
    RadioGroup rgpPergunta1;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta1);

        rgpPergunta1 = findViewById(R.id.rgpPergunta1);
        btnAvancar = findViewById(R.id.btnAvancar);

        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int acertos = 0;
                int respostaCorreta = R.id.rdbQuestao01RespostaC;
                int opcaoSelecionada = rgpPergunta1.getCheckedRadioButtonId();

                if (opcaoSelecionada == respostaCorreta) {
                    acertos++;

                    //Intent telaPergunta2 = new Intent(TelaPergunta1.this, TelaPergunta2.class);
                    //telaPergunta2.putExtra("acertos", acertos);
                    //startActivity(telaPergunta2);
                }

                String parametro = Integer.toString(acertos);

                func.irPara(
                        TelaPergunta1.this,
                        TelaPergunta2.class,
                        "acertos",
                        parametro
                );

            }
        });

    }
}