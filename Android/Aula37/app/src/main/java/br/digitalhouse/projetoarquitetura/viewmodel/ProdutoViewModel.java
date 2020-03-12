package br.digitalhouse.projetoarquitetura.viewmodel;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import br.digitalhouse.projetoarquitetura.model.Produto;
import br.digitalhouse.projetoarquitetura.reposity.ProdutoRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ProdutoViewModel extends AndroidViewModel {
    private ProdutoRepository repository = new ProdutoRepository();
    private MutableLiveData<List<Produto>> mutableProduto = new MutableLiveData<>();
    public LiveData<List<Produto>> liveDataProduto = mutableProduto;
    //Gerenciamento de thread
    private CompositeDisposable disposable = new CompositeDisposable();

    public ProdutoViewModel(@NonNull Application application) {
        super(application);
    }

    public void getTodosProdutos(Context context){
        disposable.add(
                repository.getTodosProdutos(context)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(produto -> {
                    mutableProduto.setValue(produto);
                }, throwable -> {
                    Log.i("Error", throwable.getMessage());
                })
        );
    }

    @Override
    protected void onCleared(){
        super.onCleared();
        disposable.clear();
    }


}
