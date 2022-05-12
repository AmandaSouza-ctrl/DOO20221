/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.ArrayList;

/**
 *
 * @author 20181BSI0148
 */
public class Observavel {
    
    private ArrayList<Observador> monitores = new ArrayList();
    
    public void addObservardor(Observador ob) {
        this.monitores.add(ob);
    }
    
    public void deleteObservador(Observador ob) {
        monitores.remove(ob);
    }
    
    public void notificarObservadores(){
        for (Observador ob : monitores){
            ob.update(this);
        }
    }
    
}
