package br.com.dh.validanomeemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNome;
    private EditText inputEmail;
    private Button botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNome = findViewById(R.id.nome_id);
        inputEmail = findViewById(R.id.email_id);
        botaoEnviar = findViewById(R.id.botao_enviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarCampos(inputNome.getText().toString(), inputEmail.getText().toString());

            }
        });

    }

    public void validarCampos(String nome, String email){

        if(nome.isEmpty()){
            Toast.makeText(this,"Preencha o Campo Nome", Toast.LENGTH_LONG).show();
        }else if(email.isEmpty()){
            Toast.makeText(this, "Preencha o Campo Email", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Dados Ok", Toast.LENGTH_LONG).show();
        }

    }
}
