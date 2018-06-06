package br.com.paulosalvatore.ocean_a4_06_06_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitulo;

    private EditText etNome;
    private EditText etEmail;

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo = (TextView) findViewById(R.id.tvTitulo);

        etNome = (EditText) findViewById(R.id.etNome);
        etEmail = (EditText) findViewById(R.id.etEmail);

        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }

    private int contador = 0;

    public void enviar(View view) {
        // Toast.makeText(this, "Botão clicado.", Toast.LENGTH_LONG).show();

        contador++;

        tvTitulo.setText("Título Alterado: " + contador);

        String nome = etNome.getText().toString();
        String email = etEmail.getText().toString();

        if (nome.isEmpty()) {
            Toast.makeText(this, "Digite o seu nome.", Toast.LENGTH_LONG).show();
        }
        else if (email.isEmpty()) {
            Toast.makeText(this, "Digite o seu e-mail.", Toast.LENGTH_LONG).show();
        }
        else {
            tvResultado.setText(
                    "Nome: " + nome + "\n" +
                    "E-mail: " + email
            );
        }
    }
}
