package modelo;

/**
 * Created by Aluno on 10/03/2016.
 */
public class noticias {
    private Integer _idnoticias;
    private String manchete;
    private String texto;

    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchete) {
        this.manchete = manchete;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer get_idnoticias() {
        return _idnoticias;
    }

    public void set_idnoticias(Integer _idnoticias) {
        this._idnoticias = _idnoticias;
    }
}
