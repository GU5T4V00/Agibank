package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class Produto {
    public Scanner sc = new Scanner(System.in);
    public String nome;
    public Double preco;
    public int quantidade;

    public void adicionarEstoque(){
        System.out.println("Informe a quantidade a ser adicionada:");
        quantidade = quantidade + sc.nextInt();
    }

    public void removerEstoque(){
        System.out.println("Informe a quantidade a ser removida:");
        quantidade = quantidade - sc.nextInt();
    }

    public void colocarPreco(){
        System.out.println("Informe o preço do produto");
        preco = sc.nextDouble();
    }

    public void exibirDados(){
        System.out.println("O produto: " + this.nome);
        System.out.println("Está com o preço de: " + this.preco);
        System.out.println("E uma quantidade de: " + this.quantidade);

    }
}
