package com.digitalhouse.comunicacaofragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.digitalhouse.comunicacaofragmentos.interfaces.Comunicador;
import com.digitalhouse.comunicacaofragmentos.model.Cores;

public class MainActivity extends AppCompatActivity implements Comunicador {

   public static final String CHAVE_COR = "COR" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //método que irá recarregar o conteúdo do Primeiro fragmento
       replaceFragments(R.id.container2, new PrimeiroFragmento());
    }

    @Override
    public void envioDadosCores(Cores cores) {

        //criação do bundle
        Bundle bundle = new Bundle();

        //Inserindo para o bundle a chave que é a nossa constante, e o objeto
        //Sempre que você quiser mandar um objeto para uma activity ou fragmento usa-se o putParcelable
        bundle.putParcelable(CHAVE_COR, cores);

        //Criando a instancia do segundo fragmento
        Fragment segundoFragmento = new SegundoFragmento();

        //inseriondo através do setArguments os dados que serão enviados junto com o segundo fragmento
        segundoFragmento.setArguments(bundle);

        //chamada do método que irá recarregar o segundo fragmento no container 1 da activity
        replaceFragments(R.id.container1, segundoFragmento);


    }

    //Método que faz o replace do fragmento recebendo o id do container que será recarregado, e o fragmento
    private void replaceFragments(int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }
}
