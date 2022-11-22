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
    
    protected int obterRespostaCorreta(String questao) {
        int respostaCorreta;
        
        /*
        TODO:
        - Colocar as respostas corretas em cada case
        */
        switch(questao) {
            
            case 'questao-01':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-02':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-03':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-04':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-05':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-06':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-07':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-08':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-09':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case 'questao-10':
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
            
            default:
                respostaCorreta = 0;
                break;
        }
        
        return respostaCorreta;
    }
    
}
