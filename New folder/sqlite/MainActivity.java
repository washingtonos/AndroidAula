package com.example.logonrm.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.logonrm.sqlite.dao.ProdutoDao;
import com.example.logonrm.sqlite.modelo.Produto;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtValor, edtDescricao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.et_nome);
        edtValor = (EditText) findViewById(R.id.et_Valor);
        edtDescricao = (EditText) findViewById(R.id.et_Valor);
    }

    public void Cadastrar(View view){
        Produto produto = new Produto();
        produto.setNome(edtNome.getText().toString());
        produto.setDescricao(edtDescricao.getText().toString());
        produto.setValor(Double.parseDouble(edtValor.getText().toString()));
        ProdutoDao dao = new ProdutoDao(this);
        dao.insert(produto);

        Toast.makeText(this, "Cadastrado !", Toast.LENGTH_LONG).show();

    }
}
