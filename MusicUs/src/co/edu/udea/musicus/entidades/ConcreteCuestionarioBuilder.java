package co.edu.udea.musicus.entidades;

import java.util.Collections;
import java.util.Random;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:02:01
 */
public class ConcreteCuestionarioBuilder implements CuestionarioBuilder {

    private final Cuestionario cuestionario;
    private final Nivel nivel;

    public ConcreteCuestionarioBuilder(Nivel nivel) {
        this.nivel = nivel;
        cuestionario = new Cuestionario();
    }

    @Override
    public void agregarPregunta() {

        int k = 1;
        while (k > 0) {
            Pregunta p = nivel.getTema().getPreguntas().get((int) (Math.random() * nivel.getTema().getPreguntas().size()));
            Pregunta pc = new Pregunta();
            pc.setEnunciado(p.getEnunciado());
            pc.setImagen(p.getImagen());
            pc.setId(p.getId());
            if (!existePregunta(pc)) {
                int i = 1;
                while (i > 0) {
                    Respuesta r = p.getRespuestas().get((int) (Math.random() * p.getRespuestas().size()));
                    if (r.getCorrecta().equals("true")) {
                        pc.getRespuestas().add(r);
                        i--;
                    }
                }
                int j = 3;
                while (j > 0) {
                    Respuesta r = p.getRespuestas().get((int) (Math.random() * p.getRespuestas().size()));
                    if (r.getCorrecta().equals("false") && !existeRespuesta(r.getTextoRespuesta(), pc)) {
                        pc.getRespuestas().add(r);
                        j--;
                    }
                }
                revolverRespuestas(pc);
                cuestionario.getPreguntas().add(pc);
                k--;
            }
        }

    }

    public boolean existePregunta(Pregunta pc) {
        for (Pregunta p : cuestionario.getPreguntas()) {
            if (p.getId().equals(pc.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean existeRespuesta(String enunciado, Pregunta p) {
        for (Respuesta r : p.getRespuestas()) {
            if (r.getTextoRespuesta().equals(enunciado)) {
                return true;
            }
        }
        return false;
    }

    public void revolverRespuestas(Pregunta p) {
        long seed = System.nanoTime();
        Collections.shuffle(p.getRespuestas(), new Random(seed));
    }

    @Override
    public Cuestionario getCuestionario() {
        return cuestionario;
    }
}
