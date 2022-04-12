/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

import fabrica.abstrata.modelo.EnvioSMSClaro;
import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.CobrancaClaro;
import fabrica.abstrata.modelo.Cobranca;

/**
 *
 * @author felipe
 */
public class FabricaClaro extends FabricaAbstrataEnvios{ 

    @Override
    public  Cobranca criaCobranca() {
        return new CobrancaClaro();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSClaro(); 
    }
}

