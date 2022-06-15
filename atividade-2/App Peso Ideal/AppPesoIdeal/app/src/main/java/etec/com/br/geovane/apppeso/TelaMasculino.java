package etec.com.br.geovane.apppeso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaMasculino extends AppCompatActivity {
    Button btCalcular, btVoltar;
    EditText edAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_masculino);

        btCalcular = findViewById(R.id.btnCalcMasc);
        btVoltar = findViewById(R.id.btnVoltaMasc);
        edAltura = findViewById(R.id.edtAltMasc);


        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float altura, pesoIdeal;

                if (edAltura.getText().toString().isEmpty()) {
                    edAltura.setError("Obrigatório!");

                } else {
                    altura = Float.parseFloat(edAltura.getText().toString());

                    //Soma
                    pesoIdeal = (72.7f * altura) - 58f;
                    Toast.makeText(TelaMasculino.this, "O peso ideal é: " + pesoIdeal+ "kg", Toast.LENGTH_SHORT).show();
                }
            }})
        ;

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Clique no voltar", Toast.LENGTH_SHORT).show();
    }
}