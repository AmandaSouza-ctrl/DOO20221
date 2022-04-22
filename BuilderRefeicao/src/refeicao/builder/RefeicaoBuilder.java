

package refeicao.builder;

import refeicao.modelo.Batata;
import refeicao.modelo.Refeicao;
import refeicao.modelo.Refrigerante;
import refeicao.modelo.Suco;

/**
 *
 * @author felipe
 */
public abstract class RefeicaoBuilder {    
    Refeicao refeicao;        
    
    public void adicionarSuco(String sabor){                                
        refeicao.setBebida(new Suco(sabor));        
    }   
       
    public void adicionarRefrigerante(String sabor){
        refeicao.setBebida(new Refrigerante(sabor));        
    }   
    
    
    public void adicionarBatata(){
            refeicao.setBatata(new Batata());        
    }  
    
}
