package br.digitalhouse.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import br.digitalhouse.comunicacaoentrefragmento.R;
import br.digitalhouse.interfaces.Comunicador;
import br.digitalhouse.model.SistemaOperacional;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Comunicador {

    public static final String SISTEMA_OPERACIONAL = "SO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragments(R.id.container2, new PrimeiroFragment());
    }

    @Override
    public void envioDadosSistemaOperacional(SistemaOperacional so) {
        Bundle bundle = new Bundle();

        //envio de objeto compactado
        bundle.putParcelable(SISTEMA_OPERACIONAL, so);

        Fragment segundoFragmento = new SegundoFragment();

        segundoFragmento.setArguments(bundle);

        replaceFragments(R.id.container1, segundoFragmento);

    }

    private void replaceFragments(int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }
}
