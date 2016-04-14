package modelo;

/**
 * Created by Aluno on 10/03/2016.
 */
public class Personagens {
    private Integer _idpersonagem;
    private String nome;
    private String lore;
    private int precoip;
    private int precorp;
    private String categoria;
    private Integer imagem;
    private String counterum;
    private String counterdois;
    private String countertres;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public int getPrecoip() {
        return precoip;
    }

    public void setPrecoip(int precoip) {
        this.precoip = precoip;
    }

    public int getPrecorp() {
        return precorp;
    }

    public void setPrecorp(int precorp) {
        this.precorp = precorp;
    }

    public String getCounterum() {
        return counterum;
    }

    public void setCounterum(String counterum) {
        this.counterum = counterum;
    }

    public String getCounterdois() {
        return counterdois;
    }

    public void setCounterdois(String counterdois) {
        this.counterdois = counterdois;
    }

    public String getCountertres() {
        return countertres;
    }

    public void setCountertres(String countertres) {
        this.countertres = countertres;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    public Integer get_idpersonagem() {
        return _idpersonagem;
    }

    public void set_idpersonagem(Integer _idpersonagem) {
        this._idpersonagem = _idpersonagem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}