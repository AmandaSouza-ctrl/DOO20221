
import programacaofluente.Funcionario;

/**
 *
 * @author amanda souza
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Funcionario funcionario = new Funcionario();
        funcionario.comNome("Amanda")
                  .comTelefone("99999999")
                  .comCpf("123456789")
                  .comEmail("amandasouza@gmail.com")
                  .comCargo("estagiária");
        
        
    
    }
    
}
