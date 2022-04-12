package game.fabrica;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;

public class FabricaDeNotificacoes {
    String filePath;
    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) {        
 
        Image img = null;
        //Termine a implementacao da fabrica
        //use a imagem gameover.png para notificar que o usuario perdeu o jogo 
        //e use as imagem ganhou.png para notiricar que o usuario genhou o jogo
      
        return img;
    }

   

}