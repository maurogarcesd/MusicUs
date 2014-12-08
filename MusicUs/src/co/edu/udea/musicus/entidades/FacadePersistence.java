package co.edu.udea.musicus.entidades;

import java.util.ArrayList;

/**
 * @author teo
 * @version 1.0
 * @created 08-dic-2014 17:02:01
 */
public class FacadePersistence {

    public FacadePersistence() {

    }

    public ArrayList<Tema> getTemas() {
        PersistenceXML pxml = new PersistenceXML();
        return pxml.getTemas();
    }
}
