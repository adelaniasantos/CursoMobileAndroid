package br.digitalhouse.exercciclodevida;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.nio.LongBuffer;


/**
 * A simple {@link Fragment} subclass.
 */
public class exercFragment extends Fragment {


    public exercFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("CICLO", "On Attach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_exerc, container, false);

        Log.i("CICLO", "onCreateView");
       return  view;
    }

}
