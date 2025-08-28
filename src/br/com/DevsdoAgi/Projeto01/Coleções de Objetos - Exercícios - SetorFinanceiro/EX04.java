import java.util.*;
/*
Exercício 4 – Agenda Telefônica – Set + List
Contexto:
Uma empresa quer manter contatos únicos, mas também exibir a lista ordenada por nome.
Requisitos:
Criar a classe Contatocom nome, telefone e email.
Usar Set<Contato> para armazenar contatos sem duplicatas (unicidade baseada no email).
Converter o Set em List<Contato> para exibição ordenada por nome.
Exibir todos os contatos.
 */

public class Contato{
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome ,String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){return email;}

    @Override
    public String toString(){
        return "\nCÓDIGO: " + this.telefone + "\nemail: " + this.email + "\nNOME: " + this.nome;
    }

    public static void main(String[] args){
        Set<Contato> contatos = new HashSet<>();
        contatos.add(new Contato( "Gustavo", "123123123","gu@gmail.com"));
        contatos.add(new Contato( "Davi", "123123122","da@gmail.com"));
        contatos.add(new Contato( "Guilherme", "123123121","gui@gmail.com"));
        contatos.add(new Contato( "Nelson", "123123124","ne@gmail.com"));
        contatos.add(new Contato( "Thiago", "123123125","thi@gmail.com"));
        contatos.add(new Contato( "Thiago", "123123125", "thi@gmail.com"));
        contatos.add(new Contato( "Guilherme", "123123121", "gui@gmail.com"));
    }
}
