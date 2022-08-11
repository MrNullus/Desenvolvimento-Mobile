package etec.com.br.geovane.apppeso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btMasculino, btFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          btMasculino = findViewById(R.id.btnMasc);
          btFeminino = findViewById(R.id.btnFem);

        btMasculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela_masculino = new Intent(MainActivity.this,TelaMasculino.class);
                startActivity(tela_masculino);
            }
        });

        btFeminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela_feminino = new Intent(MainActivity.this,TelaFeminino.class);
                startActivity(tela_feminino);
            }
        });

    }
}