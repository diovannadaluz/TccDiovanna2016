package com.example.aluno.tccdiovanna;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;


import dao.PersonagemDAO;
import dao.contract;
import util.AdaptadorImagem;


/**
 * Created by Aluno on 10/03/2016.
 */
public class Personagensgrid extends Activity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private PersonagemDAO personagemDAO;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //acesso ao banco
        personagemDAO = PersonagemDAO.getInstance(this);
        personagemDAO.open();

        final String[] DE = {contract.Personagem.COLUNA_NOME, contract.Personagem.COLUNA_IMAGEM}; //DE (colunas presentes no Cursor)
        final int[] PARA = {R.id.textView, R.id.imageView}; //PARA (Views para onde irão os dados do Cursor)

        //mapeia o GridView
        GridView gridView = (GridView) findViewById(R.id.gridimagens);

        //cria um objeto da classe GridViewAdapter, um adaptador Cursor -> GridView
        AdaptadorImagem dadosAdapter = new util.AdaptadorImagem(
                Personagensgrid.this, //contexto da aplicação
                R.layout.gridpersonagens_interno, //layout de cada item do GridView
                personagemDAO.getLista(), //cursor (resultante de uma consulta no banco de dados)
                DE,
                PARA,
                0);

        //associa o adaptador a GridView
        gridView.setAdapter(dadosAdapter);


    }
}


