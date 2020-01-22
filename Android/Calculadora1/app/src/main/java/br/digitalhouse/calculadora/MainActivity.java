package br.digitalhouse.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumeroUm;
    private EditText inputNumeroDois;
    private Button botaoCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logicaBotaoCalcular();

            }
        });

    }

    private void logicaBotaoCalcular() {
        if(!inputNumeroUm.getText().toString().isEmpty()
                && !inputNumeroDois.getText().toString().isEmpty()){

            int numeroUm = Integer.parseInt(inputNumeroUm.getText().toString());
            int numeroDois = Integer.parseInt(inputNumeroDois.getText().toString());

            String resultado  =  String.valueOf(calcular(numeroUm, numeroDois));

            textViewResultado.setText(resultado);

            inputNumeroUm.getText().clear();
            inputNumeroDois.getText().clear();

        }else{
            inputNumeroUm.setError("Campo Obrigatorio");
            inputNumeroDois.setError("Campo Obrigatorio");
        }
    }

    private void initViews(){
        inputNumeroUm = findViewById(R.id.edit_text_numero_um);
        inputNumeroDois = findViewById(R.id.edit_text_numero_dois);
        botaoCalcular = findViewById(R.id.botao_calcular);
        textViewResultado = findViewById(R.id.text_resultado);
    }

    public int calcular(int numeroUm, int numeroDois){

        return numeroUm + numeroDois;
    }
}
