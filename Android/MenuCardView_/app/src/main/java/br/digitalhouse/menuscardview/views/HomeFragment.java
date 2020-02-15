package br.digitalhouse.menuscardview.views;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import br.digitalhouse.menuscardview.R;
import br.digitalhouse.menuscardview.adapter.ContatoRecyclerViewAdapter;
import br.digitalhouse.menuscardview.model.Contato;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewContatos;
    private ContatoRecyclerViewAdapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerViewContatos = view.findViewById(R.id.recycler_view_contatos);
        adapter = new ContatoRecyclerViewAdapter(getListContatos());

        recyclerViewContatos.setAdapter(adapter);
        //Vertical
        recyclerViewContatos.setLayoutManager(new LinearLayoutManager(getContext()));


        return  view;
    }

    private List<Contato> getListContatos(){
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Karol", "1111-1111"));
        contatos.add(new Contato("Herinque", "1111-1111"));
        contatos.add(new Contato("Sol", "1111-1111"));
        contatos.add(new Contato("Ingrid", "1111-1111"));

        return contatos;
    }

}
