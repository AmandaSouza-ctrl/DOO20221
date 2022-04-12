/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica.abstrata.botoes;

/**
 *
 * @author amanda.souza
 */
public class FabricaDeBotoesComIcones extends FabricaAbstrataBotoes {
     
    @Override
    public JButton criaBotaoOK(){
        JButton button == new ButtonOK();
        button.setText("OK");
        return button;
    }
    
    @Override
    public JButton criaBotaoCancel(){
        JButton button == new ButtonCancel();
        button.setText("Cancelar");
        return button;
        
    }
    
}
