package etec.com.gustavohj.appconversordetemperaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // Objetos para referenciar JAVA com XML
    EditText edTemp;
    Button btCelsiusKelvin, btKelvinCelsius, btCelsiusFahre, btFahreCelsius, btKelvinFahre, btFahreKelvin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar objetos JAVA com XML
        edTemp = findViewById(R.id.edtTemp);

        btCelsiusKelvin = findViewById(R.id.btnCelsiusKelvin);
        btCelsiusFahre = findViewById(R.id.btnCelsiusFahre);

        btKelvinCelsius = findViewById(R.id.btnKelvinCelsius);
        btKelvinFahre = findViewById(R.id.btnKelvinFahre);

        btFahreCelsius = findViewById(R.id.btnFahreCelsius);
        btFahreKelvin = findViewById(R.id.btnFahreKelvin);

        //------****
        btCelsiusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                double K;
                double C;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    C = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    K = C + 273.15;

                    Toast.makeText(MainActivity.this, "A temperatura é de "+K+"K", Toast.LENGTH_LONG).show();
                }


            }
        });

        //------****
        btKelvinCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                double C;
                float K;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    K = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    C = K - 273.15;

                    Toast.makeText(MainActivity.this, "A temperatura é de " + C + "C", Toast.LENGTH_LONG).show();
                }
            }
        });

        //------****
        btCelsiusFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float C;
                double F;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    C = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    F = ( C * 1.8 ) + 32;

                    Toast.makeText(MainActivity.this, "A temperatura é de " + F + "F", Toast.LENGTH_LONG).show();
                }
            }
        });

        //------****
        btFahreCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                double C;
                Float F;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    F = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    C = ( F - 32 ) * 0.55555;

                    Toast.makeText(MainActivity.this, "A temperatura é de " + C + "C", Toast.LENGTH_LONG).show();
                }
            }
        });

        //------****
        btKelvinFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float K;
                double F;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    K = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    F = (( K - 273.15 ) * 1.8 ) + 32;

                    Toast.makeText(MainActivity.this, "A temperatura é de " + F + "F", Toast.LENGTH_LONG).show();
                }
            }
        });

        //------****
        btFahreKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float F;
                double K;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    F = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    K = ((F - 32) * 0.55555) + 273.15;

                    Toast.makeText(MainActivity.this, "A temperatura é de " + K + "K", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}