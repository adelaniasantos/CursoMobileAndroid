package br.digitalhouse.menucardview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Criar uma nova instancia da toolbar e inicializa
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Inicializa o drawer
        drawer = findViewById(R.id.drawer_layout);

        //Cria uma nova instancia do NavigationView e inicializa
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //Passa cada ID de Menu como um conjunto de IDs,
        //Pois cada menu deve ser considerado como destino de nivel superior.
        appBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_gallery)
                .setDrawerLayout(drawer)
                .build();

        //Acao de clique nos itens do menu do drawerLayout e replace dos respectivos fragmentos
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                //Criacao de uma veriavel que vai receber o id do item selecionado
                int id = menuItem.getItemId();

                if(id == R.id.nav_home){

                    replaceFragment(new HomeFragment());
                    Snackbar.make(toolbar, "HOME", Snackbar.LENGTH_LONG).show();
                    //Faço o replace do fragmento de home quando clicar no botão de ohme

                }else if (id == R.id.nav_gallery){

                    replaceFragment(new GaleriaFragment());
                    Snackbar.make(toolbar, "GALERIA", Snackbar.LENGTH_LONG).show();
                    //Faço o replace do fragmento do Galeria quando clicar no botão de galeria
                }

                //Chama a ação de close do drawerLayout e mover a gaveta
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    //Sobrescrita do metodo da ação de voltar que verifica se a NavigatinView está
    //Pressionado fecha apenas o menu ao invés da Activity
    @Override
    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    //Inflar o menu superior e isso adiciona itens
    // a barra de ação, se estiver presente.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //Criacao de uma variavel que vai receber o id do item selecionado
        int id = item.getItemId();

        //Verifica se o id recebido é igual ao do layout e realiza uma açao
        if(id == R.id.action_settings){
            //Mostra um toast
            Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
