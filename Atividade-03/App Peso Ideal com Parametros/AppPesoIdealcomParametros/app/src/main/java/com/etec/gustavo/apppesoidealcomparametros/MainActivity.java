package com.etec.gustavo.apppesoidealcomparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //OBJETOS PARA REFERENCIAR
    Button btnMasc, btnFem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //REFERENCIANDO
        btnMasc = findViewById(R.id.btnMasc);
        btnFem = findViewById(R.id.btnFem);

        //CÓDIGO DO BOTÃO MASCULINO (ENVIAR SEXO MASCULINO)
        btnMasc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sexo;
                Intent telaCalculos = new Intent(MainActivity.this, TelaCalculos.class);

                sexo = "masculino";
                telaCalculos.putExtra("sexo", sexo);

                startActivity(telaCalculos);
            }
        });

        //CÓDIGO DO BOTÃO FEMININO  (ENVIAR SEXO FEMININO)
        btnFem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sexo;
                Intent telaCalculos = new Intent(MainActivity.this, TelaCalculos.class);

                sexo = "feminino";
                telaCalculos.putExtra("sexo", sexo);

                startActivity(telaCalculos);
            }
        });
    }
}