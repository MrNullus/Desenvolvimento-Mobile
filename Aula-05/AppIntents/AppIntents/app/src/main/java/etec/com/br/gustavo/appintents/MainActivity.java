package etec.com.br.gustavo.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btT2, btT3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btT2 = findViewById(R.id.btnTela2);
        btT3 = findViewById(R.id.btnTela3);

        btT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirTela2 = new Intent(MainActivity.this, Tela2.class);
                startActivity(abrirTela2);
            }
        });

        btT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirTela3 = new Intent(MainActivity.this, Tela3.class);
                startActivity(abrirTela3);
            }
        });

    }
}