package com.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ptUsername;
    private EditText password;
    private Button btnEntrar;
    private TextView tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ptUsername = findViewById(R.id.ptUsername);
        password = findViewById(R.id.password);
        btnEntrar = findViewById(R.id.btnEntrar);
        tvMensagem = findViewById(R.id.tvMensagem);

        View.OnClickListener ouvinte = new View.OnClickListener() {

            @Override
            public void onClick(View informedView) {

                if(ptUsername.getText().toString().equals("hemerson") && password.getText().toString().equals("hemerson@10")) {
                    tvMensagem.setText("Login efetuado com sucesso!");
                    tvMensagem.setVisibility(View.VISIBLE);
                    ptUsername.onEditorAction(EditorInfo.IME_ACTION_DONE);
                } else {
                    tvMensagem.setText("Usuário ou senha inválidos!");
                    tvMensagem.setVisibility(View.VISIBLE);
                    ptUsername.onEditorAction(EditorInfo.IME_ACTION_DONE);
                }

                ptUsername.setText("");
                password.setText("");

            }

        };

        btnEntrar.setOnClickListener(ouvinte);

        View.OnClickListener ouvinte2 = new View.OnClickListener() {

            @Override
            public void onClick(View informedView) {
               tvMensagem.setText("");
            }

        };

        ptUsername.setOnClickListener(ouvinte2);

    }
}