
package refeicao.modelo;

import refeicao.Bebida;

/**
 *
 * @author felipe
 */
public class Refrigerante extends Bebida{
    
   
    public Refrigerante(String sabor){  
        System.out.println("cria refrigerante com sabor:" + sabor);
        this.setSabor(sabor);
    }
    
}
