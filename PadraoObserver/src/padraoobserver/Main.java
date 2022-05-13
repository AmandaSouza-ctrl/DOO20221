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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MembroEmail me = new MembroEmail();
        MembroWhatsapp mw = new MembroWhatsapp();
        
        me.email = "amanda@ifes.com";
        mw.numero = 9999999;
        
        CaixaEntradaGrupo ceg = new CaixaEntradaGrupo();
        CaixaEntradaGrupo ceg2 = new CaixaEntradaGrupo();

        ceg.addObservardor(me);
        ceg2.addObservardor(mw); 
        
        ceg.setNovaMensagem("segue anexo");

        ceg2.setNovaMensagem("oi");
        ceg2.setNovaMensagem("td bem?");

                
    }
    
}
