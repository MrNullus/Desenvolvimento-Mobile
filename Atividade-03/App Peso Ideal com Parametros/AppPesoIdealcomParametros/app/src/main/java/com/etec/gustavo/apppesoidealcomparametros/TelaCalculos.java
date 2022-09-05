package com.etec.gustavo.apppesoidealcomparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCalculos extends AppCompatActivity {
    //OBJETOS PARA REFERENCIAR
    EditText edtAltura;
    Button btnCalcular, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calculos);

        //REFERENCIANDO
        edtAltura = findViewById(R.id.edtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnVoltar = findViewById(R.id.btnVoltar);

        //CRIAR UMA INTENT DA TELA ATUAL PARA RECUPERAR OS VALORES
        Intent telaAtual = getIntent();

        //CRIAR O BUNDLE PARA ACESSAR O SEXO
        Bundle valoresRecebidos = telaAtual.getExtras();

        //VARIÁVEL AUXILIAR PARA O SEXO
        String sexo;

        //RECUPERANDO O SEXO ENVIADO COM getString
        sexo = valoresRecebidos.getString("sexo");

        //CÓDIGO DO BOTÃO CALCULAR
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliareis
                float altura, calcPesoIdeal;
                double pesoIdealFormated;

                if (edtAltura.getText().toString().isEmpty()) {
                    edtAltura.setError("Campo obrigatório!");
                    edtAltura.requestFocus();
                } else {
                    altura = Float.parseFloat(edtAltura.getText().toString());

                    if (sexo.equals("masculino")) {
                        calcPesoIdeal = (72.7f * altura) - 58f;
                    } else {
                        calcPesoIdeal = (62.1f * altura) - 44.7f;
                    }

                    pesoIdealFormated = Math.round(calcPesoIdeal * 100.0) / 100.0;
                    String mensagem = "Seu peso ideal é de: "+pesoIdealFormated+"kg";

                    Toast.makeText(TelaCalculos.this, mensagem, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //CÓDIGO DO BOTÃO VOLTAR
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    //CÓDIGO PARA BLOQUEAR O VOLTAR DO CELULAR
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Clique no voltar acima", Toast.LENGTH_SHORT).show();
    }
}