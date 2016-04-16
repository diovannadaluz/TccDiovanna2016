package util;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;

import com.example.aluno.tccdiovanna.R;

import dao.contract;

/**
 * Created by Aluno on 10/03/2016.
 */
public class AdaptadorImagem extends SimpleCursorAdapter {

    public AdaptadorImagem(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        super.bindView(view, context, cursor);
        //mapeia a ImageView do layout da View interna da GridView
        ImageView imvImagem = (ImageView) view.findViewById(R.id.imageView);
        //insere a imange no componente a partir do seu id na classe R
        imvImagem.setImageResource(cursor.getInt(cursor.getColumnIndex(contract.Personagem.COLUNA_IMAGEM)));
    }
}
