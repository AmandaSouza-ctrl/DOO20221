package usuario;

import java.io.Serializable;
import java.util.LinkedList;


public class Usuario implements Serializable{

    String nome;
    private String email;
    private String senha;   
    private LinkedList<Mensagem> mensagens;   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void addMensagens(Mensagem msg) {
        this.mensagens.add(msg);
    }

    public LinkedList<Mensagem> getMensagens() {
        return mensagens;
    }
}
