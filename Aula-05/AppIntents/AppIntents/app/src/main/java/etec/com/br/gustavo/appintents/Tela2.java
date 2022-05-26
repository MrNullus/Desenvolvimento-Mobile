package etec.com.br.gustavo.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {
    Button btVoltarT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btVoltarT2 = findViewById(R.id.btnVoltaT2);

        btVoltarT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Clique no voltar", Toast.LENGTH_LONG).show();
    }
}