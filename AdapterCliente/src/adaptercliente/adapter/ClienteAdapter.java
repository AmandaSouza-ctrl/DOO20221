
package adaptercliente.adapter;

import adaptercliente.model.Cliente;
import lib.ClienteExterno;


public class ClienteAdapter extends Cliente {
    private final Cliente cliente = new Cliente();
	
	
    public ClienteAdapter (ClienteExterno externo){
        this.cliente.setNomeCompleto(externo.getNome() + " " + externo.getSobreNome());
        this.cliente.setTelefone(externo.getDddTelefone() + externo.getTelefone());
        this.cliente.setCelular(externo.getDddCelular() + externo.getCelular());
        this.cliente.setEmail(externo.getEmail());
    }

    public Cliente getCliente(){
        return this.cliente;
    }
}
