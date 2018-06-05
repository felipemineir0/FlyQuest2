package br.com.flyquest.flyquest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Chamar tela CADASTRO
        Button cadastre = (Button) findViewById(R.id.cadastre);
        cadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 setContentView(R.layout.activity_cadastro);
            }
        });

        //Chamar tela HOME
        Button entrar = (Button) findViewById(R.id.entrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_home);
            }
        });
    }
}
