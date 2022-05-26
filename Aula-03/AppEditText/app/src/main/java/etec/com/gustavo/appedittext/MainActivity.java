package etec.com.gustavo.appedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // *** Objetos Java para referenciar aos objetos XHML ***
    Button btCad;
    EditText edNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // *** Referenciando osObjetos Java aos Objetos XML ***
        btCad = findViewById(R.id.btnCadastrar);
        edNome = findViewById(R.id.edtNome);

        // *** Preparando o clique do botão ***
        btCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // ** variavel auxiliar **
               String nomeDigitado;

               // Recuperar nome digitado na EDITTEXT
                nomeDigitado = edNome.getText().toString();

                // Exibir o nome digitado em uma mensagem
                Toast.makeText(MainActivity.this, "Nome digitado: " + nomeDigitado, Toast.LENGTH_LONG).show();

            }
        });

    }
}
