
package refeicao.modelo;

import refeicao.Bebida;

/**
 *
 * @author felipe
 */
public class Refeicao {
    
    private Hamburger hamburger;
    private Bebida bebida;
    private Batata batata;

    public Hamburger getHamburger() {
        return hamburger;
    }
    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    public Bebida getBebida() {
        return bebida;
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }       

    public void setBatata(Batata batata) {
        this.batata = batata;
    }
}
