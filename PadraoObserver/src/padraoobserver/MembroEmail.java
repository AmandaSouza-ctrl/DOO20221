/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

/**
 *
 * @author 20181BSI0148
 */
public class MembroEmail implements Observador{
    public String email; 

    @Override
    public void update(Observavel ob) {
        
        CaixaEntradaGrupo ceg = (CaixaEntradaGrupo) ob;
        
        System.out.println (ceg.getMensagem()+ " para o email "+email);
        
   
        
        
            
        
    }
}
