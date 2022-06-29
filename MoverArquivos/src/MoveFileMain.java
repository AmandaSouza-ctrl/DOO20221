
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;

/**
 *
 * @author felipe
 */
public class MoveFileMain implements Runnable {

    private static File listaFiles[] = null;

    public static void main(String args[]) throws IOException, InterruptedException {

        final long startTime = System.currentTimeMillis();// tempo incial
        listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
       
        Runnable estrategia1 = new MoveFileThread(listaFiles);
        Runnable estrategia2 = new MoveFileThread(listaFiles);
        
        Thread thread1 = new Thread (estrategia1);
        Thread thread2 = new Thread (estrategia2);
        
        thread1.start();
        thread2.start();

                
    }
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }

    @Override
    public void run() {
       throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
    }
    
   
    
   
}
