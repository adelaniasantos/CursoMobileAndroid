package com.digitalhouse.comunicacaofragmentos;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.digitalhouse.comunicacaofragmentos.interfaces.Comunicador;
import com.digitalhouse.comunicacaofragmentos.model.Cores;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragmento extends Fragment {
    public Comunicador comunicador;
    //Declaração dos componentes
    private Button botaoVerde;
    private Button botaoVermelho;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        //tratamento da inicialização do atributo com try catch para caso haja uma exceção
        try {

            //inicialização do atributo recebendo um contexto que seja do tipo Comunicados(interface)
            //Nesse caso o contexto é a MainActivity que implementa a interface
            comunicador = (Comunicador) context;
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public PrimeiroFragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.primeiro_fragmento, container, false);
        initView(view);

       //Clique Botao Verde
        botaoVerde.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Cores cores = new Cores("VERDE", R.color.colorPrimaryDark);

                //através do nosso atributo do tipo da interface invocamos o método que envia os dados
                //passando o objeto que acabou de ser criado com os dados de android
                comunicador.envioDadosCores(cores);
            }
        });

        //Clique Botao Vermelho
        botaoVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cores cores = new Cores("VERMELHO", R.color.colorAccent);


                //através do nosso atributo do tipo da interface invocamos o método que envia os dados
                //passando o objeto que acabou de ser criado com os dados de android
                comunicador.envioDadosCores(cores);
            }
        });


        return view;
    }

    private void initView(View view) {
        botaoVerde = view.findViewById(R.id.botaoVerde);
        botaoVermelho = view.findViewById(R.id.botaoVermelho);
    }

}
