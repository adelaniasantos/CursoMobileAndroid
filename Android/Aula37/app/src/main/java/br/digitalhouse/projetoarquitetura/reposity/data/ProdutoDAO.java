package br.digitalhouse.projetoarquitetura.reposity.data;

import android.database.Observable;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import br.digitalhouse.projetoarquitetura.model.Produto;
import io.reactivex.Flowable;

@Dao
public interface ProdutoDAO {

    @Insert
    void inserirProduto(Produto produto);

    @Delete
    void apagaProdutoBd(Produto produto);

    @Query("SELECT * FROM produtos")
    Flowable<List<Produto>>todosOsProdutosBd();

    @Query("SELECT * FROM produtos WHERE nome =:nome")
    Produto getProdutoPorNomeBd(String nome);



}
