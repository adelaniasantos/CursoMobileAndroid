package br.digitalhouse.projetoarquitetura.reposity.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import androidx.room.TypeConverter;
import br.digitalhouse.projetoarquitetura.model.Produto;

public class ProdutoConverter {

    @TypeConverter
    public List<Produto> fromString(String value){
        Type listType = (Type) new TypeToken<List<String>>(){}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromList(List<Produto> list){
        Gson gson = new Gson();
        return gson.toJson(list);
    }
}
