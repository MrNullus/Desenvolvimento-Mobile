package com.example.quiz10perguntas;

import android.content.Intent;
import android.app.Activity;
import android.widget.EditText;


public class Funcoes {

    protected void irPara(Activity atualActivity, Class activityDestino, Parcelable jogador) {
        Intent destino = new Intent(atualActivity, activityDestino);

        destino.putExtra("jogador", parametro);
        
        atualActivity.startActivity(destino);
    }
    
    protected String pegarTextoDaEdt(EditText edt) {
        return edt.getText().toString();
    }
    
}
