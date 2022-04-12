/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author amanda.souza
 */
public class FabricaDeBotoesSemIcones extends FabricaAbstrataBotoes {

    @Override
    public JButton criaBotaoOK() {
        JButton button == new JButton();
        button.setText("OK");
        return button;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton button == new JButton();
        button.setText("Cancelar");
        return button;
    }
   
    
}
