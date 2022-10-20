package etec.com.gustavo.appradiogroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // @ Atributos Iniciais
    EditText edSalario;
    RadioGroup rgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    // @ Função para calcular o novo sálario
    public void calcularSalario(View v) {

        // -> Dados Iniciais
        float salario, novoSalario = 0;

        // -> Associando objetos do XML ao Java
        edSalario = findViewById(R.id.edtSalario);
        rgp = findViewById(R.id.grpOpcoes);

        if (edSalario.getText().toString().length() <= 0) {

            // -> Setar erro caso a EditText estiver vazia
            edSalario.setError("Informe seu sálario");
            edSalario.requestFocus();

        } else {

            // -> Variavel para receber o valor armazenado na EditText e parsear para string
            salario = Float.parseFloat(edSalario.getText().toString());

            // -> Variavel para receber o id radio button clicado
            int op = rgp.getCheckedRadioButtonId();

            // -> Verificando qual radio button foi clicado
            if (op == R.id.rbt40) {
                novoSalario = salario + (salario * 0.40f);
            } else if (op == R.id.rbt45) {
                novoSalario = salario + (salario * 0.45f);
            } else if (op == R.id.rbt50) {
                novoSalario = salario + (salario * 0.50f);
            }

        }

        // -> Exibir Alert Dialog
        AlertDialog.Builder mensagem = new AlertDialog.Builder(this);
        mensagem.setTitle("Resultado");
        mensagem.setMessage("Seu novo salario é de R$ " + novoSalario);
        mensagem.setNeutralButton("OK", null);
        mensagem.setCancelable(false);
        /*
        * TODO:
        *  - pegar um desenho de dinheiro para isso funcionar
        mensagem.setIcon(R.drawable.dinheiro);*/
        mensagem.show();
    }
}