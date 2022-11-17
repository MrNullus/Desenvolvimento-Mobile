package com.example.quiz10perguntas;

import android.content.Intent;
import android.app.Activity;

class pessoa {

}

public class Funcoes {

    protected void irPara(Activity atualActivity, Class activityDestino, String nomeParametro, String parametro) {
        Intent destino = new Intent(atualActivity, activityDestino);

        destino.putExtra(nomeParametro, parametro);
        atualActivity.startActivity(destino);
    }
}
