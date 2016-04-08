package modelo;

/**
 * Created by Aluno on 10/03/2016.
 */
public class Itens {
    private Integer _iditens;
    private String nome;
    private byte[] imagem;
    private String descricao;
    private Integer custo;
    private Integer precovenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCusto() {
        return custo;
    }

    public void setCusto(Integer custo) {
        this.custo = custo;
    }

    public Integer getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Integer precovenda) {
        this.precovenda = precovenda;
    }

    public Integer get_iditens() {
        return _iditens;
    }

    public void set_id(Integer _iditens) {
        this._iditens = _iditens;
    }
}
