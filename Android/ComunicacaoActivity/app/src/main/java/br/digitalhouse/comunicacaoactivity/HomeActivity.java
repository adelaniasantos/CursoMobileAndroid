package br.digitalhouse.comunicacaoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView textoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textoEmail = findViewById(R.id.text_view_email);
        Intent intent = getIntent();

        if(intent != null){
            Bundle bundle = intent.getExtras();

            String email = bundle.getString("EMAIL");

            textoEmail.setText(email);
        }

    }
}
