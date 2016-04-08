package util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.aluno.tccdiovanna.R;

/**
 * Created by Aluno on 10/03/2016.
 */
public class AdaptadorImagem extends BaseAdapter {
    private Context ctx;
    private final int[] imagens;

    public AdaptadorImagem(Context c, int[] imagens){
        this.ctx = c;
        this.imagens = imagens;
    }
   @Override
public int getCount() { return imagens.length;}
@Override
public Object getItem(int posicao) { return posicao;}
@Override
public long getItemId(int posicao) {return posicao;}
@Override
public View getView(int posicao, View convertView, ViewGroup parent) {
    ImageView img = new ImageView(ctx);
    img.setImageResource(imagens[posicao]);
    img.setAdjustViewBounds(true);


return img;
}
}