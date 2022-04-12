
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

package game;

/**
 *
 * @author amanda.souza
 */
public class FabricaDeNotificacoes {
    String filePath;
    public enum Notificacoes {
        GAMEOVER, WINNER;
    }
    
    public FabricaDeNotificacoes(){
        try{
            File file = new File(".");
            filePath = file.getCanonicalPath();
        }catch (IOException ex){
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public Image criaImagensNotificacao(Notificacoes tipo) throws SlickException, Exception {
        Image img;
        if (null == tipo){
            throw new Exception ("Notificação não encontrada");
        }else{
            switch (tipo){
                case GAMEOVER:
                    img = new Image(filePath + "\\src\\main\\java\\gameover.png");
                    break;
                case WINNER:
                    img = new Image(filePath + "\\src\\main\\java\\ganhou.png");
                    break;
                default:
                    throw new Exception ("Notificação não encontrada");
            }
        }
        return img;
    }
    
}
