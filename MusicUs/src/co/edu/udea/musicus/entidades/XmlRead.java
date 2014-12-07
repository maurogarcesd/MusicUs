/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.musicus.entidades;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static void main(String[] args) throws Exception { 
        
         try {
            File xmFile = new File("src\\co\\edu\\udea\\musicus\\resources\\Preguntas.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmFile);
            NodeList list = document.getElementsByTagName("tema");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
   

    
    public ArrayList<Tema> getTemas() {
        ArrayList<Tema> temas = new ArrayList<>();
        Tema tema = new Tema();
        Pregunta pregunta = new Pregunta();
        Respuesta respuesta = new Respuesta();
        

        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Tema de Estudio  " + element.getAttribute("id"));

                NodeList list2 = element.getChildNodes();
                for (int j = 0; j < list2.getLength(); j++) {
                    Node node2 = list2.item(j);
                    if (node2.getNodeType() == Node.ELEMENT_NODE) {
                        Element element2 = (Element) node2;
//            System.out.println("pregunta");
                        System.out.println(element2.getAttribute("id"));
                        System.out.println(element2.getElementsByTagName("enunciado").item(0).getTextContent());
                        System.out.println(element2.getElementsByTagName("respuesta").item(0).getTextContent());
                        System.out.println(element2.getElementsByTagName("respuesta").item(0).getAttributes().getNamedItem("correcta"));
                        System.out.println(element2.getElementsByTagName("respuesta").item(1).getTextContent());
                        System.out.println(element2.getElementsByTagName("respuesta").item(2).getTextContent());
                        System.out.println(element2.getElementsByTagName("respuesta").item(3).getTextContent());
                        System.out.println(element2.getAttribute("correcta"));

//            NodeList list3= element.getChildNodes();
//            Node node3 =list3.item(j);  
//            if(node3.getNodeType() == Node.ELEMENT_NODE){
//            Element element3 = (Element)node3;
//            System.out.println(element3.getAttribute("enunciado"));
//            System.out.println("Enunciado  " + element2.getAttributeNode("enunciado"));
//            }
//                    
//                    
                    }
                }

            }
        }
        return temas;

    }}

