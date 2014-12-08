package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:01:57
 */
public class Pregunta {

    private String id;
    private String enunciado;
    private ArrayList<Respuesta> respuestas;

    public Pregunta() {

    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestas
     */
    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
