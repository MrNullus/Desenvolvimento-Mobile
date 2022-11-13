package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaPergunta1 extends AppCompatActivity {

    RadioGroup rgp;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pergunta1);

        rgp        = findViewById(R.id.rgp);
        btnAvancar = findViewById(R.id.btnAvancar);


        btnAvancar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rdbCheckado = rgp.getCheckedRadioButtonId();

                if (!rdbCheckado.isEmpty()) {
                    // String nomeUsuario =
                }
            }

        });

    }
}