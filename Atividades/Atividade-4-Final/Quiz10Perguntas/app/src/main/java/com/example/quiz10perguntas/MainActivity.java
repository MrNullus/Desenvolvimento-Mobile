package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class MainActivity extends AppCompatActivity {

    Funcoes func = new Funcoes();

    TextView txt;
    EditText edtNome;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome    = findViewById(R.id.edtNome);
        btnIniciar = findViewById(R.id.btnIniciar);
        txt        = findViewById(R.id.textView2);

        btnIniciar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (func.pegarTextoDaEdt(edtNome).isEmpty()) {

                    edtNome.setError("O campo nome é obrigatório!");
                    edtNome.requestFocus();

                } else {

                    String nome = func.pegarTextoDaEdt(edtNome);
                    Jogador jogador = new Jogador(nome, 0);

                    txt.setText(jogador.getNome() + jogador.getAcertos());

                    Intent telaPergunta1 = new Intent(MainActivity.this, TelaPergunta1.class);
                    telaPergunta1.putExtra("jogador", jogador);

                    startActivity(telaPergunta1);
                }
            }

        });
    }

}