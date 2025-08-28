import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;

/*
Exercício 2 – Set (Evitar Duplicados)
Contexto:
Uma empresa de assinaturas de newsletter precisa garantir que cada e-mail seja único, mesmo que alguém tente se cadastrar várias vezes.
Cada assinante possui: id, nome, email.
Desafio:
Crie a classe Assinante.
Use Set<Assinante> para armazenar os assinantes.
Sobrescreva equals e hashCode baseando-se apenas no email.
Cadastre alguns assinantes, incluindo emails repetidos propositalmente.
Mostre que duplicados não são aceitos.
Objetivo: trabalhar com Set e garantir unicidade usando equals e hashCode.
 */

public class Assinante {
    private int id;
    private String nome;
    private String email;

    public Assinante(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
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
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){return email;}

    @Override
    public String toString(){
        return "\nID: " + this.id + "\nAssinante: " + this.nome + "\nEmail: " + this.email;
    };

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Assinante)) return false;
        Assinante other = (Assinante) obj;
        return Objects.equals(this.email, other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public static void main(String[] args){
        Set<Assinante> assinantes = new LinkedHashSet<>();
        assinantes.add(new Assinante(1, "Gustavo", "gu@gmail.com"));
        assinantes.add(new Assinante(2, "Davi", "da@gmail.com"));
        assinantes.add(new Assinante(3, "Guilherme", "gui@gmail.com"));
        assinantes.add(new Assinante(4, "Nelson", "ne@gmail.com"));
        assinantes.add(new Assinante(5, "Thiago", "thi@gmail.com"));
        assinantes.add(new Assinante(5, "Thiago", "thi@gmail.com"));
        assinantes.add(new Assinante(3, "Guilherme", "gui@gmail.com"));

        for (Assinante piripopo : assinantes) System.out.println(piripopo);
    }
}
