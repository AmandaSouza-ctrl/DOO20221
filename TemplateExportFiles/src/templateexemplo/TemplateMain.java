
package templateexemplo;

import templateexemplo.template.Word; 
import templateexemplo.template.Html;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      Word exportWord = new Word();
      exportWord.export(texto);
      Html exportHtml = new Html();
      exportHtml.export(texto);
      
    }
    
}
