/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.musicus.entidades;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Big Computer
 */
public class XmlRead {
public static  void  main(String[] args) throws Exception{

    
    File xmFile = new File("src\\co\\edu\\udea\\musicus\\resources\\Preguntas.xml");
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document document = documentBuilder.parse(xmFile);
    
    NodeList list = document.getElementsByTagName("tema");
    
    for (int i = 0; i < list.getLength(); i++){
        Node node =list.item(i);
        
        if(node.getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element)node;
           System.out.println("Tema de Estudio  " + element.getAttribute("id"));
            NodeList list2= element.getChildNodes();
             for (int j = 0; j < list2.getLength(); j++){
            Node node2 =list2.item(j);  
            if(node2.getNodeType() == Node.ELEMENT_NODE){
            Element element2 = (Element)node2;
            System.out.println("pregunta");
            System.out.println(element2.getNodeValue());
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
        
    
}}
            
            
}}