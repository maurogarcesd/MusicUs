package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 01-dic-2014 09:50:07 p.m.
 */
public class Pregunta {

	private ArrayList<Respuesta> respuestas;
        private String enunciado;
        private String id;

	public Pregunta(){
            respuestas =new ArrayList<>();
	}

    /**
     * @return the respuesta
     */
    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
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