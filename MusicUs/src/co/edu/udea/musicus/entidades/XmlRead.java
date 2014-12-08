/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.musicus.entidades;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Big Computer
 */
public class XmlRead {

    static NodeList listaTemas;

    public static void main(String[] args) throws Exception {

        try {
            File xmFile = new File("Preguntas.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmFile);
            listaTemas = document.getElementsByTagName("tema");

        } catch (ParserConfigurationException ex) {
            System.out.println(ex);
        }
        

    }

    public static ArrayList<Tema> getTemas() {
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

                        NodeList listaRespuestas = elPregunta.getElementsByTagName("respuesta");

                        int respuestas = listaRespuestas.getLength();

                        for (int k = 0; k < respuestas; k++) {
                            respuesta = new Respuesta();
                            respuesta.setTexto(elPregunta.getElementsByTagName("respuesta").item(k).getTextContent());
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
