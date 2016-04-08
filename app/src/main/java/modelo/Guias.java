package modelo;

/**
 * Created by Aluno on 10/03/2016.
 */
public class Guias {
    private Integer _idguias;
    private String nome;
    private String texto;
    private String criador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public Integer get_idguias() {
        return _idguias;
    }

    public void set_idguias(Integer _idguias) {
        this._idguias = _idguias;
    }
}
