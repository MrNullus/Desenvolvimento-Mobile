package etec.com.br.geovane.apppeso;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaFeminino extends AppCompatActivity {
    Button btCalcular, btVoltar;
    EditText edAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_feminino);

        btCalcular = findViewById(R.id.btnCalcFem);
        btVoltar = findViewById(R.id.btnVoltaFem);
        edAltura = findViewById(R.id.edtAltFem);


        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float altura, pesoIdeal;

                if (edAltura.getText().toString().isEmpty()) {
                    edAltura.setError("Obrigatório");
            }else {
                    altura = Float.parseFloat(edAltura.getText().toString());

                    pesoIdeal = (62.1f * altura)- 44.7f;
                    Toast.makeText(TelaFeminino.this, "O peso ideal é: "+pesoIdeal+"kg", Toast.LENGTH_SHORT).show();
                }
        };

    }

    ) ; btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });}

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Clique no voltar", Toast.LENGTH_SHORT).show();
    }
}
