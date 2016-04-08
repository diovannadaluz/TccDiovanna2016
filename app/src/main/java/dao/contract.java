package dao;

import android.provider.BaseColumns;

/**
 * Created by Aluno on 10/03/2016.
 */
public class contract {
    public static final String BD_NOME = "lolstatsdb";
    public static final int BD_VERSAO = 1;

    public contract(){

    }

    public static abstract class Personagem implements BaseColumns {
        public static final String TABELA_NOME = "personagens";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_NOME = "nome";
        public static final String COLUNA_LORE = "lore";
        public static final String COLUNA_PRECORP = "precorp";
        public static final String COLUNA_PRECOIP = "precoip";
        public static final String COLUNA_COUNTERUM = "counterum";
        public static final String COLUNA_COUNTERDOIS = "counterdois";
        public static final String COLUNA_COUNTERTRES = "countertres";
        public static final String COLUNA_IMAGEM = "imagem";
        public static final String COLUNA_NOMESKIN = "nomeskin";
        public static final String COLUNA_NOMEPASSIVA = "nomepassiva";

    }

    public static abstract class Habilidades implements BaseColumns {
        public static final String TABELA_NOME = "habilidades";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_HQ = "habilidadeq";
        public static final String COLUNA_HW = "habilidadew";
        public static final String COLUNA_HE = "habilidadee";
        public static final String COLUNA_HR = "habilidade";
        public static final String COLUNA_PASSIVA = "passiva";
        public static final String COLUNA_IHQ = "imagemq";
        public static final String COLUNA_IHW = "imagemw";
        public static final String COLUNA_IHE = "imageme";
        public static final String COLUNA_IHR = "imagemr";
        public static final String COLUNA_IP = "imagemp";
        public static final String COLUNA_NOMEQ = "nomeq";
        public static final String COLUNA_NOMEW = "nomew";
        public static final String COLUNA_NOMEE = "nomee";
        public static final String COLUNA_NOMER = "nomer";
        public static final String COLUNA_NOMEPASSIVA = "nomepassiva";

    }

    public static abstract class Skins implements BaseColumns {
        public static final String TABELA_NOME = "skins";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_NOMESKIN = "nome";
        public static final String COLUNA_PRECO = "preco";
        public static final String COLUNA_IMAGEMSKIN = "imagem";

    }

    public static abstract class Guias implements BaseColumns {
        public static final String TABELA_NOME = "guias";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_NOMEGUIA = "nome";
        public static final String COLUNA_TEXTOGUIA = "texto";
        public static final String COLUNA_CRIADORGUIA = "criador";

    }

    public static abstract class Itens implements BaseColumns {
        public static final String TABELA_NOME = "itens";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_NOME = "nome";
        public static final String COLUNA_IMAGEM = "imagem";
        public static final String COLUNA_DESCRICAO = "descricao";
        public static final String COLUNA_CUSTO = "custo";
        public static final String COLUNA_PRECOVENDA = "precovenda";

    }

    public static abstract class Noticias implements BaseColumns{
        public static final String TABELA_NOME = "noticias";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_MANCHETE = "manchete";
        public static final String COLUNA_TEXTO = "texto";

    }

    public static abstract class Talentos implements BaseColumns{
        public static final String TABELA_NOME = "talentos";
        public static final String COLUNA_ID = "_id";
        public static final String COLUNA_NOME = "nome";
        public static final String COLUNA_DESCRICAO = "descricao";

    }

}
