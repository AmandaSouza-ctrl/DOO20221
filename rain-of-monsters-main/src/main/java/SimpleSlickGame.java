





/**
 *
 * @author felipe
 */
import game.observer.ControleColisao;
import game.Heroi;
import game.Inimigo;
import game.InimigoEsperto;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import java.io.*;

public class SimpleSlickGame extends BasicGame {
    private int timeCount = 0;    
    private Image land;
    private Inimigo inimigo1;
    private Inimigo inimigo2;
    private Inimigo inimigo3;
    private InimigoEsperto inimigoEsperto;
    private Image gameover;
    private Image ganhouJogo;

    boolean ganhou=false;
    int time;
  
    Heroi heroi;

    public SimpleSlickGame(String gamename) {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
        try {
            File file = new File(".");
            String filePath = file.getCanonicalPath();
            
            

            land = new Image(filePath + "\\src\\main\\java\\bg.png");
            heroi = new Heroi(filePath + "\\src\\main\\java\\heroi1.png", 200, 400);
            
            inimigo1 = new Inimigo(filePath + "\\src\\main\\java\\devil1.png", 500, -100);
            inimigo2 = new Inimigo( filePath + "\\src\\main\\java\\devil2.png",300 , -00);
            inimigo3 = new Inimigo(filePath + "\\src\\main\\java\\devil3.png", 400, -250);
            
            
            inimigoEsperto = new InimigoEsperto(filePath + "\\src\\main\\java\\devil3.png", 200, -250);
            
            
            FabricaDeNotificacoes fabrica = new FabricaDeNotificacoes();
            
            try{
                gameover = fabrica.criarImagensNotificacao(FabricaDeNotifcacoes.Notificacoes.GAMEOVER);
                ganhouJogo = fabrica.criarImagensNotificacao(FabricaDeNotifcacoes.Notificacoes.WINNER);
            }catch (Exception ex){
                Logger.getLogger(SimpleSlickGame.class.getName()).log(level.SEVERE, null, ex);
         
            }
            

            
            heroi.addMonitores(inimigo1);
            heroi.addMonitores(inimigo2);
            heroi.addMonitores(inimigo3);
            heroi.addMonitores(inimigoEsperto);

            ControleColisao controleColisao = new ControleColisao(gc);
            heroi.addMonitores(controleColisao);            
            inimigo1.addMonitores(controleColisao);
            inimigo2.addMonitores(controleColisao);
            inimigo3.addMonitores(controleColisao);
            inimigoEsperto.addMonitores(controleColisao);
            
        } catch (IOException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        
       
        g.drawImage(land, 0, 0);
        g.drawString("Time : " + time/1000 + " of 10" , 510, 20 );
        heroi.render();
        inimigo2.render();
        inimigo3.render();
        inimigo1.render(); 
        inimigoEsperto.render();
       
        if(time/1000 >= 10){
            gc.pause();
            ganhouJogo.draw(200,200);
        }
        if(gc.isPaused() && time/1000 < 10)
            gameover.draw(200,200);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);            
            appgc.start();
        } catch (SlickException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {        
        if(!gc.isPaused()){
         time += i;
         
                 
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_UP))
            this.heroi.setPosY(this.heroi.getPosY() - 2);        
        if (input.isKeyDown(Input.KEY_DOWN)) 
            this.heroi.setPosY(this.heroi.getPosY() + 2);        
        if (input.isKeyDown(Input.KEY_LEFT)) 
            this.heroi.setPosX(this.heroi.getPosX() - 2);        
        if (input.isKeyDown(Input.KEY_RIGHT))
            this.heroi.setPosX(this.heroi.getPosX() + 2);        
        timeCount++;
        if (timeCount == 20){ 
            heroi.notificarTodos();                    
            inimigo1.notificarTodos();
            inimigo2.notificarTodos();
            inimigo3.notificarTodos();
            inimigoEsperto.notificarTodos();
            timeCount=0;
            }
        }
        
    }
}
