package co.edu.udea.musicus.entidades;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:01:58
 */
public class Respuesta {

    private String correcta;
    private String textoRespuesta;

    public Respuesta() {

    }

    /**
     * @return the textoRespuesta
     */
    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    /**
     * @param textoRespuesta the textoRespuesta to set
     */
    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    /**
     * @return the correcta
     */
    public String getCorrecta() {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }
}
