package br.digitalhouse.projetoarquitetura.reposity;

import android.content.Context;

import java.util.List;

import br.digitalhouse.projetoarquitetura.model.Produto;
import br.digitalhouse.projetoarquitetura.reposity.data.ProdutoDataBase;
import io.reactivex.Flowable;

public class ProdutoRepository {

    public Flowable<List<Produto>> getTodosProdutos(Context context){
        return ProdutoDataBase.getDatabase(context).produtoDAO().todosOsProdutosBd();
    }
}
