package co.edu.udea.musicus.entidades;

import co.edu.udea.musicus.gui.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author FelipeWin
 * @version 1.0
 * @created 08-dic-2014 17:01:54
 */
public class Juego implements ActionListener {
    
    private ArrayList<Fama> famas;
    private Jugador jugador;
    private ArrayList<Nivel> niveles;
    private final Ventana ventana;
    private Nivel nivelEnJuego;
    private int preguntaEnJuego;
    private int preguntasCorrectasEnJuego;
    private ArrayList<Tema> temas;
    private FacadePersistence persistencia;
    private CuestionarioBuilder cuestionarioBuilder;
    
    public Juego() {
        cargarTemas();
        crearNiveles();
        crearFamas();
        ventana = new Ventana();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        registrarComponponentesEventos();
    }
    
    public void jugar() {
        
        ventana.setPanelNivelBorderText("Nivel " + nivelEnJuego.getId() + ": " + nivelEnJuego.getTema().getId());
        Pregunta p = nivelEnJuego.getCuestionario().getPreguntas().get(preguntaEnJuego);
        ventana.getjLabelTextoPregunta().setText(p.getEnunciado());
        ventana.getjLabelImagenPregunta().setIcon(parseImagen(p.getImagen()));
        ventana.getjRadioButtonRespuestaA().setText(p.getRespuestas().get(0).getTextoRespuesta());
        ventana.getjRadioButtonRespuestaB().setText(p.getRespuestas().get(1).getTextoRespuesta());
        ventana.getjRadioButtonRespuestaC().setText(p.getRespuestas().get(2).getTextoRespuesta());
        ventana.getjRadioButtonRespuestaD().setText(p.getRespuestas().get(3).getTextoRespuesta());
        ventana.getjPanelInicio().setVisible(false);
        ventana.getjPanelNivel().setVisible(true);
        ventana.pack();
        
    }
    
    public final void registrarComponponentesEventos() {
        ventana.getjButtonRegistrar().addActionListener(this);
        ventana.getjButtonIniciar().addActionListener(this);
        ventana.getjButtonEnviarRespuesta().addActionListener(this);
    }
    
    public ImageIcon parseImagen(String strImagen) {
        ImageIcon icon = new ImageIcon(strImagen);
        return icon;
    }
    
    public final void crearNiveles() {
        
        niveles = new ArrayList<>();
        
        Nivel nivelUno = new Nivel();
        nivelUno.setId(1);
        nivelUno.setPuntosPregunta(30);
        nivelUno.setTema(temas.get(0));
        nivelUno.setNumeroPreguntas(3);
        
        Nivel nivelDos = new Nivel();
        nivelDos.setId(2);
        nivelDos.setPuntosPregunta(50);
        nivelDos.setTema(temas.get(1));
        nivelDos.setNumeroPreguntas(5);
        
        Nivel nivelTres = new Nivel();
        nivelTres.setId(3);
        nivelTres.setPuntosPregunta(80);
        nivelTres.setTema(temas.get(2));
        nivelTres.setNumeroPreguntas(10);
        
        niveles.add(nivelUno);
        niveles.add(nivelDos);
        niveles.add(nivelTres);
        
    }
    
    public final void cargarTemas() {
        persistencia = new FacadePersistence();
        temas = persistencia.getTemas();
    }
    
    public final void crearFamas() {
        
        famas = new ArrayList<>();
        
        Fama mozart = new Fama();
        mozart.setNombreFamoso("Wolfgang Amadeus Mozart");
        mozart.setImagenFamoso("mozart.jpg");
        
        Fama beethoven = new Fama();
        beethoven.setNombreFamoso("Ludwig van Beethoven");
        beethoven.setImagenFamoso("beethoven.jpg");
        
        Fama chaikovski = new Fama();
        chaikovski.setNombreFamoso("Piotr Ilich Chaikovski");
        chaikovski.setImagenFamoso("chaikovski.jpg");
        
        famas.add(mozart);
        famas.add(beethoven);
        famas.add(chaikovski);
        
    }
    
    public Respuesta getRespuestaByEnunciado(String enunciado) {
        for (Respuesta r : nivelEnJuego.getCuestionario().getPreguntas().get(preguntaEnJuego).getRespuestas()) {
            if (r.getTextoRespuesta().equals(enunciado)) {
                return r;
            }
        }
        return null;
    }
    
    public boolean nivelSuperado(Nivel n, int preguntasCorrectas) {
        Double ps = Double.parseDouble(String.valueOf(n.getNumeroPreguntas()));
        Double c = Double.parseDouble(String.valueOf(preguntasCorrectas));
        return c / ps > 0.6;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getjButtonRegistrar())) {
            jugador = Jugador.getInstancia();
            jugador.setNombre(ventana.getjTextFieldUsuario().getText());
            ventana.getjButtonRegistrar().setEnabled(false);
            ventana.getjTextFieldUsuario().setEnabled(false);
            ventana.getjButtonIniciar().setEnabled(true);
            ventana.getjComboBoxNiveles().setEnabled(true);
        }
        if (e.getSource().equals(ventana.getjButtonIniciar())) {
            if (ventana.getjComboBoxNiveles().getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(ventana, "Selecciona un nivel para comenzar a jugar.");
                return;
            }
            nivelEnJuego = niveles.get(ventana.getjComboBoxNiveles().getSelectedIndex() - 1);
            preguntaEnJuego = 0;
            preguntasCorrectasEnJuego = 0;
            cuestionarioBuilder = new ConcreteCuestionarioBuilder(nivelEnJuego);
            for (int i = 0; i < nivelEnJuego.getNumeroPreguntas(); i++) {
                cuestionarioBuilder.agregarPregunta();
            }
            nivelEnJuego.setCuestionario(cuestionarioBuilder.getCuestionario());
            jugar();
        }
        if (e.getSource().equals(ventana.getjButtonEnviarRespuesta())) {
            String rta = null;
            Enumeration<AbstractButton> botones = ventana.getButtonGroupRespuestas().getElements();
            while (botones.hasMoreElements()) {
                AbstractButton button = (AbstractButton) botones.nextElement();
                if (button.isSelected()) {
                    rta = button.getText();
                }
            }
            if (getRespuestaByEnunciado(rta).getCorrecta().equals("true")) {
                JOptionPane.showMessageDialog(ventana, "Correcto.\n+" + nivelEnJuego.getPuntosPregunta() + " puntos.");
                preguntasCorrectasEnJuego++;
            } else {
                JOptionPane.showMessageDialog(ventana, "Haz fallado.");
            }
            preguntaEnJuego++;
            if (preguntaEnJuego < nivelEnJuego.getCuestionario().getPreguntas().size()) {
                jugar();
            } else {
                ventana.getjPanelPregunta().setVisible(false);
                if (nivelSuperado(nivelEnJuego, preguntasCorrectasEnJuego)) {
                    jugador.setPuntaje(jugador.getPuntaje() + nivelEnJuego.getPuntosPregunta() * preguntasCorrectasEnJuego);
                    ventana.getjLabelResultado().setText("NIVEL SUPERADO");
                    ventana.getjLabelImagenPersonaje().setIcon(parseImagen(famas.get(nivelEnJuego.getId() - 1).getImagenFamoso()));
                    ventana.getjLabelValorPromedio().setText(preguntasCorrectasEnJuego + "/" + nivelEnJuego.getNumeroPreguntas());
                    ventana.getjLabelTextoReconocimiento().setText("Has ganado el reconimiento de " + famas.get(nivelEnJuego.getId() - 1).getNombreFamoso());
                }
            }
        }
    }
}
