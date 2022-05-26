package etec.com.br.gustavo.appcalculos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btSoma;
    EditText edValorUm, edValorDois;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edValorUm = findViewById(R.id.edtValor1);
        edValorDois = findViewById(R.id.edtValor2);
        btSoma = findViewById(R.id.btnSomar);

        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float v1, v2, resultado;

                if (edValorUm.getText().toString().isEmpty()) {
                    edValorUm.setError("Valor 1 obrigatório!");
                    edValorUm.requestFocus();

                } else if (edValorDois.getText().toString().isEmpty()) {
                    edValorDois.setError("Valor 2 obrigatório!");
                    edValorDois.requestFocus();

                } else {
                    v1 = Float.parseFloat(edValorUm.getText().toString());
                    v2 = Float.parseFloat(edValorDois.getText().toString());

                    resultado = v1 + v2;

                    Toast.makeText(MainActivity.this, "A soma é: "+resultado, Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
