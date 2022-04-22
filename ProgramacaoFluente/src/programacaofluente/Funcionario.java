/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacaofluente;

/**
 *
 * @author amanda souza
 */


public class Funcionario {
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private String cargo;

    public Funcionario comNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Funcionario comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
     public Funcionario comCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }
    public Funcionario comEmail(String email) {
        this.email = email;
        return this;
    }
    
     public Funcionario comCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }
}