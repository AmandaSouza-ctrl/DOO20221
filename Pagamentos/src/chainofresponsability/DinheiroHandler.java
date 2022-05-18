/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import javax.swing.JOptionPane;

/**
 *
 * @author 20181BSI0148
 */

public class DinheiroHandler extends AbstractPagamentoHandler{
  
    public static final int DINHEIRO =3;  
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                + " com dinheiro?", valor);
        JOptionPane.showMessageDialog(null, "Pago com dinheiro. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
    @Override
    protected int getTipoPagamento() {
        return DINHEIRO;
    }

}
