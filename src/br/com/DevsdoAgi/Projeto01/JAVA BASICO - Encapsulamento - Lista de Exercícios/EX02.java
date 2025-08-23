package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
2. Produto (Setor Varejo)
Crie a classe Produto com os atributos privados:
nome (String)
preco (double)
estoque (int)
Implemente os métodos get e set, com as seguintes regras:
O preço não pode ser negativo
O estoque só pode ser alterado via adicionarEstoque() ou removerEstoque()
Crie um método exibirProduto() para imprimir nome, preço e estoque atual.
*/

public class EX02{
}
class Produto {
    private String nome;
    private double preco;
    private int estoque;
    public boolean verific;

    public Produto() {
        this.nome = "Desconhecido";
        this.preco = 0.00;
        this.estoque = 0;
        this.verific = true;
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco, boolean verific) {
        if (0 < preco) {
            this.verific = false;
            this.preco = preco;
        } else {
            System.out.println("Valor invalido para preço");
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + getNome());
        System.out.println("Quantidade em estoque: " + getEstoque());
        System.out.println("Preço: " + getPreco());
    }
}
class ContaBancariaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto produto1 = new Produto();
        System.out.println("Informe o nome do produto: ");
        String np = sc.nextLine();
        produto1.setNome(np);
        while (produto1.verific){
            System.out.println("Informe o preço do produto: ");
            double pp = sc.nextDouble();
            produto1.setPreco(pp, produto1.verific);
        }
        System.out.println("Informe a quantidade em estoque do produto: ");
        int ep = sc.nextInt();
        produto1.setEstoque(ep);
        produto1.exibirProduto();
    }
}
