package com.example.logonrm.exnac2;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.logonrm.exnac2.model.Chamado;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv_ListarChamadoWS);

        //Chamada do WebService
        ListaTask task = new ListaTask();
        task.execute();
    }

    private class ListaTask extends AsyncTask<Void, Void, String>{

        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(MainActivity.this,"Aguarde..","Listando..");
        }

        @Override
        protected void onPostExecute(String s) {
            progressDialog.dismiss();
            if (s != null){
                //Ler o JSON Array
                try {
                    JSONObject json = new JSONObject(s);
                    JSONArray jsonArray = json.getJSONArray("chamados");

                    List<Chamado> lista = new ArrayList<Chamado>();

                    for (int i=0; i < jsonArray.length(); i++){
                        JSONObject chamado = (JSONObject) jsonArray.get(i);
                        int codigo = chamado.getInt("codigo");
                        int codigoFunc = chamado.getInt("codigoFuncionario");
                        
                    }
                } catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected String doInBackground(Void... params) {
            return null;
        }
    }


}
