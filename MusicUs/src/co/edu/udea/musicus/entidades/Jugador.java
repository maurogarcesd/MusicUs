package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @version 1.0
 * @created 08-dic-2014 17:01:55
 */
public class Jugador {

    private ArrayList<Fama> fama;
    private static Jugador instancia;
    private String nombre;
    private int puntaje;

    private void Jugador() {
        fama = new ArrayList<>();
        puntaje = 0;
    }

    public static Jugador getInstancia() {
        if (instancia == null) {
            instancia = new Jugador();
            return instancia;
        } else {
            return instancia;
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
