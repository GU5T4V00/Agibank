import java.util.ArrayList;
import java.util.List;

/*
 Exercício 1 – List (Clientes em Ordem de Chegada)
Contexto:
 Um sistema de cadastro de clientes precisa manter a ordem de chegada para promoções especiais.
Cada cliente possui: id, nome, cpf.
Desafio:
Crie a classe Cliente.
Use List<Cliente> para armazenar os clientes.
Cadastre pelo menos 5 clientes.
Exiba todos os clientes na ordem de cadastro.
Implemente busca de cliente por CPF.
Objetivo: trabalhar com List, ordem de inserção e busca linear.
 */

public class Cliente {
    private int id;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){return cpf;}

    @Override
    public String toString(){
        return "\nID: " + this.id + "\nCLIENTE: " + this.nome + "\nCPF: " + this.cpf;
    };

    public static void main(String[] args){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Gustavo", "123123123-00"));
        clientes.add(new Cliente(2, "Davi", "123123123-01"));
        clientes.add(new Cliente(3, "Guilherme", "123123123-02"));
        clientes.add(new Cliente(4, "Nelson", "123123123-03"));
        clientes.add(new Cliente(5, "Thiago", "123123123-04"));

        for (Cliente piripopo : clientes) System.out.println(piripopo);
    }
}
