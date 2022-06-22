
package templateexemplo.template;

/**
 *
 * @author amanda.souza
 */
public abstract class ExportTemplate {
    
    //template método
    
    public void export(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save();   
    }
    
    public abstract void printLine(String linhas);
    public abstract void save();
}
