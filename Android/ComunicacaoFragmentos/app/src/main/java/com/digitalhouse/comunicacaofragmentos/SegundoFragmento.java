package com.digitalhouse.comunicacaofragmentos;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.digitalhouse.comunicacaofragmentos.model.Cores;

import static com.digitalhouse.comunicacaofragmentos.MainActivity.CHAVE_COR;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragmento extends Fragment {
    private TextView nomeCor;
    private FrameLayout layout;

    public SegundoFragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.segundo_fragmento, container, false);

        initViews(view);

        //verifica se o arguments que está chegando não é nulo
        if (getArguments() != null){

            //criamos um bandle que recebe os dados que esão chegando
            Bundle bundle = getArguments();

            //cria um objeto do tipo SistemOperacional que está recebendo o
            //objeto que está chegando atraves do getParcelable passando a chave de identificação
            Cores cores = bundle.getParcelable(CHAVE_COR);


            //Inserindo o valor do nome que chegou para o textview
            nomeCor.setText(cores.getNomeCor());

            //Nova instancia de um objeto drawable
           // Drawable drawable = getResources().getDrawable(cores.getHexaCor());

            //Setando o hexa que chegou para o componente xxxx
            layout.setBackgroundColor(cores.hexaCor);

        }

        return view;
    }

    private void initViews(View view) {
        nomeCor = view.findViewById(R.id.textoNome);
        layout = view.findViewById(R.id.segundo_fragmento);
    }

}
