package br.digitalhouse.comunicacaoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputEmail;
    private TextInputLayout inputSenha;
    private FloatingActionButton botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = inputEmail.getEditText().getText().toString();
                String senha = inputEmail.getEditText().getText().toString();

               if(!email.isEmpty() && !senha.isEmpty()){
                   Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                   Bundle bundle = new Bundle();
                   bundle.putString("EMAIL", email);
                   intent.putExtras(bundle);
                   startActivity(intent);
               }
            }
        });


    }

    private void initViews() {
        inputEmail = findViewById(R.id.email);
        inputSenha = findViewById(R.id.senha);
        botaoEnviar = findViewById(R.id.floatingActionButtonEnviar);
    }
}
