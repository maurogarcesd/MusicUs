package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:02:00
 */
public class Cuestionario {

    private final ArrayList<Pregunta> preguntas;

    public Cuestionario() {
        preguntas = new ArrayList<>();
    }

    /**
     * @return the preguntas
     */
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
}
