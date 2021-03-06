package com.example.p2.Main;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p2.R;
import com.example.p2.dao.Cidade;
import com.example.p2.dao.bd;

public class CadastroCidade extends AppCompatActivity {

    private EditText nome;
    private EditText populacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cidade);

        nome = findViewById(R.id.nome_cidade);
        populacao = findViewById(R.id.num_pop);


    }
    public void SalvarCidade(View view){
        Cidade cidade = new Cidade();

        cidade.setNome(nome.getText().toString());
        cidade.setPopulacao(Integer.parseInt(populacao.getText().toString()));

        bd.SalvarDados(cidade);
        System.out.println(bd.getDados());
        finish();
    }
}

