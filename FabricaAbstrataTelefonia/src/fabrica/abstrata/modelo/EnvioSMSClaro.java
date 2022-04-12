/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.modelo;

import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.Mensagem;

/**
 *
 * @author felip
 */
public class EnvioSMSClaro implements EnvioSMS{

    
    //public EnvioSMSClaro() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone claro:" + telefone );
        return true;
    }
}
