package dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.aluno.tccdiovanna.R;

/**
 * Created by Aluno on 10/03/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
        private static DBHelper dbHelper;
        private Context context;

        private DBHelper(Context context) {
            super(context, contract.BD_NOME, null, contract.BD_VERSAO);
            this.context = context;
        }

        public static DBHelper getInstance(Context context) {
            if (dbHelper == null) {
                dbHelper = new DBHelper(context);
                return dbHelper;
            } else {
                return dbHelper;
            }
        }

        public void onCreate(SQLiteDatabase db) {

        // criação da tabela Habilidades


        String habsqlcreate = "create table " + contract.Habilidades.TABELA_NOME + " ("
                + contract.Habilidades.COLUNA_ID + " integer primary key autoincrement,"
                + contract.Habilidades.COLUNA_NOMEPASSIVA + " text,"
                + contract.Habilidades.COLUNA_NOMEQ + " text,"
                + contract.Habilidades.COLUNA_NOMEW + " text,"
                + contract.Habilidades.COLUNA_NOMEE + " text,"
                + contract.Habilidades.COLUNA_NOMER + " text,"
                + contract.Habilidades.COLUNA_PASSIVA + " text,"
                + contract.Habilidades.COLUNA_HQ + " text,"
                + contract.Habilidades.COLUNA_HW + " text,"
                + contract.Habilidades.COLUNA_HE + " text,"
                + contract.Habilidades.COLUNA_HR + " text,"
                + contract.Habilidades.COLUNA_IHQ + " big int,"
                + contract.Habilidades.COLUNA_IHW + " big int,"
                + contract.Habilidades.COLUNA_IHE + " big int,"
                + contract.Habilidades.COLUNA_IHR + " big int,"
                + contract.Habilidades.COLUNA_IP + " big int);";
        db.execSQL(habsqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Habilidades.TABELA_NOME);

                ContentValues habvalores = new ContentValues();
                habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Poço de Sangue");
                habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Voo Sombrio");
                habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Sede de Sangue / Preço em Sangue");
                habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Lâminas da Aflição");
                habvalores.put(contract.Habilidades.COLUNA_NOMER, "Massacre");
                habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao usar uma habilidade que tenha custo de Vida, Aatrox armazena o dano auto infligido no Poço de Sangue. Ao receber dano letal, Aatrox extrai o sangue atual do poço e o recupera em forma de Vida ao longo de uma breve duração. Além disso, Aatrox recebe 1% de Velocidade de Ataque para cada 2% de sangue que houver no poço.");
                habvalores.put(contract.Habilidades.COLUNA_HQ, "Aatrox levanta voo e se joga em um local alvo, causando dano e lançando ao ar inimigos no centro do impacto.\n" +
                        "Aatrox levanta voo e golpeia o chão no local alvo, causando 70/115/160/205/250 (+60% de Dano de Ataque Bônus) de Dano Físico a todos os inimigos próximos e arremessando ao ar por 1 segundos os alvos no centro do impacto.");
                habvalores.put(contract.Habilidades.COLUNA_HW, "Enquanto ativado, Aatrox causa dano bônus a cada três ataques, ao custo de sua própria Vida. Enquanto desativado, Aatrox restaura Vida a cada três ataques.\n" +
                                "Enquanto desativado, Aatrox se beneficia de Sede de Sangue. Enquanto ativado, Preço em Sangue é ativado e remove Sede de Sangue.\n" +
                                "Sede de Sangue: Todo terceiro ataque de Aatrox restaura 20/25/30/35/40 (+25% de Dano de Ataque Bônus) de Vida, aumentando para 200% caso esteja com menos de metade da Vida.\n" +
                                "Preço em Sangue: Todo terceiro ataque de Aatrox causa 60/95/130/165/200 (+100% de Dano de Ataque Bônus) de Dano Físico adicional e gasta de Vida.");
                habvalores.put(contract.Habilidades.COLUNA_HE, "Aatrox desfere um poderoso golpe de espada, causando dano e lentidão a todos os inimigos atingidos.\n" +
                                "Aatrox desfere o poder de sua espada, causando 75/110/145/180/215 (+60% de Poder de Habilidade) (+60% de Dano de Ataque Bônus) de Dano Mágico a todos os inimigos atingidos e lhes causa 40% de lentidão por 1.75/2/2.25/2.5/2.75 segundos.");
                habvalores.put(contract.Habilidades.COLUNA_HR, "Aatrox colhe o sangue de suas vítimas, causando dano a todos os campeões inimigos ao seu redor e recebendo aumento de Velocidade de Ataque e de Alcance de Ataque por um curto período.\n" +
                        "Aatrox colhe o sangue de suas vítimas, causando 200/300/400 (+100% de Poder de Habilidade) de Dano Mágico a todos os campeões inimigos ao seu redor. Em seguida, Massacre preenche o Poço de Sangue de Aatrox em 20% para cada campeão atingido e lhe concede 40/50/60% de Velocidade de Ataque e 175 de Alcance de Ataque por 12 segundos.");
                habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.aatroxp);
                habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.aatroxq);
                habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.aatroxw);
                habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.aatroxe);
                habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.aatroxr);
                        db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
                Log.i("tcc", "Inseriu as habilidades de Aatrox");

/* ************************************************************************************************************************************************************ */
               habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Furto de Essência");
                habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Orbe da Ilusão");
                habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Fogo de Raposa");
                habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Encanto");
                habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ímpeto Espiritual");
                habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Recebe uma carga de Furto de Essência sempre que um de seus feitiços atinge um inimigo (máx.: 3 cargas por feitiço). Ao atingir 9 cargas, o próximo feitiço de Ahri irá curá-la a cada vez que atinge um inimigo.");
                habvalores.put(contract.Habilidades.COLUNA_HQ, "Ahri lança e recupera seu orbe, causando Dano Mágico no trajeto de ida e Dano Verdadeiro na volta. Ahri recebe Velocidade de Movimento enquanto seu orbe estiver em movimento.\n" +
                        "Causa 40/65/90/115/140 (+35% de Poder de Habilidade) de Dano Mágico no caminho de ida e 40/65/90/115/140 (+35% de Poder de Habilidade) de Dano Verdadeiro no caminho de volta.Ahri recebe Velocidade de Movimento enquanto seu orbe estiver em movimento.");
                habvalores.put(contract.Habilidades.COLUNA_HW, "Ahri libera três fogos de raposa que travam alvo e atacam inimigos próximos.\n" +
                                "Cria 3 fogos de raposa que travam mira em inimigos próximos (priorizando campeões), causando 40/65/90/115/140 (+40% de Poder de Habilidade) de Dano Mágico.Inimigos atingidos por mais de um fogo de raposa recebem 30% de dano de cada fogo de raposa adicional, com o máximo de 0 de dano a um único inimigo.");
                habvalores.put(contract.Habilidades.COLUNA_HE, "Ahri lança um beijo que causa dano e encanta um inimigo que encontre, fazendo com que andem inofensivamente em direção à ela.\n" +
                                "Sopra um beijo que causa 60/90/120/150/200 (+50% de Poder de Habilidade) de Dano Mágico e encanta um inimigo, fazendo com que ele caminhe inofensivamente na direção de Ahri por 1/1.25/1.5/1.75/2 segundo(s).");
                habvalores.put(contract.Habilidades.COLUNA_HR, "Ahri corre adiante e dispara raios de essência, causando dano em 3 inimigos próximos (priorizando Campeões). Ímpeto Espiritual pode ser lançado até três vezes antes de entrar em Tempo de Recarga.\n" +
                                "Lepidamente avança e dispara 3 raios de essência em inimigos próximos (priorizando campeões), causando 70/110/150 (+30% de Poder de Habilidade) de Dano Mágico. Pode ser lançado até três vezes dentro de 10 segundos antes de iniciar o Tempo de Recarga.");
                habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ahrip);
                habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.ahriq);
                habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ahriw);
                habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ahrie);
                habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.ahrir);
                    db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ahri");

/* ************************************************************************************************************************************************************ */
         habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Disciplinas Gêmeas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Marca do Assassino");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Proteção do Crepúsculo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Corte Crescente");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Dança das Sombras");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Disciplina da Força: Os ataques básicos de Akali causam 6% de Dano Mágico adicional, aumentando em 1% a cada 6 pontos de Poder de Habilidade.\n" +
                    "\n" +
                    "Disciplina do Poder: Akali recebe 6% de Vampirismo Mágico, aumentando em 1% a cada 6 pontos de Dano de Ataque adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Akali arremessa sua kama em um alvo inimigo para causar 35/55/75/95/115 (+40% de Poder de Habilidade) de Dano Mágico e marcá-lo por 6 segundos.Os ataques básicos de Akali contra um alvo marcado consomem a marca para causar 45/70/95/120/145 (+50% de Poder de Habilidade) de Dano Mágico e restaurar 40 de Energia.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Akali cria uma cortina de fumaça. Dentro da área de ação, ela fica invisível e tem sua Velocidade de Movimento brevemente aumentada. Atacar ou usar habilidades a revelam brevemente. Inimigos na nuvem de fumaça têm sua Velocidade de Movimento reduzida.\n" +
                            "Akali cria uma cortina de fumaça que dura 8 segundos. Dentro da área de ação, ela fica invisível e tem sua Velocidade de Movimento aumentada em 20/40/60/80/100%, decaindo ao longo de 1 segundo. Atacar ou usar habilidades a revelam brevemente.Inimigos na nuvem de fumaça sofrem 14/18/22/26/30% de redução na Velocidade de Movimento.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Akali brande suas kamas, causando dano baseado em seu Dano de Ataque e Poder de Habilidade.\n" +
                            "Akali brande suas kamas, atingindo as unidades inimigas com 30/55/80/105/130 (+60% de Dano de Ataque) (+40% de Poder de Habilidade) de Dano Físico.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Akali move-se pelas sombras para atravessar rapidamente seu alvo, causando dano e consumindo uma carga de Essência das Sombras. Akali recupera as cargas de Essência das Sombras tanto periodicamente quanto em abates e assistências, com máximo de 3 acúmulos.\n" +
                            "Akali move-se pelas sombras para atravessar rapidamente seu alvo, causando 100/175/250 (+50% de Poder de Habilidade) de Dano Mágico.Akali armazena uma Essência das Sombras com abates e assistências, assim como a cada 30/22.5/15 segundos, até um total de 3.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.akalip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.akaliq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.akaliw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.akalie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.akalir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Akali");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Atropelar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Pulverizar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Cabeçada");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Urro Triunfante");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Vontade Indestrutível");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Cada vez que Alistar lança um feitiço, ele pisoteia unidades e torres próximas por poucos segundos, causando dano às unidades as quais ele passar por cima.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Alistar golpeia o chão, causando 60/105/150/195/240 (+50% de Poder de Habilidade) de Dano Mágico e arremessando todos os inimigos próximos ao ar, atordoando-os por 1,5 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Alistar avança em um inimigo e o empurra, causando 55/110/165/220/275 (+70% de Poder de Habilidade) de Dano Mágico e atordoando-o enquanto estiver sendo empurrado para trás.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Restaura 60/90/120/150/180 (+20% de Poder de Habilidade) de Vida a Alistar e metade dessa quantia para aliados próximos. O Tempo de Recarga é reduzido em 2 segundos a cada vez que uma unidade inimiga morre.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Remove os desarmes de Alistar. Ele recebe 60/75/90 de Dano de Ataque. O Dano Mágico e Físico recebido é reduzido em 70% por 7 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.alistarp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.alistarq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.alistarw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.alistare);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.alistarr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Alistar");
/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Toque Amaldiçoado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Lançar Bandagens");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Desespero");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Chilique");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "A Maldição da Múmia Triste");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques de Amumu reduzem a resistência Mágica do alvo por uma curta duração.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Arremessa uma bandagem ao local alvo. Se um inimigo for atingido, Amumu se puxará até ele, o atordoará, e causará 80/130/180/230/280 (+70% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Alternar: Inimigos próximos recebem 8/12/16/20/24 de Dano Mágico mais 1/1.5/2/2.5/3 (+1% de Poder de Habilidade)% de sua Vida máxima a cada segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Amumu recebe 2/4/6/8/10 de dano reduzido de ataques físicos.\n" +
            "Ativo: Amumu causa 75/100/125/150/175 (+50% de Poder de Habilidade) de Dano Mágico a unidades próximas. Sempre que Amumu é atingido, o Tempo de Recarga de Chilique é reduzido em 0,5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Amumu emaranha as unidades inimigas próximas, causando 150/250/350 (+80% de Poder de Habilidade) de Dano Mágico e impedindo seus ataques e movimentação por 2 segundos");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.amumup);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.amumuq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.amumuw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.amumue);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.amumur);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Amumu");
/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Renascimento");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Lampejo Gelado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Cristalizar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Congelamento");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Tempestade Glacial");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao morrer, Anivia voltará a ser um ovo. Se ele sobreviver por seis segundos, Anivia renascerá gloriosamente.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Um bloco gigante de gelo é lançado na direção alvo, causando 60/90/120/150/180 (+50% de Poder de Habilidade) de Dano Mágico e congelando os alvos, reduzindo sua Velocidade de Movimento em 20%. Ao fim de seu alcance, ou se Anivia ativar novamente a habilidade, o projétil detona, causando 60/90/120/150/180 (+50% de Poder de Habilidade) de Dano Mágico em uma pequena área e atordoando unidades por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Anivia invoca uma muralha de gelo impenetrável de 400/500/600/700/800 unidades de largura, bloqueando todo o movimento. A muralha dura 5 segundo(s) antes de derreter.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Anivia atinge seu alvo com vento congelante, causando 55/85/115/145/175 (+50% de Poder de Habilidade) de Dano Mágico. Se o alvo estiver sob efeito de Lampejo Gelado ou Tempestade Glacial, ele recebe o dobro de dano.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Alternar: Anivia invoca uma chuva de gelo e granizo, causando 80/120/160 (+25% de Poder de Habilidade) de Dano por segundo e congelando os alvos, reduzindo sua Velocidade de Movimento e de Ataque em 20%.Drena 40/50/60 de Mana por segundo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.aniviap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.aniviaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.aniviaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.aniviae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.aniviar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Anivia");
 /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Piromania");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Desintegrar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Incinerar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Escudo Fundido");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Invocar: Tibbers");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após conjurar 4 habilidades, a próxima habilidade de ataque de Annie atordoará o alvo por um curto período de tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Causa 80/115/150/185/220 (+80% de Poder de Habilidade) de Dano Mágico. O custo de Mana e metade do Tempo de Recarga são restituídos caso Desintegrar abata o alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Conjura um cone de fogo que causa 70/115/160/205/250 (+85% de Poder de Habilidade) de Dano Mágico a todos os inimigos na área.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Aumenta a Armadura e a Resistência Mágica em 10/20/30/40/50 por 5 segundos. Causa 20/30/40/50/60 (+20% de Poder de Habilidade) de Dano Mágico a inimigos que atacarem Annie com ataques básicos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Tibbers aparece em uma explosão de fogo, causando 175/300/425 (+80% de Poder de Habilidade) de Dano Mágico a todos os inimigos na área alvo.Pelos próximos 45 segundos, Tibbers persegue os inimigos, causando 20/30/40 (+20% de Poder de Habilidade) de Dano Mágico por segundo a inimigos próximos. Se Annie conjurar Escudo Fundido enquanto Tibbers estiver ativo, ele receberá o escudo e velocidade adicional que decai em um curto período.Tibbers pode ser controlado segurando-se a tecla Alt em conjunto com o botão direito do mouse ou reativando esta habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.anniep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.annieq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.anniew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.anniee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.annier);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Annie");
 /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Tiro Congelado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Concentração");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Rajada");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Olhar do Falcão");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Flecha de Cristal Encantada");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os acertos críticos de Ashe não causam dano adicional, mas aplicam Lentidão fortalecida a seu alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Passivo: Ataques básicos concedem Foco por 4 segundos, acumulando-se até 4 vezes. Com 4 acúmulos, Concentração pode ser conjurada, consumindo todo o Foco.\n" +
                    "Ativo: Por 5 segundos, Ashe recebe 20/25/30/35/40% de Velocidade de Ataque e seus ataques básicos disparam uma rajada de flechas, resultando em 0 de Dano Físico por ataque. Durante esse período, ela não acumula Foco.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Dispara flechas em área de cone, cada uma causando 20/35/50/65/80 (+100% de Dano de Ataque) de Dano Físico.Acertos em campeões contam como Acertos Críticos para os propósitos do Tiro Congelado.Inimigos podem bloquear mais de uma flecha, mas somente recebem dano da primeira.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Revela o terreno enquanto percorre seu trajeto em direção ao local alvo em qualquer parte do mapa. Concede visão por 5 segundos. Ashe pode acumular até 2 cargas de Olhar do Falcão.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Dispara uma grande flecha de cristal em linha reta que atordoa um campeão inimigo, causando 250/425/600 (+100% de Poder de Habilidade) de Dano Mágico. Quanto maior for o seu trajeto, mais tempo durará o atordoamento até o máximo de 3.5 segundos. Inimigos ao redor recebem metade do dano.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ashep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.asheq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ashew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ashee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.asher);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ashe");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Centro do Universo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Oscilação Estelar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Expansão Celestial");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Cometa Lendário");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Voz da Luz");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Estrelas orbitam Aurelion Sol, causando Dano Mágico quando atingem um inimigo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Primeira conjuração: Aurelion Sol cria um novo núcleo estelar, que cresce ao longo do tempo e lhe concede 10% de Velocidade de Movimento.O núcleo detona quando chega a seu Limite Exterior, aplicando 70/110/150/190/230 (+65% de Poder de Habilidade) de Dano Mágico e um atordoamento de 1/1.25/1.5/1.75/2 segundo.\n" +
                    "Segunda conjuração: Detona o núcleo antecipadamente.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Aumenta o dano base da Estrela em 10/20/30/40/50.\n" +
                    "Alternância: As Estrelas de Aurelion Sol orbitam em seu Limite Exterior, causando 150% de dano, com um total de 0 (+0) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Gera Velocidade de Escapada enquanto movimenta-se. A movimentação contínua em uma direção concede Velocidade de Movimento crescente até 25/30/35/40/45%. Receber dano de Campeões ou torres zera este efeito.\n" +
                    "Ativo: Ao chegar a 100 de Velocidade de Escapada, voa por 3000/4000/5000/6000/7000 unidades na direção escolhida ou até fazer um comando de movimentação. Aurelion Sol pode ver e ser visto através de muros enquanto voa.Receber dano de Campeões ou torres força a aterrissagem.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Sopra uma explosão de puro fogo estelar, causando 200/300/400 (+70% de Poder de Habilidade) de Dano Mágico e reduzindo a velocidade em 60/70/80%, que decai ao longo de 4 segundos. A explosão também empurra os inimigos próximos em direção ao Limite Exterior de Aurelion Sol.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.aurelionsolp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.aurelionsolq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.aurelionsolw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.aurelionsole);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.aurelionsolr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Aurelion Sol");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Legado de Shurima");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Areias da Conquista");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Surja!");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Areias Oscilantes");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Decreto do Imperador");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Azir pode invocar o Disco Solar das ruínas de uma torre aliada ou inimiga.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Azir comanda todos os Soldados de Areia na direção do local alvo. Os Soldados de Areia causam 65/85/105/125/145 (+50% de Poder de Habilidade) de Dano Mágico a todos os inimigos que atravessarem e aplicam uma Lentidão de 25% por 1 segundo.Inimigos atingidos por múltiplos Soldados de Areia terão a duração da lentidão reiniciada, mas não receberão dano adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Recebe 20/30/40/50/60% de Velocidade de Ataque.\n" +
                   " Ativo: Azir invoca um Soldado de Areia por 9 segundos. Quando Azir ataca um inimigo ao alcance do soldado, este ataca em seu lugar, causando 0 (+60% de Poder de Habilidade) de Dano Mágico a inimigos em linha reta. Se múltiplos soldados atingirem o mesmo alvo, cada soldado após o primeiro causa 25% de dano. Os soldados atacam mesmo que Azir não esteja ao alcance de um ataque básico.Azir pode acumular até {{ maxammo }} Soldados de Areia. Um novo soldado fica disponível a cada 0 segundos. Movimentar-se para muito longe dos soldados faz com que eles sejam desativados. Soldados de Areia expiram duas vezes mais rápido quando próximos a uma torre inimiga.Azir pode consumir um soldado para causar dano a uma torre inimiga ao invocá-lo sobre tal torre. Isso causa 0 (+40% de Poder de Habilidade) de Dano Mágico à torre.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Azir avança na direção de um de seus Soldados de Areia, causando 60/90/120/150/180 (+40% de Poder de Habilidade) de Dano Mágico aos inimigos atingidos. Caso Azir atinja um campeão inimigo, ele para e recebe um escudo por 4 segundo que absorve 80/120/160/200/240 (+0) de dano.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Azir invoca uma parede de soldados armados que marcha em frente, empurrando para trás os inimigos e causando-lhes 150/225/300 (+60% de Poder de Habilidade) de Dano Mágico. Os soldados permanecem em forma de parede por 5/6/7 segundos.Inimigos serão impedidos pelo Decreto do Imperador, mesmo que tentem pular sobre a parede, mas Azir e seus aliados podem passar livremente e recebem 20% de Velocidade de Movimento por 1 segundo ao atravessá-la.O Decreto do Imperador não interage com os ataques básicos ou habilidades de Azir.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.azirp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.azirq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.azirw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.azire);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.azirr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Azir");
/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Chamado do Viajante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Prisão Cósmica");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Santuário do Protetor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Jornada Mágica");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Têmpera do Destino");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A presença do Bardo faz com que surjam sinos mágicos, que concedem experiência, Mana e velocidade adicional a ele. Além disso, espíritos menores o seguem e ajudam em seus ataques - coletar sinos faz com que estes mipes acumulem poder ao longo do curso de uma partida.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O Bardo faz um disparo de energia, causando 80/125/170/215/260 (+65% de Poder de Habilidade) de Dano Mágico a um ou dois inimigos. O primeiro alvo atingido sofrerá Lentidão de 60% por 1/1.2/1.4/1.6/1.8 segundo(s).Se o disparo atingir outro inimigo ou uma parede, quaisquer inimigos atingidos serão atordoados por 1/1.2/1.4/1.6/1.8 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "O Bardo faz surgir um santuário de cura que, imediatamente, oferece 30/60/90/120/150 (+30% de Poder de Habilidade) de Vida, mas restaura até 70/110/150/190/230 (+60% de Poder de Habilidade) de Vida conforme acumula poder por 10 segundos. O efeito do santuário também concede 50% de Velocidade de Movimento que decai ao longo de 1.5 segundos. O Bardo pode ter até 3 santuários ativos ao mesmo tempo, que permanecem em seus lugares até serem visitados por um campeão aliado ou esmagados por um campeão inimigo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "O Bardo abre um corredor de caminho único através de terreno próximo. Tanto aliados quanto inimigos podem usá-lo clicando em qualquer parte dele com o botão direito, permanecendo próximos à sua entrada, sendo que aliados o atravessam 10/20/30/40/50% mais rapidamente que inimigos.O corredor desaparece após 10 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "O Bardo desfere um arco de energia mágica em um local alvo. Em seu impacto, todos os campeões, tropas, monstros e torres na área alvo são colocados em estase, tornando-se invencíveis, inalvejáveis e incapazes de agir por 2.5 segundos.Monstros épicos também são colocados em estase, apesar de serem normalmente imunes a desarmes.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.bardop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.bardoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.bardow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.bardoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.bardor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Bardo");
            /*******************************************************************************************************************************************/
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Barreira de Mana");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Puxão Biônico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Turbo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Punho do Poder");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Campo Estático");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando a Vida de Blitzcrank chega a menos de 20% do total, ele ativa a Barreira de Mana. Isso cria um escudo de Mana igual a 50% de sua Mana por 10 segundos. A Barreira de Mana só pode ocorrer uma vez a cada 90 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Blitzcrank dispara sua mão direita. Caso encontre uma unidade inimiga, a habilidade os atordoa e causa 80/135/190/245/300 (+100% de Poder de Habilidade) de Dano Mágico enquanto é puxada em sua direção.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Blitzcrank sobrecarrega a si próprio para aumentar a Velocidade de Movimento em 70/75/80/85/90% e a Velocidade de Ataque em 30/38/46/54/62% por 5 segundos. O efeito de Velocidade de Movimento é reduzido ao longo da duração da habilidade. Quando Turbo acaba, a Velocidade de Movimento de Blitzcrank é reduzida em 30% por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Blitzcrank carrega seu punho para fazer com que o próximo ataque cause o dobro de seu Dano de Ataque total como Dano Físico e arremesse o alvo ao ar.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Relâmpagos saem de Blitzcrank para atingir um inimigo aleatório próximo com 100/200/300 (+20% de Poder de Habilidade) de Dano Mágico a cada 2,5 segundos.\n" +
                    "Ativo: Causa 250/375/500 (+100% de Poder de Habilidade) de Dano Mágico e silencia as unidades inimigas ao redor por 0,5 segundos. O efeito passivo não é ativado durante o Tempo de Recarga.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.blitzcrankp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.blitzcrankq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.blitzcrankw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.blitzcranke);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.blitzcrankr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Blitzcrank");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Labareda");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Cauterizar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Pilar de Chamas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Conflagração");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Piroclasma");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "As habilidades de Brand deixam seus alvos incandescentes, causando 8% de sua Vida máxima em Dano Mágico ao longo de 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Brand dispara uma bola de fogo em linha reta, causando 80/120/160/200/240 (+65% de Poder de Habilidade) de Dano Mágico.\n" +
                    "Incandescente: Se o alvo estiver incandescente, Cauterizar o atordoará por 0 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Após um curto atraso, Brand cria um pilar de chamas na área alvo, causando 75/120/165/210/255 (+60% de Poder de Habilidade) de Dano Mágico a unidades na área.\n" +
                    "Incandescente: Unidades que estiverem incandescentes recebem 25% de dano adicional do Pilar de Chamas.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Brand conjura um poderoso disparo em seu alvo, causando 70/105/140/175/210 (+55% de Poder de Habilidade) de Dano Mágico.\n" +
                    "Incandescente: Se o alvo estiver incandescente, Conflagração se espalha para inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Brand desfere uma devastadora torrente de fogo, causando 150/250/350 (+50% de Poder de Habilidade) de Dano Mágico a cada vez que saltar, com no máximo 5 saltos.\n" +
                    "Incandescente: Se o alvo estiver incandescente, Piroclasma priorizará campeões para o próximo salto.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.brandp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.brandq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.brandw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.brande);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.brandr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Brand");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Golpes Concussivos");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Mordida do Inverno");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Eu te Protejo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Inquebrável");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Fissura Glacial");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Braum adiciona acúmulos de Golpes Concussivos a inimigos com ataques básicos ou com Mordida do Inverno. Ele e seus aliados continuam a adicionar acúmulos com ataques básicos. Com 4 acúmulos, seu alvo será atordoado.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Braum dispara gelo de seu escudo, causando 70/115/160/205/250 (+0) de Dano Mágico ao primeiro alvo atingido e reduz sua Velocidade de Movimento em 70%, que se recupera ao longo dos próximos 2 segundos.Aplica um acúmulo de Golpes Concussivos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Braum salta à frente de um campeão ou tropa aliada alvo.Ao aterrissar, Braum e o aliado recebem 0 de Armadura e 0 de Resistência Mágica (15/17.5/20/22.5/25 mais 10/11.5/13/14.5/16% da Armadura / Resistência Mágica adicional de Braum) por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Braum reduz o dano recebido e o bloqueia para aliados em sua retaguarda.Braum levanta seu escudo em uma direção por 3/3.25/3.5/3.75/4 segundos, negando o dano do próximo ataque vindo desta direção. Ataques seguintes causam 30/32.5/35/37.5/40% de dano reduzido.Braum intercepta projéteis, fazendo que o atinjam e sejam destruídos.Braum recebe 10% de Velocidade de Movimento enquanto dura o efeito.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Braum golpeia o chão, arremessando ao ar inimigos próximos e em linha reta à sua frente. Uma fissura é deixada na linha, causando Lentidão a inimigos.Inimigos atingidos recebem 150/250/350 (+60% de Poder de Habilidade) de Dano Mágico. O primeiro campeão atingido é arremessado ao ar por 1/1.25/1.5 segundos. Inimigos seguintes são arremessados brevemente.Pelos próximos 4 segundos, inimigos que entrarem na área sofrem Lentidão de 40/50/60% por 0.25 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.braump);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.braumq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.braumw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.braume);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.braumr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Bardo");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Bem na Mira");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Pacificadora de Piltover");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Armadilha Mecânica Yordle");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Rede Calibre 90");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ás na Manga");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A cada alguns ataques básicos, ou contra um alvo que ela prendeu em uma armadilha ou rede, Caitlyn fará um disparo Bem na Mira causando dano adicional que escala com sua Chance de Acerto Crítico. Em alvos presos por armadilhas ou pela rede, o alcance de Bem na Mira é dobrado.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Prepara o rifle por 1 segundo para fazer um disparo afiado e perfurante que causa 30/70/110/150/190 (+0) de Dano Físico. Após atingir qualquer alvo, ele se abre em um projétil maior que causa 33% a menos de dano. Sempre causa o total de dano a alvos revelados por armadilhas.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Posiciona armadilhas que um Campeão inimigo pode ativar, imobilizando-o por 2 segundos e revelando-os por um curto período de tempo.As armadilhas têm duração de 90 segundos. Até 3/3/4/4/5 armadilhas podem estar ativas ao mesmo tempo.Inimigos pegos em armadilhas recebem 30/70/110/150/190 (0) de dano adicional de Bem na Mira.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Dispara uma rede, empurrando Caitlyn para trás. A rede causa 70/110/150/190/230 (+80% de Poder de Habilidade) de Dano Mágico e reduz a velocidade do primeiro inimigo atingido em 50% por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Leva um segundo para alinhar um disparo perfeito em um campeão inimigo em até 2000/2500/3000 de alcance. O disparo causa 250/475/700 (+200% de Dano de Ataque Bônus) de Dano Físico, mas outros campeões inimigos podem interceptá-lo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.caitlynp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.caitlynq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.caitlynw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.caitlyne);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.caitlynr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Caitlyn");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Aspecto da Serpente");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Explosão Venenosa");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Miasma");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Presas Duplas");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Olhar Petrificador");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Cassiopeia recebe acúmulos de Aspecto da Serpente ao longo do tempo e ao envenenar campeões inimigos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Cassiopeia atinge uma área com veneno após um breve atraso. Inimigos em tal área ficam Envenenados, recebendo 75/115/155/195/235 (+45% de Poder de Habilidade) de Dano Mágico ao longo de 3 segundos. Se Explosão Venenosa atingir um campeão inimigo, Cassiopeia recebe 20% de Velocidade de Movimento por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Cassiopeia desfere uma nuvem tóxica que cresce ao longo de 7 segundos. Inimigos na nuvem ficam Envenenados por 2 segundos, fazendo com que recebam 10/15/20/25/30 (+10% de Poder de Habilidade) de Dano Mágico a cada segundo e sofram Lentidão de 25/30/35/40/45%. A nuvem continuamente reaplica esse Veneno a inimigos que estiverem dentro dela.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Cassiopeia causa 55/80/105/130/155 (+0) de Dano Mágico a seu alvo. Se Presas Duplas abater o alvo, Cassiopeia recupera seu custo e restaura 1.5% de sua Mana máxima (0). Se o alvo estiver Envenenado, o Tempo de Recarga de Presas Duplas é reduzido para 0,5 segundos.Atingir um inimigo com Presas Duplas aumenta o dano do Veneno causado ao alvo em 20% por 5 segundos. Esse efeito se acumula até duas vezes.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Cassiopeia causa 150/250/350 (+50% de Poder de Habilidade) de Dano Mágico a todos os inimigos à sua frente. Inimigos que estiverem de frente para ela ficam atordoados por 2 segundos. Inimigos virados para o outro lado sofrem 60% de redução na Velocidade de Movimento.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.cassiopeiap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.cassiopeiaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.cassiopeiaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.cassiopeiae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.cassiopeiar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Cassiopeia");
/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Carnívoro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ruptura");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Grito Selvagem");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Espinhos Vorpais");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Banquete");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Sempre que Cho'Gath abate uma unidade, ele recupera Vida e Mana. Os valores restaurados aumentam com o nível de Cho'Gath.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Rompe o terreno no local alvo. Inimigos pegos pela ruptura são arremessados ao ar por 1 segundo, recebem 80/135/190/245/305 (+100% de Poder de Habilidade) de Dano Mágico e têm a Velocidade de Movimento reduzida em 60% por 1,5 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Silencia inimigos em área de cone por 1.5/1.75/2/2.25/2.5 segundo(s), além de causar 75/125/175/225/275 (+70% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Alternar: Ataques básicos lançam espinhos que causam 20/35/50/65/80 (+30% de Poder de Habilidade) de Dano Mágico. Os espinhos ficam maiores conforme Cho'Gath recebe acúmulos de Banquete");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Alimenta-se ferozmente de uma unidade inimiga, causando 300/475/650 (+70% de Poder de Habilidade) de Dano Verdadeiro a campeões ou 1000 (+70% de Poder de Habilidade) a tropas e monstros. Se Banquete causar o golpe final, Cho'Gath recebe um acúmulo de Banquete, o que faz com que ele cresça em tamanho e receba 90/120/150 de Vida máxima, assim como efeitos adicionais com base em seu alvo."
                    + "\nEfeito de campeões: recebe um acúmulo adicional de Banquete." +
            "\nEfeito de tropas e monstros: restitui 50% do Tempo de Recarga e custo de Banquete.Cho'Gath não pode ter mais que 6 acúmulos de Banquete em qualquer momento e perde metade dos acúmulos ao morrer.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.chogathp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.chogathq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.chogathw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.chogathe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.chogathr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Cho'Gath");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Munição Hextec");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Bomba de Fósforo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Valquíria");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Metralhadora");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Barragem de Mísseis");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "O ataque básico de Corki causa dano adicional. Metade do dano de seu ataque básico é convertido em Dano Mágico. Em alguns momentos, o Pacote chega na base de Corki para ser apanhado, temporariamente concedendo-lhe Velocidade de Movimento fora de combate e aprimorando Valquíria para Entrega Especial.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Corki lança uma bomba, causando 70/115/160/205/250 (+0) (+50% de Poder de Habilidade) de Dano Mágico a inimigos na área alvo. Além disso, a explosão revela a área e os campeões atingidos por 6 segundos (não revela unidades invisíveis).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Ativo: Corki sobrevoa uma curta distância, causando 60/90/120/150/180 (+40% de Poder de Habilidade) de Dano Mágico por segundo a inimigos no fogo deixado em seu caminho.\n" +
                    "Entrega Especial: Corki sobrevoa uma grande distância, soltando bombas que empurram inimigos para os lados e deixam um rastro flamejante por 5 segundos. O rastro reduz a Velocidade de Movimento de inimigos em 90% e os queima com 0 (+0) (+20% de Poder de Habilidade) de Dano Mágico por segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "A metralhadora de Corki dispara em todos os alvos à sua frente por 4 segundos, causando 20/32/44/56/78 (+40% de Dano de Ataque Bônus) de dano (metade Físico, metade Mágico) e reduzindo 1/2/3/4/5 de Armadura e de Resistência Mágica por segundo. As reduções de Armadura e de Resistência Mágica acumulam-se e duram 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Ativo: Corki dispara um míssil que explode no primeiro inimigo atingido, causando 100/130/160 0.2/0.5/0.8 (+30% de Poder de Habilidade) de Dano Mágico em todos os inimigos próximos.Corki pode armazenar até 7 mísseis. Todo 3º míssil disparado será um Grandão, que causa 50% de dano adicional.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.corkip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.corkiq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.corkiw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.corkie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.corkir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Corki");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Hemorragia");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Dizimar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ataque Mutilador");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Apreender");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Guilhotina de Noxus");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Darius estrategicamente acerta seus ataques, fazendo com que o alvo sangre. Esse efeito acumula-se até cinco vezes. Inimigos que chegarem ao máximo de acúmulos de Hemorragia farão com que Darius receba o Poder de Noxus, aumentando drasticamente o dano que causa.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Após um curto intervalo, Darius golpeia com seu machado ao redor de si mesmo, atingindo os inimigos em seu trajeto. Inimigos atingidos pela lâmina do machado recebem 40/70/100/130/160 (+105% de Dano de Ataque Bônus) de Dano Físico. Inimigos atingidos pelo cabo recebem 50% do dano (não aplica Hemorragia).Darius cura-se com 12% de sua Vida removida por campeão inimigo atingido pela lâmina (máx.: 36%).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "O próximo ataque básico de Darius causa 0 de Dano Físico e reduz a Velocidade de Movimento do alvo em 90% por 1 segundo.Ataque Mutilador restitui seu custo de Mana e 50% de seu Tempo de Recarga caso abata o alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "");
            habvalores.put(contract.Habilidades.COLUNA_HR, "");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ashep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.asheq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ashew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ashee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.asher);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Darius");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Espada de Prata Lunar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe Crescente");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Cascata Lívida");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Colapso Minguante");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Zênite Lunar");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Recebe Velocidade de Ataque. Cada terceiro acerto fere inimigos próximos com Dano Mágico adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Lança um raio de energia lunar em arco, causando 60/95/130/165/200 (+70% de Poder de Habilidade) de Dano Mágico.Atinge inimigos afligidos com o efeito de Plenilúnio, revelando-os por 3 segundos caso não estejam invisíveis.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Cria três esferas orbitantes que explodem ao contato com inimigos, causando 22/34/46/58/70 (+20% de Poder de Habilidade) de Dano Mágico.Duração: 5 segundos.Concede um escudo temporário que absorve 40/55/70/85/100 (+30% de Poder de Habilidade) de dano. Se a terceira esfera detonar, o escudo aumenta em 40/55/70/85/100 (+30% de Poder de Habilidade).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Revela e atrai todos os inimigos próximos, causando 35/40/45/50/55% de Lentidão a eles por 2 segundos em seguida.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Torna-se a encarnação viva da lua vingativa, avançando em um inimigo e causando 100/160/220 (+60% de Poder de Habilidade) de Dano Mágico.Zênite Lunar não tem Tempo de Recarga quando usado ao avançar em um inimigo afetado por Plenilúnio. Todos os outros inimigos terão o efeito de Plenilúnio removido, independente de terem sido atingidos por Zênite Lunar.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.dianap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.dianaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.dianaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.dianae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.dianar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Diana");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Injetar Adrenalina");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Cutelo Infectado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Agonia Ardente");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Masoquismo");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Sadismo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Dr. Mundo regenera 0,3% de sua Vida máxima a cada segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Dr. Mundo arremessa seu cutelo, causando Dano Mágico igual a 15/17.5/20/22.5/25% da Vida atual do alvo (80/130/180/230/280 de dano mínimo) e reduzindo sua velocidade em 40% por 2 segundos. (Máx.: 300/350/400/450/500 de dano a monstros)Metade do custo de Vida é restituído se o cutelo atingir um alvo (abates restituem o custo total de Vida).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Alternar: Dr. Mundo causa 35/50/65/80/95 (+20% de Poder de Habilidade) de Dano Mágico a inimigos próximos por segundo e reduz a duração de desarmes em si próprio em 10/15/20/25/30%.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Dr. Mundo causa 0 de dano adicional (3/3.5000000000000004/4/4.5/5% da Vida máxima) em seu próximo ataque básico e aumenta o Dano de Ataque em 20/40/60/80/100 por 5 segundos. Dr. Mundo recebe +0.2/0.4/0.6/0.8/1 de Dano de Ataque adicional para cada percentual de Vida que tiver perdido.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Dr. Mundo regenera 0 de Vida (40/50/60% da Vida máxima) ao longo de 12 segundos. Além disso, ele recebe 15/25/35% de Velocidade de Movimento durante este período.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.drmundop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.drmundoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.drmundow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.drmundoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.drmundor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Dr. Mundo");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "League of Draven");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Revolução do Machado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Adrenalina");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Sai da Frente");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Reta da Morte");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Draven recebe a Adoração de seus fãs quando apanha uma Revolução do Machado, abate uma tropa, um monstro ou destrói uma torre. Abater campeões inimigos concede ouro adicional a Draven, com base em quanta Adoração ele tem.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O próximo ataque de Draven causará 45/55/65/75/85% de Dano de Ataque de Dano Físico adicional. O dano adicional é igual a 45/55/65/75/85% do seu Dano de Ataque total.Esse machado ricocheteará do alvo em direção ao ar. Se Draven o apanhar, ele automaticamente estará pronto para outra Revolução do Machado.Draven pode ter duas Revoluções do Machado em funcionamento ao mesmo tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Draven ganha 40/45/50/55/60% de aumento na Velocidade de movimento por 1.5 segundo(s) e 20/25/30/35/40% de aumento na Velocidade de Ataque por 3 segundo(s). A Velocidade de Movimento adicional diminui rapidamente pela duração.Apanhar uma Revolução do Machado fará com que o Tempo de Recarga de Adrenalina zere.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Draven arremessa seus machados, causando 70/105/140/175/210 (+50% de Dano de Ataque Bônus) de Dano Físico aos alvos atingidos e empurrando-os ao lado. Os alvos atingidos sofrem 20/25/30/35/40% de Lentidão por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Draven arremessa dois machados gigantes para causar 175/275/375 (+110% de Dano de Ataque Bônus) de Dano Físico a cada unidade atingida.Reta da Morte lentamente muda de sentido e retorna a Draven após atingir um campeão inimigo. Draven também pode ativar esta habilidade enquanto os machados estiverem em movimento, fazendo com que eles voltem antes. Causa 8% a menos de dano para cada unidade atingida (Mínimo de 40%) e reinicia quando os machados mudarem de direção.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.dravenp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.dravenq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.dravenw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.dravene);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.dravenr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Draven");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Ressonância Revo-Z");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Giratempo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Convergência Paralela");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Mergulho Fásico");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Cronoquebra");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "O Revo-Z de Ekko carrega suas habilidades e ataques com energia temporal. O terceiro acerto causa dano adicional e drena a Velocidade de Movimento do alvo. Caso o alvo seja um campeão, Ekko recebe Velocidade de Movimento adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ekko arremessa um dispositivo que causa 60/75/90/105/120 (+10% de Poder de Habilidade) de Dano Mágico aos inimigos que atravessa. Ele expande-se em um campo de Lentidão no primeiro campeão atingido, reduzindo a velocidade de tudo o que atingir em 32/39/46/53/60%. Em seguida, retorna a Ekko, causando 60/85/110/135/160 (+60% de Poder de Habilidade) de Dano Mágico a todos os alvos atingidos no trajeto de volta.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Os ataques básicos de Ekko causam Dano Mágico adicional a inimigos com menos de 30% de Vida, igual a 5% (+[2% de Poder de Habilidade]%) de sua Vida perdida (máx.: 150 de dano contra tropas e monstros).Ativo: Após um intervalo de 3 segundos, Ekko cria uma cronosfera de curta duração no local alvo, reduzindo em 40% a velocidade de inimigos dentro dela. Se Ekko entrar na esfera, ele a detonará, recebendo um escudo que absorve até 80/100/120/140/160 (+150% de Poder de Habilidade) de dano por 2 segundos. Inimigos pegos pela explosão ficam atordoados por 2.25 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Ekko avança rapidamente uma curta distância na direção alvejada. Seu próximo ataque causará 50/80/110/140/170 (+20% de Poder de Habilidade) de Dano Mágico adicional e o teleportará até seu alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Torna Ekko invulnerável, inalvejável e o teleporta de volta a onde estava 4 segundos atrás. Ekko cura a si mesmo em 100/150/200 + 20% (+[7% de Poder de Habilidade]%) do dano recebido ao longo dos últimos 4 segundos e causa 200/350/500 (+130% de Poder de Habilidade) de Dano Mágico a todos os inimigos próximos do ponto de chegada.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ekkop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.ekkoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ekkow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ekkoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.ekkor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ekko");

/* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Aranha Rainha");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Neurotoxina / Mordida Venenosa");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Cria Volátil / Frenesi Aracnídeo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Casulo / Rapel");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Forma de Aranha");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Forma Humana: Quando as habilidades mágicas de Elise atingem um inimigo, ela recebe uma Cria dormente. Forma de Aranha: Ataques básicos causam Dano Mágico adicional e restauram a Vida de Elise.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Causa Dano Mágico igual a 40/75/110/145/180 mais 4% (+[3% de Poder de Habilidade]%) da Vida atual do alvo. Dano adicional máximo contra monstros: 75/100/125/150/175.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Invoca uma cria embebida em veneno que se movimenta a um local alvo e explode, causando 60/110/160/210/260 (+80% de Poder de Habilidade) de Dano Mágico após 3 segundos ou ao aproximar-se de um inimigo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Atordoa o primeiro inimigo atingido por 1.6/1.7/1.8/1.9/2 segundos e os revela caso não estejam invisíveis.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Elise transforma-se em uma ameaçadora aranha, sacrificando 425 de alcance de ataque em troca de 25 de Velocidade de Movimento e acesso a habilidades aracnídeas. Todas as Crias dormentes são despertadas e atacarão inimigos próximos.Crias: As Crias causam 10/15/20/25 (+15% de Poder de Habilidade) de dano e recebem dano reduzido em 25% de habilidades multi-alvo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.elisep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.eliseq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.elisew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.elisee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.eliser);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Elise");
  /* ************************************************************************************************************************************************************ */

            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Passos Sombrios");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Espinho de Ódio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Frenesi Negro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Devastar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Abraço da Agonia");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando não estiver em combate, Evelynn entrará em estado de furtividade somente sendo vista por campeões inimigos próximos ou visão verdadeira. Ela regenera Mana rapidamente enquanto estiver camuflada.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Evelynn dispara uma fileira de espinhos através de um inimigo próximo, causando 40/50/60/70/80 (+0) (+40% de Dano de Ataque Bônus) de Dano Mágico a todos os inimigos em seu caminho.Espinho de Ódio prioriza o alvo que Evelynn estiver atacando.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Ativo: Evelynn remove todos os efeitos de redução de Velocidade de Movimento que a afetam e recebe 30/40/50/60/70% de Velocidade de Movimento por 3 segundos.Passivo: As habilidades que Evelynn acertar em seus inimigos reduzem o Tempo de Recarga de Frenesi Negro em 1 segundo.Abates e Assistências a campeões zeram o Tempo de Recarga de Frenesi Negro.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Evelynn rapidamente ataca um alvo 2 vezes (aplicando efeitos de contato), causando um total de 70/110/150/190/230 (+100% de Poder de Habilidade) (+40% de Dano de Ataque Bônus) de Dano Físico.Em seguida, Evelynn recebe 60/75/90/105/120% de Velocidade de Ataque por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Evelynn empala todos os inimigos na área alvejada, causando 15/20/25 (+1% de Poder de Habilidade)% de suas Vidas atuais em Dano Mágico e reduzindo suas Velocidades de Movimento em 40/60/80% por 2 segundo(s).Evelynn afunila a dor de seus alvos, ganhando um escudo vital de 150/225/300 para cada campeão inimigo atingido que pode durar até 6 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.evelynnp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.evelynnq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.evelynnw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.evelynne);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.evelynnr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Evellyn");
  /* ************************************************************************************************************************************************************ */

            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Feitiço do Poder Crescente");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Disparo Místico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Fluxo Essencial");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Translocação Arcana");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Barragem Incendiária");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Atingir um alvo com qualquer das habilidades de Ezreal aumenta sua Velocidade de Ataque em 10% por 6 segundos (o efeito se acumula até 5 vezes).");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ezreal dispara um projétil de energia, causando 35/55/75/95/115 (+0) (+40% de Poder de Habilidade) de Dano Físico (aplica efeitos de contato). Os Tempos de Recarga de Ezreal são reduzidos em 1.5 segundos caso Disparo Místico atinja um alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Ezreal dispara uma onda de energia que causa dano a todos os Campeões inimigos que atravessa, com 70/115/160/205/250 (+80% de Poder de Habilidade) de Dano Mágico. Se Ezreal ou seus Campeões aliados são tingidos pela onda, sua Velocidade de Ataque é aumentada em 20/25/30/35/40% por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Ezreal teleporta-se para um local alvo próximo e faz um disparo teleguiado na unidade inimiga mais próxima, causando 75/125/175/225/275 (+0) (+75% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Ezreal carrega por 1 segundo para disparar uma poderosa barragem de energia que causa 350/500/650 (+100% de Dano de Ataque Bônus) (+90% de Poder de Habilidade) de Dano Mágico a cada unidade que atravessa. Contudo, ela causa 10% a menos de dano para cada unidade que atinge (mín.: 30%).");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ezrealp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.ezrealq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ezrealw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ezreale);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.ezrealr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ezreal");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pavor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Aterrorizar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Drenar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Ventania Sombria");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Tempestade de Corvos");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "As habilidades de Fiddlesticks reduzem a Resistência Mágica de seus alvos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Atinge uma unidade inimiga alvo com medo, aplicando Pavor e fazendo com que fuja aterrorizada por 1.25/1.5/1.75/2/2.25 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Causa 60/90/120/150/180 (+45% de Poder de Habilidade) de Dano Mágico a cada segundo à unidade alvo e cura Fiddlesticks com 60/65/70/75/80% do dano causado.\n" +
                    "Duração máxima: 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Dispara um projétil no inimigo alvejado que causa 65/85/105/125/145 (+45% de Poder de Habilidade) de Dano Mágico, silenciando-o por 1,25 segundo antes de ricochetear para um novo alvo (causa 150% de dano a tropas e monstros).Ventania Sombria pode ricochetear até 5 vezes e priorizará inimigos que ainda não atingiu. Os alvos podem ser atingidos mais de uma vez, mas serão silenciados apenas uma vez.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Uma revoada de corvos assassinos voa ao redor de Fiddlesticks por 5 segundos, causando 125/225/325 (+45% de Poder de Habilidade) de Dano Mágico a cada segundo a todos os inimigos da área. Este efeito tem uma canalização de 1,5 segundo e teleporta Fiddlesticks para o local alvo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.fiddlesticksp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.fiddlesticksq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.fiddlesticksw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.fiddlestickse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.fiddlesticksr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Fiddle");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Dança da Duelista");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Estocada");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ripostar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Esgrima");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Desafio Grandioso");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Fiora desafia campeões inimigos próximos para que desviem dela. Ela indica a direção de que tentará atingi-los. Caso consiga completar o próprio desafio, receberá um pequeno efeito e indicará uma nova direção.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Fiora avança em uma direção e golpeia um inimigo próximo, causando 65/75/85/95/105 (+60% de Dano de Ataque Bônus) de Dano Físico e aplicando efeitos de contato. Este ataque prioriza Pontos Vitais e alvos ao alcance de abate. Caso esta habilidade atinja um inimigo, 60% de seu Tempo de Recarga é restituído.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Fiora apara todo o dano, efeitos negativos e desarmes recebidos pelos próximos 0.75 segundos, golpeando na direção alvo logo em seguida.O golpe causa 90/130/170/210/250 (+0) de Dano Mágico ao primeiro campeão inimigo e reduz sua Velocidade de Ataque e de Movimento em 50% por 1.5 segundos. Se Fiora aparar um desarme imobilizante, Ripostar atordoa em vez de reduzir a velocidade.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Fiora recebe 50% de aumento na Velocidade de Ataque pelos próximos dois ataques. O primeiro ataque não pode causar Acerto Crítico, mas aplica uma Lentidão de 30% por 1 segundo. O segundo ataque seguramente causa Acerto Crítico com [0]% de dano (0).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Fiora revela todos os quatro Pontos Vitais do campeão alvo, podendo causar até [0]% da Vida máxima dele como Dano Verdadeiro. Além disto, Fiora recebe a Velocidade de Movimento adicional de Dança da Duelista ([0]%) enquanto estiver próxima ao alvo.Caso atinja todos os 4 Pontos Vitais em 8 segundos, ou caso o alvo morra após atingir ao menos um deles, Fiora e seus aliados na área são curados com 80/110/140 (+0) a cada segundo entre 2 e 5 segundos, escalável com a quantidade de Pontos Vitais atingidos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.fiorap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.fioraq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.fioraw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.fiorae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.fiorar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Fiora");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Lutador Ligeiro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ataque do Ouriço");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Tridente da Pedra do Mar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Brincalhão / Trapaceiro");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Lançar Isca");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A destreza de Fizz permite que ele ignore colisão com unidades e receba menos Dano Físico de ataques básicos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Fizz avança em direção ao alvo, causando dano normal mais 10/25/40/55/70 (+35% de Poder de Habilidade) de Dano Mágico. Essa habilidade aplica efeitos de contato.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Os ataques de Fizz dilaceram seus inimigos, causando 20/30/40/50/60 (+45% de Poder de Habilidade) mais 4/5/6/7/8% da Vida removida do alvo como Dano Mágico ao longo de 3 segundos.\n" +
                    "Ativo: Por 6 segundos, os ataques de Fizz causam 10/15/20/25/30(+30% de Poder de Habilidade) como Dano Mágico adicional ao contato.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Fizz salta em direção ao seu cursor com sua lança, tornando-se incapaz de ser alvo, e então acerta o chão causando 70/120/170/220/270 (+75% de Poder de Habilidade) de Dano Mágico em inimigos próximos, causando 40/45/50/55/60% de Lentidão por 2 segundos.Reativar esta habilidade enquanto Fizz está no topo de sua lança, faz com que Fizz pule novamente em direção ao seu cursor e cause 70/120/170/220/270 (+75% de Poder de Habilidade) de Dano Mágico em uma área menor em inimigos próximos, ao invés de destruir o chão.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Fizz lança um peixe mágico em determinada direção, o qual pode se prender a qualquer campeão inimigo que caminhar sobre ele, reduzindo sua Velocidade de Movimento em 50/60/70% e amplificando o Dano Mágico causado por Fizz (exceto por Lançar Isca) ao alvo em 20% por 6 segundos. Após 1.5 segundos, um tubarão emerge do chão, lançando o alvo ao ar e empurrando para longe outros inimigos, causando 200/325/450 (+100% de Poder de Habilidade) de Dano Mágico e reduzindo sua Velocidade de Movimento em 50/60/70% por 1,5 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ashep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.asheq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ashew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ashee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.asher);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Fizz");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pele Rúnica");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe Resoluto");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Bastião");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Rajada Íntegra");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ídolo de Durand");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Galio converte 50% de sua Resistência Mágica total em Poder de Habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Galio dispara um poderoso golpe de seus olhos, causando 80/135/190/245/300 (+60% de Poder de Habilidade) de Dano Mágico a inimigos próximos do local do impacto e reduz a Velocidade de Movimento deles em 24/28/32/36/40% por 2.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Galio protege um campeão aliado por 4 segundos, aumentando sua Armadura e Resistência Mágica em 30/45/60/75/90. Cada vez que a unidade sofrer dano, Galio é curado com 25/40/55/70/85 (+30% de Poder de Habilidade). (-20% de cura para cada acerto consecutivo)");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Galio desfere um poderoso turbilhão que causa 60/105/150/195/240 (+50% de Poder de Habilidade) de Dano Mágico a todos os inimigos em seu caminho. Uma corrente de ar permanece por 5 segundos, aumentando a Velocidade de Movimento dos aliados que passarem por ela em 20/28/36/44/52%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Galio canaliza por 2 segundos, provocando inimigos próximos e bloqueando 50% do dano recebido.Após canalizar, Galio causa 200/300/400 (+60% de Poder de Habilidade) de Dano Mágico a inimigos ao redor, mais um adicional de 10% de dano para cada ataque que ele sofreu enquanto canalizava, até um máximo de 360/540/720 (+108% de Poder de Habilidade) de dano (80% de dano adicional).");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.galiop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.galioq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.galiow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.galioe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.galior);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Galio");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Julgamento de Fogo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Negociarrr");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Remover Escorbuto");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Barril de Pólvora");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Barragem de Canhão");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A cada alguns segundos, o ataque corpo a corpo de Gangplank deixará seu inimigo em chamas.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Dispara um projétil que causa 20/45/70/95/120 (+100% de Dano de Ataque) de Dano Físico (pode fazer Acerto Crítico e aplica efeitos de contato).Se Negociarrr abater o alvo, Gangplank saqueia 2/3/4/5/6 unidades de ouro e 4/5/6/7/8 Serpentes de Prata. (Troque Serpentes de Prata na loja para aprimorar a Barragem de Canhão.)");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Gangplank consome uma grande quantidade de fruta cítrica, curando todos os efeitos debilitantes e curando-o com 50/75/100/125/150 (+90% de Poder de Habilidade) + 15% de sua Vida perdida.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Posiciona um Barril de Pólvora no local alvo por 60 segundos. Ele pode ser atacado por Gangplank ou por seus inimigos.Se Gangplank o destruir, ele explode, causando o dano do ataque como Dano Físico (ignora 40% de Armadura) e Lentidão de 40/50/60/70/80% por 2 segundos a inimigos. Campeões recebem 60/90/120/150/180 de Dano Físico adicional da explosão.Quando um barril explode, outros barris com zonas de explosão sobrepostas também explodem (o dano não é cumulativo).Os barris decaem a cada 0 segundos. (A frequência de decaimento aumenta nos níveis 7 e 13)A explosão dos barris aplica o efeito de saqueamento de Negociarrr.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Sinaliza para que o navio de Gangplank dispare 0 remessas de balas de canhão em uma área ao longo de 8 segundos. Cada remessa causa 50/70/90 (+10% de Poder de Habilidade) de Dano Mágico e reduz a Velocidade de Movimento dos inimigos em 30% por 0.5 segundos.Colete Serpentes de Prata com Negociarrr para aprimorar na loja.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.gangplankp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.gangplankq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.gangplankw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.gangplanke);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.gangplankr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de GP");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Perseverança");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Acerto Decisivo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Coragem");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Julgamento");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Justiça Demaciana");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Se Garen não foi recentemente atingido por dano ou habilidades inimigas, ele regenera um percentual de sua Vida máxima a cada segundo. O dano das tropas não interrompe Perseverança.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Garen liberta-se de todos os efeitos de lentidão e recebe 30% de Velocidade de Movimento por 1.5/2/2.5/3/3.5 segundos.Seu próximo ataque básico dentro de 4.5 segundos causa 30/55/80/105/130 (+140% de Dano de Ataque) de Dano Físico e silencia seu alvo por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Abater unidades concede permanentemente 0 de Armadura e de Resistência Mágica, até o valor máximo de 30.\n" +
                    "Ativo: Garen recebe um escudo defensivo por 2/3/4/5/6 segundos, reduzindo o dano recebido em 30%.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Garen rapidamente gira sua espada ao redor do corpo por 3 segundo(s), causando 0 de Dano Físico a inimigos próximos -- 14/18/22/26/30 mais 34/35/36/37/38% de seu Dano de Ataque , 0 vezes (aumentado em 1 a cada 3 níveis de campeão) -- ao longo da duração.Julgamento causa 33% de dano adicional quando atinge somente um inimigo.Cancelar Julgamento restitui Tempo de Recarga igual à duração restante.Julgamento pode causar acerto crítico.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: O campeão inimigo com mais abates recentes torna-se o Vilão. Julgamento e ataques básicos contra ele causam 1% de sua Vida máxima como Dano Verdadeiro adicional.\n" +
                    "Ativo: Garen evoca o poder de Demacia para tentar executar um campeão inimigo, causando 175/350/525 de Dano Mágico mais 28/33/40% da Vida perdida do alvo. Causa Dano Verdadeiro ao Vilão.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.garenp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.garenq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.garenw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.garene);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.garenr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Garen");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Fúria Genética");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Bumerangue / Pedregulho");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Hiperativo / Safanão");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Salto / Encontrão");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "GNAR!");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Enquanto está em combate, Gnar gera Fúria. Quando atinge o máximo de Fúria, sua próxima habilidade o transformará em Mega Gnar, concedendo mais condições de sobrevivência e acesso a novas habilidades.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Mini Gnar: Arremessa um bumerangue que causa 5/35/65/95/125 (+115% de Dano de Ataque) de Dano Físico e reduz a Velocidade de Movimento em 15/20/25/30/35% por 2 segundos. O bumerangue volta para Gnar após atingir um inimigo, causando 50% de dano a alvos subsequentes. Cada inimigo somente pode ser atingido uma vez. Apanhar o bumerangue reduz seu Tempo de Recarga em [0]%.\n" +
                    "Mega Gnar: Arremessa um pedregulho que para ao atingir um inimigo, causando Lentidão a todos os inimigos próximos e também 5/45/85/125/165 (+120% de Dano de Ataque) de Dano Físico. Apanhar o pedregulho reduz seu Tempo de Recarga em 60%.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Mini Gnar:\n" +
                    "Passivo: Cada 3º ataque ou habilidade no mesmo alvo causa 10/20/30/40/50 (+100% de Poder de Habilidade) + 6/8/10/12/14% da Vida máxima do alvo como Dano Mágico adicional e concede [0]% de Velocidade de Movimento a Gnar, que decai ao longo de 3 segundos (máx.: 100/150/200/250/300 de dano contra monstros).\n" +
                    "Mega Gnar: Atordoa inimigos em uma área por 1,25 segundo, causando 25/45/65/85/105 (+100% de Dano de Ataque) de Dano Físico.Gnar recebe o efeito de Hipervelocidade de Movimento quando abandona a forma Mega.\n");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Mini Gnar: Salta em um local, recebendo 20/30/40/50/60% de Velocidade de Ataque por 3 segundos. Se Gnar aterrissar em uma unidade, ele salta a partir dela, deslocando-se mais. Causa 20/60/100/140/180 (+0)[6% da Vida máxima de Gnar] em Dano Físico e uma breve Lentidão se a unidade atingida for um inimigo.\n" +
                    "Mega Gnar: Salta em um local e causa 20/60/100/140/180 (+0)[6% da Vida máxima de Gnar] em Dano Físico a todos os inimigos próximos ao aterrissar. Os inimigos em que Gnar aterrissar sofrem breve Lentidão.Se Esmagamento for usado para transformar Gnar, ele ainda poderá saltar.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Mini Gnar:\n" +
                    "Passivo: Aumenta a Redução do Tempo de Recarga de um Bumerangue apanhado para 50/55/60% e a Velocidade de Movimento adicional de Hiperativo para 45/60/75%.\n" +
                    "Mega Gnar: Empurra todos os inimigos próximos na direção especificada, causando 200/300/400 (+20% de Dano de Ataque Bônus) (+50% de Poder de Habilidade) de Dano Físico e reduz a Velocidade de Movimento em 45% por 1.25/1.5/1.75 segundos. Qualquer inimigo que atingir uma parede recebe 150% de dano e sofre Atordoamento em vez de Lentidão.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.gnarp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.gnarq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.gnarw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.gnare);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.gnarr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Gnar");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Happy Hour");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Jogar o Barril");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Fúria da Bebedeira");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Barrigada");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Barril Explosivo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao usar a habilidade, Gragas bebe e restaura 4% de sua Vida máxima. Este efeito pode ocorrer somente uma vez a cada 8 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Gragas arremessa seu barril em um local alvo, explodindo ao ser ativado novamente ou por conta própria após 4 segundos, causando 80/120/160/200/240 (+60% de Poder de Habilidade) de Dano Mágico a inimigos na área e reduzindo sua Velocidade de Movimento em 40/45/50/55/60% por 2 segundos (causa 70% do dano a tropas).O dano e a redução de velocidade aumentam conforme o barril fermenta, chegando até 150% após 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Gragas dá uns bons goles em sua bebida, recebendo 10/12/14/16/18% de dano reduzido por 2,5 segundos.Após terminar sua bebida, seu próximo ataque básico causa, a inimigos próximos, Dano Mágico igual a 20/50/80/110/140 (+30% de Poder de Habilidade) mais 8% de suas Vidas máximas (máx.: 300 vs. monstros).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Gragas avança, colidindo com a primeira unidade inimiga. Ele causa 80/130/180/230/280 (+60% de Poder de Habilidade) de Dano Mágico a inimigos na área e os joga para trás, atordoando-os por 1 segundo.O Tempo de Recarga de Barrigada é reduzido em 0 caso Gragas colida com uma unidade.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Gragas arremessa seu barril, causando 200/300/400 (+70% de Poder de Habilidade) de Dano Mágico a todos os inimigos na área, afastando-os do centro da explosão.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.gragasp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.gragasq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.gragasw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.gragase);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.gragasr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Gragas");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Nova Destino");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Fim da Linha");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Cortina de Fumaça");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Saque Rápido");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Efeito Colateral");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A escopeta de Graves carrega até duas cápsulas. Após dispará-las, ele precisa recarregar. Cada ataque faz diversos disparos em área de cone. Atingir um inimigo com mais de um disparo causa dano adicional. Esses projéteis não podem atravessar unidades.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Dispara um projétil que causa 55/70/85/100/115 (+0) de Dano Físico a inimigos em linha reta.Após 2 segundos, ou 0,25 segundos caso colida com terreno, o projétil detona, causando 80/125/170/215/260 (+0) de Dano Físico a todos os inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Cria uma nuvem de fumaça com duração de 4 segundos. Inimigos dentro da nuvem de fumaça não conseguem enxergar o lado de fora dela.Causa 60/110/160/210/260 (+60% de Poder de Habilidade) de Dano Mágico e reduz a velocidade em 15/20/25/30/35% ao impacto.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Avança em uma direção, recarregando uma cápsula. Por 4 segundos, Graves recebe Bravura Indômita.Ataques básicos reduzem o Tempo de Recarga de Saque Rápido em 0.5 segundos e, contra unidades que não são tropas, também zeram Bravura Indômita.Bravura Indômita concede 10/15/20/25/30 de Armadura e de Resistência Mágica (acumula-se até 4 vezes).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Dispara um projétil explosivo com tal força que empurra Graves para trás. O projétil causa 250/400/550 (+0) de Dano Físico ao primeiro inimigo atingido. Após atingir um campeão inimigo ou chegar ao fim de seu alcance, o projétil explode, causando 200/320/440 (+0) de Dano Físico em uma área em forma de cone.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.gravesp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.gravesq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.gravesw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.gravese);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.gravesr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Graves");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Caminho da Guerra");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Enfurecido");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Espírito do Pavor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Ataque Devastador");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Massacre das Sombras");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Hecarim recebe Dano de Ataque igual a um percentual de sua Velocidade de Movimento adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Hecarim golpeia os inimigos próximos com 60/95/130/165/200 (+60% de Dano de Ataque Bônus) de Dano Físico (66% de dano a tropas).Se Hecarim causa dano a ao menos um inimigo em seu ataque, ele recebe um acúmulo de Enfurecido, reduzindo o Tempo de Recarga base de sua habilidade em 1 segundo(s) por um curto período de tempo. Este efeito se acumula até 2 vezes.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Hecarim causa 80/120/160/200/240 (+80% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos a todos os inimigos próximos. Hecarim se cura em 20% do dano que estes inimigos recebem de qualquer origem.Hecarim não pode se curar com mais do que 90/120/150/180/210 de Vida proveniente de tropas ou monstros.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Hecarim recebe Velocidade de Movimento crescente e ignora colisão com unidades por 4 segundos. Seu próximo ataque empurra o alvo para trás, causando de 40/75/110/145/180 (+50% de Dano de Ataque Bônus) a 80/150/220/290/360 (+100% de Dano de Ataque Bônus) de Dano Físico com base na distância percorrida por ele durante o Ataque Devastador (a distância do empurrão também escala).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Hecarim invoca cavaleiros espectrais e avança, causando 150/250/350 (+100% de Poder de Habilidade) de Dano Mágico em qualquer um que acertar.Hecarim desfere uma onda de choque ao terminar o ataque, fazendo com que inimigos próximos se afastem dele por 1 segundos.Hecarim se move apenas até o local alvejado. Os cavaleiros sempre se movem pelo percurso inteiro.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.hecarimp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.hecarimq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.hecarimw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.hecarime);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.hecarimr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Hecarim");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Robôs tecmatúrgicos de manutenção");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Torre Evolutiva H-28G");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Micro-Mísseis Hextec");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Granada de Tempestade de Elétrons CH-2");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "MELHORIA!!!");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Heimerdinger garante 10/15/20/25/30 de regeneração de Vida por 5 segundos às Torres H-28G e campeões aliados próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Posiciona uma torre no local alvo. Os ataques da torre priorizam os alvos de Heimerdinger e inimigos que o estiverem atacando. A Vida das torres aumenta conforme o nível de campeão de Heimerdinger e elas são desativadas caso ele se afaste da área. Heimerdinger gera um Conjunto de Torre a cada 24/23/22/21/20 segundos e pode armazenar até 1/1/2/2/3 Conjunto(s) ao mesmo tempo. Atributos das Torres Evolutivas H-28G\n" +
                    "Vida: 150/175/200/225/250/275/300/325/350/375/400/425/450/475/500/525/550/575 (+16/16/16/16/16)\n" +
                    "Ataque - Canhão: 12/18/23/29/34 (+15% de Poder de Habilidade) de Dano Mágico e +1/2/3/4/5% de carga do feixe a cada ataque. Ataque - Feixe: 40/60/80/105/130 (+55% de Poder de Habilidade) de Dano Mágico em linha reta a cada 16 segundos.\n" +
                    "Máximo de torres posicionadas: 3");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Dispara uma barragem de 5 mísseis que convergem em direção ao seu cursor e de dispersam em seguida. Cada míssil causa 60/90/120/150/180 (+45% de Poder de Habilidade) de Dano Mágico.\n" +
                    "Unidades atingidas mais de uma vez recebem dano reduzido:Campeões e monstros: 12/18/24/30/36 (+12% de Poder de Habilidade) de Dano Mágico, máx.:\n" +
                    "108/162/216/270/324 0.93 de dano totalTropas: 60% do dano baseMirar entre Heimerdinger e o alvo aumenta sua dispersão.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Arremessa uma granada que causa 60/100/140/180/220 (+60% de Poder de Habilidade) de Dano Mágico a unidades inimigas e reduz sua Velocidade de Movimento em 35% por 2 segundos. Inimigos no centro da explosão também são atordoados por 1.25 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Deixa a próxima habilidade sem custo de conjuração e lhe dá efeitos adicionais. Reative a habilidade para cancelar.\n" +
                    "Torre Apex H-28G: Posiciona uma torre que causa 80/100/120 (+30% de Poder de Habilidade) de Dano Mágico com seu canhão e 200/270/340 (+70% de Poder de Habilidade) de Dano Mágico com seu feixe por 8 segundos. Ela tem dano de raio, imunidade a desarmes, seus ataques reduzem a Velocidade de Movimento dos alvos em 25% por 2 segundos, ela recebe 20% de uma carga de feixe por ataque e não faz parte do limite de torres disponíveis.\n" +
                    "Enxame de Mísseis Hextec: Dispara 4 ondas de mísseis que causam 135/180/225 0.45/0.45/0.45 de Dano Mágico cada uma. Campeões e monstros atingidos por múltiplos mísseis recebem dano reduzido. Máx.: 500/690/865 1.83.\n" +
                    "Granada de Luz CH-3X: Arremessa uma granada que dispara três vezes, causando 150/200/250 0.6 de Dano Mágico. Tanto a área de atordoamento quanto a de Lentidão são maiores e a redução de Velocidade de Movimento é aumentada para 80%.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.heimerdingerp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.heimerdingerq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.heimerdingerw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.heimerdingere);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.heimerdingerr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Heimerdinger");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Profetisa de um Deus Ancião");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe de Tentáculo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Lição Dura");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Teste de Espírito");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Salto de Fé");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Illaoi e os Recipientes que ela cria fazem surgir Tentáculos em terreno intransponível próximo. Tentáculos golpeiam Espíritos, Recipientes e vítimas da Lição Dura de Illaoi. Tentáculos causam Dano Físico a inimigos atingidos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Passivo: Illaoi é curada com 5% de sua Vida perdida sempre que um Tentáculo causa dano a um campeão.\n" +
                    "Ativo: Illaoi golpeia um Tentáculo, causando 0 (+0) de Dano Físico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Para seu próximo ataque, Illaoi salta em direção ao alvo, causando 15/35/55/75/95 (+110% de Dano de Ataque) de Dano Físico. Ao atingi-lo, Tentáculos próximos também golpeiam o alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Illaoi arranca o Espírito do corpo de um inimigo, forçando-o a permanecer perante ela para que lhe ensine uma lição.Illaoi invoca o poder de seu deus para puxar o Espírito de um campeão inimigo por 10 segundos. O Espírito pode ser atacado por Illaoi e seus aliados, ecoando 25/30/35/40/45% (+[0]%) do dano que recebe ao alvo.Se o Espírito morrer ou o alvo deixar seu alcance, ele se torna um Recipiente. Recipientes fazem surgir um Tentáculo a cada 10 segundos por 1 minuto e têm sua Velocidade de Movimento reduzida em 80%, que decai ao longo de 2 segundos.Tentáculos golpeiam Espíritos e Recipientes, causando 0 (+0) de Dano Físico.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Illaoi golpeia o chão com seu ídolo, causando 150/250/350 (+50% de Dano de Ataque Bônus) de Dano Físico a inimigos próximos.Um Tentáculo surge para cada campeão inimigo atingido e, pelos próximos 8 segundos, Tentáculos golpeiam com 50% mais velocidade, ficam inalvejáveis e Lição Dura fica com Tempo de Recarga de 2 segundos.'Existem deuses bons e gentis. O meu não é nenhum desses.'");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.illaoip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.illaoiq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.illaoiw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.illaoie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.illaoir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Illaoi");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Fervor Ioniano");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Surto da Lâmina");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Estilo Hiten");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Ataque do Equilíbrio");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Lâminas Transcendentais");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Reduz a duração de todos os desarmes para cada campeão inimigo próximo.\n" +
                    "\n" +
                    "1 campeão: 10%\n" +
                    "2 campeões: 25%\n" +
                    "3 campeões: 40%");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Irelia avança para atingir seu alvo, causando 20/50/80/110/140 (+100% de Dano de Ataque) de Dano Físico e aplicando efeitos de contato.Caso abata o alvo, o Tempo de Recarga de Surto da Lâmina é zerado e restaura 35 de Mana.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Ataques básicos restauram 5/7/9/11/13 de Vida.\n" +
                    "Ativo: Os ataques básicos de Irelia causam 15/30/45/60/75 de Dano Verdadeiro e dobram a Vida restaurada por 6 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Irelia perfura seu alvo, causando 80/120/160/200/240 (+50% de Poder de Habilidade) de Dano Mágico e reduzindo a Velocidade de Movimento do alvo em 60% por 1/1.25/1.5/1.75/2 segundo(s).Se o alvo tiver um percentual de Vida maior que o de Irelia, ela o atordoa pela mesma duração.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Irelia invoca 4 lâminas espirituais que pode arremessar para causar 80/120/160 (+60% de Dano de Ataque Bônus) (+50% de Poder de Habilidade) de Dano Físico a inimigos que atravessarem. Ela se cura em 25% do dano causado contra campeões e 10% contra tropas e monstros.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ireliap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.ireliaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ireliaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ireliae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.ireliar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Irelia");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Brisa de Impulso");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ventania Uivante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Zéfiro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Olho da Tempestade");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Monção");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Aumenta a Velocidade de todos os campeões aliados que moverem-se na direção de Janna em 8%.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Conjura um turbilhão que causa 60/85/110/135/160 (+35% de Poder de Habilidade) de Dano Mágico a todos os inimigos em seu caminho, lançando-os ao ar por 0.5 segundos.O turbilhão pode ser carregado por até 3 segundos. Para cada segundo carregado, ele causa 15/20/25/30/35 (+10% de Poder de Habilidade) de dano adicional, arremessa ao ar por 0.25 segundos adicionais e tem um percurso 35% mais longo.Ative novamente a habilidade para enviar o turbilhão antes do tempo previsto.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Aumenta a Velocidade de Movimento em 9/11/13/15/17% (+2% de Poder de Habilidade) e ignora colisão com unidades.\n" +
                    "Ativo: Causa 60/115/170/225/280 (+50% de Poder de Habilidade) de Dano Mágico a um inimigo e reduz sua Velocidade de Movimento em 24/28/32/36/40% (+[6% de Poder de Habilidade]%) por 3 segundos. O efeito passivo é perdido enquanto Zéfiro estiver em Tempo de Recarga.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Protege um Campeão ou torre aliada por 5 segundos. O escudo absorve até 80/120/160/200/240 (+70% de Poder de Habilidade) de dano e concede 10/17.5/25/32.5/40 (+10% de Poder de Habilidade) Dano de Ataque até que seja quebrado.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Invoca o poder do vento para empurrar para trás os inimigos ao redor e restaurar 100/150/200 (+50% de Poder de Habilidade) de Vida a aliados próximos a cada segundo por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.jannap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.jannaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.jannaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.jannae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.jannar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Janna");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Capacitor Hextec");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Aos céus! / Disparo Chocante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Campo Estático / Hipercarga");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Golpe Trovejante / Portão Acelerador");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Canhão de Mercúrio / Martelo de Mercúrio");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Concede 40 de Velocidade de Movimento por 1,25 segundo e evita colisão com unidades sempre que Transformar for conjurado.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Empunhadura de Canhão: Dispara um orbe de eletricidade que detona ao atingir um inimigo (ou ao alcançar o fim de seu trajeto), causando Dano Físico a todos os inimigos na área da explosão.\n" +
                    "Salta na direção de um inimigo, causando 40/80/120/160/200/240 (+120% de Dano de Ataque Bônus) de Dano Físico e 30/35/40/45/50/55% de Lentidão por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Recebe 6/8/10/12/14/16 de Mana por acerto enquanto estiver em Empunhadura de Martelo.\n" +
                    "Ativo: Cria uma aura elétrica que causa 100/160/220/280/340/400 (+100% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos a inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Causa 8/10.4/12.8/15.2/17.6/20% da Vida máxima do inimigo (+100% de Dano de Ataque Bônus) como Dano Mágico e empurra uma curta distância para trás. (200/300/400/500/600/700 de dano máximo contra monstros.)");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Ativo: Transforma o Martelo de Mercúrio em Canhão de Mercúrio, recebendo novas habilidades e ataques à distância.O próximo ataque em Empunhadura de Canhão reduz a Armadura e Resistência Mágica do inimigo em [0]% por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.jaycep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.jayceq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.jaycew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.jaycee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.jaycer);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Jayce");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Sussurro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Granada Dançante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Florescer Mortal");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Audiência Cativa");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Aclamação");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "O canhão de Jhin, Sussurro, é um instrumento preciso criado para causar muito dano. Ele dispara com frequência fixa e carrega apenas quatro projéteis. Jhin encanta o projétil final com magia negra para causar acerto crítico e dano adicional de execução. Sempre que a Sussurro causa acerto crítico, ela inspira Jhin com Velocidade de Movimento.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Jhin lança um cartucho no inimigo alvo, causando 60/85/110/135/160 (+0) (+60% de Poder de Habilidade) de Dano Físico antes que ele salte a um inimigo próximo ainda não atingido.O cartucho pode atingir no máximo 4 vezes. Cada abate pelo cartucho aumenta o dano de acertos subsequentes em 35%.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Jhin faz um disparo de longo alcance que para no primeiro campeão atingido, causando 50/85/120/155/190 (+70% de Dano de Ataque) de Dano Físico a ele e 65% de tal dano a tropa e monstros atingidos em seu trajeto.Se Florescer Mortal atingir um campeão que já foi atingido por um dos ataques básicos de Jhin, Armadilhas de Lótus ou aliados dentre os últimos 4 segundos, ele o enraizará por 0.75/1/1.25/1.5/1.75 segundos e concederá Velocidade de Movimento a Jhin como se tivesse lhe causado um Acerto Crítico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Jhin posiciona uma Armadilha Lótus invisível no local alvo com duração de 2 minutos e ativa ao ser pisada, revelando inimigos próximos por 4 segundos.A armadilha deixa para trás uma área que reduz a velocidade de inimigos em 35% e detona após 2 segundos, causando 20/80/140/200/260 (+120% de Dano de Ataque) (+100% de Poder de Habilidade) de Dano Mágico (65% de dano nos acertos subsequentes contra tropas e monstros).Jhin prepara uma nova armadilha a cada 0 segundos e pode armazenar 2 por vez. Beleza em Morte - Quando Jhin abate um campeão inimigo, uma armadilha de lótus surgirá e detonará onde foi abatido.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Jhin se prepara e canaliza, permitindo que faça 4 super disparos de extremo alcance em área de cone à sua frente. Os disparos param no primeiro campeão atingido, reduzindo sua velocidade em 80% por 0.75 segundos e causando 50/125/200 (+25% de Dano de Ataque) de Dano Físico, aumentado em 2% para cada 1% de Vida perdida do alvo. O 4º disparo causa Acerto Crítico de [0]% de dano.Se cancelada antecipadamente, o Tempo de Recarga de Aclamação é restituído em 10% para cada disparo não feito.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.jhinp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.jhinq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.jhinw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.jhine);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.jhinr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Jhin");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Anime-se!");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Trocando!");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Zap!");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Mordidinha Flamejante!");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Super Mega Míssil da Morte!");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Jinx ganha grande quantidade de Velocidade de Movimento adicional sempre que um Campeão ou torre que ela tenha atacado recentemente for abatido ou destruído. Este bônus se esvai com o tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Jinx troca de armas.\n" +
                    "Fishbones, o Lança-Mísseis: Ataques básicos causam 110% de dano ao alvo de Jinx e todos os inimigos próximos, recebem 75/100/125/150/175 de alcance, disparam 15% mais devagar e consomem Mana.\n" +
                    "Pow-Pow, a Metralhadora: Ataques básicos concedem Velocidade de Ataque adicional por 2,5 segundos. Esse efeito acumula-se até 3 vezes, efetivando um total de [0]% (o efeito é cumulativo com o nível da habilidade e o nível de Jinx). Os acúmulos se vão um por vez e só beneficiam o primeiro ataque de Jinx após mudar para o Lança-Mísseis.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Jinx faz um disparo chocante que causa 10/60/110/160/210 (+140% de Dano de Ataque) de Dano Físico ao primeiro inimigo atingido, revelando-o (caso não esteja invisível) e reduzindo sua Velocidade de Movimento em 30/40/50/60/70% por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Jinx arremessa 3 armadilhas que, uma vez armadas, explodem ao contato com campeões inimigos, enraizando o alvo por 1,5 segundo e causando 80/135/190/245/300 (+100% de Poder de Habilidade) de Dano Mágico ao longo de 1,5 segundo a inimigos próximos. As armadilhas duram 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Jinx dispara um míssil que acumula dano ao longo do primeiro segundo de seu trajeto. Ele explode no primeiro campeão inimigo atingido, causando de 25/35/45 (+10% de Dano de Ataque Bônus) a 250/350/450 (+100% de Dano de Ataque Bônus) de Dano Físico mais 25/30/35% de sua Vida removida. Inimigos próximos recebem 80% de dano.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.jinxp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.jinxq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.jinxw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.jinxe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.jinxr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Jinx");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Aprumo Marcial");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Perfurar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Vigia");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Lacerar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Chamado do Destino");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Em vez de cancelar a animação básica de ataque, uma ordem de movimento faz com que Kalista salte em direção ao clique depois que ela completa seu ataque. Kalista causa dano bônus quando salta em direção ao seu alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Lança um projétil rápido, porém estreito, que causa 10/70/130/190/250 (+100% de Dano de Ataque) de Dano Físico. Aciona Aprumo Marcial (P), Vigia (W) e Lacerar (E).Caso abata um alvo, Perfurar continua em ação, transferindo todos os acúmulos de Lacerar ao próximo alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Quando Kalista estiver próxima de seu aliado Em Juramento, ela recebe +[0]% de Velocidade de Ataque. Se ambos fizerem ataques básicos no mesmo alvo, ela causa 5/7.5/10/12.5/15% de sua Vida máxima como Dano Mágico. 10 s de Tempo de Recarga por alvo.\n" +
                    "Ativo: Envia a alma de um Vigia para patrulhar uma área sem visibilidade. Campeões vistos são revelados por 4 segundos. Os Vigias têm duração de 3 voltas.Kalista recebe uma carga de Vigia a cada 90/80/70/60/50 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Enquanto Lacerar estiver sem Tempo de Recarga, as lanças de Kalista perfuram seu alvo e permanecem nele por 4 segundos.\n" +
                    "Ativo: Arranca as lanças de alvos próximos, causando 20/30/40/50/60 (+60% de Dano de Ataque) de Dano Físico e reduz sua Velocidade de Movimento em 25/30/35/40/45% por 2 segundos. Cada lança adicional aumenta o dano de Lacerar.Se Lacerar abater ao menos um alvo, seu Tempo de Recarga é zerado.Se Lacerar abater dois ou mais alvos, seu custo de Mana é restituído.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Puxa o aliado em Juramento na direção de Kalista. Por até 4 segundos, o aliado em Juramento fica inalvejável, mas em estado pacífico.Ele poderá clicar com o mouse para voar na direção da posição alvo, parando no primeiro campeão inimigo atingido, empurrando para trás todos os inimigos em um pequeno raio e posicionando o aliado em Juramento em seu alcance máximo de ataque do inimigo. O aliado em Juramento com Kalista deve estar dentre 1000 unidades de distância para que ela conjure essa habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.kalistap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.kalistaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.kalistaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.kalistae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.kalistar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Kalista");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Ímpeto Ardente");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Chama Interior");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Decisão Absorta");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Inspiração");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Mantra");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Reduz o Tempo de Recarga de Mantra a cada vez que Karma causar dano a um campeão inimigo com uma de suas habilidades (metade do efeito com ataques básicos).");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Dispara uma rajada de energia que explode ao contato com inimigo, causando 80/125/170/215/260 (+60% de Poder de Habilidade) de Dano Mágico a inimigos na área e reduzindo sua Velocidade de Movimento em 25% por 1.5 segundo(s).\n" +
                    "Efeito de Mantra - Alma Iluminada: Causa 25/75/125/175 (+30% de Poder de Habilidade) de Dano Mágico adicional e deixa um círculo de chamas na área de impacto ou ao atingir o alcance máximo, causando [0]% de Lentidão a inimigos. Após 1,5 segundo, o círculo entra em erupção, causando 50/150/250/350 (+60% de Poder de Habilidade) de Dano Mágico a inimigos na área.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Vincula Karma ao Campeão inimigo ou monstro alvo, revelando-o e causando 60/110/160/210/260 (+90% de Poder de Habilidade) de Dano Mágico ao longo de 2 segundos. O inimigo é enraizado em seu lugar por 1/1.25/1.5/1.75/2 segundo(s) se o vínculo não for quebrado.\n" +
                    "Efeito de Mantra - Renovação: Karma é curada com [75/150/225/300]% (+[0]%) de sua Vida perdida. Se o vínculo não for quebrado ou se o alvo morrer, a duração do enraizamento é aumentada em 0 segundo(s) e Karma é curada com [75/150/225/300]% (+[0]%) de sua Vida perdida.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "O alvo aliado recebe um escudo, concedendo 40/45/50/55/60% de Velocidade de Movimento por 1.5 segundo(s) e absorvendo 80/110/140/170/200 (+50% de Poder de Habilidade) de dano por 4 segundos.\n" +
                    "Efeito de Mantra - Afronta: O escudo transborda com energia, absorvendo 60/140/220/300 (+60% de Poder de Habilidade) de dano adicional pelo alvo de Karma (0 de escudo total). Campeões aliados ao redor dela recebem escudos que absorvem até [0]% do escudo do alvo inicial (0). Todos os campeões protegidos por Afronta recebem [0]% de Velocidade de Movimento por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Karma fortalece sua próxima habilidade usada dentro de 8 segundos para ter um efeito adicional.\n" +
                    "Alma Iluminada: Causa Dano Mágico adicional e deixa um círculo de energia, causando lentidão drástica e dano a inimigos após um breve intervalo.\n" +
                    "Renovação: Karma cura-se com uma parte de sua Vida perdida. Se o alvo não quebrar o vínculo, a duração do enraizamento é estendida e Karma é curada novamente com uma parte de sua Vida perdida.\n" +
                    "Afronta: O alvo de Karma recebe um escudo aprimorado. Campeões aliados ao redor dela ficam protegidos e recebem Velocidade de Movimento.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.karmap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.karmaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.karmaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.karmae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.karmar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Karma");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Desafio da Morte");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Devastar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Barreira da Dor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Perverter");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Réquiem");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao morrer, Karthus entra na forma de espírito, e pode continuar lançando feitiços por mais 7 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Cria uma explosão com atraso na posição do cursor de Karthus. Após 0,5 segundos, causa 40/60/80/100/120 (+30% de Poder de Habilidade) de Dano Mágico a cada inimigo próximo. Isto causa o dobro de dano se atingir apenas uma unidade.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Cria uma parede no local alvo, com duração de 5 segundos. Inimigos que a atravessarem terão sua Resistência Mágica reduzida em 15% e a Velocidade de Movimento reduzida em 40/50/60/70/80% por 5 segundos (a Velocidade de Movimento se recupera gradualmente ao longo da duração).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Desativar: Quando Karthus abate uma unidade, ele restaura 20/27/34/41/48 de Mana.\n" +
                    "Ativar: Drena 30/42/54/66/78 de Mana para causar 30/50/70/90/110 (+20% de Poder de Habilidade) de Dano Mágico a inimigos próximos a cada segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Após canalizar por 3 segundos, Karthus causa 250/400/550 (+60% de Poder de Habilidade) de Dano Mágico a todos os campeões inimigos (independente da distância).");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.karthusp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.karthusq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.karthusw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.karthuse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.karthusr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Karthus");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pedra do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Esfera Nula");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Lâmina Ínfera");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Força de Pulso");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Caminhar na Fenda");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Kassadin recebe 15% de Dano Mágico reduzido e ignora colisão com unidades.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Kassadin dispara um orbe de energia do Vazio em um alvo inimigo, causando 70/95/120/145/170 (+70% de Poder de Habilidade) de Dano Mágico e interrompendo canalizações.A energia excedente toma forma ao seu redor, concedendo um escudo temporário que absorve 40/70/100/130/160 (+30% de Poder de Habilidade) de Dano Mágico por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Os ataques básicos de Kassadin drenam energia do Vazio, causando 20 (+10% de Poder de Habilidade) de Dano Mágico adicional.\n" +
                    "Ativo: Kassadin carrega sua Lâmina Ínfera, fazendo com que seu próximo ataque básico cause 40/65/90/115/140 (+70% de Poder de Habilidade) de Dano Mágico adicional e restaure 4/5/6/7/8% de sua Mana removida (aumenta para 20/25/30/35/40% contra campeões).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Kassadin drena energia das habilidades conjuradas em suas proximidades, recebendo uma carga sempre que uma habilidade é conjurada perto dele.Ao atingir 6 cargas, Kassadin pode usar Força de Pulso para causar 80/105/130/155/180 (+70% de Poder de Habilidade) de Dano Mágico e 50/60/70/80/90% de Lentidão a inimigos por 1 segundos em área de cone à sua frente.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Kassadin teleporta-se para um local próximo, causando 80/100/120 (+0) (+20% de Poder de Habilidade) de Dano Mágico a unidades inimigas próximas.Cada Caminhar na Fenda seguinte dentro dos próximos 15 segundos dobra o custo de Mana e causa 40/50/60 (+0) (+0) de Dano Mágico adicional por acúmulo. O efeito acumula-se até 4 vezes.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.kassadinp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.kassadinq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.kassadinw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.kassadine);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.kassadinr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Kassadin");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Voracidade");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Lâmina Ricochete");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ciclone das Adagas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Shunpo");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Lótus da Morte");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "O Tempo de Recarga das habilidades de Katarina são reduzidos em 15 segundos sempre que um campeão danificado por ela nos últimos 3 segundos morra.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Arremessa uma adaga, causando60/85/110/135/160 (+45% de Poder de Habilidade) de Dano Mágico a seu alvo e aos 4 inimigos mais próximos.Inimigos atingidos são marcados por 4 segundos. Os ataques e habilidades de Katarina consomem a marca, causando 15/30/45/60/75 (+20% de Poder de Habilidade) de Dano Mágico adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Ataca com suas adagas em movimento circular, causando 40/75/110/145/180 (+60% de Dano de Ataque Bônus) (+25% de Poder de Habilidade) de Dano Mágico. Caso atinja um Campeão inimigo, Katarina recebe 15/20/25/30/35% de Velocidade de Movimento por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Teleporta ao local do alvo. Causa 40/70/100/130/160 (+25% de Poder de Habilidade) de Dano Mágico se o alvo for um inimigo.Após usar Shunpo, Katarina recebe dano reduzido em 15% por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Katarina gira em torno de si mesma, disparando adagas nos 3 Campeões inimigos mais próximos, causando 350/550/750 (+375% de Dano de Ataque Bônus) (+250% de Poder de Habilidade) de Dano Mágico ao longo de 2.5 segundos.As adagas aplicam Feridas Dolorosas, reduzindo efeitos de auto-cura em 40% por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.katarinap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.katarinaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.katarinaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.katarinae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.katarinar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Katarina");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Fervor Sagrado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Acerto de Contas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Bênção Divina");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Fúria Íntegra");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Intervenção");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando Kayle ataca um campeão, o alvo perde 3% de Armadura e Resistência Mágica por 5 segundos. Este efeito se acumula até 5 vezes.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Atinge um alvo, causando 60/110/160/210/260 (+100% de Dano de Ataque Bônus) (+60% de Poder de Habilidade) de Dano Mágico e reduzindo sua Velocidade de Movimento em 35/40/45/50/55% por 3 segundos, além de aplicar um acúmulo de Fervor Sagrado.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Abençoa um campeão aliado, aumentando sua Velocidade de Movimento em 18/21/24/27/30% (+[7% de Poder de Habilidade]%) por 3 segundos e curando-o com 60/105/150/195/240 (+45% de Poder de Habilidade) de Vida.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: os ataques básicos de Kayle causam 10/15/20/25/30 (+15% de Poder de Habilidade) de Dano Mágico adicional ao contato.\n" +
                    "Ativo: Kayle aumenta seu alcance de ataque em 400 por 10 segundos e o efeito passivo é aumentado para 20/30/40/50/60 (+30% de Poder de Habilidade) de Dano Mágico ao contato.Além disto, inimigos próximos ao alvo recebem 20/30/40/50/60 (+20/25/30/35/40% de Dano de Ataque) (+30% de Poder de Habilidade) de Dano Mágico a cada ataque.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Banha o alvo de Kayle em luz sagrada, tornando-o imune a todo o dano por 2/2.5/3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.kaylep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.kayleq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.kaylew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.kaylee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.kayler);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Kayle");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Marca da Tormenta");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Shuriken Trovejante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Surto Elétrico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Investida Relâmpago");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Turbilhão Cortante");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "As habilidades de Kennen adicionam Marcas da Tormenta a seu alvo por 6,25 segundos. Ao receber 3 Marcas da Tormenta, um oponente fica atordoado por 1,25 segundo e Kennen recebe 25 de Energia. \n" +
                    "\n" +
                    "Seu efeito é reduzido se ocorrer novamente em menos de 7 segundos.\n");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Arremessa uma shuriken que causa 75/115/155/195/235 (+75% de Poder de Habilidade) de Dano Mágico ao primeiro inimigo atingido.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: A cada 5 ataques, Kennen causa Dano Mágico adicional igual a 40/50/60/70/80% do seu Dano de Ataque e adiciona uma Marca da Tormenta em seu alvo.\n" +
                    "Ativo: Atinge com eletricidade todas as unidades próximas pegas pelo Turbilhão Cortante ou marcadas pela Marca da Tormenta, causando 65/95/125/155/185 (+55% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Kennen recebe 335 de Velocidade de Movimento e ignora colisão com unidades por 2 segundos, causando 85/125/165/205/245 (+60% de Poder de Habilidade) de Dano Mágico a qualquer inimigo que atravessar. Além disso, Kennen receberá 10/20/30/40/50 de Armadura e Resistência Mágica por 4 segundos. Kennen recebe 40 de Energia pela primeira vez que atravessar um inimigo.A Investida Relâmpago causa metade do dano em tropas.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Invoca uma tempestade mágica por 3/4/5 segundos que causa 80/145/210 (+40% de Poder de Habilidade) de Dano Mágico a um campeão inimigo aleatório próximo a Kennen a cada 0,25 segundos. Turbilhão Cortante somente pode atingir o mesmo campeão uma vez a cada meio segundo e não mais do que 3 vezes no total.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.kennenp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.kennenq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.kennenw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.kennene);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.kennenr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Kennen");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Ameaça Invisível");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Sabor de Medo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Espinho do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Salto");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Massacre do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando Kha'Zix não estiver visível para a equipe inimiga, ele recebe Ameaça Invisível, fazendo com que seu próximo ataque básico contra um Campeão inimigo cause Dano Magico adicional e Lentidão.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Passivo: Marca inimigos que estiverem isolados de aliados próximos.\n" +
                    "Ativo: Causa 70/95/120/145/170 (+120% de Dano de Ataque Bônus) de Dano Físico. Se o alvo estiver isolado, o dano aumenta para 91/124/156/189/221 (+156% de Dano de Ataque Bônus).\n" +
                    "Garras Aumentadas Evoluídas: Se o alvo estiver isolado, o dano é aumentado para 0 (+0). Aumenta o alcance de Sabor de Medo e dos ataques básicos de Kha'Zix em 50.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Dispara espinhos explosivos, causando 80/110/140/170/200 (+100% de Dano de Ataque Bônus) de Dano Físico a todos os inimigos próximos (20% de dano adicional a monstros) e 20% de redução na Velocidade de Movimento por 2 segundos. Cura Kha'Zix em 60/85/110/135/160 (+50% de Poder de Habilidade) caso ele esteja dentro do raio da explosão.\n" +
                    "Fileiras de Espinhos Evoluídas: Espinho do Vazio dispara três espinhos em área de cone, reduzindo a Velocidade de Movimento de inimigos atingidos em 50% por 2 segundos. Se o alvo for um campeão, Kha'Zix recebe visão dele por 2 segundos (não afeta unidades invisíveis).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Salta para a área alvo, causando 65/100/135/170/205 (+20% de Dano de Ataque Bônus) de Dano Físico.\n" +
                    "Asas Evoluídas: Aumenta o alcance de Salto. A cada abate ou assistência, o Tempo de Recarga de Salto é zerado.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Aumentar o nível de Massacre do Vazio permite que Kha'Zix evolua uma de suas habilidades.\n" +
                    "Ativo: Torna-se invisível por 1 segundo. Ativa Ameaça Invisível e aumenta a Velocidade de Movimento de Kha'Zix em 40%. Além disso, Kha'Zix ignora colisão com unidades enquanto estiver invisível. Massacre do Vazio pode ser conjurado uma segunda vez dentre 15 segundos.\n" +
                    "Camuflagem Ativa Evoluída: Massacre do Vazio pode ser conjurado três vezes e sua duração aumenta para 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.khazixp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.khazixq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.khazixw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.khazixe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.khazixr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Khazix");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Marca Familiar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Dança de Flechas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Frenesi do Lobo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Pesar Crescente");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Refúgio da Ovelha");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os Kindred marcam alvos para Caçar. Completar uma Caça com sucesso fortalece permanentemente os ataques básicos deles.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "A Ovelha salta, disparando até 3 flechas em inimigos próximos, causando 60/90/120/150/180 (+0) de Dano Físico.Conjurar Frenesi do Lobo ou saltar dentro de seu efeito reduz o Tempo de Recarga dessa habilidade para 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Conforme os Kindred movem-se, eles acumulam Vigor do Caçador até um máximo de 100 acúmulos. Com o máximo de acúmulos, o próximo ataque da Ovelha drena 0 de Vida do alvo.\n" +
                    "Ativo: O Lobo marca um território como seu, atacando inimigos próximos dentro dele por 8 segundos. A Ovelha pode direcioná-lo aos alvos através de ataques básicos. Se a Ovelha deixar o território do Lobo, ele cessará seus ataques e se juntará a ela.Os ataques do Lobo causam Dano Físico igual a 25/30/35/40/45 (+0) mais 40% do dano da Marca Familiar.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Mutila um inimigo, reduzindo sua Velocidade de Movimento em 70% por 1 segundo.Assim que a Ovelha atacar o alvo duas vezes, seu terceiro ataque direcionará o Lobo para que salte no inimigo, causando muito Dano Físico.O Lobo causa Dano Físico igual a 60/90/120/150/180 (+0) +5% da Vida máxima do alvo");
            habvalores.put(contract.Habilidades.COLUNA_HR, "A Ovelha abençoa o solo sob um campeão aliado por 4 segundos, criando uma área na qual nenhum ser vivo, seja aliado ou inimigo, pode morrer. Ao chegar a 10% de Vida, as unidades ficam imunes a dano adicional ou cura.Quando a bênção se encerra, todos os seres vivos na área são curados com 200/250/300.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.kindredp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.kindredq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.kindredw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.kindrede);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.kindredr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Kindred");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Surpresa Icathiana");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Cusparada Cáustica");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Barragem Bio-Arcana");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Gosma do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Artilharia Viva");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao morrer, Kog'Maw inicia uma reação em cadeia em seu corpo, fazendo com que ele se mova mais rapidamente e detone após 4 segundos, causando 100 + (25 x Nv) de Dano Verdadeiro a inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Lança um projétil corrosivo que causa 80/130/180/230/280 (+50% de Poder de Habilidade) de Dano Mágico ao primeiro inimigo atingido, destrói sua Armadura e Resistência Mágica em 12/16/20/24/28% por 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Por 6 segundos, os ataques básicos:Recebem 90/120/150/180/210 de alcanceCausam 10/15/20/25/30% mais 2% (+0)% da Vida máxima do alvo como Dano Mágico adicional.Recebem 100% de Velocidade de Ataque totalCausam 55% de dano a unidades que não são tropasDurante esse tempo, o limite máximo de Velocidade de Ataque de Kog'Maw é dobrado.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Causa 60/110/160/210/260 (+70% de Poder de Habilidade) de Dano Mágico a inimigos atingidos, além de deixar um rastro no chão por 4 segundos, reduzindo a velocidade de inimigos nela em 20/28/36/44/52%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Faz um disparo de artilharia, causando Dano Mágico. Cada disparo subsequente dentre 10 segundos custa 50 de Mana a mais (máx.: 500).\n" +
                    "Dano:70/110/150 (+65% de Dano de Ataque Bônus) (+25% de Poder de Habilidade) a inimigos com mais de 50% de Vida50% de Dano de Ataque Bônus (+0) (+0) a inimigos entre 25% e 50% de Vida0 (+0) (+0) a inimigos com menos de 25% de VidaInimigos atingidos são revelados por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.kogmawp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.kogmawq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.kogmaww);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.kogmawe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.kogmawr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Kogmaw");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Imagem Espelho");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Sigilo de Malícia");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Distorção");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Correntes Etéreas");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Mímica");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando LeBlanc fica com menos de 40% de Vida, ela fica invisível por 1 segundo e cria uma Imagem Espelho que não causa dano e dura até 8 segundos.\n" +
                    "\n" +
                    "Imagem Espelho tem 1 minuto de Tempo de Recarga.\n" +
                    "\n" +
                    "Imagem Espelho pode ser controlada segurando-se a tecla Alt em conjunto com o botão direito do mouse.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Causa 55/80/105/130/155 (+40% de Poder de Habilidade) de Dano Mágico e marca o alvo por 3,5 segundos.Se o alvo receber dano de uma das habilidades de LeBlanc, o sigilo será ativado, causando 55/80/105/130/155 (+40% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Avança a um local alvo, causando 85/125/165/205/245 (+60% de Poder de Habilidade) de Dano Mágico a unidades próximas.Por 4 segundos, ela pode ativar Distorção novamente para retornar a seu lugar inicial.\n");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Lança uma corrente que prende a primeira unidade atingida a LeBlanc, causando 40/65/90/115/140 (+50% de Poder de Habilidade) de Dano Mágico e reduz sua Velocidade de Movimento em 25%.Se o alvo permanecer preso por 1.5 segundos, ele recebe 40/65/90/115/140 (+50% de Poder de Habilidade) de Dano Mágico adicional e fica incapacitado de se mover por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "LeBlanc pode conjurar uma versão mímica do último feitiço que lançou.As mímicas de Sigilo de Malícia e Correntes Etéreas causam 100/200/300 (+60% de Poder de Habilidade) de Dano Mágico em ambas as instâncias de seus danos.Distorção mímica causa 150/300/450 (+90% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.leblancp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.leblancq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.leblancw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.leblance);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.leblancr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Leblanc");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Agitação");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Onda Sônica / Ataque Ressonante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Proteger / Vontade de Ferro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Tempestade / Mutilar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Fúria do Dragão");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após Lee Sin usar uma habilidade, seus próximos 2 ataques básicos recebem 40% de Velocidade de Ataque e restituem 20/10 de Energia.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Onda Sônica: Lee Sin projeta uma onda de som para localizar seus inimigos, causando 50/80/110/140/170 (+90% de Dano de Ataque Bônus) de Dano Físico ao primeiro inimigo encontrado. Se Onda Sônica atingir, Lee Sin pode conjurar Ataque Ressonante nos próximos 3 segundos.\n" +
                    "Ataque Ressonante: Lee Sin avança até o inimigo atingido por Onda Sônica, causando 50/80/110/140/170 (+90% de Dano de Ataque Bônus) de Dano Físico mais 8% de sua Vida removida (máx.: 400 de dano vs. monstros).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Proteger: Lee Sin avança em direção a um alvo aliado. Se o aliado for um campeão, Lee Sin protege ele e a si mesmo de 40/80/120/160/200 (+80% de Poder de Habilidade) de dano por 2 segundos, e o Tempo de Recarga de Proteger é reduzido em 50%. Após usar Proteger, Lee Sin pode conjurar Vontade de Ferro pelos próximos 3 segundos.\n" +
                    "Vontade de Ferro: O treinamento intenso de Lee Sin permite que ele fique mais resistente em combate. Por 4 segundos, Lee Sin recebe 5/10/15/20/25% de Roubo de Vida e de Vampirismo Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Tempestade: Lee Sin golpeia o chão, enviando uma onda de choque que causa 60/95/130/165/200 (+100% de Dano de Ataque Bônus) de Dano Mágico e revela unidades inimigas atingidas por 4 segundos. Se Tempestade atingir um inimigo, Lee Sin pode conjurar Mutilar dentre os próximos 3 segundos.\n" +
                    "Mutilar: Lee Sin mutila inimigos próximos revelados por Tempestade, reduzindo a Velocidade de Movimento deles em 20/30/40/50/60% por 4 segundos. A Velocidade de Movimento recupera-se gradualmente ao longo da duração.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Lee Sin realiza um poderoso chute giratório, lançando o campeão inimigo pra trás, causando 200/400/600 (+200% de Dano de Ataque Bônus) de Dano Físico ao alvo e a inimigos que colidirem com ele. Inimigos que colidirem com o alvo são lançados ao ar por um breve período de tempo. A cada vez que o alvo colide com um campeão inimigo, a ele também causa 12/15/18% de sua Vida adicional como Dano Físico.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.leesinp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.leesinq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.leesinw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.leesine);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.leesinr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Lee Sin");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Luz do Sol");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Proteção da Aurora");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Eclipse");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Lâmina Zênite");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Labareda Solar");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Feitiços de dano afligem inimigos com Luz do Sol por 3,5 segundos. Quando campeões aliados causam dano a estes alvos, eles consomem o efeito negativo da Luz do Sol para causar Dano Mágico adicional.\n");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O próximo ataque básico de Leona causa um adicional de 40/70/100/130/160 (+30% de Poder de Habilidade) de Dano Mágico e atordoa um inimigo por 1.25 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Recebe 20/30/40/50/60 (+20% de Armadura adicional) de Armadura adicional e 20/30/40/50/60 (+20% de Resistência Mágica adicional) de Resistência Mágica por 3 segundos. Quando o efeito acaba, os inimigos próximos atingidos recebem 60/110/160/210/260 (+40% de Poder de Habilidade) de Dano Mágico e Leona retém sua Armadura e Resistência Mágica adicionais por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Atinge todos os inimigos em uma linha, causando 60/100/140/180/220 (+40% de Poder de Habilidade) de Dano Mágico. O último Campeão inimigo atingido ficará brevemente enraizado e Leona correrá em sua direção.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Conjura um intenso raio de energia solar, causando 150/250/350 (+80% de Poder de Habilidade) de Dano Mágico e reduzindo a Velocidade de Movimento de inimigos em 80% por 1.5 segundos. Inimigos no centro da explosão são atordoados.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.leonap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.leonaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.leonaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.leonae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.leonar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Leona");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Glacinata");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Estilhaço de Gelo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Círculo Ártico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Caminho Glacial");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Túmulo Congelado");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A cada 18 segundos, a próxima habilidade de Lissandra não tem custo de Mana. Este Tempo de Recarga é reduzido em 1 segundo sempre que Lissandra debilita a movimentação de um inimigo com uma habilidade (não se aplica a efeitos de debilitar movimentação provenientes de itens).");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Arremessa uma lança de gelo que se estilhaça ao atingir um inimigo, causando 70/100/130/160/190 (+65% de Poder de Habilidade) de Dano Mágico e reduzindo a Velocidade de Movimento em 16/19/22/25/28% por 1.5 segundos. Em seguida, os estilhaços atravessam o alvo, causando o mesmo dano a outros inimigos atingidos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Causa 70/110/150/190/230 (+40% de Poder de Habilidade) de Dano Mágico a inimigos próximos e os enraíza por 1.1/1.2/1.3/1.4/1.5 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Conjura uma garra de gelo que causa 70/115/160/205/250 (+60% de Poder de Habilidade) de Dano Mágico a todos os inimigos atingidos. Reativar essa habilidade transporta Lissandra ao local atual da garra.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Conjuração em inimigo: Congela o campeão alvo, atordoando-o por 1.5 segundos.\n" +
                    "Conjuração em si mesma: Lissandra protege-se em gelo negro por 2.5 segundos, curando-se em 100/150/200 (+30% de Poder de Habilidade) de Vida com 1% adicional para cada 1% de sua Vida removida, tornando-se inalvejável e invulnerável, mas incapaz de realizar qualquer ação.Em seguida, o gelo negro emana do alvo, causando 150/250/350 (+70% de Poder de Habilidade) de Dano Mágico a inimigos. Ele tem duração de 3 segundos e reduz a Velocidade de Movimento de inimigos em 30/45/75%.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.lissandrap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.lissandraq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.lissandraw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.lissandrae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.lissandrar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Lissandra");
  /* ************************************************************************************************************************************************************ */

            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Disparo Iluminado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Luz Perfurante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Chama Ardente");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Perseguição Implacável");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "O Expurgo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Sempre que Lucian usa uma habilidade, seu próximo ataque terá disparo duplo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Dispara um feixe de luz perfurante através de uma unidade inimiga, causando 80/110/140/170/200 (+60/75/90/105/120% de Dano de Ataque) (60/75/90/105/120% de Dano de Ataque adicional) de Dano Físico a inimigos em linha reta.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Faz um disparo que explode ao contato inimigo ou ao alcançar o fim de seu trajeto. A explosão causa 60/100/140/180/220 (+90% de Poder de Habilidade) de Dano Mágico e marca inimigos por 6 segundos.Quando Lucian ou seus aliados causam dano a um alvo marcado, Lucian recebe 60/65/70/75/80 de Velocidade de Movimento por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Avança rapidamente uma curta distância.Sempre que Disparo Iluminado atinge um inimigo, o Tempo de Recarga de Perseguição Implacável é reduzido em 1 segundo (dobra para 2 segundos contra campeões).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Lucian movimenta-se livremente enquanto dispara com rapidez em uma única direção por 3 segundos. Seus disparos colidem com o primeiro inimigo que atingem, cada um causando 20/35/50 (+10% de Poder de Habilidade) (+20% de Dano de Ataque) de Dano Físico. O Expurgo causa 400% de dano a tropas.Lucian pode usar Perseguição Implacável durante O Expurgo.Reative O Expurgo para cancelá-lo antecipadamente.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.lucianp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.lucianq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.lucianw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.luciane);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.lucianr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Lucian");
  /* ************************************************************************************************************************************************************ */   /****************************************/

            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pix, a Fada Companheira");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Lança Purpurina");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Caprichos");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Socorro, Pix!");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Crescimento Virente");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Pix é uma fada selvagem que acompanha Lulu. Pix dispara uma barragem de energia mágica nos alvos que Lulu atacar.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Lulu e Pix disparam ambas um raio perfurante, causando 80/125/170/215/260 (+50% de Poder de Habilidade) de Dano Mágico e 80% de redução na Velocidade de Movimento por 1/1.25/1.5/1.75/2 segundos a inimigos. Essa Lentidão decai ao longo do tempo.Cada inimigo somente pode ser atingido por um projétil.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Conjuração em aliado: O alvo aliado recebe 30 (+5% de Poder de Habilidade)% de Velocidade de Movimento por 3/3.25/3.5/3.75/4 segundos.\n" +
                    "Conjuração em inimigo: Polimorfiza um campeão inimigo por 1.25/1.5/1.75/2/2.25 segundos, desarmando sua capacidade de atacar ou conjurar habilidades e reduzindo sua Velocidade de Movimento base em 60.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Conjuração em aliado: Comanda Pix para pular em um aliado e ajudar com seus ataques em vez de Lulu por 6 segundos. Se o aliado for um campeão, Pix o protege de 80/120/160/200/240 (+60% de Poder de Habilidade) de dano por 6 segundos.\n" +
                    "Conjuração em inimigo: Pix causa 80/110/140/170/200 (+40% de Poder de Habilidade) de Dano Mágico à unidade inimiga alvo. Em seguida, Pix a segue e concede visão dela por 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Lulu faz um aliado crescer, lançando ao ar os inimigos ao seu redor. Por 7 segundos, seu aliado recebe 300/450/600 (+50% de Poder de Habilidade) de Vida adicional e reduz a Velocidade de Movimento de inimigos próximos em 30/45/60%.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.lulup);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.luluq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.luluw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.lulue);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.lulur);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Lulu");

  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Iluminação");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ligação da Luz");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Barreira Prismática");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Singularidade Lucente");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Centelha Final");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "As habilidades de dano de Lux carregam o alvo com energia por 6 segundos. O próximo ataque de Lux incendeia a energia, causando Dano Mágico adicional (com base no nível de Lux) ao alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Dispara uma esfera de luz, enraizando até dois inimigos por 2 segundos e causando 60/110/160/210/260 (+70% de Poder de Habilidade) de Dano Mágico a cada um deles.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Lança o cetro de Lux em um local-alvo e de volta, protegendo a si mesma e todos os campeões aliados que forem tocados de 50/65/80/95/110 (+20% de Poder de Habilidade) de dano por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Cria uma área que desacelera inimigos em 20/24/28/32/36%. Após 5 segundo(s) a área implode, causando 60/105/150/195/240 (+60% de Poder de Habilidade) de Dano Mágico.Ative novamente para antecipar a detonação.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Dispara um estonteante feixe de luz, causando 300/400/500 (+75% de Poder de Habilidade) de Dano Mágico a todos os inimigos em linha reta. A Centelha Final incendeia e redefine o efeito negativo de Iluminação.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.luxp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.luxq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.luxw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.luxe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.luxr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Lux");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Escudo de Granito");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Fragmento Sísmico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Golpes Brutais");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Estrondar Terreno");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "\n" +
                    "Força Incontrolável");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Malphite está protegido por uma camada de rocha qua absorve dano até 10% de sua Vida máxima. Se Malphite não for atingido por 10 segundos, este efeito se recarrega.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Causa 70/120/170/220/270 (+60% de Poder de Habilidade) de Dano Mágico e rouba 14/17/20/23/26% de Velocidade de Movimento do alvo por 4 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: A Armadura de Malphite é aumentada em 10/15/20/25/30% (0).\n" +
                    "Ativo: Ataques básicos causam 15/30/45/60/75 (+0) (+10% de Poder de Habilidade) de Dano Físico adicional ao alvo e a qualquer unidade próxima.\n" +
                    "Duração: 6 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Malphite bate no chão, causando 60/95/130/165/200 (+30% de Armadura) (+20% de Poder de Habilidade) de Dano Mágico a inimigos ao seu redor, reduzindo suas Velocidades de Ataque em 30/35/40/45/50% por 3 segundo(s).O dano desta habilidade é equivalente a 30% da Armadura de Malphite.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Malphite ataca na direção da área alvo causando 200/300/400 (+100% de Poder de Habilidade) de Dano Mágico e lançando os inimigos ao ar por 1.5 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.malphitep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.malphiteq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.malphitew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.malphitee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.malphiter);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Malphite");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Invocar Voidling");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Chamado do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Zona Nula");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Visões Maléficas");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Aperto Ínfero");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após conjurar 4 habilidades, Malzahar invoca um Voidling incontrolável para atacar unidades inimigas por 21 segundos. Voidlings têm 200 + 50 x nv. de Vida e 20 + 5 x nv. de Dano de Ataque.\n" +
                    "\n" +
                    "Voidlings crescem após 7 segundos (+50% de Dano de Ataque/Armadura), e entram em Frenesi após 14 segundos (+100% de Velocidade de Ataque).");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Malzahar abre dois portais para o Vazio. Após um curto intervalo, eles disparam projéteis que causam 80/135/190/245/300 (+80% de Poder de Habilidade) de Dano Mágico e silenciam campeões por 1.4/1.8/2.2/2.6/3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Malzahar cria uma zona de energia negativa por 5 segundos. A zona causa dano a inimigos próximos em 4/4.5/5/5.5/6% (+[1% de Poder de Habilidade]%) de sua Vida máxima a cada segundo (dano contra monstros é limitado em 120 de dano por segundo).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Malzahar infecta a mente de seu alvo, causando 80/140/200/260/320 (+80% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos.Se o alvo morrer durante esse período, as visões passam para um inimigo próximo e Malzahar recebe 10/14/18/22/26 de Mana.Os Voidlings de Malzahar são atraídos pelas unidades afetadas.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Malzahar canaliza a essência do Vazio para suprimir o campeão alvo, causando 250/400/550 (+130% de Poder de Habilidade) de Dano Mágico ao longo de 2,5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.malzaharp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.malzaharq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.malzaharw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.malzahare);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.malzaharr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Malzahar");
  /* ************************************************************************************************************************************************************ */

            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Seiva Mágica");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Esmagamento Arcano");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Avanço Retorcido");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Atirar Mudas");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Turbilhão Vingativo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Cada vez que um feitiço é lançado próximo a Maokai, ele extrai energia disso, recebendo uma carga de Seiva Mágica. Ao acumular 5 cargas, o seu próximo ataque básico o curará em um percentual de sua Vida máxima.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Maokai desfere uma onda de choque arcana. Inimigos próximos são arremessados para trás e todos os inimigos afetados recebem 70/115/160/205/250 (+40% de Poder de Habilidade) de Dano Mágico e 20/27/34/41/48% de Lentidão por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Maokai se transforma em uma nuvem de energia arcana que se desloca rapidamente na direção de um inimigo alvo, o enraíza por 1/1.25/1.5/1.75/2 segundo(s) e causa 9/10/11/12/13 (+3% de Poder de Habilidade)% da Vida máxima do alvo como Dano Mágico (máx.: 300 a tropas e monstros).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Maokai arremessa uma muda que causa 40/60/80/100/120 (+40% de Poder de Habilidade) de Dano Mágico ao impacto.A muda concede visão da área ao seu redor, e perseguirá inimigos que se aproximarem, explodindo para causar 80/120/160/200/240 (+60% de Poder de Habilidade) de Dano Mágico e 50% de Lentidão por 1 segundo(s) a inimigos atingidos. As mudas têm duração de 40/45/50/55/60 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Alternar: Maokai cria um vórtice mágico que protege a si mesmo e a campeões aliados, reduzindo o dano que não seja proveniente de torres em 20% por até 10 segundos.Maokai pode encerrar o efeito para liberar a energia acumulada, causando 100/150/200 (+50% de Poder de Habilidade) (+2 por dano absorvido) de Dano Mágico a inimigos dentro do vórtice. Maokai pode armazenar até 100/150/200 de dano adicional.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.maokaip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.maokaiq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.maokaiw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.maokaie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.maokair);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Maokai");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Ataque Duplo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ataque Alpha");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Meditar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Estilo Wuju");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Highlander");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A cada certo número de ataques, Master Yi dá um ataque duplo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Master Yi se teleporta para atingir até 4 inimigos, causando 25/60/95/130/165(+100% de Dano de Ataque) de Dano Físico para cada um deles e 75/100/125/150/175 de dano adicional a tropas e monstros, enquanto se torna inalvejável.Ataque Alpha pode ter Acerto Crítico, causando 60% de Dano de Ataque de Dano Físico adicional. Ataques básicos reduzem o Tempo de Recarga de Ataque Alpha em 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Master Yi se concentra, restaurando 30/50/70/90/110 (+15% de Poder de Habilidade) de Vida por segundo ao longo de 4 segundos. Esta cura aumenta em 1% para cada 1% de Vida perdida por Master Yi.Enquanto se concentra, Master Yi reduz o dano recebido em 50/55/60/65/70%. A redução desta magia é cortada pela metade contra torres.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Concede 10% (+0) de Dano de Ataque.\n" +
                    "Ativo: Ataques básicos causam 12/19/26/33/40 (+10/12.5/15/17.5/20% de Dano de Ataque) de Dano Verdadeiro adicional por 5 segundos. Em seguida, o bônus passivo é perdido enquanto Estilo Wuju estiver em Tempo de Recarga.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Abates e assistências em campeões reduzem o restante do Tempo de Recarga das habilidades de Master Yi em 70%.\n" +
                    "Ativo: Aumenta a Velocidade de Movimento em 25/35/45%, a Velocidade de Ataque em 30/55/80% e concede imunidade a todos os efeitos de Lentidão por 10 segundos. Enquanto ativo, abates e assistências em campeões estendem a duração de Highlander em 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.masteryip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.masteryiq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.masteryiw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.masteryie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.masteryir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Master Yi");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Batida do Amor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Dois por Um");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Desfilando");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Chuva de Disparos");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Metendo Bala");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Miss Fortune causa Dano Físico adicional sempre que ataca um novo alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Miss Fortune faz um disparo ricocheteante através de um inimigo, causando 20/35/50/65/80 (+0) (+35% de Poder de Habilidade) de Dano Físico ao primeiro alvo e 40/70/100/130/160 (+0) (+50% de Poder de Habilidade) de dano ao segundo. Ambos aplicam efeitos de contato.Se o primeiro disparo abater o alvo, o segundo causa 50% de dano adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Após 5 segundos sem receber dano direto, Miss Fortune recebe 25 de Velocidade de Movimento. Após outros 5 segundos, esse efeito aumenta para 60/70/80/90/100.\n" +
                    "Ativo: Ativa a Velocidade de Movimento total de Desfilando e concede 40/55/70/85/100% de Velocidade de Ataque por 3 segundos.Batidas do Amor prolongam a duração do efeito de Velocidade de Ataque em 1 segundo(s) (o efeito é dobrado contra campeões).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Miss Fortune revela uma área, fazendo chover disparos que causam 80/115/150/185/220 (+80% de Poder de Habilidade) de Dano Mágico ao longo de 2 segundos reduzindo a velocidade dos inimigos atingidos em 28/36/44/52/60%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Miss Fortune canaliza uma barragem de disparos por 3 segundos, causando (+35% de Dano de Ataque Bônus) (+20% de Poder de Habilidade) de Dano Físico por onda (12/14/16 ondas no total).Metendo Bala pode causar Acerto Crítico com [0]% de dano.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.missfortunep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.missfortuneq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.missfortunew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.missfortunee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.missfortuner);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Miss Fortune");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Iron Man");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Mace of Spades");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Harversters of Sorrow");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Siphon of Destruction");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Children of the Grave");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Um percentual do dano causado com habilidades é convertido em um escudo temporário, absorvendo o dano recebido.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Os próximos três golpes de Mordekaiser são fortalecidos. Os dois primeiros causam 10/20/30/40/50 (+165% de Dano de Ataque Bônus) (+100% de Dano de Ataque Bônus) de Dano Mágico adicional. O golpe final causa 2 vezes o dano adicional dos golpes anteriores, até 0 (+0) (+0).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Mordekaiser recebe experiência adicional por abater tropas próximas a aliados (50% da experiência perdida pelo compartilhamento).\n" +
                    "Experiência adicional recebida: 0\nAtivo:\n" +
                    "Alveja um campeão aliado, vinculando-o a Mordekaiser:Ambos recebem até 75 de Velocidade de Movimento quando andam um em direção ao outro.Quando se encostam, eles causam 140/180/220/260/300 (+90% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos a inimigos próximos.Reative para que ambos roubem instantaneamente 50/85/120/155/190 (+30% de Poder de Habilidade) de Vida de inimigos próximos (25% de cura das tropas, máx. de 2 unidades; causa Dano Mágico).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Mordekaiser causa 35/65/95/125/155 (+60% de Dano de Ataque) (+60% de Dano de Ataque) de Dano Mágico em área de cone.Para cada campeão atingido, ele recebe 15/17.5/20/22.5/25% de escudo máximo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo - Dragon Force: Causar dano ao Dragão o amaldiçoará por 10 segundos.\n" +
                    "Ativo: Amaldiçoa o campeão alvo e rouba 25/30/35 (+4% de Poder de Habilidade)% de sua Vida (25% no início, 75% ao longo de 10 segundos; causa Dano Mágico).\n" +
                    "Efeito de Maldição: Quando abatida pela equipe de Mordekaiser, a alma Amaldiçoada da unidade o seguirá por 45/60/75 segundos.Mordekaiser recebe 30% de seu Poder de Habilidade e 25% de sua Vida adicional.O fantasma recebe (+0) de Dano de Ataque e (+0) de Vida.O fantasma pode ser controlado segurando-se a tecla Alt em conjunto com o botão direito do mouse ou reativando esta habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.mordekaiserp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.mordekaiserq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.mordekaiserw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.mordekaisere);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.mordekaiserr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Mordekaiser");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Sifão da Alma");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ligação das Trevas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Solo Atormentado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Escudo Negro");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Grilhões da Alma");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Morgana tem Vampirismo Mágico, curando-se sempre que causa dano com suas habilidades.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Faz um disparo de energia das trevas, enraizando o primeiro inimigo atingido por 2/2.25/2.5/2.75/3 segundos e causando-lhe 80/135/190/245/300 (+90% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Amaldiçoa uma área por 5 segundos. Inimigos no terreno amaldiçoado recebemde 16/32/48/64/80 (+22% de Poder de Habilidade) a 24/48/72/96/120 (+33% de Poder de Habilidade) de Dano Mágico a cada segundo, com base na Vida removida do inimigo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Protege um campeão aliado por 5 segundos. O escudo absorve 70/140/210/280/350 (+70% de Poder de Habilidade) de Dano Mágico e impede desarmes até que quebre.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Correntes sombrias se prendem a campeões inimigos próximos, causando 150/225/300 (+70% de Poder de Habilidade) de dano mágico e 20% de Lentidão por 3 segundos. Após 3 segundos, eles recebem 150/225/300 (+70% de Poder de Habilidade) de dano mágico adicional e ficam atordoados por 1.5 segundo(s).Campeões inimigos podem quebrar as correntes ao afastarem-se de Morgana.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.morganap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.morganaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.morganaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.morganae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.morganar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Morgana");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Maré Oscilante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Prisão Aquática");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Vazante e Fluxo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Bênção da Conjuradora");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Maré Violenta");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando as habilidades de Nami atingem campeões aliados, eles recebem Velocidade de Movimento por um curto período de tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Envia uma bolha em direção à área alvo, causando 75/130/185/240/295 (+50% de Poder de Habilidade) de Dano Mágico a inimigos e atordoando-os por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Desfere um jato de água que salta entre campeões aliados e inimigos, curando os aliados e causando dano aos inimigos.\n" +
                    "Ao atingir aliado: Cura 65/95/125/155/185 (+30% de Poder de Habilidade) de Vida e salta a um campeão inimigo próximo.\n" +
                    "Ao atingir inimigo: Causa 70/110/150/190/230 (+50% de Poder de Habilidade) de Dano Mágico e salta a um campeão aliado próximo.Salta somente uma vez para cada alvo, para um total de 3 alvos. A quantia de dano e de cura é modificada em -15% + (7.5% por 100 de Poder de Habilidade) a cada salto.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Fortalece um campeão aliado durante 6 segundo(s) ou 3 ataques básicos. Os ataques básicos de aliados causam 25/40/55/70/85 (+20% de Poder de Habilidade) de Dano Mágico adicional e reduzem a Velocidade de Movimento do alvo em 15/20/25/30/35% (+[5% de Poder de Habilidade]%) por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Invoca uma Maré Violenta a partir da posição da Nami. A onda lança ao ar, causa 50/60/70% de Lentidão e 150/250/350 (+60% de Poder de Habilidade) de Dano Mágico. A duração da lentidão aumenta com base na distância percorrida pela Maré Violenta, com uma duração mínima de 2 segundos e máxima de 4 segundos.Aliados atingidos pela onda recebem o dobro do efeito de Marés Oscilantes.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.namip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.namiq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.namiw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.namie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.namir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Nami");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Devorador de Almas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ataque Sifão");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Murchar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Fogo Espiritual");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Fúria das Areias");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Nasus drena a energia espiritual de seu inimigo, acumulando Roubo de Vida adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ativo: O próximo ataque básico de Nasus tem 25 de Alcance de Ataque adicional (não cumulativo com o alcance de Fúria das Areias) e causará 30/50/70/90/110 (+100% de Dano de Ataque) (+3) de Dano Físico.\n" +
                    "Passivo: O Ataque Sifão recebe, permanentemente, 3 de dano caso abata uma unidade inimiga. O valor é dobrado contra campeões, tropas grandes e monstros grandes.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Nasus envelhece o campeão alvo por 5 segundos, inicialmente reduzindo sua Velocidade de Movimento em 35% e aumentando para 47/59/71/83/95% ao longo da duração. A Velocidade de Ataque do alvo é reduzida pela metade.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Nasus desfere fogo espiritual no local alvo, causando 55/95/135/175/215 (+60% de Poder de Habilidade) de Dano Mágico inicial.Pelos próximos 5 segundos, os inimigos na área terão sua Armadura reduzida em 20/25/30/35/40 e receberão um adicional de 11/19/27/35/43 (+12% de Poder de Habilidade) de Dano Mágico por segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Nasus se fortalece dentro de uma tempestade de areia por 15 segundos, aumentando sua Vida máxima em 300/450/600 e Alcance de Ataque em 50.Enquanto a tempestade estiver ativa, ele causa 3/4/5 (+1% de Poder de Habilidade)% da Vida máxima dos inimigos próximos a cada segundo (240 de dano máx. por segundo) em Dano Mágico e a converte em Dano de Ataque adicional.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.nasusp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.nasusq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.nasusw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.nasuse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.nasusr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Nasus");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Âncora Impactante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Lançar Âncora");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ira do Titã");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Correnteza");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Carga de Profundidade");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques básicos de Nautilus causam Dano Físico adicional e imobilizam seus alvos. Este efeito não pode ocorrer mais de uma vez em determinado período de tempo no mesmo alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Nautilus arremessa sua âncora. Se ela atingir uma unidade inimiga, Nautilus arrasta o alvo e a si mesmo e se juntam causando 60/105/150/195/240 (+75% de Poder de Habilidade) de Dano Mágico e atordoando o inimigo brevemente.Se a âncora atingir o terreno, Nautilus arrastará a si mesmo ao local e a recarga é reduzida em 50% (0.5).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Nautilus envolve a si mesmo com energia negra por 10 segundos, protegendo-o dos próximos 65/70/75/80/85 (+10% de Vida Bônus) (9/11/13/15/17% de sua Vida máxima) de dano.Enquanto o escudo persistir, os ataques básicos de Nautilus causam 30/40/50/60/70 (+40% de Poder de Habilidade) de Dano Mágico adicional ao longo de 2 segundos a todas as unidades ao redor de seu alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Nautilus golpeia o chão, fazendo com que o terreno ao seu redor exploda. Cada explosão causa 55/85/115/145/175 (+30% de Poder de Habilidade) de Dano Mágico a unidades na área, e reduz sua Velocidade de Movimento em 30/35/40/45/50% por 1.25 segundos. Esta lentidão é reduzida ao longo do tempo.Uma unidade pode ser atingida por mais de uma explosão, mas receberá 50% a menos de dano de explosões adicionais.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Nautilus dispara uma onda de choque que perseguirá um campeão inimigo. Isto causará 125/175/225 (+40% de Poder de Habilidade) de Dano Mágico aos inimigos que passarem por ela, além de serem lançados ao ar.A onda de choque explode ao atingir seu alvo, causando 200/325/450 (+80% de Poder de Habilidade) de Dano Mágico, lançando-o pelo ar e atordoando-o por 1/1.5/2 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.nautilusp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.nautilusq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.nautilusw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.nautiluse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.nautilusr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Nautilus");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Espreitar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Arremessar Lança / Bote");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Arapuca / Investida");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Ímpeto Selvagem / Patada");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Aspecto do Puma");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Atingir campeões ou monstros com Arremessar Lança e Arapuca aciona uma Caçada, revelando-os por 4 segundos. Durante esse tempo, Nidalee recebe 10% de Velocidade de Movimento (aumentando para 30% em direção ao alvo Caçado) e o primeiro uso de Bote ou Investida contra o alvo é aprimorado.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Humana: Nidalee arremessa sua lança, causando 60/77.5/95/112.5/130 (+40% de Poder de Habilidade) de Dano Mágico. Caso exceda o alcance de um ataque básico, ela causa mais dano com base na distância percorrida, até um potencial de 180/232.5/285/337.5/390 (+120% de Poder de Habilidade) de dano total.\n" +
                    "Puma: O próximo ataque de Nidalee causa dano adicional, aumentando drasticamente em alvos de Vida baixa.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Humana: Nidalee posiciona uma armadilha de Arapuca, com duração de 2 minutos. Quando ativada por um inimigo, ele é revelado e recebe 40/80/120/160/200 (+20% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos.\n" +
                    "Puma: Nidalee avança com um salto no local alvo, causando dano a inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Humana: Nidalee cura um campeão aliado em 45/85/125/165/205 (+50% de Poder de Habilidade) e concede-lhe 20/30/40/50/60% de Velocidade de Ataque por 7 segundos.\n" +
                    "Puma: Nidalee ataca os inimigos na direção alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Humana: Nidalee transforma-se em puma, e suas habilidades básicas tornam-se Bote, Investida, e Patada.\n" +
                    "Puma: Nidalee transforma-se novamente em humana. Enquanto em forma humana, ativar uma Caçada zera o Tempo de Recarga de Aspecto do Puma.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.nidaleep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.nidaleeq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.nidaleew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.nidaleee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.nidaleer);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Nidalee");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Lâminas Sombrias");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Portador do Anoitecer");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Proteção das Trevas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Horror Indescritível");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Paranoia");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques básicos de Nocturne reduzem seu Tempo de Recarga em 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Nocturne lança uma lâmina de sombras que causa 60/105/150/195/240 (+75% de Dano de Ataque Bônus) de Dano Físico e deixa um Rastro do Crepúsculo por 5 segundo(s). Campeões inimigos atingidos também deixam um Rastro do Crepúsculo.Enquanto estiver no rastro, Nocturne ignora colisão com unidades e recebe 15/20/25/30/35% de Velocidade de Movimento e 15/25/35/45/55 de Dano de Ataque.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Nocturne está com 20/25/30/35/40% de Velocidade de Ataque adicional.\n" +
                    "Ativo: Nocturne cria uma barreira mágica por 1,5 segundo, que bloqueia a próxima habilidade inimiga.Se uma habilidade for bloqueada pela barreira, a Velocidade de Ataque adicional passiva de Nocturne é dobrado por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passiva: Nocturne recebe aumento massivo de Velocidade de Movimento em direção a inimigos aterrorizados.\n" +
                    "Ativo: Nocturne coloca um pesadelo na mente de seu alvo, causando 80/125/170/215/260(+100% de Poder de Habilidade) de Dano Mágico durante 2 segundos. Caso Nocturne se mantenha no alcance do alvo pela duração completa, o alvo fica aterrorizado durante 1/1.25/1.5/1.75/2 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Nocturne reduz o raio de visão de todos os campeões inimigos e remove a visão de seus aliados por 4 segundos.Enquanto Paranoia estiver ativa, Nocturne pode lançar a si mesmo em um campeão inimigo, causando 150/250/350 (+120% de Dano de Ataque Bônus) de Dano Físico.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.nocturnep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.nocturneq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.nocturnew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.nocturnee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.nocturner);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Nocturne");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Visionário");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Consumir");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ferver o Sangue");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Explosão de Gelo");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Zero Absoluto");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Nunu pode lançar feitiços gratuitamente após 5 ataques.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ordena o yeti a morder uma tropa ou monstro, causando 400/550/700/850/1000 de Dano Verdadeiro ao alvo e curando a si mesmo com 70/115/160/205/250 (+75% de Poder de Habilidade).Nunu recebe bônus por 120/150/180/210/240 segundos com base no que consumiu.\n" +
                    "Elementais: Aumento no Tamanho e [0]% de Vida máxima. Animais ou Mortos-Vivos:\n" +
                    "Abater uma unidade concede [0]% de Velocidade de Movimento por 3 segundos\nOutros monstros: Os ataques e habilidades de Nunu causam um adicional de [0]% da sua Vida máxima como Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "A temperatura do sangue de Nunu e do aliado alvo sobem, aumentando a Velocidade de Movimento em 8/9/10/11/12% e a Velocidade de Ataque em 25/30/35/40/45% por 12 segundos.Se Nunu alvejar a si mesmo, Ferver o Sangue tentará alvejar o campeão aliado mais próximo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Nunu arremessa uma bola de gelo em uma unidade inimiga, causando 80/120/160/200/240 (+90% de Poder de Habilidade) de Dano Mágico, reduz sua Velocidade de Movimento em 40/45/50/55/60% e sua Velocidade de Ataque em 25% por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Nunu absorve o calor da área, canalizando por até 3 segundos, reduzindo a Velocidade de Movimento dos inimigos ao seu redor em 50% e a Velocidade de Ataque em 25%.Quando a canalização acaba, inimigos que permaneceram na área recebem até 625/875/1125 (+250% de Poder de Habilidade) de Dano Mágico, dependendo do tempo de canalização da habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.nunup);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.nunuq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.nunuw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.nunue);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.nunur);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Nunu");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Fúria Berserker");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ressaca");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Golpes Nefastos");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Balanço Temerário");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ragnarok");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A Velocidade de Ataque de Olaf é aumentada em 1% para cada 1% de Vida removida.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Olaf arremessa um machado ao local alvo, causando 70/115/160/205/250 (+100% de Dano de Ataque Bônus) de Dano Físico e 29/33/37/41/45% de redução na Velocidade de Movimento por 2.5 segundos a unidades que atravessa. Quanto mais longe chegar o machado, mais longo será o seu efeito; sendo sempre superior a 1.5 segundo.Se Olaf apanhar o machado, o Tempo de Recarga da habilidade é reduzido em 4,5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Por 6 segundos, Olaf recebe 9/12/15/18/21% de Roubo de Vida e sua Velocidade de Ataque é aumentada em 40/50/60/70/80%.Durante esse tempo, Olaf também recebe 1% de aumento na cura de todas as origens para cada 2% de Vida removida.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Olaf movimenta ferozmente seus machados, causando 70/115/160/205/250 (+40% de Dano de Ataque) de Dano Verdadeiro a seu alvo. O custo da habilidade é igual a 30% do dano total causado, mas o custo é restituído se o alvo for abatido.Ataques básicos reduzem o Tempo de Recarga de Balanço Temerário em 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Olaf recebe 10/20/30 de Armadura e 10/20/30 de Resistência Mágica.\n" +
                    "Ativo: Olaf remove todos os efeitos debilitantes de si mesmo e se torna imune a eles pelos próximos 6 segundos. Olaf também recebe 50/60/70% de Velocidade de Movimento adicional em direção a campeões inimigos por 1 segundo. Durante este período, Olaf perde o efeito passivo de Ragnarok e recebe 40/60/80 de Dano de Ataque.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.olafp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.olafq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.olafw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.olafe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.olafr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Olaf");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Dando Corda");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Comando: Atacar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Comando: Dissonância");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Comando: Proteger");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Comando: Onda de Choque");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "O Ataque Básico de Orianna causa Dano Mágico adicional. Este dano aumenta quanto mais Orianna atacar o mesmo alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Orianna comanda sua Esfera para avançar no local alvo, causando 60/90/120/150/180 (+50% de Poder de Habilidade) de Dano Mágico a alvos ao longo do trajeto. Contudo, ela causa 10% a menos de dano para cada unidade que atingir (mín.: 40%).Sua Esfera permanece no local alvo após o comando.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Orianna comanda sua Esfera para que desfira um pulso elétrico, causando 70/115/160/205/250 (+70% de Poder de Habilidade) de Dano Mágico a inimigos próximos.O pulso deixa para trás um campo de energia por 3 segundos, reduzindo a Velocidade de Movimento de inimigos em 20/25/30/35/40% e aumentando a Velocidade de Movimento de aliados em 20/25/30/35/40% por 2 segundos. O efeito é reduzido ao longo do tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: A Esfera adiciona 10/15/20/25/30 de Armadura e de Resistência Mágica ao Campeão aliado a que estiver presa.\n" +
                    "Ativo: Orianna comanda sua Esfera para que se desloque e se prenda a um Campeão aliado, protegendo-o por 4 segundos contra 80/120/160/200/240 (+40% de Poder de Habilidade) de dano.\n" +
                    "Inimigos pelos quais a Esfera atravessar em seu trajeto recebem 75% do valor do escudo como dano: 60/90/120/150/180 (+30% de Poder de Habilidade).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Orianna comanda sua Esfera para que desfira uma onda de choque após um breve intervalo, causando 150/225/300 (+70% de Poder de Habilidade) de Dano Mágico a inimigos próximos e lançando-os ao ar em uma distância predefinida, na direção da Esfera.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.oriannap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.oriannaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.oriannaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.oriannae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.oriannar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Orianna");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Proteção de Égide");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Atirar Lança");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Égide de Zeonia");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Ataque Busca-Coração");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Grande Estocada Aérea");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após atacar ou lançar feitiços 4 vezes, Pantheon bloqueará o próximo ataque de torre ou ataque básico lançado.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Pantheon arremessa sua lança em um oponente, causando 65/105/145/185/225 (+140% de Dano de Ataque Bônus) de Dano Físico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Pantheon salta no campeão inimigo, tropa inimiga ou monstro neutro, causando 50/75/100/125/150 (+100% de Poder de Habilidade) de Dano Mágico e 1 segundo(s) de atordoamento. Pantheon também zera instantaneamente sua Proteção de Égide.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Os ataques básicos e Atirar Lança de Pantheon recebem 100% de Chance de Acerto Crítico contra alvos abaixo de 15% de Vida.\n" +
                    "Ativo: Pantheon se concentra e desfere 3 ataques velozes à sua frente, com um total de 80/130/180/230/280 (+300% de Dano de Ataque Bônus) de Dano Físico (causa 60% de dano a tropas e monstros).\n" +
                    "Dano por acerto: 60% de Dano de Ataque Bônus");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Pantheon acumula toda a sua força e salta em direção ao céu, aterrissando na área alvo alguns segundos depois. Causa até 400/700/1000 (+100% de Poder de Habilidade) de Dano Mágico a unidades no centro (reduzindo até 50% próximo à borda) e reduz sua Velocidade de Movimento em 35% por 1 segundo.Se Pantheon cancelar esta canalização, a Grande Estocada Aérea é colocada em um Tempo de Recarga de 30 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.pantheonp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.pantheonq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.pantheonw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.pantheone);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.pantheonr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Pantheon");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Embaixadora de Ferro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Choque do Martelo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Presença Inabalável");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Investida Heróica");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Veredito da Guardiã");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Poppy arremessa seu broquel, recebendo alcance de ataque e Dano Mágico adicional.\n" +
                    "\n" +
                    "O broquel aterrissa em um local próximo e Poppy pode apanhá-lo para receber um escudo. Inimigos podem pisar no broquel para destruí-lo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Poppy golpeia o chão, causando 40/65/90/115/140 (+80% de Dano de Ataque Bônus) mais 6% da Vida máxima dos inimigos como Dano Físico e deixando a área instável.A área reduz a velocidade de inimigos dentro dela em 20/25/30/35/40% e uma erupção ocorre após 1 segundo, causando o dano inicial novamente.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Poppy recebe 0 de Armadura e 0 de Resistência Mágica (12% da Armadura e da Resistência Mágica). Esse efeito é dobrado se Poppy estiver com menos de 40% de Vida.\n" +
                    "Ativo: Pelos próximos 2.5 segundos, Poppy recebe 27/29/31/33/35% de Velocidade de Movimento. Enquanto Presença Inabalável estiver ativa, ela interrompe avanços rápidos de inimigos em uma área ao seu redor, causando 70/110/150/190/230 (+70% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Poppy dá um encontrão em um inimigo, causando 50/70/90/110/130 (+50% de Dano de Ataque Bônus) de Dano Físico e os carrega consigo. Se Poppy carregar o alvo contra um terreno, o inimigo recebe 50/70/90/110/130 (+50% de Dano de Ataque Bônus) de Dano Físico adicional e é atordoado por 1.6/1.7/1.8/1.9/2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Poppy canaliza um golpe com o martelo que empurra inimigos para muito longe.\n" +
                    "Primeira conjuração: Poppy canaliza por até 4 segundos, reduzindo a própria velocidade em 15%.\n" +
                    "Segunda conjuração: Poppy golpeia o chão, emanando uma onda de choque que causa 200/300/400 (+90% de Dano de Ataque Bônus) de Dano Físico a inimigos ao redor do primeiro campeão atingido e arremessando-os por uma grande distância em direção à sua plataforma de invocação. O comprimento e a distância do empurrão da onda de choque aumentam com a duração da canalização.Inimigos ficam inalvejáveis enquanto estiverem em deslocamento.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.poppyp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.poppyq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.poppyw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.poppye);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.poppyr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Poppy");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Rapina");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Investida Anuviante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Sentidos Apurados");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Salto");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Retaguarda do Inimigo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Valor periodicamente marca inimigos como Vulneráveis. O primeiro ataque básico de Quinn contra alvos Vulneráveis causará Dano Físico adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Valor voa em linha reta, marcando o primeiro inimigo que atingir como Vulnerável e reduzindo drasticamente seu raio de visão por 1.5 segundos. Em seguida, Valor causa 20/45/70/95/120 (+0) (+50% de Poder de Habilidade) de Dano Físico a todos os inimigos próximos.Se o primeiro alvo não for um campeão, ele não poderá atacar por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Atacar um alvo Vulnerável aumenta a Velocidade de Ataque e de Movimento em 20/25/30/35/40% por 2 segundos.\n" +
                    "Ativo: Valor revela uma grande área próxima por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Quinn avança em direção a um inimigo, causando 40/70/100/130/160 (+20% de Dano de Ataque Bônus) de Dano Físico enquanto Valor o marca como Vulnerável.Ao alcançar seu alvo, Quinn salta dele, movimentando-o brevemente e reduzindo sua Velocidade de Movimento em 50% (que decai ao longo de 1.5 segundos).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Quinn e Valor se agrupam para voar em alta velocidade.\n" +
                    "Quinn chama Valor para ajudá-la. Após uma canalização de 2 segundos, eles se unem, recebendo 70/100/130% de Velocidade de Movimento total e a capacidade de conjurar Bombardeio ao encerrar Retaguarda do Inimigo ou ao realizar uma ação de ataque.Receber dano de torres ou campeões coloca Retaguarda do Inimigo em um Tempo de Recarga de 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.quinnp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.quinnq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.quinnw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.quinne);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.quinnr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Quinn");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Casco Espetado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Bola do Poder");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Bola Curva Defensiva");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Provocação Perfurante");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Tremores");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Rammus recebe dano adicional conforme sua carapaça fica reforçada, convertendo 25% de sua Armadura em Dano de Ataque.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Rammus acelera em forma de bola ao longo de 7 segundos em direção a seus inimigos, causando 100/150/200/250/300 (+100% de Poder de Habilidade) de Dano Mágico a inimigos ao impacto, jogando-os para trás e reduzindo a Velocidade de Movimento deles em 20/25/30/35/40% por 2 segundos.Ativar Bola Curva Defensiva removerá este efeito após 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Rammus entra em formação de defesa por 6 segundos, aumentando sua Armadura e Resistência Mágica em 40/60/80/100/120 e refletindo 25/35/45/55/65 (+10% de Armadura) de Dano Mágico aos atacantes.Esta habilidade recebe dano igual a 10% da Armadura.Ativar Bola do Poder remove este efeito por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Rammus prova o campeão ou monstro inimigo para que faça um ataque imprudente, reduzindo sua Armadura em 5/10/15/20/25 e forçando-o a atacar Rammus por 1.25/1.5/1.75/2/2.25 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Rammus cria tremores debaixo de si, causando 65/130/195 (+30% de Poder de Habilidade) de Dano Mágico por segundo a unidades e estruturas próximas por 8 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.rammusp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.rammusq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.rammusw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.rammuse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.rammusr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Rammus");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Fúria dos Xer'Sai");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ira da Rainha / Sondar Presas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Escavar / Emergir");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Mordida Feroz / Túnel");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Investida do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Enquanto estiver emergida, os ataques básicos e habilidades de Rek'Sai geram Fúria. Quando escava, Rek'Sai consome Fúria para curar a si mesma.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Emergida: Os 3 próximos ataques dentre 5 segundos causam 15/25/35/45/55 (+20% de Dano de Ataque Bônus) de Dano Físico adicional a inimigos próximos.\n" +
                    "Enterrada: Rek'Sai lança um pulso de terreno carregado com o Vazio que explode na primeira unidade atingida, causando 60/90/120/150/180 (+70% de Poder de Habilidade) de Dano Mágico e revelando os inimigos não-invisíveis atingidos por 2.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Emergida: Escava o chão.\n" +
                    "Escavada: Emerge, causando 40/80/120/160/200 (+40% de Dano de Ataque Bônus) de Dano Físico e arremessando ao ar os inimigos próximos por até 1 segundo com base na proximidade que estiverem de Rek'Sai. Uma unidade não pode ser atingida por Emergir mais que uma vez a cada 10/9.5/9/8.5/8 segundos.\n" +
                    "Efeitos de Enterrada: Novas habilidades, +0 de Velocidade de Movimento, raio de visibilidade reduzido, ataques automáticos desativados e recebe Sentido Sísmico: Inimigos próximos que moverem-se na névoa de guerra terão sua posição reveladas para Rek'Sai e seus aliados.\n");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Emergida: Rek'Sai morde um alvo, causando 0 de Dano Físico, aumentando em até 100% com o máximo de Fúria. Se Rek'Sai tiver 100 de Fúria, Mordida Feroz causa Dano Verdadeiro.\n" +
                    "Dano máximo: 0Enterrada: Rek'Sai avança pelo túnel, deixando duas Entradas de Túnel conectadas. Clicar em uma delas fará com que Rek'Sai mergulhe em direção à outra entrada.Entradas de Túnel duram 10 minutos e podem ser destruídas por inimigos. Rek'Sai pode ter 8 túneis simultâneos. Túneis tem 10/9/8/7/6 segundo(s) de Tempo de Recarga ao usar.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Concede 20/40/60% de Velocidade de Ataque.\n" +
                    "Ativo: Após canalizar por 1,5 segundo, Rek'Sai fica inalvejável enquanto desloca-se até a Entrada de Túnel alvo. Receber dano de um campeão ou torre interromperá a canalização.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.reksaip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.reksaiq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.reksaiw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.reksaie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.reksair);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Reksai");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Domínio da Ira");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Abater os Indefesos");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Predador Desumano");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Fatiar e Picar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Dominus");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Renekton ganha Fúria para cada ataque básico que ele faz. Esta Fúria pode fortalecer suas habilidades com efeitos adicionais. Adicionalmente, Renekton ganha Fúria adicional quando estiver com a Vida baixa.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Renekton brande sua arma, causando 60/90/120/150/180 (+80% de Dano de Ataque Bônus) de Dano Físico a inimigos próximos, curando a si mesmo com 3/4.5/6/7.5/9 (+80% de Dano de Ataque Bônus) de Vida para cada não-Campeão atingido e 120% de Dano de Ataque Bônus (+0) de Vida para cada Campeão atingido.\n" +
                    "Total máximo de Vida: 50/75/100/125/150.Ele gera 2,5 de Fúria para cada não-Campeão atingido e 10 de Fúria para cada Campeão atingido.\n" +
                    "Total máximo de Fúria: 30.\n" +
                    "Efeito de 50 de Fúria: O dano é aumentado para 90/135/180/225/270 (+120% de Dano de Ataque Bônus). A cura é aumentada para 9/13.5/18/22.5/27 (+0) por não-Campeão e 0 (+0) por Campeão, até um máximo de 150/225/300/375/450. Deixa de gerar Fúria.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "O próximo ataque de Renekton acerta duas vezes, atordoando seu alvo por 0.75 segundos e causando 5/15/25/35/45 (+150% de Dano de Ataque) de Dano Físico por acerto (10/30/50/70/90 (+225% de Dano de Ataque) de dano total).Cada acerto aplica efeitos de contato e gera Fúria. Renekton gera 10 de Fúria adicional por atingir um campeão.\n" +
                    "50 de Fúria adicional: Renekton ataca três vezes, atordoando seu alvo por 1.5 segundos e causando um total de 15/45/75/105/135 (+0) de dano. Deixa de gerar Fúria.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Fatiar: Renekton avança em linha reta, causando 30/60/90/120/150 (+90% de Dano de Ataque Bônus) de Dano Físico. Atingir um inimigo permite conjurar Picar por 4 segundos.\n" +
                    "Picar: Renekton avança em linha reta, causando 30/60/90/120/150 (+90% de Dano de Ataque Bônus) de Dano Físico.Ele gera 2 de Fúria para cada não-Campeão atingido e 10 de Fúria para cada Campeão atingido.\n" +
                    "Total máximo de Fúria: 30.\n" +
                    "Fatiar - Efeito de 50 de Fúria: O dano é aumentado para 45/90/135/180/225 (+135% de Dano de Ataque Bônus). Inimigos atingidos têm sua Armadura reduzida em 15/20/25/30/35% por 4 segundos. Deixa de gerar Fúria.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Renekton envolve-se com energias sombrias por 15 segundos, recebendo 250/500/750 de Vida. Enquanto estiver ativo, ele causa 30/60/120 (+10% de Poder de Habilidade) de Dano Mágico a inimigos próximos e recebe 5 de Fúria por segundo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.renektonp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.renektonq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.renektonw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.renektone);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.renektonr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Renekton");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Predador Oculto");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Selvageria");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Rugido de Batalha");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Boleadeiras");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Furor da Caçada");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Enquanto estiver em um arbusto ou invisível, Rengar salta no alvo ao usar seu ataque básico.\n" +
                    "\n" +
                    "Rengar acumula 1 ponto de Ferocidade a cada habilidade que usar em inimigos. Ao chegar a 5 pontos de Ferocidade, sua próxima habilidade será fortalecida, recebendo um efeito adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O próximo ataque básico dentro de 3 segundos causa 100/105/110/115/120% (+0) do Dano de Ataque de Rengar mais 30/60/90/120/150 de Dano Físico.\n" +
                    "Efeito de Ferocidade: O próximo ataque básico dentro de 3 segundos causa 130% 1 do Dano de Ataque de Rengar mais 0 de Dano Físico e lhe concede [0]% de Velocidade de Ataque e 20% de Dano de Ataque por 5 segundos (o dano e a Velocidade de Ataque escalam com o nível de Rengar).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Causa 50/80/110/140/170 (+80% de Poder de Habilidade) de Dano Mágico a inimigos na área. A Armadura e Resistência Mágica de Rengar aumentam em 10/15/20/25/30 por 4 segundos. A Armadura e de Resistência Mágica adicionais aumentam em 50% para cada campeão inimigo atingido.\n" +
                    "Efeito de Ferocidade: Causa 0 (+80% de Poder de Habilidade) de Dano Mágico a inimigos na área, concede as defesas da habilidade normal e restaura entre 0 e 0 de Vida com base na Vida removida (valores de cura e dano escalam com o nível de Rengar).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Arremessa uma boleadeira, causando 50/100/150/200/250 (+70% de Dano de Ataque Bônus) de Dano Físico e e reduz a Velocidade de Movimento de um inimigo em 60/65/70/75/80% por 2,5 segundos. Esta lentidão é reduzida ao longo do tempo.\n" +
                    "Efeito de Ferocidade: Causa 0 (+70% de Dano de Ataque Bônus) de Dano Físico e enraíza o alvo por 1.75 segundos além da lentidão normal (o dano escala com o nível de Rengar).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Rengar fica invisível por 7 segundos após 1 segundo (adiado para até 3 segundos caso esteja recebendo dano) de atraso, e revela campeões inimigos dentre 2000/3000/4000 de alcance. Enquanto estiver invisível, Rengar recebe 15% de Velocidade de Movimento ao mover-se em direção a campeões inimigos e seu próximo ataque fará com que salte.Após sair da invisibilidade, Rengar recebe 25/35/45% de Velocidade de Movimento e gera 5 pontos de Ferocidade ao longo de 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.rengarp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.rengarq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.rengarw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.rengare);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.rengarr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Rengar");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Lâmina Rúnica");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Asas Quebradas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Explosão de Ki");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Valentia");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Lâmina do Exílio");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "As habilidades de Riven energizam sua espada, fazendo com que seus ataques básicos causem Dano Físico adicional. Sua espada pode ser carregada até três vezes e gasta uma carga por ataque.\n");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Riven avança em linha reta à sua frente. Esta habilidade pode ser reativada mais 2 vezes.\n" +
                    "1º e 2º uso: Golpeia à frente, causando 10/30/50/70/90 (+40/45/50/55/60% de Dano de Ataque) de Dano Físico a todas as unidades com que entrar em contato.\n" +
                    "3º uso: Salta em frente e atinge o chão, causando 10/30/50/70/90 (+40/45/50/55/60% de Dano de Ataque) de Dano Físico e arremessando inimigos próximos ao ar. Este salto pode cruzar terreno intransponível.Riven alvejará a unidade que o seu cursor estiver sobrepondo ou, caso não haja alvo presente, ela simplesmente atacará na direção em que estiver virada.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "A espada de Riven emite uma explosão de energia rúnica que atinge os inimigos próximos, causando 50/80/110/140/170 (+100% de Dano de Ataque Bônus) de Dano Físico e atordoando-os por 0.75 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Riven avança rapidamente na direção de seu cursor e fica protegida, bloqueando até 90/120/150/180/210 (+100% de Dano de Ataque Bônus) de dano recebido por 1,5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "A arma de Riven emana energia espiritual por 15 segundos, concedendo-lhe 20% de Dano de Ataque adicional (+20% de Dano de Ataque Bônus), aumento no alcance de seus ataques e habilidades de dano, e a capacidade de usar Golpe de Vento uma vez.\n" +
                    "Golpe de Vento: Riven dispara uma onda de choque que causa de 80/120/160 (+60% de Dano de Ataque Bônus) a 240/360/480 (+180% de Dano de Ataque Bônus) de Dano Físico em todos os inimigos atingidos, aumentando com base na Vida removida dos inimigos");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.rivenp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.rivenq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.rivenw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.rivene);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.rivenr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Riven");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Titã do Ferro Velho");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Cospe-Fogo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Escudo de Sucata");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Arpão Elétrico");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "O Equalizador");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Cada habilidade que Rumble conjura lhe dá Aquecimento. Quando Rumble chega a 50% de Aquecimento, ele entra na Zona de Perigo, concedendo efeitos adicionais a todas as suas habilidades. Quando ele chega a 100% de Aquecimento, ele começa a Sobreaquecer, concedendo dano adicional a seus ataques básicos, mas tornando-o incapaz de conjurar habilidades por alguns segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Rumble incendeia seus oponentes, causando 75/135/195/255/315 (+100% de Poder de Habilidade) de Dano Mágico em área de cone ao longo de 3 segundos. A habilidade causa metade do dano a tropas.\n" +
                    "Efeito da Zona de Perigo: Causa 50% de dano adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Rumble levanta um escudo por 2 segundos, que absorve 50/80/110/140/170 (+40% de Poder de Habilidade) de dano. Ele recebe 10/15/20/25/30% de Velocidade de Movimento adicional por 1 segundo.\n" +
                    "Bônus da Zona de Perigo: 50% de aumento na resistência do escudo e na Velocidade de Movimento.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Rumble atinge seu oponente com até 2 tasers, causando 45/70/95/120/145 (+40% de Poder de Habilidade) de Dano Mágico e aplicando uma redução cumulativa de velocidade de 15/20/25/30/35% por 2 segundos.\n" +
                    "Efeito da Zona de Perigo: Dano e percentual de redução de velocidade aumentados em 50%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Rumble lança uma fileira de mísseis que cria uma trilha flamejante por 5 segundos. Inimigos nesta área tem sua Velocidade de Movimento reduzida em 35% e recebem 130/185/240 (+30% de Poder de Habilidade) de Dano Mágico a cada segundo.Você pode controlar o posicionamento deste ataque ao clicar e arrastar seu mouse em uma linha.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.rumblep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.rumbleq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.rumblew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.rumblee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.rumbler);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Rumble");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Maestria Arcana");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Sobrecarregar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Prisão de Runa");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Fluxo de Feitiço");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Poder do Desespero");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Conjurar habilidades concede um acúmulo de Maestria Arcana.\n" +
                    "\n" +
                    "Com 5 acúmulos, Ryze fica sobrecarregado, recebendo um escudo de Mana que bloqueia dano e faz com que suas conjurações reduzam significantemente Tempo de Recarga de suas outras habilidades.\n" +
                    "\n" +
                    "As habilidades de Ryze escalam com sua Mana máxima.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Passivo: A duração da Maestria Arcana sobrecarregada aumenta para 3/3.5/4/4.5/5 segundos.\n" +
                    "Ativo: Dispara um orbe, causando 60/95/130/165/200 (+55% de Poder de Habilidade) (+0) de Dano Mágico ao primeiro alvo atingido.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Instantaneamente enraíza um alvo por 1/1.1/1.2/1.3/1.4 segundo(s), causando 80/100/120/140/160 (+40% de Poder de Habilidade) (+0) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Desfere um orbe que causa 36/52/68/84/100 (+20% de Poder de Habilidade) (+0) de Dano Mágico e reduz a Resistência Mágica de inimigos atingidos em 8/9/10/11/12% por 5 segundos, acumulando-se até 3 vezes.Após atingir, Fluxo de Feitiço salta em inimigos próximos e em Ryze (até 6 alvos secundários) antes de retornar ao alvo original. Instâncias de dano no alvo original após a primeira causam 18/26/34/42/50 (+10% de Poder de Habilidade) (+0) de dano.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Ryze recebe 10/20/30% de Redução do Tempo de Recarga.\n" +
                    "Ativo: Ryze recebe 80 de Velocidade de Movimento e 15/20/25% de Vampirismo Mágico por 6 segundos. Durante este tempo, as habilidades de Ryze causam 50% de dano adicional a inimigos próximos a seus alvos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ryzep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.ryzeq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ryzew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ryzee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.ryzer);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ryze");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Congelar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ataque do Ártico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Mangual dos Ventos Boreais");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Congelação Permanente");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Prisão Glacial");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Causar dano a um inimigo com uma habilidade ou ataque básico concede Armadura adicional e reduz efeitos de redução de movimento a Sejuani.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Avança em linha reta, arremessando ao ar os inimigos e causando 80/125/170/215/260 (+40% de Poder de Habilidade) de Dano Mágico. A investida é interrompida após arremessar um inimigo ao ar.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "O próximo ataque básico de Sejuani também atinge inimigos próximos a seu alvo. Todas as unidades atingidas recebem Dano Mágico igual a 4/4.5/5/5.5/6% (+[3% de Poder de Habilidade]%) de suas respectivas Vidas máximas. Em seguida, ela agita o mangual, causando 40/70/100/130/160 (+10% de Vida Bônus) (+60% de Poder de Habilidade) de Dano Mágico a inimigos próximos ao longo de 4 segundos.Caso essa habilidade seja reativada, Sejuani começa a agitar imediatamente seu mangual.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Habilidades e ataques básicos aplicam Congelamento a inimigos por 4 segundos.\n" +
                    "Ativo: Todos os inimigos com Congelar recebem 80/105/130/155/180 (+50% de Poder de Habilidade) de Dano Mágico e 50/55/60/65/70% de Lentidão por 1.5 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Sejuani arremessa uma boleadeira de Gelo Verdadeiro em linha reta. Se a boleadeira atingir um inimigo, ela se estilhaça, atordoando o alvo e inimigos próximos por 1.25/1.5/1.75 segundo(s). Se a boleadeira chegar ao seu alcance máximo, ela se estilhaça e causa 30% de Lentidão a inimigos próximos por 1.25/1.5/1.75 segundo(s).Todos os inimigos na área dos estilhaços recebem 150/250/350 (+80% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.sejuanip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.sejuaniq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.sejuaniw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.sejuanie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.sejuanir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Sejuani");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Apunhalar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Enganar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Caixinha Surpresa");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Veneno de Dois Gumes");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Alucinações");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Shaco causa 20% de dano adicional ao atacar uma unidade pelas costas.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Shaco se teleporta para perto e se torna invisível por 3.5 segundos.Seu próximo ataque básico dentre os próximos 6 segundos irá causar acerto crítico, causando 140/160/180/200/220% de dano (acertos críticos normais causam 200% da dano).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Shaco cria uma Caixinha Surpresa no local alvo. Ela se torna invisível após 2 segundos, e abrirá quando um inimigo se aproximar, causando temor a eles e atacando-os por 0.5/0.75/1/1.25/1.5 segundo(s).Seus ataques causam 35/50/65/80/95 (+20% de Poder de Habilidade) de Dano Mágico e ela dura 60 segundo(s) enquanto permanece invisível ou 5 segundos após ser ativada.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Enquanto Veneno de Dois Gumes estiver pronto para ser conjurado, os ataques básicos de Shaco aplicam Veneno de Dois Gumes por 2 segundos, reduzindo a Velocidade de Movimento em 10/15/20/25/30% e também reduzindo a Velocidade de Ataque em 20/22.5/25/27.5/30% se o alvo for uma tropa ou um monstro.\n" +
                    "Ativo: Causa 50/90/130/170/210 (+100% de Dano de Ataque Bônus) (+100% de Poder de Habilidade) de Dano Mágico ao inimigo alvo e aplica Veneno de Dois Gumes por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Shaco desaparece brevemente e reaparece com um clone que dura até 18 segundos. O clone causa 75% do dano de Shaco e recebe 50% de dano aumentado.Ao morrer, o clone explode, causando 300/450/600 (+100% de Poder de Habilidade) de Dano Mágico em inimigos próximos.O clone pode ser controlado segurando-se a tecla Alt em conjunto com o botão direito do mouse.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.shacop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.shacoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.shacow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.shacoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.shacor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Shaco");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Barreira de Ki");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ataque Crepúsculo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Refúgio Espiritual");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Corrida das Sombras");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Manter a União");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após conjurar uma habilidade, Shen recebe um escudo. Afetar outros escudos reduz o Tempo de Recarga desse efeito.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Shen chama por sua espada espiritual e a saca. Inimigos com os quais ela se colide têm a velocidade reduzida em 35% ao se afastarem de Shen pelos próximos 2 segundos.Os próximos 3 ataques de Shen causam 3/3.5/4/4.5/5 (+2% de Poder de Habilidade)% da Vida máxima de seu alvo como Dano Mágico adicional. Se a espada espiritual se colidiu com um campeão inimigo, tais ataques causam 5/5.5/6/6.5/7 (+2% de Poder de Habilidade)% e têm +50% de Velocidade de Ataque.Cada ataque causa 30/50/70/90/110 de Dano Mágico adicional a monstros e tropas (máx.: 75/100/125/150/175).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "A espada espiritual de Shen cria uma área defensiva por 1.75 segundos. Ataques básicos que atingiriam Shen ou um campeão aliado nessa área são bloqueados.Caso não haja nenhum campeão a se proteger na área quando ela for criada, a espada espiritual não será ativada até que alguém entre ou 2 segundos se passem.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Causar dano com Corrida das Sombras ou Ataque Crepúsculo recupera 0 de Energia.\n" +
                    "Ativo: Shen avança em uma direção, causando 50/75/100/125/150 [+0] de Dano Físico a campeões inimigos e monstros neutros em seu trajeto, provocando-os por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Shen concede um escudo a um campeão aliado alvo que absorve até 250/550/850 (+135% de Poder de Habilidade) de dano por 5 segundos. Após canalizar por 0 segundos, Shen e sua espada espiritual teleportam-se para o local do aliado.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.shenp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.shenq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.shenw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.shene);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.shenr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Shen");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Meio-dragão");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Mordida Dupla");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Combustão");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Hálito Flamejante");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Descida do Dragão");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Shyvana recebe Armadura e Resistência Mágica adicionais. Estes valores são dobrados enquanto Shyvana estiver em Forma de Dragão.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Shyvana golpeia duas vezes em seu próximo ataque, causando 0 e 80/85/90/95/100% de Dano de Ataque de Dano Físico, respectivamente, em seu primeiro e segundo ataque.Enquanto Mordida Dupla estiver em Tempo de Recarga, ataques básicos reduzem a duração restante do Tempo de Recarga em 0,5 segundos.\n" +
                    "Forma de Dragão: Mordida Dupla fere todas as unidades à frente de Shyvana.O dano do segundo acerto da Mordida Dupla é igual a 40/55/70/85/100% do Dano de Ataque de Shyvana.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Shyvana causa 20/32/45/57/70 (+20% de Dano de Ataque Bônus) de Dano Mágico por segundo a inimigos próximos, recebendo 30/35/40/45/50% de Velocidade de Movimento adicional que decai ao longo de 3 segundos.Enquanto Combustão estiver ativa, ataques básicos causam @Effect1Amount*0.25@ (+@CharBonusPhysical*0.25@) de Dano Mágico a inimigos próximos, e estendem sua duração em 1 segundo.\n" +
                    "Forma de Dragão: Combustão abrasa a terra, causando dano contínuo a inimigos que estiverem em cima dela.Combustão causa +20% de dano a monstros.Combustão tem duração máxima de 7 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Shyvana desfere uma bola de fogo que causa 60/100/140/180/220 (+60% de Poder de Habilidade) de Dano Mágico a todos os inimigos que atravessar, marcando-os por 5 segundos.Os ataques básicos de Shyvana em alvos marcados causam 2.5% de sua Vida máxima como Dano Mágico ao contato.\n" +
                    "Forma de Dragão: Hálito Flamejante envolve todas as unidades em área de cone à sua frente.O dano de contato do Hálito Flamejante contra monstros é limitado em 100 de dano por acerto.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Ativo: Shyvana transforma-se em um dragão e voa até o local alvo. Inimigos em seu caminho recebem 175/300/425 (+70% de Poder de Habilidade) de Dano Mágico e são arremessados em direção ao seu local alvo.\n" +
                    "Passivo: Shyvana gera 1/2/3 de Fúria a cada 1,5 segundo. Ataques básicos geram 2 de Fúria.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.shyvanap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.shyvanaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.shyvanaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.shyvanae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.shyvanar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Shyvana");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Bastião do Poder");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Rastro de Veneno");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Mega Adesivo");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Lançar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Poção da Insanidade");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Aumenta a Vida de Singed em 25 para cada 100 de Mana que ele possui.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Alternar: Singed deixa um rastro venenoso que causa 22/34/46/58/70 (+30% de Poder de Habilidade) de Dano Mágico por segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Singed deixa uma área pegajosa no chão por 5 segundos, causando 35/45/55/65/75% de Lentidão aos inimigos na área (com duração de 1 segundo após deixá-la).Se Singed arremessar um alvo para dentro dessa área, o alvo ficará enraizado.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Singed arremessa um inimigo sobre seus ombros, causando 50/65/80/95/110 (+75% de Poder de Habilidade) mais 6/6.5/7/7.5/8% da Vida máxima do alvo como Dano Mágico. Máx.: 300 de dano adicional contra tropas e monstros.Se o alvo que Singed arremessar aterrissar em seu Mega Adesivo, ele ficará enraizado por 1/1.25/1.5/1.75/2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Singed bebe uma potente mistura química que lhe concede 35/50/80 de Poder de Habilidade, Armadura, Resistência Mágica, Velocidade de Movimento, Regeneração de Vida e de Mana por 25 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.singedp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.singedq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.singedw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.singede);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.singedr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Singed");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "In Gloria Mori");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe Demolidor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Fornalha da Alma");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Urro do Assassino");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Investida Incontrolável");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após ser abatido, Sion reanima a si mesmo, mas sua Vida se esvai rapidamente enquanto estiver reanimado.\n" +
                    "\n" +
                    "Ele pode se mover e atacar durante esse tempo. Ele recebe 100% de Roubo de Vida, ataca com extrema rapidez e causará 10% da Vida máxima do alvo em Dano Físico ao contato. Máx.: 75% de dano adicional contra monstros.\n" +
                    "\n" +
                    "Todas suas habilidades são trocadas por Acesso Mortífero, que lhe concede Velocidade de Movimento adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Sion se prepara para um golpe forte por até 2 segundos. Ao terminar, ele causa de 20/40/60/80/100 (+60% de Dano de Ataque) a 60/120/180/240/300 (+180% de Dano de Ataque) de Dano Físico a inimigos na área (60% de dano a tropas). Inimigos atingidos sofrem Lentidão temporária.Se Sion carregar por ao menos 1 segundo, inimigos são arremessados ao ar e atordoados por 1,25 a 2,25 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Sion recebe 2 de Vida máxima sempre que abate uma unidade (10 para monstros grandes ou abates/assistências em campeões).\n" +
                    "Valor atual: 10% de máximo de VidaAtivo: Sion se protege por 30/55/80/105/130 (+40% de Poder de Habilidade) (+0) (6/7/8/9/10% de sua Vida máxima) por 6 segundos. Após 3 segundos, enquanto o escudo persiste, Sion pode reativar para causar 40/65/90/115/140 (+40% de Poder de Habilidade) mais 10/11/12/13/14% da Vida máxima do alvo como Dano Mágico a inimigos ao seu redor. Máx.: 400 de dano adicional contra tropas e monstros.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Sion dispara uma onda de choque de curto alcance, causando 70/105/140/175/210 (+40% de Poder de Habilidade) de Dano Mágico ao primeiro alvo atingido, reduzindo sua Velocidade de Movimento em 40/45/50/55/60% e sua Armadura em 20% por 2,5 segundos.Se o alvo não for um campeão, ele será arremessado para trás. Todos os inimigos que a unidade arremessada atravessar receberão 30% de dano adicional e Lentidão de 40/45/50/55/60%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Sion avança em linha reta por 8 segundos e pode desviar levemente na direção do cursor do mouse. Enquanto avança, ele é imune a todos os efeitos de controle de grupo. Reativar a habilidade cancelará o seu efeito.Ao colidir com um campeão inimigo ou com terreno, Sion causa 150/300/450 (+40% de Dano de Ataque Bônus) de Dano Físico, arremessa ao ar e atordoa inimigos em uma pequena área por 0.75 segundos. Inimigos em uma área maior recebem o mesmo dano e tem sua Velocidade de Movimento reduzida em 40/45/50% por 3 segundos.O dano aumenta para 300/600/900 (+80% de Dano de Ataque Bônus) e a duração do Atordoamento aumenta para 1.75 segundos conforme Sion percorre um trajeto maior.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.sionp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.sionq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.sionw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.sione);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.sionr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Sion");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pés Ligeiros");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Lâmina Bumerangue");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ricochete");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Escudo de Feitiço");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Na Caçada");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Sivir ganha uma pequena explosão de Velocidade de Movimento quando ela ataca um campeão inimigo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Sivir arremessa sua arma como um bumerangue, causando 25/45/65/85/105 (+70/80/90/100/110% de Dano de Ataque) (+50% de Poder de Habilidade) de Dano Físico à primeira unidade atingida e 15% de dano reduzido a cada alvo seguinte, até um mínimo de 40%.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Os próximos 3 ataques básicos de Sivir saltam em alvos próximos, causando 100% de Dano de Ataque de Dano Físico ao primeiro alvo e 60/65/70/75/80% de Dano de Ataque de Dano Físico aos alvos subsequentes.Se um determinado ataque de Ricochete causar Acerto Crítico ao primeiro alvo, todos os saltos subsequentes também serão críticos.Os alvos não podem ser atingidos mais que uma vez para cada ataque de Ricochete. Efeitos de contato são aplicados somente ao primeiro alvo de cada ataque.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Sivir cria uma barreira mágica por 1.5 segundos, bloqueando a próxima habilidade inimiga.Se uma habilidade for bloqueada pelo escudo, Sivir recupera 80/95/110/125/140 de Mana.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Sivir recebe 40/60/80% de Velocidade de Ataque enquanto Ricochete estiver ativo.\n" +
                    "Ativo: Sivir incita seus aliados por 8 segundos, concedendo inicialmente, a todos os aliados próximos, 40/50/60% de Velocidade de Movimento adicional que se reduz para 20% após os primeiros 2/3/4 segundos da duração de Na Caçada.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.sivirp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.sivirq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.sivirw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.sivire);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.sivirr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Sivir");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Espirais Cristalinas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Corte de Cristal");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Exoesqueleto Cristalino");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Fratura");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Empalar");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A presença de Skarner faz com que surjam cristais em locais predefinidos do mapa. Quando está próximo dos cristais que sua equipe possui, Skarner recebe muita Velocidade de Movimento, Velocidade de Ataque e Regeneração de Mana.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Skarner causa 80% de Dano de Ataque Bônus de Dano Físico a todos os inimigos próximos. Se uma unidade for atingida, Skarner carrega a si mesmo com Energia do Cristal por 4 segundos.Enquanto Skarner estiver carregado, Corte de Cristal causa 80% de Dano de Ataque Bônus(+30% de Poder de Habilidade) de Dano Mágico adicional.Ataques básicos reduzem o Tempo de Recarga de Corte de Cristal em 0,25 segundos (o quádruplo contra campeões).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Skarner se protege contra 0 (10/11/12/13/14% de sua Vida máxima) (+80% de Poder de Habilidade) de dano por 6 segundos. Enquanto o escudo persistir, Skarner recebe Velocidade de Movimento adicional que aumenta até 16/20/24/28/32% ao longo de 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Cristalizar inimigos com Fratura e Empalar concede Carga de Cristal pela duração do desarme e reduz o Tempo de Recarga de Fratura pela mesma quantia.\n" +
                    "Ativo: Skarner invoca uma explosão de energia cristalina, causando 40/65/90/115/140 (+20% de Poder de Habilidade) de Dano Mágico, reduzindo a velocidade dos alvos atingidos em 30/35/40/45/50% por 2.5 segundos e reduzindo a velocidade do disparo.Inimigos atingidos por Fratura são afligidos com Veneno Cristalino por 5 segundos, fazendo com que o próximo ataque básico de Skarner contra eles cause 25/35/45/55/65 de Dano Físico adicional e atordoe o alvo por 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Skarner suprime um campeão inimigo por 1.75 segundos, causando 60% de Dano de Ataque de Dano Físico mais 20/60/100 (+50% de Poder de Habilidade) de Dano Mágico. Skarner pode mover-se livremente durante este período, e arrastará sua vítima indefesa com ele. Quando o efeito acabar, o alvo de Skarner receberá a mesma quantidade de dano novamente.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.skarnerp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.skarnerq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.skarnerw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.skarnere);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.skarnerr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Skarner");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Power Chord");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Hino do Valor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ária da Perseverança");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Canção da Celeridade");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Crescendo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após conjurar 3 habilidades, o próximo ataque básico de Sona causa Dano Mágico adicional além de um efeito adicional com base na música que Sona ativou por último.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ativo: Causa 40/80/120/160/200 (+50% de Poder de Habilidade) de Dano Mágico aos dois inimigos mais próximos (prioriza campeões). Sona recebe uma aura que concede 0 (+20% de Poder de Habilidade) de Dano Mágico adicional no próximo ataque de aliados por 5 segundos. A aura de Sona dura 3 segundos e é estendida em 0.5 segundos para cada aliado que ajudar.\n" +
                    "Power Chord - Staccato: Causa 40% de dano adicional em Power Chord.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Ativo: Cura Sona e o campeão aliado próximo mais ferido em 30/50/70/90/110 (+20% de Poder de Habilidade). Essa cura aumenta em 0.5% para cada 1% de Vida perdida do alvo. Sona recebe uma aura que concede um escudo de 0 (+20% de Poder de Habilidade) por 1.5 segundo a aliados. A aura de Sona dura 3 segundos e é estendida em 0.5 segundos para cada aliado que ajudar.\n" +
                    "Power Chord - Diminuendo: Reduz o dano total de um inimigo em 20% (+[0]%) por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Ativo: Concede [0]% (+[0]%) de Velocidade de Movimento a Sona, que decai ao longo do tempo e cria uma aura de Celeridade ao seu redor e que dura 3 segundos. Tocar um aliado com a aura lhe concede [0]% (+[0]%) de Velocidade de Movimento por 1.5 segundos. Sona aumenta a duração da própria aura e a própria Velocidade de Movimento em 0.5 segundos.\n" +
                    "Power Chord - Tempo: Reduz a Velocidade de Movimento de um inimigo em 40% (+4% de Poder de Habilidade) por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Ativo: Acerta um acorde irresistível, atordoando os campeões inimigos, forçando-os a dançar por 1.5 segundos e causando 150/250/350 (+50% de Poder de Habilidade) de Dano Mágico.\n" +
                    "Passivo: Cada nível de Crescendo concede poder aprimorado às auras de Sona. Canção da Celeridade também recebe aumento em seu poder no efeito da própria Sona.+10/20/40 de Dano Mágico para Hino do Valor+10/20/40 de resistência no escudo de Ária da Perseverança +2/4/6% de Velocidade de Movimento para Canção da Celeridade");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.sonap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.sonaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.sonaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.sonae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.sonar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Sona");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Salvação");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Chamado Estelar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Infusão Astral");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Equinócio");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Desejo");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Soraka corre mais rapidamente em direção a aliados com pouca vida.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Soraka invoca uma estrela no local alvo. Inimigos que estiverem no raio da explosão recebem 70/110/150/190/230 (+35% de Poder de Habilidade) de Dano Mágico e têm a velocidade reduzida em 30/35/40/45/50% por 2 segundos.Se Chamado Estelar atingir um Campeão, Soraka recebe Rejuvenescimento por 4 segundos, o qual restaura 14/16/18/20/22 (+0) de Vida por segundo e concede 15% de Velocidade de Movimento quando não estiver movimentando-se em direção a Campeões inimigos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Restaura 80/110/140/170/200 (+60% de Poder de Habilidade) de Vida a outro Campeão aliado.Se conjurada enquanto sob efeito de Rejuvenescimento, Soraka concederá a seu alvo seus benefícios por 0 segundos.Não pode ser conjurado se Soraka estiver com menos de 5% de Vida.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Cria uma área no local alvo por 1,5 segundo, causando 70/110/150/190/230 (+40% de Poder de Habilidade) de Dano Mágico a campeões inimigos dentre o raio da conjuração. Campeões inimigos que permanecem na área são Silenciados até saírem. Quando a área desaparece, todos os campeões inimigos que permanecerem no local são enraizados por 1/1.25/1.5/1.75/2 segundo(s) e recebem 70/110/150/190/230 (+40% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Invoca poderes divinos para restaurar 150/250/350 (+55% de Poder de Habilidade) de Vida a todos os Campeões aliados. O poder de Desejo é aumentado em 50% para cada Campeão com menos de 40% de Vida.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.sorakap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.sorakaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.sorakaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.sorakae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.sorakar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Soraka");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Renovação Pútrida");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Decrepitar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Nuncamova");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Tormenta");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Bando Voraz");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Swain regenera Mana sempre que abate uma unidade. Essa quantia aumenta a cada nível.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Swain envia seu corvo para atacar um inimigo. Ao longo dos 3 próximos segundos, o alvo toma 25/40/55/70/85 (+30% de Poder de Habilidade) de Dano Mágico por segundo e sofre 20/25/30/35/40% de Lentidão.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Swain marca uma área alvo. Após um curto período, garras prendem as unidades inimigas, causando 80/120/160/200/240 (+70% de Poder de Habilidade) de Dano Mágico e imobilizando-os por 1/1.25/1.5/1.75/2 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Swain atinge seu alvo com 75/115/155/195/235 (+80% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos. Ele causa 8/11/14/17/20% de dano adicional ao alvo atingido.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Alternar: Swain transforma-se em um corvo. Durante esse tempo, até 3 corvos menores atacam inimigos próximos a cada segundos, priorizando campeões. Cada corvo causa 50/70/90 (+20% de Poder de Habilidade) de Dano Mágico e cura Swain com 75% do dano causado contra campeões e 25% contra tropas.O custo para manter Bando Voraz aumenta em 5/6/7 de Mana a cada segundo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.swainp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.swainq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.swainw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.swaine);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.swainr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Swain");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Transcender");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Esfera Negra");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Determinação");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Dispersar os Fracos");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Poder Irrestrito");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Feitiços recebem efeitos adicionais no nível máximo.\n" +
                    "\n" +
                    "Esfera Negra: Causa 15% de dano adicional a Campeões.\n" +
                    "Determinação: Aumenta a duração de Lentidão em 33%.\n" +
                    "Dispersar os Fracos: Largura de feitiços aumentada em 50%.\n" +
                    "Poder Irrestrito: Alcance aumentado em 75.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Conjura uma Esfera Negra, causando 50/95/140/185/230 (+60% de Poder de Habilidade) de Dano Mágico. A esfera permanece em seu lugar por 6 segundos e pode ser manipulada pelas outras habilidades de Syndra.Este feitiço pode ser conjurado enquanto se movimenta.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Primeira Conjuração: Apanha uma Esfera Negra ou tropa inimiga. Se nenhum alvo for selecionado, a Esfera Negra mais próxima é apanhada.\n" +
                    "Segunda Conjuração: Arremessa a Esfera Negra ou tropa inimiga. Inimigos atingidos sofrem 80/120/160/200/240 (+70% de Poder de Habilidade) de Dano Mágico e Lentidão de 25/30/35/40/45% por 1.5 segundo(s).Este feitiço pode ser conjurado enquanto se movimenta.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Afasta inimigos e Esferas Negras, causando 70/115/160/205/250 (+40% de Poder de Habilidade) de Dano Mágico a eles e em quaisquer inimigos com quem se colidirem.Esferas Negras que forem afastadas atordoam inimigos em seu trajeto por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Surge do poder cataclísmico e completo de Syndra, juntando todas as Esferas Negras para causar Dano Mágico ao campeão inimigo alvo. Poder Irrestrito manipula as três Esferas Negras que orbitam Syndra, além das Esferas Negras criadas anteriormente.\n" +
                    "Dano por esfera: 90/135/180 (+20% de Poder de Habilidade).\n" +
                    "Dano mínimo total: 270/405/540 (+60% de Poder de Habilidade).");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.syndrap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.syndraq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.syndraw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.syndrae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.syndrar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Syndra");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Um Gosto Adquirido");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Língua-chicote");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Devorar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Pele Grossa");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Viagem Abissal");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Tahm Kench aplica uma carga de Um Gosto Adquirido a todos os Campeões inimigos que acertar com ataques básicos ou habilidades que causem dano. Uma vez que tenha aplicado três cargas, ele pode interagir com eles de maneira... diferente.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Causa 80/125/170/215/260 (+70% de Poder de Habilidade) de Dano Mágico ao primeiro inimigo atingido, também aplicando 30/40/50/60/70% de redução na Velocidade de Movimento por 2 segundo(s). Campeões com 3 acúmulos de Um Gosto Adquirido serão atordoados por 1.5 segundo(s).Ative Devorar enquanto sua língua estiver no meio do trajeto para devorar monstros/tropas à distância.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Devora um alvo por 4/4.5/5/5.5/6 s (metade do tempo para campeões inimigos). Inimigos recebem 20/23/26/29/32% (+[2% de Poder de Habilidade]%) de sua Vida máxima como Dano Mágico (máximo de 400/450/500/550/600 contra monstros neutros).\n" +
                    "Campeões inimigos: Exige 3 acúmulos de Um Gosto Adquirido para serem devorados. Enquanto segura um campeão inimigo, a velocidade de Tahm Kench é reduzida em 95%.\n" +
                    "Campeões aliados: Enquanto segura um campeão aliado, Tahm Kench recebe 30/35/40/45/50% de Velocidade de Movimento em direção a campeões inimigos.\n" +
                    "Tropas e monstros: Reative a habilidade para cuspi-los, causando 100/150/200/250/300 (+60% de Poder de Habilidade) de Dano Mágico aos alvos atingidos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "\n" +
                    "Pele Grossa\n" +
                    "Custo: 50 de Mana \n" +
                    "Alcance: 1\n" +
                    "Tahm Kench transforma o dano recebido em Vida cinza. Conforme ela se esvai, Tahm Kench é curado com um percentual da Vida cinza acumulada. Quando ativada, esta habilidade transforma toda a Vida cinza em um escudo.\n" +
                    "Passivo: O dano recebido enquanto esta habilidade não estiver em Tempo de Recarga é convertido em Vida cinza. Caso seja deixado em decaimento, 20/26/32/38/44% da Vida cinza é transformado em Vida.\n" +
                    "Ativo: Converte toda a sua Vida cinza em um escudo com duração de 6 segundos, mas que se esvai gradualmente ao longo do tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Passivo: Ataques básicos e habilidades que causam dano aplicam 0 (20 + 2/4/6% da Vida adicional de Tahm Kench) de Dano Mágico.\n" +
                    "Ativo: Começa a canalizar por até 15 segundos. Durante este tempo, um campeão aliado pode clicar com o botão direito em Tahm Kench para juntar-se a ele. A habilidade também pode ser reativada para fazer o trajeto sozinho. Ao reativar, ou assim que um aliado optar por entrar, Tahm se desloca até o local alvo. Receber dano de um campeão quebra a canalização.''Rapaz, o mundo é um rio e eu sou seu rei. Não há lugar que eu não possa ir e nem que eu não possa voltar.''");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.tahmkenchp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.tahmkenchq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.tahmkenchw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.tahmkenche);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.tahmkenchr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Tahm Kench");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Piedade");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Diplomacia Noxiana");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Ancinho");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Degolar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ataque das Sombras");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Talon causa 10% mais de dano com seus ataques básicos para qualquer alvo que sofrer Lentidão, atordoamento, imobilização, ou estiver suprimido.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O próximo ataque básico de Talon causa um adicional de 30/60/90/120/150 (+30% de Dano de Ataque Bônus) de Dano Físico. Se o alvo for um campeão, ele sangrará com 10/20/30/40/50 (+120% de Dano de Ataque Bônus) de Dano Físico por 6 segundo(s), revelando sua localização durante o período.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Talon lança uma saraivada de adagas que depois retornam para ele, causando 30/55/80/105/130 (+60% de Dano de Ataque Bônus) de Dano Físico cada vez que acerta um inimigo. Além disso, o inimigo sofre Lentidão de 20/25/30/35/40% por 2 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Talon teleporta-se para o lado mais distante de seu alvo, reduzindo sua Velocidade de Movimento em 99% por 0.25 segundo e amplificando o dano contra tal alvo em 3/6/9/12/15% por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Talon lança um círculo de lâminas e fica invisível por até 2.5 segundos, recebendo 40% de Velocidade de Movimento. Quando Talon volta a ficar visível, as lâminas se convergem para o local onde ele estiver. Sempre que uma das lâminas se movimenta, Ataque das Sombras causa 120/170/220 (+90% de Dano de Ataque Bônus) de Dano Físico aos inimigos que atravessar.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.talonp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.talonq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.talonw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.talone);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.talonr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Talon");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Joalheiro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Imbuir");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Despedaçar");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Deslumbrar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Resplendor");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Após conjurar uma habilidade, o próximo ataque básico de Taric causa Dano Mágico adicional com base em sua Armadura e reduz os Tempos de Recarga de suas habilidades em 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Taric resgata a força terrena para curar um aliado alvo e a si mesmo em 60/100/140/180/220 (+30% de Poder de Habilidade) (5% da Vida adicional de Taric). Caso alveje a si mesmo, a cura aumenta em 40%, restaurando 84/140/196/252/308 (+42% de Poder de Habilidade) (+7% de Vida Bônus) de Vida.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: As gemas de Taric aumentam sua Armadura em 10/15/20/25/30. Além disso, campeões aliados próximos recebem 12% de Armadura (12% da Armadura de Taric).\n" +
                    "Ativo: Taric despedaça sua armadura, causando 40/80/120/160/200 (+20% de Armadura) de Dano Mágico a inimigos próximos e reduzindo a Armadura deles em 5/10/15/20/25 (+5% de Armadura) por 4 segundos. Taric perde 10/15/20/25/30 de Armadura enquanto Despedaçar estiver em Tempo de Recarga.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Taric dispara uma esfera prismática em um inimigo alvo, atordoando-o por 1.2/1.3/1.4/1.5/1.6 segundo(s) e causando entre 40/70/100/130/160 (+20% de Poder de Habilidade) e 80/140/200/260/320 (+40% de Poder de Habilidade) de Dano Mágico. O dano de Deslumbrar aumenta quanto mais próximo Taric estiver do alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Taric bate no chão com seu martelo, causando 150/250/350 (+50% de Poder de Habilidade) de Dano Mágico nos inimigos ao redor.Pelo(s) próximo(s) 10 segundo(s), as gemas de Taric irradiam energia, concedendo a ele 30/50/70 de Dano de Ataque e Poder de Habilidade e metade deste valor aos seus aliados próximos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.taricp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.taricq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.taricw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.tarice);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.taricr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Taric");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Camuflagem");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Dardo Ofuscante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Mover Depressa");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Tiro Tóxico");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Armadilha Venenosa");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Se Teemo permanecer imóvel e não realizar qualquer ação por um curto período de tempo, ele fica invisível por tempo indefinido. Teemo pode começar a ficar invisível enquanto se movimenta por um arbusto. Ele pode se movimentar por arbustos sem quebrar a invisibilidade. Ao quebrar a invisibilidade, Teemo recebe o Elemento Surpresa, aumentando a própria Velocidade de Ataque por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Causa 80/125/170/215/260 (+80% de Poder de Habilidade) de Dano Mágico e cega o alvo por 1.5/1.75/2/2.25/2.5 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: A Velocidade de Movimento de Teemo aumenta em 10/14/18/22/26%, a menos que tenha recebido dano por um campeão ou torre inimiga nos últimos 5 segundos.\n" +
                    "Ativo: Teemo acelera, recebendo o dobro dos efeitos normais por 3 segundos. Este efeito não é perdido quando atingido.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Os ataques básicos de Teemo envenenam seu alvo, causando 10/20/30/40/50 (+30% de Poder de Habilidade) de Dano Mágico ao contato e 6/12/18/24/30 (+10% de Poder de Habilidade) de Dano Mágico por segundo durante 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Arremessa um cogumelo como armadilha que detonará caso um inimigo pise nela, espalhando veneno em inimigos próximos que reduz a Velocidade de Movimento em 30/40/50%, os revela e causa 200/325/450 (+50% de Poder de Habilidade) de Dano Mágico ao longo de 4 segundos. As armadilhas têm duração de 5 minutos e levam 1 segundo para armar e ficar invisíveis. Se uma armadilha arremessada cair em cima de outra, ela saltará até 3/4/5 Teemos de distância antes de se fixar.Teemo guarda um cogumelo a cada 0 segundos, mas só pode carregar 3 ao mesmo tempo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.teemop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.teemoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.teemow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.teemoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.teemor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Teemo");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Condenação");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Sentença");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Passagem Sombria");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Esfolar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "A Caixa");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Thresh pode colher as almas de inimigos que morrem próximos a ele, concedendo-lhe Armadura e Poder de Habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Thresh prende um inimigo, puxando-o ou saltando em direção a ele em seguida. Ele arremessa sua foice, causando 80/120/160/200/240 (+50% de Poder de Habilidade) de Dano Mágico à primeira unidade atingida e a puxa em sua direção por 1,5 segundo.O Tempo de Recarga de Sentença é reduzido em 3 segundos caso atinja um inimigo.Reative esta habilidade para puxar Thresh em direção ao inimigo preso.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Thresh cria uma lanterna protetora que um aliado pode usar para deslocar-se até ele. Thresh arremessa a Lanterna em um local. Se um aliado próximo da Lanterna clicar nela, ele a apanhará e Thresh puxará ambos em sua direção.Além disso, a Lanterna concederá (a Thresh e até um aliado próximo) um escudo com duração de 4 segundos que absorve até 60/100/140/180/220 (+40% de Poder de Habilidade) de dano.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo:Causa de Dano Mágico a cada acerto, acumulando enquanto não ataca.Este valor é igual ao total de almas coletadas mais até 80/110/140/170/200% de Dano de Ataque, com base no tempo decorrido desde seu último ataque.\n" +
                    "Ativo:Thresh desloca os inimigos próximos na direção de sua escolha. Causa 65/95/125/155/185 (+40% de Poder de Habilidade) de Dano Mágico em linha reta que inicia em sua retaguarda. Inimigos atingidos são empurrados na direção do golpe e, em seguida, sofrem redução na Velocidade de Movimento igual a 20/25/30/35/40% por 1,5 segundo.Conjure para frente para empurrar; conjure para trás para puxar.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Thresh aprisiona inimigos em paredes que causam dano e Lentidão caso seja quebrada. Ele cria uma prisão de paredes espectrais ao redor de si mesmo. Campeões inimigos que a atravessarem sofrerão 250/400/550 (+100% de Poder de Habilidade) de Dano Mágico e redução na Velocidade de Movimento de 99% por 2 segundo(s), mas quebram aquela parede. Assim que uma das paredes é quebrada, as demais não causarão dano e aplicam metade da duração de lentidão. Um inimigo não pode ser afetado por mais de uma parede simultaneamente.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.threshp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.threshq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.threshw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.threshe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.threshr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Thresh");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Tiro Certeiro");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Tiro Rápido");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Salto Foguete");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Carga Explosiva");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Tiro Destruidor");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Aumenta o alcance de ataque de Tristana conforme ela sobe de nível.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ativo: Aumenta a Velocidade de Ataque de Tristana em 30/50/70/90/110% por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Tristana lança a si mesma para o local alvo, causando 60/110/160/210/260 (+50% de Poder de Habilidade) de Dano Mágico, reduzindo também a velocidade dos inimigos ao seu redor em 60% por 1/1.5/2/2.5/3 segundos.Abates, assistências e o acumulo máximo de detonações da Carga Explosiva em campeões zeram o Tempo de Recarga do Salto Foguete.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: Inimigos explodem quando abatidos pelos ataques básicos de Tristana, causando 50/75/100/125/150 (+25% de Poder de Habilidade) de Dano Mágico a inimigos próximos.\n" +
                    "Ativo: Posiciona uma bomba em um inimigo ou torre que explode após 4 segundos, causando 60/70/80/90/100 (+0) (+50% de Poder de Habilidade) de Dano Físico. Cada ataque e habilidade carrega o dano da bomba em +30%.Com 4 cargas, a bomba explode imediatamente. O raio da detonação será duas vezes maior se usada em uma torre.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Tristana dispara uma bola de canhão gigantesca em uma unidade inimiga. Isso causa 300/400/500 (+100% de Poder de Habilidade) de Dano Mágico e empurra unidades próximas para trás em 600/800/1000 de distância.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.tristanap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.tristanaq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.tristanaw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.tristanae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.tristanar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Tristana");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Tributo do Rei");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Mordida");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Domínio Congelado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Pilar de Gelo");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Subjugar");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando uma unidade inimiga morre próxima a Trundle, ele é curado em um percentual de sua Vida máxima.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Trundle morde seu oponente em seu próximo ataque básico, causando 20/40/60/80/100 (+80/90/100/110/120% de Dano de Ataque) de Dano Físico e causando Lentidão breve a seu alvo.Esse ataque aumenta o Dano de Ataque de Trundle em 20/25/30/35/40 por 8 segundos, e seu oponente perde metade dessa quantia.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Trundle cobre o local alvo com gelo por 8 segundo(s), recebendo 20/25/30/35/40% de Velocidade de Movimento, 20/35/50/65/80% de Velocidade de Ataque e também 20% de aumento nos efeitos de cura e regeneração de todas as origens.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Trundle cria um pilar de gelo no local alvo por 6 segundo(s), tornando-o um terreno intransponível e causando 30/35/40/45/50% de Lentidão a todas as unidades inimigas próximas.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Trundle drena 20/27.5/35 (+2% de Poder de Habilidade)% da Vida máxima de um campeão inimigo como Dano Mágico e 40% de sua Armadura e Resistência Mágica, metade imediatamente e metade ao longo de 4 segundos. A Armadura e Resistência Mágica são devolvidas 4 segundos após o fim da drenagem.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.trundlep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.trundleq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.trundlew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.trundlee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.trundler);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Trundle");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Fúria da Batalha");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Sanguinário");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Grito Zombador");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Corte Giratório");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Fúria Sem Fim");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Tryndamere recebe Fúria para cada ataque, acerto crítico e golpe fatal que realiza. A Fúria passivamente aumenta a sua Chance de Acerto Crítico e pode ser consumida com a habilidade Sanguinário.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Passivo: Tryndamere sente sede de sangue, recebendo 5/10/15/20/25 de Dano de Ataque mais 0.15/0.2/0.25/0.3/0.35 por 1% de Vida removida.\n" +
                    "Ativo: Tryndamere consome sua Fúria, restaurando 30/40/50/60/70 (+30% de Poder de Habilidade) de Vida, mais 0.5/0.95/1.4/1.85/2.3 (+120% de Poder de Habilidade) de Vida por ponto de Fúria consumido.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Reduz o Dano de Ataque dos campeões em 20/35/50/65/80 por 4 segundos. Inimigos que estiverem de costas também terão a Velocidade de Movimento reduzida em 30/37.5/45/52.5/60%.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Tryndamere gira através de seus inimigos, causando 70/100/130/160/190 (+120% de Dano de Ataque Bônus) (+100% de Poder de Habilidade) de Dano Físico a inimigos em seu caminho e gerando Fúria.O Tempo de Recarga de Corte Giratório é reduzido em 1 segundo sempre que Tryndamere causar acerto crítico. Este efeito é dobrado contra campeões.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Tryndamere fica completamente imune à morte por 5 segundos, recusando-se a ficar com menos de 1 de Vida e recebendo imediatamente 50/75/100 de Fúria.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.tryndamerep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.tryndamereq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.tryndamerew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.tryndameree);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.tryndamerer);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Tryndamere");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Dados Viciados");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Coringas");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Escolha uma Carta");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Baralho Marcado");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Destino");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao abater uma unidade, Twisted Fate rola seu dado da ''sorte'' e recebe de 1 a 6 unidades de ouro adicionais.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Arremessa três cartas que causam 60/105/150/195/240 (+65% de Poder de Habilidade) de Dano Mágico a cada inimigo que atravessarem.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Conjure uma vez para embaralhar as cartas. Conjure novamente para escolher sua carta, aprimorando o próximo ataque.A carta azul causa 40/60/80/100/120 (+100% de Dano de Ataque) (+50% de Poder de Habilidade) de Dano Mágico e restaura 50/75/100/125/150 de Mana.A carta vermelha causa 30/45/60/75/90 (+100% de Dano de Ataque) (+50% de Poder de Habilidade) de Dano Mágico às unidades ao redor do alvo e reduz sua Velocidade de Movimento em 30/35/40/45/50% por 2,5 segundos.A carta dourada causa 15/22.5/30/37.5/45 (+100% de Dano de Ataque) (+50% de Poder de Habilidade) de Dano Mágico e atordoa por 1/1.25/1.5/1.75/2 segundos");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Passivo: A cada 4 ataques, Twisted Fate causa 55/80/105/130/155 (+50% de Poder de Habilidade) de Dano Mágico adicional.Além disso, sua Velocidade de Ataque aumenta em 10/15/20/25/30%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Revela todos os Campeões inimigos (incluindo aqueles invisíveis) no mapa por 6/8/10 segundos.Enquanto Destino estiver ativa, Twisted Fate pode teleportar-se a até 5500 unidades de distância em 1,5 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.twistedfatep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.twistedfateq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.twistedfatew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.twistedfatee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.twistedfater);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Twisted Fate");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Veneno Mortal");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Emboscada");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Tonel de Veneno");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Contaminar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ra-ta-ta-ta");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques básicos de Twitch infectam o alvo, causando Dano Verdadeiro a cada segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Após 1.5 segundos sem receber dano, Twitch fica invisível e recebe 20% de Velocidade de Movimento por até 4/5/6/7/8 segundos. Ao deixar a invisibilidade, ele recebe 30/40/50/60/70% de Velocidade de Ataque por 5 segundos.Quando um campeão inimigo afetado por Veneno Mortal morre, o Tempo de Recarga de Emboscada é zerado.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Twitch arremessa um barril de veneno que explode em uma área, adicionando 2 acúmulos de Veneno Mortal e causando 25/30/35/40/45% de Lentidão por 3 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Causa 20/35/50/65/80 de Dano Físico mais 15/20/25/30/35 (+20% de Poder de Habilidade) (+0) por acúmulo de Veneno Mortal a todos os inimigos próximos afligidos por Veneno Mortal.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Por 5 segundos, Twitch recebe 300 de Alcance de Ataque e 20/30/40 de Dano de Ataque adicional.Enquanto durar o efeito, seus ataques básicos tornam-se disparos perfurantes que causam 20% a menos de dano em alvos subsequentes, até o mínimo de 40% de dano.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.twitchp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.twitchq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.twitchw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.twitche);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.twitchr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Twitch");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Agilidade do Macaco");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Postura do Tigre");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Postura da Tartaruga");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Postura do Urso");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Postura da Fênix");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Iniciar uma nova postura concede 10% de Velocidade de Ataque e 5 de Velocidade de Movimento por um curto período de tempo a Udyr. O efeito pode se acumular até 3 vezes.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Efeito persistente: Ataques básicos causam 15% de Dano de Ataque de Dano Físico adicional. Udyr realiza um Ataque do Tigre em seu primeiro ataque básico, causando 30/80/130/180/230 (+120/130/140/150/160% de Dano de Ataque) de Dano Físico adicional ao longo de 2 segundos.\n" +
                    "Ativação: Aumenta a Velocidade de Ataque em 30/40/50/60/70% por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Efeito Persistente: Recebe 10/12/14/16/18% de Roubo de Vida.\n" +
                    "Ativação: Recebe um escudo que absorve 60/95/130/165/200 (+50% de Poder de Habilidade) de dano por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Efeito persistente: Ataques básicos atordoam o alvo por 1 segundo. Este efeito não pode ocorrer no mesmo alvo novamente em menos de 5 segundos.\n" +
                    "Ativação: Aumenta a Velocidade de Movimento em 15/20/25/30/35% e ignora colisão com unidades por 2/2.25/2.5/2.75/3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Efeito Persistente: Incendeia inimigos à frente de Udyr em seu primeiro ataque básico e a cada terceiro ataque em seguida, causando 40/75/110/145/180 (+45% de Poder de Habilidade) de Dano Mágico.\n" +
                    "Ativação: Desfere ondas de fogo, causando 15/25/35/45/55 (+25% de Poder de Habilidade) de Dano Mágico a cada segundo a inimigos próximos por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.udyrp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.udyrq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.udyrw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.udyre);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.udyrr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Udyr");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Aumentador de Raios Tocado por Zaun");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Caçador Ácido");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Condensador do Terror");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Carga Corrosiva Noxiana");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Reversor de Posição Hipercinético");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques básicos e Caçadores Ácidos de Urgot reduzem o dano de seu alvo em 15% por 2,5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Urgot dispara um projétil na direção do cursor, causando 10/40/70/100/130 (+85% de Dano de Ataque) de Dano Físico. Se Caçador Ácido abater uma unidade, metade do seu custo de Mana é restituído.Você pode lançar um projétil teleguiado se mantiver o cursor do mouse sobre um alvo afetado por Carga Corrosiva Noxiana.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Urgot carrega seu condensador de terror para receber um escudo que absorve 60/100/140/180/220 (+80% de Poder de Habilidade) mais 8% de sua Mana máxima (+0) de dano por 5 segundos. Enquanto o escudo estiver ativo, os ataques e projéteis de Urgot reduzem a velocidade dos alvos em 20/25/30/35/40%.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Urgot lança uma Carga Corrosiva no local alvo. Inimigos atingidos pela carga têm sua Armadura reduzida em 12/14/16/18/20% e recebem 75/130/185/240/295 (+60% de Dano de Ataque Bônus) de Dano Físico ao longo de 5 segundos.Caçador Ácido pode perseguir alvos afetados por Carga Corrosiva Noxiana.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Urgot alveja um campeão inimigo e canaliza seu Reversor de Posição Hipercinético por 1 segundo, trocando de local com seu alvo em seguida e aterrorizando inimigos próximos por 1,5 segundo. Seu alvo fica suprimido pela duração da canalização.Urgot recebe 30/40/50% de dano reduzido por 5 segundos, começando com o início da canalização, e seu alvo sofre redução de velocidade em 40% por 3 segundos após a troca.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.urgotp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.urgotq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.urgotw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.urgote);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.urgotr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Urgot");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Vingança Viva");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Flecha Perfurante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Aljava da Ruína");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Chuva de Flechas");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Corrente da Corrupção");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao conseguir um abate ou assistência, Varus recebe Velocidade de Ataque temporariamente. O efeito é maior se o inimigo for um Campeão.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Primeira conjuração: Varus começa a preparar seu próximo disparo, aumentando gradualmente o dano e o alcance.\n" +
                    "Segunda conjuração: Varus dispara, causando de 10/47/83/120/157 (+100% de Dano de Ataque) a 15/70/125/180/235 (+160% de Dano de Ataque) de Dano Físico, reduzido em 15% por inimigo atingido (mín.: 33%).Enquanto prepara-se para atirar, a Velocidade de Movimento de Varus é reduzida em 20%. Após 4 segundos, o disparo de Flecha Perfurante falha, mas restitui metade de seu custo de Mana.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Os ataques básicos de Varus causam 10/14/18/22/26 (+25% de Poder de Habilidade) de Dano Mágico adicional e aplicam Arruinar por 6 segundo(s) (acumula até 3 vezes).As outras habilidades de Varus detonam Arruinar, causando Dano Mágico igual a 2/2.75/3.5/4.25/5% (+2% de Poder de Habilidade) da Vida máxima do alvo por acúmulo (máx.: 360 de dano total vs. monstros).");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Varus dispara uma chuva de flechas que causa 65/100/135/170/205 (+60% de Dano de Ataque Bônus) de Dano Físico e profana o terreno por 4 segundos.Terrenos profanados reduzem a Velocidade de Movimento de inimigos em 25/30/35/40/45% e também reduzem a auto-cura e regeneração de inimigos em 40%.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Varus lança uma gavinha de corrupção que causa 100/175/250 (+100% de Poder de Habilidade) de Dano Mágico e imobiliza o primeiro campeão atingido por 2 segundos.A corrupção então se espalha em direção aos campeões inimigos próximos não infectados. Caso os alcance, eles recebem o mesmo dano e também são imobilizados. Unidades imobilizadas recebem 3 acúmulos de Ruína ao longo da duração.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.varusp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.varusq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.varusw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.varuse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.varusr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Varus");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Caçadora Noturna");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Rolamento");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Dardos de Prata");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Condenar");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Hora Final");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Vayne impiedosamente caça malfeitores. Ela recebe 30 de Velocidade de Movimento ao se mover em direção a campeões inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Rola uma curta distância. O próximo ataque básico dentre 7 segundos causa 30/35/40/45/50% de Dano de Ataque de Dano de Ataque adicional, igual a 30/35/40/45/50% do Dano de Ataque total.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Cada terceiro ataque ou habilidade consecutiva contra um inimigo causa 6/7.5/9/10.5/12% da Vida máxima do inimigo como Dano Verdadeiro adicional.Causa um máximo de 200 de dano contra monstros e um mínimo de 40/60/80/100/120 de dano contra qualquer alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Faz um disparo que arremessa para trás o inimigo e causa 45/80/115/150/185 (+50% de Dano de Ataque Bônus) de Dano Físico. Inimigos que colidirem com o terreno recebem 45/80/115/150/185 (+50% de Dano de Ataque Bônus) de Dano Físico adicional e ficam atordoados por 1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Recebe 30/50/70 de Dano de Ataque adicional por 8/10/12 segundos. Enquanto estiver ativo, Rolamento concede invisibilidade por 1 segundo, e a Velocidade de Movimento adicional de Caçadora Noturna é aumentada para 90.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.vaynep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.vayneq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.vaynew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.vaynee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.vayner);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Vayne");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Equilibrio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe Maligno");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Matéria Negra");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Horizonte de Eventos");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Explosão Primordial");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A Regeneração de Mana de Veigar aumenta em 1,5% para cada 1% de Mana removida.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ativo: Faz um disparo de energia das trevas, causando 70/110/150/190/230 (+60% de Poder de Habilidade) de Dano Mágico aos dois primeiros inimigos atingidos. Para cada alvo abatido, Veigar recebe 1 de Poder de Habilidade. O valor é dobrado contra campeões, tropas grandes e monstros grandes.\n" +
                    "Passivo: Veigar recebe 1/2/3/4/5 de Poder de Habilidade em abates e assistências de campeões.\n" +
                    "Poder de Habilidade adicional: +1");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Após 1,2 segundo, matéria negra cai do céu no local alvo, causando 100/150/200/250/300 (+100% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Após um atraso de 0.5 segundo(s), Veigar distorce os limites do espaço ao redor do local alvo por 3 segundos, formando um pentágono de paredes. Inimigos que tentarem passar através do perímetro são impedidos e atordoados por 1.5/1.75/2/2.25/2.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Explode um campeão inimigo, causando 250/375/500 (+100% de Poder de Habilidade) mais 80% do Poder de Habilidade do alvo em Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.veigarp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.veigarq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.veigarw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.veigare);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.veigarr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Veigar");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Desconstrução Orgânica");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Fissão Plasmática");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Fenda do Vazio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Ruptura Tectônica");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Raio Desintegrador de Formas de Vida");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "As habilidades de Vel'Koz adicionam acúmulos de Desconstrução Orgânica nos inimigos. A terceira habilidade atingida consome os acúmulos e causa Dano Verdadeiro adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Vel'Koz dispara um orbe de plasma que causa 80/120/160/200/240 (+60% de Poder de Habilidade) de Dano Mágico e aplica uma redução de 70% na Velocidade de Movimento, que se esvai ao longo de 1/1.25/1.5/1.75/2 segundo(s).Ao reativar ou ao atingir um inimigo, o orbe se divide em um ângulo de 90 graus.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Vel'Koz abre uma fenda ao Vazio que causa 30/50/70/90/110 (+25% de Poder de Habilidade) de Dano Mágico. Após um intervalo, ela causa 45/75/105/135/165 (+38% de Poder de Habilidade) de Dano Mágico adicional. Ambos os acertos adicionam um acúmulo de Desconstrução Orgânica.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Vel'Koz rompe uma área próxima que, após um intervalo, causa 70/100/130/160/190 (+50% de Poder de Habilidade) de Dano Mágico e arremessa ao ar os inimigos por 0.75 segundos.Quaisquer inimigos próximos a Vel'Koz serão levemente empurrados na direção em que a habilidade foi conjurada.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Vel'Koz canaliza um feixe de energia que segue o cursor por 2,5 segundos, causando Dano Mágico até um total de 500/700/900 (+60% de Poder de Habilidade), e reduz a Velocidade de Movimento dos inimigos atingidos em 20% por 1 segundo. Adiciona um acúmulo de Desconstrução Orgânica a cada 0,5 segundos.Pode ser cancelado ao conjurar novamente.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.velkozp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.velkozq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.velkozw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.velkoze);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.velkozr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Velkoz");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Blindagem");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Quebra-Cofres");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Pancada Certeira");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Força Excessiva");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Saque e Enterrada");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Quando uma habilidade de Vi atinge um inimigo, ela ganha um escudo que absorve dano igual a 10% da sua Vida máxima por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Carrega um poderoso soco que carrega Vi para sua frente.\n" +
                    "Primeira Conjuração: Reduz a Velocidade de Movimento em 15% enquanto aumenta o dano e alcance da arrancada ao longo de 1,25 segundo.\n" +
                    "Segunda Conjuração: Arranca em frente, causando de 50/75/100/125/150 (+80% de Dano de Ataque Bônus) a 100/150/200/250/300 (+140% de Dano de Ataque Bônus) de Dano Físico e aplicando Pancada Certeira a todos os inimigos atingidos (causa 75% de dano a tropas e monstros). É interrompida ao colidir com um campeão inimigo, jogando-o para trás.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Todo terceiro ataque no mesmo alvo causa um adicional de 4/5.5/7/8.5/10% (+1% por 35 Dano de Ataque Bônus) da Vida máxima do alvo em Dano Físico, reduz sua Armadura em 20% e concede a Vi 30/35/40/45/50% de Velocidade de Ataque por 4 segundos (máx.: 300 de dano contra tropas e monstros.)");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Faz com que o próximo ataque básico cause 10/30/50/70/90 (+115% de Dano de Ataque) (+70% de Poder de Habilidade) de Dano Físico ao alvo e inimigos por trás dele.Vi carrega um novo soco a cada 14/12.5/11/9.5/8 segundos e pode acumular até 2 cargas ao mesmo tempo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Alveja um campeão inimigo e o persegue, lançando-o para cima por 1,25 segundo e causando 150/300/450 (+140% de Dano de Ataque Bônus) de Dano Físico.Enquanto carrega, Vi não pode ser impedida e afastará inimigos que estiverem no caminho, causando 75% de dano a eles.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.vip);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.viq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.viw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.vie);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.vir);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Vi");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Evolução Gloriosa");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Poder do Sifão");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Campo Gravítico");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Raio da Morte");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Tempestade do Caos");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Viktor inicia com o Núcleo Hex Protótipo que pode ser aprimorado três vezes na loja para melhorar suas habilidades.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Viktor explode uma unidade inimiga causando 40/60/80/100/120 (+20% de Poder de Habilidade) de Dano Mágico, concedendo a si mesmo 30/50/70/90/110 (+0) do dano causado como escudo. O próximo ataque de Viktor causa 0 (+50% de Poder de Habilidade) de Dano Mágico adicional. (O dano adicional escala com o nível de Viktor.)\n" +
                    "Aprimoramento - Turbocarga: Viktor recebe 30% de Velocidade de Movimento por 2.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Viktor posiciona um dispositivo de aprisionamento gravitacional por 4 segundos, reduzindo a Velocidade de Movimento das unidades inimigas em 28/32/36/40/44% e adicionando um acúmulo a cada 0,5 segundos. Com 3 acúmulos, o alvo é atordoado por 1,5 segundo.\n" +
                    "Aprimoramento - Implosão: Inimigos atordoados por Campo Gravítico são arrastados para o centro.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Viktor usa seu braço robótico para disparar um feixe caótico que corta o campo em linha reta, causando 70/110/150/190/230 (+70% de Poder de Habilidade) de Dano Mágico a todos os inimigos em seu trajeto.\n" +
                    "Aprimoramento - Pós-choque: Uma explosão segue o rastro de Raio da Morte, causando 70/110/150/190/230 (+70% de Poder de Habilidade) de Dano Mágico. Inimigos anteriormente atingidos pelo Raio da Morte recebem 40% do dano.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Viktor conjura uma singularidade no local alvo, causando 150/250/350 (+55% de Poder de Habilidade) de Dano Mágico e interrompendo canalizações dos inimigos.Viktor pode redirecionar a singularidade por 7 segundos, causando 30/60/90 (+20% de Poder de Habilidade) de Dano Mágico por segundo a inimigos próximos. A singularidade se movimentará mais vagarosamente conforme se distancia de Viktor.\n" +
                    "Aprimoramento - Velocidade: Tempestade do Caos se movimenta 20% mais rápida.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.viktorp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.viktorq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.viktorw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.viktore);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.viktorr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Viktor");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pacto Vermelho");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Transfusão");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Poça de Sangue");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Maré de Sangue");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Hemopraga");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Cada 40 pontos de Vida adicional concedem 1 de Poder de Habilidade a Vladimir, e cada 1 ponto de Poder de Habilidade concede a Vladimir 1,4 de Vida adicional (não acumula com si mesmo).");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Vladimir drena a força vital de seu alvo, causando 90/125/160/195/230 (+60% de Poder de Habilidade) de Dano Mágico e curando a si mesmo com 15/25/35/45/55 (+25% de Poder de Habilidade) de Vida.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Vladimir transforma-se em uma poça de sangue por 2 segundos, tornando-se inalvejável e reduzindo em 40% a Velocidade de Movimento dos inimigos acima dele.Vladimir causa 80/135/190/245/300 (+15% de Vida Bônus) de Dano Mágico ao longo da duração e cura a si mesmo em 15% desta quantia.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Vladimir desfere uma torrente de sangue, causando 60/85/110/135/160 (+45% de Poder de Habilidade) de Dano Mágico a todos os inimigos próximos.Cada conjuração lhe dá um acúmulo de Fortalecido (máx.: 4), aumentando sua cura e regeneração em 4/5/6/7/8% por 10 segundos. Além disso, o custo e o dano base Maré de Sangue aumentam em 25% por acúmulo.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Vladimir infecta a área alvo com uma praga virulenta, causando 12% a mais de dano por 5 segundos.Após 5 segundos, os inimigos infectados recebem 150/250/350 (+70% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.vladimirp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.vladimirq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.vladimirw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.vladimire);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.vladimirr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Vladimir");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "O Escolhido da Tormenta");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Trovão Giratório");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Frenesi");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Rugido Majestoso");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Garras do Trovão");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Volibear cura a si mesmo rapidamente por alguns segundos quando sua Vida chega a nível crítico.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Volibear segue em quatro patas para caçar seus inimigos, recebendo 15% de Velocidade de Movimento por 4 segundos. Este efeito é melhorado para 30/35/40/45/50% de Velocidade de Movimento enquanto movimenta-se em direção a Campeões inimigos.O próximo ataque de Volibear durante este período causa 30/60/90/120/150 de Dano Físico e arremessa seu alvo para trás de si.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Volibear recebe 8/11/14/17/20% de Velocidade de Ataque a cada ataque. Este efeito acumula-se até 3 vezes.\n" +
                    "Ativo: Quando Volibear tem 3 acúmulos de Frenesi, ele pode morder um inimigo para causar 80/125/170/215/260 (+15% de Vida Bônus) de Dano Físico, aumentado em 1% para cada 1% de Vida removida do alvo. Se Volibear morde um monstro, o Tempo de Recarga de Frenesi é reduzido em 50%.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Volibear causa 60/105/150/195/240 (+60% de Poder de Habilidade) de Dano Mágico nos inimigos próximos, desacelerando-os em 30/35/40/45/50% por 3 segundo(s).As tropas e monstros também sofrerão temor.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Volibear emerge com uma série de relâmpagos, atingindo até 4 inimigos próximos com 75/115/155 (+30% de Poder de Habilidade) de Dano Mágico.Pelos próximos 12 segundos, a tempestade fortalece Volibear, fazendo com que seus ataques básicos causem 75/115/155 (+30% de Poder de Habilidade) de Dano Mágico adicional que se liga a 4 inimigos próximos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.volibearp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.volibearq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.volibearw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.volibeare);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.volibearr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Volibear");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Sede Eterna");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Ataque Sedento");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Chamado dos Caçadores");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Aroma do Sangue");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Coerção Infinita");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Cada ataque do Warwick irá curá-lo. Cada ataque bem sucedido contra o mesmo alvo irá roubar quantias maiores de Vida para ele.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Atinge um inimigo com o maior valor entre 75/125/175/225/275 (+100% de Poder de Habilidade) e 8/10/12/14/16% (+100% de Poder de Habilidade) da Vida máxima do alvo como Dano Mágico (só pode causar dano fixo em monstros), e cura Warwick por 80% do dano causado.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Warwick uiva, aumentando a própria Velocidade de Ataque em 40/50/60/70/80% e a Velocidade de Ataque dos campeões aliados próximos em metade disso por 6 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Alternar: Warwick percebe campeões inimigos com menos de 50% de Vida dentre 1500/2300/3100/3900/4700 de distância. Enquanto detecta um inimigo com Vida baixa, Warwick o revela (caso não esteja invisível) e recebe 20/25/30/35/40% de Velocidade de Movimento.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Warwick avança na direção de um campeão inimigo e o suprime por 1.8 segundos. Durante este tempo, Warwick ataca sua vítima 5 vezes, causando um total de 150/250/350 (+200% de Dano de Ataque Bônus) de Dano Mágico (aciona efeitos de contato 5 vezes).Warwick recebe 30% de Roubo de Vida enquanto durar o efeito.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.warwickp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.warwickq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.warwickw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.warwicke);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.warwickr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Warwick");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pele de Pedra");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe Destruidor");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Chamariz");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Resplendor das Nuvens");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ciclone");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Aumenta a Armadura e Resistência Mágica de Wukong para cada campeão inimigo próximo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O próximo ataque de Wukong ganhará 125 de Alcance de Ataque, causará 30/60/90/120/150 (+110% de Dano de Ataque) de Dano Físico e reduzirá a Armadura do inimigo em 10/15/20/25/30% por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Wukong fica invisível por 1,5 segundo. Um chamariz incontrolável é deixado para trás e causará 70/115/160/205/250 (+60% de Poder de Habilidade) de Dano Mágico a inimigos próximos após 1,5 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Wukong avança na direção do inimigo alvo e envia imagens para atacar até 2 inimigos adicionais próximos ao seu alvo, causando 60/105/150/195/240 (+80% de Dano de Ataque Bônus) de Dano Físico em cada inimigo atingido. Ao acertar seu alvo, Wukong ganha 30/35/40/45/50% de Velocidade de Ataque por 4 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "O cajado de Wukong cresce e ele o gira, causando 20/110/200 (+120% de Dano de Ataque) de Dano Físico por segundo e arremessando ao ar os inimigos que encontrar. Wukong recebe Velocidade de Movimento ao longo da duração da habilidade.\n" +
                    "Duração: 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.wukongp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.wukongq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.wukongw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.wukonge);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.wukongr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Wukong");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Oscilação de Mana");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Pulso Arcano");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Olho da Destruição");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Orbe Eletrizante");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Ritual Arcano");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques básicos de Xerath restauram Mana periodicamente.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Primeira conjuração: Xerath carrega Pulso Arcano, gradualmente reduzindo sua Velocidade de Movimento enquanto aumenta o alcance da habilidade.\n" +
                    "Segunda conjuração: Xerath dispara Pulso Arcano, causando 80/120/160/200/240 (+75% de Poder de Habilidade) de Dano Mágico a todos os inimigos em uma linha.Enquanto carrega Pulso Arcano, Xerath não pode atacar ou conjurar outras habilidades. Se Xerath não disparar a habilidade, metade do custo de Mana é restituído.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Xerath conjura uma explosão de energia arcana, causando 60/90/120/150/180 (+60% de Poder de Habilidade) de Dano Mágico e 10% de redução na Velocidade de Movimento por 2.5 segundos a todos os inimigos na área alvo. Inimigos no centro da explosão também recebem 0 (+0) de Dano Mágico e 60/65/70/75/80% de redução na Velocidade de Movimento. Esta Lentidão se esvai rapidamente.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Xerath dispara um orbe de magia bruta. O primeiro inimigo atingido recebe 80/110/140/170/200 (+45% de Poder de Habilidade) de Dano Mágico e fica atordoado entre 0.75 e 1.75 segundos. A duração do atordoamento é calculada com base na distância percorrida pelo orbe.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Xerath ascende à sua verdadeira forma, enraizando-se onde estiver e recebendo 3 Barragens Arcanas. Esta artilharia mágica causa 190/245/300 (+43% de Poder de Habilidade) de Dano Mágico a todos os inimigos atingidos.O enraizamento acaba após 10 segundos, quando todos os disparos tiverem sido feitos ou ao ser manualmente desativado com um comando de movimentação. Se Xerath não disparar uma única Barragem Arcana, metade do Tempo de Recarga de Ritual Arcano é restituído.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.xerathp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.xerathq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.xerathw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.xerathe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.xerathr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Xerath");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Desafio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Golpe de Três Garras");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Grito de Guerra");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Investida Audaciosa");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Varredura Crescente");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Xin Zhao desafia seu alvo com seus ataques básicos e Investida Audaciosa, reduzindo sua Armadura em 15% por 3 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Os próximos 3 ataques básicos de Xin Zhao causarão 15/30/45/60/75 (+125% de Dano de Ataque) de Dano Físico adicional e reduzem o Tempo de Recarga de suas outras habilidades em 1 segundo. O golpe final também arremessa o alvo ao ar.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: A cada terceiro ataque básico, Xin Zhao causa Acerto Crítico a seu alvo com 25/37.5/50/62.5/75% de dano adicional. A cada terceiro acerto, ele cura a si mesmo com 30/35/40/45/50 (+0) (+40% de Poder de Habilidade) de Vida.\n" +
                    "Ativo: Xin Zhao solta um grito de guerra, aumentando a própria Velocidade de Ataque em 40/45/50/55/60% por 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Xin Zhao ataca e desafia um inimigo. A investida causa 70/110/150/190/230 (+60% de Poder de Habilidade) de Dano Mágico e 25/30/35/40/45% de Lentidão a todos os inimigos próximos por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Xin Zhao desfere uma varredura ao seu redor, causando 75/175/275 (+100% de Dano de Ataque Bônus) mais 15% da Vida atual do alvo em Dano Físico, atordoa e empurra inimigos para trás (máx.: 600 contra tropas e monstros). Xin Zhao recebe 15/20/25 de Armadura e Resistência Mágica por 6 segundos para cada campeão atingido.\n" +
                    "Desafio: Se um alvo desafiado for atingido pela varredura, ele não será afetado pelo empurrão.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.xinzhaop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.xinzhaoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.xinzhaow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.xinzhaoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.xinzhaor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Xin Zhao");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Estilo do Errante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Tempestade de Aço");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Parede de Vento");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Espada Ágil");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Último Suspiro");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A Chance de Acerto Crítico de Yasuo é dobrada. Além disso, Yasuo forma um escudo sempre que estiver em movimento. O escudo é ativado quando ele recebe dano de um campeão ou monstro.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Avança em linha reta, causando 20/40/60/80/100 (+100% de Dano de Ataque) de Dano Físico.Ao atingir, Tempestade de Aço concede um acúmulo de Acumular Tempestade por 10 segundos. Com 2 acúmulos, Tempestade de Aço dispara um turbilhão que lança inimigos ao ar.\n" +
                    "Tempestade de Aço é tratado como um ataque básico: Ele pode causar dano critico, aplica efeitos de contato e seu Tempo de Recarga e tempo de conjuração são reduzidos pela Velocidade de Ataque.Se for conjurada enquanto avança, Tempestade de Aço desferirá um golpe circular.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Cria uma parede movediça que bloqueia projéteis inimigos por 4 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Dispara em direção ao alvo inimigo, causando 70/90/110/130/150 (+60% de Poder de Habilidade) de Dano Mágico. Cada conjuração aumenta o dano base de sua próxima Corrida em 25%, até o máximo de 50%.Não pode ser conjurada novamente no mesmo inimigo por 10/9/8/7/6 segundos.Se for conjurada enquanto avança, Tempestade de Aço desferirá um golpe circular.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Avança em direção a um campeão inimigo lançado ao ar, causando 200/300/400 (+150% de Dano de Ataque Bônus) de Dano Físico e mantendo no ar todos os inimigos lançados ao ar na área por 1 segundo adicional. Concede Fluxo máximo, mas zera todos os acúmulos de Acumular Tempestade.Por 15 segundos, Yasuo recebe 50% de Penetração de Armadura adicional - isto afeta a Armadura proveniente de itens, efeitos, runas e talentos.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.yasuop);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.yasuoq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.yasuow);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.yasuoe);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.yasuor);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Yasuo");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pacto Profano");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Presságio da Guerra");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Presságio da Peste");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Presságio da Fome");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Presságio da Morte");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Yorick recebe dano reduzido em 5% e seus ataques básicos causam 5% a mais de dano para cada invocação que estiver ativa. Enquanto isso, os carniçais de Yorick recebem 35% do Dano de Ataque e Vida.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "O próximo ataque de Yorick causará 30/60/90/120/150 (+120% de Dano de Ataque) de Dano Físico e invocará um Carniçal Espectral por até 5 segundos.O Carniçal Espectral causa 8/16/24/32/40 de dano adicional por acerto e se move 15/20/25/30/35% mais rápido. Enquanto o carniçal estiver ativo, Yorick se moverá 15/20/25/30/35% mais rápido.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Yorick invoca um Carniçal Decadente que surge com uma violenta explosão, causando 60/95/130/165/200 (+100% de Poder de Habilidade) de Dano Mágico e Lentidão de 20/25/30/35/40% em inimigos próximos por 1,5 segundo. Enquanto o Carniçal Decadente continuar vivo, os inimigos próximos continuarão sob Lentidão de 10/12.5/15/17.5/20% por até 5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Yorick causa 55/85/115/145/175 (+100% de Dano de Ataque Bônus) de Dano Mágico e se cura em até 40% do dano causado. Um Carniçal Faminto é invocado atrás de seu alvo por até 5 segundos, curando Yorick com o dano que causar (a cura do dano de um carniçal é reduzida pela metade contra tropas e monstros).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Yorick Invoca um fantasma com a forma do campeão aliado alvo. Os fantasmas causam 45/60/75% do Dano de Ataque do aliado alvo e duram 10 segundo(s). Caso este aliado morra enquanto o fantasma estiver vivo, ele se sacrificará para revivê-lo por até 10 segundo(s).O fantasma pode ser controlado segurando-se a tecla Alt em conjunto com o botão direito do mouse ou reativando esta habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.yorickp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.yorickq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.yorickw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.yoricke);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.yorickr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Yorick");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Divisão Celular");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Esticada");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Matéria Instável");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Estilingue Elástico");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Vamos pular!");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A cada vez que Zac atingir um inimigo com uma habilidade, ele derrama uma parte de si mesmo que pode ser reabsorvida para restaurar Vida. Ao receber dano letal, Zac se divide em 4 poças que tentam se recombinar. Se qualquer uma das poças permanecer viva após 8 segundos, ele ressuscitará com uma certa quantia de Vida, dependendo da Vida das poças sobreviventes. Cada poça tem um percentual da Vida máxima, Armadura e Resistência Mágica de Zac. Esta habilidade tem 5 minutos de Tempo de Recarga.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Golpeia inimigos, causando 70/110/150/190/230 (+50% de Poder de Habilidade) de Dano Mágico e 20/25/30/35/40% de redução na Velocidade de Movimento por 2 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "O corpo de Zac entra em erupção, causando 40/55/70/85/100 de Dano Mágico + 4/5/6/7/8 (+2% de Poder de Habilidade)% da Vida máxima do inimigo como Dano Mágico a todos os inimigos próximos (máx.: 200 de dano contra tropas e monstros).Quando Zac reabsorve uma parte de si mesmo, o Tempo de Recarga de Matéria Instável é reduzido em 1 segundo.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Carrega e se lança em direção a um local alvo, arremessando inimigos ao ar.Zac vira em direção ao cursor e carrega ao longo de 0.9/1/1.1/1.2/1.3 segundos. Reativar a habilidade o lança em direção a seu alvo, causando 80/130/180/230/280 (+70% de Poder de Habilidade) de Dano Mágico a todos os inimigos atingidos e os lança ao ar por 1 segundo.Além disso, Zac fará surgir pedaços adicionais caso atinja mais de um campeão inimigo.A conjuração pode ser cancelada movimentando-se, restituindo metade do Tempo de Recarga e custo da habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Zac quica 4 vezes, lançando inimigos ao ar e causando Lentidão a eles.Cada impacto causa 140/210/280 (+40% de Poder de Habilidade) de Dano Mágico a inimigos próximos, lança-os ao ar por 1 segundo e lhes causa 20% de Lentidão por 1 segundo. Inimigos atingidos mais de uma vez recebem metade do dano e não são arremessados ao ar. Ao ser ativada, Zac remove todos os efeitos de Lentidão que o afetam e recebe um efeito de aceleração da Velocidade de Movimento (20-50%) enquanto estiver ativo.Zac pode clicar com o botão direito para se mover e pode ativar Matéria Instável enquanto estiver no ar.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.zacp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.zacq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.zacw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.zace);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.zacr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Zac");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Desprezo pelos Fracos");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Shuriken Laminado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Sombra Viva");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Corte Sombrio");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Marca Fatal");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Os ataques básicos de Zed contra alvos com menos de 50% de Vida causam 6-10% da Vida máxima do alvo como Dano Mágico adicional. Este efeito pode ocorrer somente uma vez a cada 10 segundos no mesmo alvo.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Zed e sua sombra arremessam seus shurikens, cada um causando 75/115/155/195/235 (+100% de Dano de Ataque Bônus) de Dano Físico ao primeiro inimigo que atravessarem e 45/69/93/117/141 (+60% de Dano de Ataque Bônus) de Dano Físico a cada inimigo adicional.Shurikens adicionais que atingirem o mesmo inimigo causam 50% a menos de dano que o shuriken anterior.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Concede 5/10/15/20/25% de Dano de Ataque adicional (+0).A sombra de Zed avança, permanecendo em seu lugar por 4 segundos.Reativar Sombra Viva fará com que Zed troque de lugar com sua sombra.A sombra de Zed imita suas habilidades. Se uma habilidade atingir qualquer alvo duas vezes, Zed restaura 20/25/30/35/40 de Energia. A Energia só pode ser restaurada uma vez por habilidade imitada.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Zed e sua sombra golpeiam, causando 60/90/120/150/180 (+80% de Dano de Ataque Bônus) de Dano Físico a inimigos próximos. Cada campeão inimigo atingido pelo Corte Sombrio de Zed reduz o Tempo de Recarga de Sombra Viva em 2 segundos.Cada inimigo atingido por um Corte Sombrio da sombra terá sua Velocidade de Movimento reduzida em 20/25/30/35/40% por 1,5 segundo.Inimigos atingidos por ambos os Cortes Sombrios terão a Velocidade de Movimento reduzida em 30/37.5/45/52.5/60%, mas não recebem dano adicional.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Zed fica brevemente inalvejável e faz surgir uma sombra em sua posição, com duração de 6 segundos.Em seguida, ele avança em direção ao campeão alvo e o marca para morrer. Após 3 segundos, a marca será disparada, causando Dano Físico igual a 100% de Dano de Ataque mais 25/35/45% de todo o Dano Físico e Mágico causado ao alvo por Zed e suas sombras enquanto a marca esteve ativa.Após 0,5 segundos, Zed pode reativar a Marca Fatal, fazendo com que troque de posição com sua sombra.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.zedp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.zedq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.zedw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.zede);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.zedr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Zed");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Pavio Curto");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Bomba Saltitante");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Carga Concentrada");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Campo Minado de Hexplosivos");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Bomba Mega Infernal");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "A cada 12 segundos, o próximo ataque básico de Ziggs causa Dano Mágico adicional. Esse Tempo de Recarga é reduzido sempre que Ziggs usa uma habilidade.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Ziggs arremessa uma bomba saltitante que causa 75/120/165/210/255 (+65% de Poder de Habilidade) de Dano Mágico.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Ziggs arremessa uma carga explosiva que detona após 4 segundos, ou quando a habilidade é ativada novamente. A explosão causa 70/105/140/175/210 (+35% de Poder de Habilidade) de Dano Mágico a inimigos, empurrando-os para longe.Ziggs também é empurrado, mas não recebe dano.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Ziggs espalha minas de proximidade que detonam ao contato com inimigos, causando 40/65/90/115/140 (+30% de Poder de Habilidade) de Dano Mágico. Inimigos atingidos têm a velocidade reduzida em 20/25/30/35/40% por 1.5 segundos.Inimigos que acionarem uma mina recebem 40% de dano de minas adicionais. As minas se desarmam automaticamente após 10 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Ziggs põe para funcionar sua maior criação, a Bomba Mega Infernal, arremessando-a em uma enorme distância. Inimigos na zona primária de detonação recebem 300/450/600 (+110% de Poder de Habilidade) de Dano Mágico. Inimigos mais distantes recebem dois terços do dano. Tropas recebem o dobro do dano.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ziggsp);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.ziggsq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ziggsw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ziggse);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.ziggsr);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ziggs");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Tempo Engarrafado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Bomba Relógio");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Retroceder");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Distorção no Tempo");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Alteração Temporal");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "SEM DESCRICAO");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Zilean arremessa uma bomba-relógio em um local. A bomba se prende à primeira unidade que se aproximar de uma pequena área ao seu redor (priorizando campeões). Após 3 segundos, ela detonará, causando 75/115/165/230/300 (+90% de Poder de Habilidade) de Dano Mágico a inimigos próximos. Posicionar duas bombas em uma unidade detonará a primeira antecipadamente, atordoando todos os inimigos no raio da explosão por 1.1/1.2/1.3/1.4/1.5 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Reduz o Tempo de Recarga das outras habilidades básicas de Zilean em 10 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Zilean aumenta a Velocidade de Movimento de um campeão aliado, ou desacelera um campeão inimigo, em 40/55/70/85/99% por 2.5 segundo(s).");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Zilean marca a si mesmo ou a um campeão aliado com uma runa de tempo protetora por 5 segundo(s). Se o alvo receber dano letal, ele será transportado de volta no tempo, recuperando 600/850/1100 (+200% de Poder de Habilidade) de vida.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.ashep);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.asheq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.ashew);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.ashee);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.asher);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Ashe");
  /* ************************************************************************************************************************************************************ */
            habvalores.put(contract.Habilidades.COLUNA_NOMEPASSIVA, "Ascensão dos Espinhos");
            habvalores.put(contract.Habilidades.COLUNA_NOMEQ, "Desabroche Letal");
            habvalores.put(contract.Habilidades.COLUNA_NOMEW, "Crescimento Desenfreado");
            habvalores.put(contract.Habilidades.COLUNA_NOMEE, "Pântano das Raízes");
            habvalores.put(contract.Habilidades.COLUNA_NOMER, "Espinhos Sufocantes");
            habvalores.put(contract.Habilidades.COLUNA_PASSIVA, "Ao morrer, Zyra retorna brevemente à sua forma de planta. Após 2 segundos, ela pode usar qualquer habilidade para disparar um espinho em direção ao cursor, causando Dano Verdadeiro em cada inimigo que ele atingir.");
            habvalores.put(contract.Habilidades.COLUNA_HQ, "Espinhos são disparados do chão, causando 70/105/140/175/210 (+65% de Poder de Habilidade) de Dano Mágico a inimigo na área.\n" +
                    "Crescimento Desenfreado: Se Desabroche Letal atingir uma semente, uma Cospe-Espinhos surge causando 23 + (6.5 × level) (+20% de Poder de Habilidade) de Dano Mágico. Cospe-Espinhos têm 750 de alcance e duração de 10 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HW, "Passivo: Concede 2/4/6/8/10% de Redução do Tempo de Recarga.\n" +
                    "Ativo: Planta uma semente, com duração de 30 segundos. Se um campeão inimigo pisar em uma semente, ela será destruída, mas ele será revelado por 2 segundos.Zyra armazena uma semente a cada 17/16/15/14/13 segundos (Máx.: 2 sementes armazenadas, 4 sementes plantadas).\n" +
                    "Crescimento Desenfreado: Conjure habilidades em sementes para fazer crescer plantas. O dano das plantas é calculado com base no nível de Zyra. Plantas adicionais atingindo o mesmo alvo causam 50% de dano a menos.");
            habvalores.put(contract.Habilidades.COLUNA_HE, "Desfere um ataque com vinhas, causando 60/95/130/165/200 (+50% de Poder de Habilidade) de Dano Mágico e enraizando inimigos por 0.75/1/1.25/1.5/1.75 segundo(s).\n" +
                    "Crescimento Desenfreado: Se Pântano das Raízes atingir uma semente, uma Vinha Áspera surge, causando 23 + (6.5 × level) (+20% de Poder de Habilidade) de Dano Mágico e reduzindo a velocidade de inimigos em 30% por 2 segundos. Cada Vinha Áspera tem 400 de alcance e duração de 10 segundos.");
            habvalores.put(contract.Habilidades.COLUNA_HR, "Invoca a fúria da natureza e faz surgir uma raiz retorcida no local alvo, causando 180/265/350 (+70% de Poder de Habilidade) de Dano Mágico a todos os inimigos na área em que se expandir. Após 2 segundos, as vinhas desferem um golpe vertical que lança os inimigos ao ar por 1 segundos.\n" +
                    "Crescimento Desenfreado: Plantas que estiverem no alcance das raízes ficam enfurecidas e têm sua Velocidade de Ataque aumentadas em 50%.");
            habvalores.put(contract.Habilidades.COLUNA_IP, R.drawable.zyrap);
            habvalores.put(contract.Habilidades.COLUNA_IHQ, R.drawable.zyraq);
            habvalores.put(contract.Habilidades.COLUNA_IHW, R.drawable.zyraw);
            habvalores.put(contract.Habilidades.COLUNA_IHE, R.drawable.zyrae);
            habvalores.put(contract.Habilidades.COLUNA_IHR, R.drawable.zyrar);
            db.insertOrThrow(contract.Habilidades.TABELA_NOME, null, habvalores);
            Log.i("tcc", "Inseriu as habilidades de Zyra");
  /* ************************************************************************************************************************************************************ */

                                                        /****FIM DAS HABILIDADES****/

            String sknsqlcreate = "create table " + contract.Skins.TABELA_NOME + " ("
                + contract.Skins.COLUNA_ID + " integer primary key autoincrement,"
                + contract.Skins.COLUNA_NOMESKIN + " text,"
                + contract.Skins.COLUNA_IMAGEMSKIN + " big int,"
                + contract.Skins.COLUNA_PRECO + " integer);";
        db.execSQL(sknsqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Skins.TABELA_NOME);

            ContentValues sknvalores = new ContentValues();

   /* ********************************AATROX**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Aatrox clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.aatroxs1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Aatrox clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Aatrox Justiceiro");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.aatroxs2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Aatrox Justiceiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Mech Aatrox");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.aatroxs3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Mech Aatrox");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Aatrox Caçador dos Mares");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.aatroxs4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Aatrox Caçador dos Mares");
/* ********************************AHRI**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri da Dinastia");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri da Dinastia");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri Noturna");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri Noturna");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri Raposa Flamejante");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri Raposa Flamejante");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri Estrela do Pop");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri Estrela do Pop");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri Desafiante(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri Desafiante");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ahri Colegial");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ahris7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ahri Colegial");
/* ********************************AKALI**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Sinistra(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali Sinistra");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Carmesim(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali Carmesim");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Esportista(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali Esportista");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Enfermeira");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali Enfermeira");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Lua Sangrenta");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali Lua Sangrenta");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Presas de prata");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Akali Presas de prata");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Akali Caçadora de cabeças");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.akalis8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caçadora de cabeças");

/* ********************************ALISTAR**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Negro(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar Negro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Dourado");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 390);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar Dourado");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Toureiro(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar Toureiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Velho Oeste(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin velho oeste");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Indomável(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar indomável");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Infernal");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar infernal");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Zagueiro");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar zagueiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Alistar Saqueador");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.alistars9);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Alistar saqueador");

/* ********************************AMUMU**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu Faraó(indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu Faraó");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu Jogos de Inverno(indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu Jogos de inverno");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Emumu");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 520);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Emumu");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu Presente de Grego(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu presente de grego");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu Quase Rei do Baile(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu quase rei do baile");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu, o Mini-Cavaleiro");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu, o Mini-Cavaleiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu, o Robozinho Triste");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu, o Robozinho Triste");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Amumu Festa Surpresa");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.amumus9);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Amumu Festa Surpresa");

/* ********************************ANIVIA**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia Espírito de Equipe(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia Espírito de Equipe");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia de Rapina");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia de rapina");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia Caçadora de Noxus(indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia caçadora de noxus");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia Hextec");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia hextec");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia Gelo Sombrio");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1820);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia gelo sombrio");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Anivia Pré Histórica");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.anivias7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Anivia pré histórica");

 /* ********************************ANNIE**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Gótica(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Gótica");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Chapeuzinho(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Chapeuzinho");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie no País das Maravilhas(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie no país das maravilhas");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Rainha do Baile(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Rainha do Baile");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie do Raio de Gelo");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie do raio de gelo");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie ao Contrário");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie ao contrário");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Frankenstibbers(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Frankenstibbers");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Panda");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies9);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Panda");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Queridinha");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies10);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Queridinha");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Annie Hextec(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.annies11);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Annie Hextec");

/* ********************************ASHE**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe de Freljord(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe de Freljord");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe de Sherwood");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 520);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe de Sherwood");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe Bretã(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe Bretã");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe Rainha)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe Rainha");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe Ametista)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe Ametista");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe Cupido Mortal)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe Cupido Mortal");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Ashe Saqueadora)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.ashes7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Ashe Saqueadora");

/* ********************************AURELION SOL**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Aurelion Sol Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.aurelionsols1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Aurelion Sol Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Aurelion Sol Senhor das Cinzas");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.aurelionsols2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Aurelion Sol Senhor das cinzas");

/* ********************************AZIR**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Azir Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.azirs1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Azir Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Azir Galático");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.azirs2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Azir Galático");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Azir Senhor dos Túmulos");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.azirs3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Azir Galático");

/* ********************************BARDO**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Bardo Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.bardos1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Bardo Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Bardo Sabugueiro");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.bardos2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1950);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Bardo Sabugueiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Bardo Dia Nevado");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.bardos3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Bardo Dia Nevado");

/* ********************************BLITZCRANK**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Blitzcrank Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Blitzcrank Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Blitzcrank Enferrujado(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Blitzcrank Enferrujado");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Blitzcrank Goleiro(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Blitzcrank Goleiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Blitzcrank Nocaute");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Blitzcrank Nocaute");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Blitzcrank Tunado em Piltover");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1820);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Blitzcrank Tunado em Piltover");    

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Certamente não é o Blitzcrank(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Certamente não é o Blitzcrank");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "iBlitzcrank");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin iBlitzcrank");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Riot Blitzcrank");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Riot Blitzcrank");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Blitzcrank Chefão");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.blitzcranks9);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Blitzcrank Chefão");

/* ********************************BRAND**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Brand Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.brands1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Brand Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Brand Pós Apocalipse");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.brands2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Brand Pós Apocalipse");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Brand Vândalo");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.brands3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 520);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Brand Vândalo");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Brand Criogênico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.brands4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Brand Criogênico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Brand Zumbi(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.brands5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Brand Zumbi");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Brand Fogo Espiritual");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.brands6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Brand Fogo Espiritual");

/* ********************************BRAUM**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Braum Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.braums1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Braum Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Braum Caçador de Dragões");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.braums2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Braum Caçador de Dragões");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Braum El Tigre");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.braums3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1350);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Braum El Tigre");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Braum Coração de Leão");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.braums4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Braum Coração de Leão");

/* ********************************CAITLYN**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn da Resistência");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn da Resistência");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Xerife Caitlyn");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 520);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Xerife Caitlyn");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn Caçadora(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn Caçadora");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn Guerrilheira do Ártico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn Guerrilheira do Ártico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn Policial");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn Policial");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn Caçadora de Cabeças");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn Caçadora de Cabeças");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Caitlyn Espectro Lunar(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.caitlyns8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Caitlyn Espectro Lunar");

/* ********************************CASSIOPEIA**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cassiopéia Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.cassiopeias1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cassiopeia Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cassiopeia do Velho-Oeste");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.cassiopeias2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cassiopeia do Velho-Oeste");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cassiopeia Sereia");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.cassiopeias3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cassiopeia Sereia");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "cassiopeia Helênica");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.cassiopeias4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin cassiopeia Helênica");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cassiopeia Presas de Jade");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.cassiopeias5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cassiopeia Presas de Jade");

/* ********************************CHOGATH**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gat Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gat Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gath Terror Noturno(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gath Terror Noturno");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gath Cavalheiro(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gath Cavalheiro");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gath do Lago Ness");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gath do Lago Ness");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gath Jurássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gath Jurássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gath Máquina de Combate Primum(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gath Máquina de Combate Primum");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Cho'Gath Pré-histórico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.chogaths7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Cho'Gath Pré-histórico");

/* ********************************CORKI**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki OVNI(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki OVNI");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki no Bobsleigh");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki no Bobsleigh");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki Barão Vermelho(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki Barão Vermelho");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki Caranga Envenenada");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 520);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki Caranga Envenenada");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki Montado em Urf");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki Montado em Urf");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Corki Asas de Dragão");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Corki Asas de Dragão");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Fnatic Corki(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.corkis8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Fnatic Corki");

/* ********************************DARIUS**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Darius Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dariuss1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Darius Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Lorde Darius");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dariuss2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Lorde Darius");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Darius Bioforja");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dariuss3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Darius Bioforja");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Darius Rei dos Bretões");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dariuss4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Darius Rei dos Bretões");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Darius Mestre da Enterrada");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dariuss5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 1820);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Darius Mestre da Enterrada");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Darius Colegial");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dariuss6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 750);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Darius Colegial");

/* ********************************DIANA**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Diana Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dianas1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Diana Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Diana Valquíria Sombria");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dianas2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Diana Valquíria Sombria");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Diana Deusa Lunar");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.dianas3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Diana Deusa Lunar");

/* ********************************DR. MUNDO**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Dr. Mundo Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Dr. Mundo Clássico");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Dr. Mulko(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos2);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Dr. Mulko");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Sr. Mundoverso(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos3);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Sr. Mundoverso");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Diretor Mundo(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos4);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Diretor Mundo");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Mundo Mundo(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos5);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Mundo Mundo");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Carrasco Mundo");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos6);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 520);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Carrasco Mundo");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Mundo Enfurecido");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos7);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Mundo Enfurecido");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "TPA Mundo(Indisponível)");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos8);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin TPA Mundo");

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Mundo Curtindo o Verão");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos9);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 975);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Mundo Curtindo o Verão");


/* ********************************DR. MUNDO**************************************************************************************************************************** */

            sknvalores.put(contract.Skins.COLUNA_NOMESKIN, "Dr. Mundo Clássico");
            sknvalores.put(contract.Skins.COLUNA_IMAGEMSKIN, R.drawable.drmundos1);
            sknvalores.put(contract.Skins.COLUNA_PRECO, 0);
            db.insertOrThrow(contract.Skins.TABELA_NOME, null, sknvalores);
            Log.i("tcc", "Inseriu a skin Dr. Mundo Clássico");
/* ************************************************************************************************************************************************************ */
        String persqlcreate = "create table " + contract.Personagem.TABELA_NOME + " ("
                + contract.Personagem.COLUNA_ID + " integer primary key,"
                + contract.Personagem.COLUNA_NOME + " text,"
                + contract.Personagem.COLUNA_LORE + " text,"
                + contract.Personagem.COLUNA_IMAGEM + " big int,"
                + contract.Personagem.COLUNA_PRECOIP + " integer,"
                + contract.Personagem.COLUNA_PRECORP + " integer,"
                + contract.Personagem.COLUNA_COUNTERUM + " text,"
                + contract.Personagem.COLUNA_COUNTERDOIS + " text,"
                + contract.Personagem.COLUNA_COUNTERTRES + " text,"
                + contract.Personagem.COLUNA_NOMEPASSIVA + " references habilidades(_nomepassiva),"
                + contract.Personagem.COLUNA_NOMESKIN + " references skins(_nomeskins));";
        db.execSQL(persqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Personagem.TABELA_NOME);


        String guisqlcreate = "create table " + contract.Guias.TABELA_NOME + " ("
                + contract.Guias.COLUNA_ID + " integer primary key autoincrement,"
                + contract.Guias.COLUNA_NOMEGUIA + " text,"
                + contract.Guias.COLUNA_CRIADORGUIA + " text,"
                + contract.Guias.COLUNA_TEXTOGUIA + " text);";
        db.execSQL(guisqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Guias.TABELA_NOME);


        String itnsqlcreate = "create table " + contract.Itens.TABELA_NOME + " ("
                + contract.Itens.COLUNA_ID + " integer primary key autoincrement,"
                + contract.Itens.COLUNA_NOME + " text,"
                + contract.Itens.COLUNA_CUSTO + " integer,"
                + contract.Itens.COLUNA_DESCRICAO + " text,"
                + contract.Itens.COLUNA_PRECOVENDA + " integer,"
                + contract.Itens.COLUNA_IMAGEM + " big int);";
        db.execSQL(itnsqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Itens.TABELA_NOME);


        String ntcsqlcreate = "create table " + contract.Noticias.TABELA_NOME + " ("
                + contract.Noticias.COLUNA_ID + " integer primary key autoincrement,"
                + contract.Noticias.COLUNA_MANCHETE + " text,"
                + contract.Noticias.COLUNA_TEXTO + " text);";
        db.execSQL(ntcsqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Noticias.TABELA_NOME);

        String tlnsqlcreate = "create table " + contract.Talentos.TABELA_NOME + " ("
                + contract.Talentos.COLUNA_ID + " integer primary key autoincrement,"
                + contract.Talentos.COLUNA_NOME + " text,"
                + contract.Talentos.COLUNA_DESCRICAO + " text);";
        db.execSQL(tlnsqlcreate);
        Log.i("tcc", "Executou o script de criação da tabela "
                + contract.Talentos.TABELA_NOME);

    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("tcc", "Upgrade da vers�o " + oldVersion + " para " + newVersion
                + ", destruindo tudo.");
        db.execSQL("drop table if exists " + contract.Personagem.TABELA_NOME);
        onCreate(db); // chama onCreate e recria o banco de dados
        Log.i("tcc", "Executou o script de upgrade da tabela "
                + contract.Personagem.TABELA_NOME);
    }
}
