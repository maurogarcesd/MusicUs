package co.edu.udea.musicus.entidades;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 01-dic-2014 09:50:07 p.m.
 */
public class Respuesta {

	private String correcta;
        private String texto;

	public Respuesta(){

	}

    /**
     * @return the correcta
     */
    public String isCorrecta() {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

}