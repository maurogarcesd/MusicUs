package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:01:58
 */
public class Tema {

    private String id;
    private ArrayList<Pregunta> preguntas;
    private String resumen;

    public Tema() {

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

    /**
     * @return the preguntas
     */
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * @return the resumen
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * @param resumen the resumen to set
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
