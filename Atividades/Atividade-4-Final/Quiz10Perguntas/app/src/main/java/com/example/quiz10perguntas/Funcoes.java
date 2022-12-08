package com.example.quiz10perguntas;

import android.content.Intent;
import android.app.Activity;
import android.os.Parcelable;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.Toast;

public class Funcoes  {
    protected void irPara(Activity atualActivity, Class activityDestino, Parcelable parametro) {
        Intent destino = new Intent(atualActivity, activityDestino);

        destino.putExtra("jogador", parametro);

        atualActivity.startActivity(destino);
    }

    protected void manipularClick(RadioGroup radioGroup, String questao, Jogador j, Activity atualActivity, Class activityDestino) {
        int respostaCorreta = this.obterRespostaCorreta(questao);
        int opcaoSelecionada = radioGroup.getCheckedRadioButtonId();

        if (opcaoSelecionada == -1) {
            String text = "Por favor, escolha uma alternativa";
            Toast.makeText(atualActivity, text, Toast.LENGTH_SHORT).show();
        } else {
            if (opcaoSelecionada == respostaCorreta) {
                int acertosAtual = j.getAcertos() + 1;

                j.setAcertos(acertosAtual);
            }

            this.irPara(atualActivity, activityDestino, j);
        }
    }

    protected String pegarTextoDaEdt(EditText edt) {
        return edt.getText().toString();
    }

    protected int obterRespostaCorreta(String questao) {
        int respostaCorreta;

        switch(questao) {
            
            case "questao-01":
                respostaCorreta = R.id.rdbQuestao01RespostaC;
                break;
                
            case "questao-02":
                respostaCorreta = R.id.rdbQuestao02RespostaB;
                break;
                
            case "questao-03":
                respostaCorreta = R.id.rdbQuestao03RespostaD;
                break;
                
            case "questao-04":
                respostaCorreta = R.id.rdbQuestao04RespostaC;
                break;
                
            case "questao-05":
                respostaCorreta = R.id.rdbQuestao05RespostaD;
                break;
                
            case "questao-06":
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case "questao-07":
                respostaCorreta = R.id.rdbQuestao07RespostaC;
                break;
                
            case "questao-08":
                respostaCorreta = R.id.rdbQuestao08RespostaC;
                break;
                
            case "questao-09":
                respostaCorreta = R.id.rdbQuestao09RespostaD;
                break;
                
            case "questao-10":
                respostaCorreta = R.id.rdbQuestao10RespostaC;
                break;
            
            default:
                respostaCorreta = 0;
                break;
        }
        
        return respostaCorreta;
    }
    
}
