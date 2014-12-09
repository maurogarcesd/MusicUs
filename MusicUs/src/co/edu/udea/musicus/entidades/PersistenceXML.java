package co.edu.udea.musicus.entidades;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author teo
 * @version 1.0
 * @created 08-dic-2014 17:02:02
 */
public class PersistenceXML {

    public PersistenceXML() {

    }

    public ArrayList<Tema> getTemas() {
        NodeList listaTemas = null;
        try {
            File xmFile = new File("Preguntas.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmFile);
            listaTemas = document.getElementsByTagName("tema");
        } catch (ParserConfigurationException ex) {
            System.out.println(ex);
        } catch (SAXException | IOException ex) {
            System.out.println(ex);
        }
        ArrayList<Tema> temas = new ArrayList<>();
        Tema tema = null;
        Pregunta pregunta = null;
        Respuesta respuesta = null;

        for (int i = 0; i < listaTemas.getLength(); i++) {
            Node nodoTemas = listaTemas.item(i);
            if (nodoTemas.getNodeType() == Node.ELEMENT_NODE) {

                Element elTema = (Element) nodoTemas;
                tema = new Tema();
                tema.setId(elTema.getAttribute("id"));
                NodeList listaPreguntas = elTema.getElementsByTagName("pregunta");

                for (int j = 0; j < listaPreguntas.getLength(); j++) {
                    Node nodoPreguntas = listaPreguntas.item(j);
                    if (nodoPreguntas.getNodeType() == Node.ELEMENT_NODE) {
                        Element elPregunta = (Element) nodoPreguntas;

                        pregunta = new Pregunta();
                        pregunta.setId(elPregunta.getAttribute("id"));
                        pregunta.setEnunciado(elPregunta.getElementsByTagName("enunciado").item(0).getTextContent());
                        pregunta.setImagen(elPregunta.getElementsByTagName("imagen").item(0).getTextContent());

                        NodeList listaRespuestas = elPregunta.getElementsByTagName("respuesta");

                        int respuestas = listaRespuestas.getLength();

                        for (int k = 0; k < respuestas; k++) {
                            respuesta = new Respuesta();
                            respuesta.setTextoRespuesta(elPregunta.getElementsByTagName("respuesta").item(k).getTextContent());
                            respuesta.setCorrecta(elPregunta.getElementsByTagName("respuesta").item(k).getAttributes().getNamedItem("correcta").getTextContent());
                            pregunta.getRespuestas().add(respuesta);
                        }

                    }
                    tema.getPreguntas().add(pregunta);
                }
            }
            temas.add(tema);
        }
        return temas;
    }
}
