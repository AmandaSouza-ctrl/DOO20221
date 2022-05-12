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
public class CaixaEntradaGrupo extends Observavel{
    public String novaMensagem; 
 
    public void setNovaMensagem (String mensagem){
        this.novaMensagem = mensagem; 
        
        notificarObservadores();
    }
    
    public String getMensagem(){
        return novaMensagem;
    }
    
   
}

