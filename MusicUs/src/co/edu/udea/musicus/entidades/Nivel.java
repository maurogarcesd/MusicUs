package co.edu.udea.musicus.entidades;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:01:56
 */
public class Nivel {

    private Cuestionario cuestionario;
    private int id;
    private int PuntosPregunta;
    private Tema tema;
    private int numeroPreguntas;

    public Nivel() {

    }

    /**
     * @return the cuestionario
     */
    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    /**
     * @param cuestionario the cuestionario to set
     */
    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the PuntosPregunta
     */
    public int getPuntosPregunta() {
        return PuntosPregunta;
    }

    /**
     * @param PuntosPregunta the PuntosPregunta to set
     */
    public void setPuntosPregunta(int PuntosPregunta) {
        this.PuntosPregunta = PuntosPregunta;
    }

    /**
     * @return the tema
     */
    public Tema getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(Tema tema) {
        this.tema = tema;
    }

    /**
     * @return the numeroPreguntas
     */
    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    /**
     * @param numeroPreguntas the numeroPreguntas to set
     */
    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }
}
