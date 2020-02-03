package com.digitalhouse.exerciointentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputNome;
    private TextInputLayout inputSobreNome;
    private TextInputLayout inputIdade;
    private Button botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = inputNome.getEditText().getText().toString();
                String sobrenome = inputSobreNome.getEditText().getText().toString();
                String idade = inputIdade.getEditText().getText().toString();

                if(!nome.isEmpty() && !sobrenome.isEmpty() && !idade.isEmpty()){
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                    Bundle bundle = new Bundle();
                    bundle.putString("NOME", nome);
                    bundle.putString("SOBRENOME", sobrenome);
                    bundle.putString("IDADE", idade);

                    intent.putExtras(bundle);

                    startActivity(intent);
                }

            }
        });


    }

    public void initViews(){
        inputNome = findViewById(R.id.textInputLayoutNome);
        inputSobreNome = findViewById(R.id.textInputLayoutSobrenome);
        inputIdade = findViewById(R.id.textInputLayoutIdade);
        botaoEnviar = findViewById(R.id.botaEnviar);

    }

}
