package fiap.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import fiap.sqlite.dao.ProdutoDAO;
import fiap.sqlite.model.Produto;

public class Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        listView = (ListView) findViewById(R.id.lv_Lista);

        //Recupera os produtos cadastrados no banco
        ProdutoDAO dao = new ProdutoDAO(this);
        List<Produto> lista = dao.list();

        //Criar o adapter para exebir a lista de produtos no ListView
        ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(this,android.R.layout.simple_list_item_1,lista);
        listView.setAdapter(adapter);
    }
}
