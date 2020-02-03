package com.digitalhouse.exerciointentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {


    private TextView textoNome;
    private TextView textoMsgOla;
    private TextView textoSobrenome;
    private TextView textoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViews();

        Intent intent = getIntent();

        if(intent != null){

            Bundle bundle = intent.getExtras();

            String nome = bundle.getString("NOME");
            String sobrenome = bundle.getString("SOBRENOME");
            String idade = bundle.getString("IDADE");

            textoMsgOla.setText(textoMsgOla.getText().toString().replace("Fulano",nome));
            textoNome.setText(textoNome.getText().toString() + " " + nome);
            textoSobrenome.setText(textoSobrenome.getText().toString() + " " + sobrenome);
            textoIdade.setText(textoIdade.getText().toString() + " " + idade);
        }
    }

    public void initViews(){
        textoMsgOla = findViewById(R.id.texMsgOla);
        textoNome = findViewById(R.id.textViewNome);
        textoSobrenome = findViewById(R.id.textSobrenome);
        textoIdade = findViewById(R.id.texIdade);
    }

}
