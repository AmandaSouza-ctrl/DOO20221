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
public class ChequeHandler extends AbstractPagamentoHandler {
    
      public static final int CHEQUE =4;  
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                + " com cheque?", valor);
        JOptionPane.showMessageDialog(null, "Pago com cheque. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
    @Override
    protected int getTipoPagamento() {
        return CHEQUE;
    }

}

