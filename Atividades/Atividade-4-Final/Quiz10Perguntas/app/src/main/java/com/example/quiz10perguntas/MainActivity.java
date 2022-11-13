package com.example.quiz10perguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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
                    Indent telaPergunta1  = new Indent(MainActivity.this, TelaPergunta1.class)
                    String nomeUsuario = edtNome.getText().toString();

                    telaPergunta1.putExtra("nome_usuario", nomeUsuario);

                    startActivity(telaPergunta1);    
                }
            }

        });
    }
}