/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightsempadrao;

/**
 *
 * @author 20181BSI0148
 */
public class StatusItem {

    StatusItem(Estado estado, boolean podeCancelar, boolean compraConcluida) {
        this.estado = estado;
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;
    }
        
    public enum Estado { 
        CARRINHO, FECHADO, PAGO, ENVIADO , ENTREGUE 
    }
    Estado estado;
    boolean podeCancelar;
    boolean compraConcluida;
}
