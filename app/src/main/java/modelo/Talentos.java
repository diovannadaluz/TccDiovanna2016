package modelo;

/**
 * Created by Aluno on 10/03/2016.
 */
public class Talentos {
    private Integer _idtalentos;
    private String nome;
    private Integer imagem;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    public Integer get_idtalentos() {
        return _idtalentos;
    }

    public void set_idtalentos(Integer _idtalentos) {
        this._idtalentos = _idtalentos;
    }
}
