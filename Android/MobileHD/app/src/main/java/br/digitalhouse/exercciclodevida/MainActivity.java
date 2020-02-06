package br.digitalhouse.exercciclodevida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao1;
    private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao1 = findViewById(R.id.button1);
        botao2 = findViewById(R.id.botao2);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragments(new exercFragment());
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragments(new SegundoFragment());
            }
        });


    }

    private void replaceFragments(Fragment fragment){
        //Declarar o gerenciador
        FragmentManager manager = getSupportFragmentManager();

        //Declarar o transaction
        FragmentTransaction transaction = manager.beginTransaction();

        //Replace declarando aonde eu vou recarregar o meu fragmento
        transaction.replace(R.id.container, fragment);

        //Finalizar a acao
        transaction.commit();

        //Forma simplificada
        //getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

    }
}
