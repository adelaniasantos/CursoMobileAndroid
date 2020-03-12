package br.digitalhouse.projetoarquitetura.reposity.data;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import br.digitalhouse.projetoarquitetura.model.Produto;

@Database(entities = {Produto.class}, version = 1, exportSchema = false)
@TypeConverters(ProdutoConverter.class)
public abstract class ProdutoDataBase extends RoomDatabase {
    public abstract ProdutoDAO produtoDAO();

    private static volatile ProdutoDataBase INSTANCE;

    public static ProdutoDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ProdutoDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ProdutoDataBase.class, "produtos_bd")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
