package dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


/**
 * Created by Aluno on 18/03/2016.
 */
public class PersonagemDAO {
    private static PersonagemDAO persDAO; //objeto da própria classe
    private final Context context; //o contexto da aplicação
    private DBHelper myHelper; //objeto que auxilia na criação e/ou upgrade do banco de dados
    private SQLiteDatabase database; //objeto de conexão com o banco de dados

    /**
     * Método construtor privado para implementar o padrão de projeto Singleton.
     *
     * @param context
     */
    private PersonagemDAO(Context context) {
        this.context = context; //recebe o contexto da Activity que o chamou
    }

    /**
     * Método responsável por obter a instância do objeto ou contruí-lo, se este ainda não tiver sido contruído.
     *
     * @param context
     * @return persDAO
     */
    public static PersonagemDAO getInstance(Context context) {
        if (persDAO == null) {
            persDAO = new PersonagemDAO(context);
            return persDAO;
        }

        return persDAO;
    }

    /**
     * Método responsável por abrir uma conexão com o banco de dados.
     */
    public void open() {
        myHelper = DBHelper.getInstance(context); //instância um objeto que auxilia na criação e/ou atualização
        database = myHelper.getWritableDatabase(); //devolve uma conexão para o banco de dados
    }

    /**
     * Método responsável por liberar a conexão com o banco de dados.
     */
    public void close() {
        database.close(); //libera o recurso
    }
}