package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class MainActivity extends AppCompatActivity {

    Funcoes func = new Funcoes();
    EditText edtNome;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome    = findViewById(R.id.edtNome);
        btnIniciar = findViewById(R.id.btnIniciar);


        btnIniciar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (edtNome.getText().toString().isEmpty()) {
                    edtNome.setError("O campo nome é obrigatório!");
                    edtNome.requestFocus();
                } else {
                    Intent telaPergunta1  = new Intent(MainActivity.this, TelaPergunta1.class);
                    String nomeUsuario = edtNome.getText().toString();

                    telaPergunta1.putExtra("nome_usuario", nomeUsuario);

                    func.irPara(
                        MainActivity.this,
                        TelaPergunta1.class,
                        "nome-usuario",
                        nomeUsuario
                    );


                    startActivity(telaPergunta1);    
                }
            }

        });
    }

}