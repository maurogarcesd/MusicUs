package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 01-dic-2014 09:50:07 p.m.
 */
public class Tema {
    private String id;
   
    private ArrayList<Pregunta> preguntas;
	public Tema(){
            preguntas = new ArrayList<>();

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

}