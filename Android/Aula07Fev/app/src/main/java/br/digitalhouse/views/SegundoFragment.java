package br.digitalhouse.views;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import br.digitalhouse.comunicacaoentrefragmento.R;
import br.digitalhouse.model.SistemaOperacional;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static br.digitalhouse.views.MainActivity.SISTEMA_OPERACIONAL;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragment extends Fragment {

    private ImageView imagem;
    private TextView nomeSistema;


    public SegundoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segundo, container, false);

        initViews(view);

        if(getArguments()!=null){
            Bundle bundle = getArguments();
            SistemaOperacional so = bundle.getParcelable(SISTEMA_OPERACIONAL);
            nomeSistema.setText(so.getImagem());

            //Nova instancia de um objeto drawable
            Drawable drawable = getResources().getDrawable(so.getImagem());

            //setando a imagem para o componente imageView
            imagem.setImageDrawable(drawable);
        }

        return  view;
    }

    private void initViews(View view){
        imagem = view.findViewById(R.id.android);
        nomeSistema = view.findViewById(R.id.text_home);
    }


}
