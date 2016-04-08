package modelo;

/**
 * Created by Aluno on 10/03/2016.
 */
public class Skins {
    private Integer _idskin;
    private String nomeskin;
    private Integer imagemskin;
    private Integer preco;

    public String getNomeskin() {
        return nomeskin;
    }

    public void setNomeskin(String nomeskin) {
        this.nomeskin = nomeskin;
    }


    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getImagemskin() {
        return imagemskin;
    }

    public void setImagemskin(Integer imagemskin) {
        this.imagemskin = imagemskin;
    }

    public Integer get_idskin() {
        return _idskin;
    }

    public void set_idskin(Integer _idskin) {
        this._idskin = _idskin;
    }
}
