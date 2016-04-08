package com.example.aluno.tccdiovanna;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import util.AdaptadorImagem;


/**
 * Created by Aluno on 10/03/2016.
 */
public class Personagensgrid extends Activity {
    private int[] imagens = {
        R.drawable.aatrox, R.drawable.ahri, R.drawable.akali, R.drawable.alistar, R.drawable.anivia, R.drawable.annie, R.drawable.ashe, R.drawable.azir,
            R.drawable.bardo, R.drawable.blitzcrank, R.drawable.brand, R.drawable.braum, R.drawable.caitlyn, R.drawable.cassiopeia, R.drawable.chogath,
            R.drawable.corki, R.drawable.darius, R.drawable.diana, R.drawable.draven, R.drawable.drmundo, R.drawable.elise, R.drawable.ekko, R.drawable.evelynn,
            R.drawable.ezreal, R.drawable.fiddlesticks, R.drawable.fiora, R.drawable.fizz, R.drawable.galio, R.drawable.gangplank, R.drawable.garen,
            R.drawable.gnar, R.drawable.gragas, R.drawable.graves, R.drawable.hecarim, R.drawable.heimerdinger, R.drawable.illaoi, R.drawable.irelia,
            R.drawable.janna, R.drawable.jarvaniv, R.drawable.jax, R.drawable.jayce, R.drawable.jhin, R.drawable.jinx, R.drawable.kalista, R.drawable.karma,
            R.drawable.karthus, R.drawable.kassadin, R.drawable.katarina, R.drawable.kayle, R.drawable.kennen, R.drawable.khazix, R.drawable.kindred,
            R.drawable.kogmaw, R.drawable.leblanc, R.drawable.leesin,R.drawable.leona, R.drawable.lissandra, R.drawable.lucian, R.drawable.lulu,
            R.drawable.lux, R.drawable.malphite, R.drawable.malzahar, R.drawable.maokai, R.drawable.masteryi, R.drawable.missfortune, R.drawable.mordekaiser,
            R.drawable.morgana, R.drawable.nami, R.drawable.nasus, R.drawable.nautilus, R.drawable.nidalee, R.drawable.nocturne, R.drawable.nunu, R.drawable.olaf,
            R.drawable.orianna, R.drawable.pantheon, R.drawable.poppy, R.drawable.quinn, R.drawable.rammus, R.drawable.reksai, R.drawable.renekton, R.drawable.rengar,
            R.drawable.riven, R.drawable.rumble, R.drawable.ryze, R.drawable.sejuani, R.drawable.shaco, R.drawable.shen, R.drawable.shyvana, R.drawable.singed,
            R.drawable.sion, R.drawable.sivir, R.drawable.skarner, R.drawable.sona, R.drawable.soraka, R.drawable.swain, R.drawable.tahnkench, R.drawable.talon,
            R.drawable.taric, R.drawable.teemo, R.drawable.thresh, R.drawable.tristana,R.drawable.trundle, R.drawable.tryndamere, R.drawable.twistedfate,
            R.drawable.twitch, R.drawable.udyr, R.drawable.urgot, R.drawable.varus, R.drawable.vayne, R.drawable.veigar, R.drawable.velkoz, R.drawable.vi,
            R.drawable.viktor, R.drawable.vladimir, R.drawable.volibear, R.drawable.warwick, R.drawable.wukong, R.drawable.xerath, R.drawable.xinzhao, R.drawable.yasuo,
            R.drawable.yorick, R.drawable.zac, R.drawable.zed, R.drawable.ziggs, R.drawable.zilean, R.drawable.zyra
    };


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.personagensgrid);
        GridView grid = (GridView) findViewById(R.id.gridimagens);
        grid.setAdapter(new AdaptadorImagem(this, imagens));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int posicao, long id) {
                Toast.makeText(Personagensgrid.this, "Nº da imagem: " +
                        imagens[posicao], Toast.LENGTH_SHORT).show();
            }
        });


    }


}
