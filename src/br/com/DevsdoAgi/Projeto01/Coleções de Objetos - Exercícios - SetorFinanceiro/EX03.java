import java.util.*;
/*
Exercício 3 – Map (Produtos em Estoque)
Contexto:
Uma loja online precisa consultar rapidamente a quantidade em estoque de cada produto pelo código do produto.
Cada produto possui: codigo, nome, quantidade.
Desafio:
Crie a classe Produto.
Use Map<String, Produto> onde a chave é o código do produto.
Cadastre pelo menos 5 produtos.
Implemente consulta pelo código do produto.
Exiba todos os produtos com seus códigos e quantidades.
Objetivo: trabalhar com Map, associação chave → valor e busca rápida.
 */

public class Produto {
    private String codigo;
    private int quantidade;
    private String nome;

    public Produto(String codigo, int quantidade, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public void setId(String codigo){
        this.codigo = codigo;
    }
    public String getId(){
        return this.codigo;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){return quantidade;}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString(){
        return "\nCÓDIGO: " + this.codigo + "\nQUANTIDADE: " + this.quantidade + "\nNOME: " + this.nome;
    }

    public static void main(String[] args){
        Map<String, Produto> produtos = new HashMap<>();
        produtos.put("1", new Produto("1", 12, "Batata"));
        produtos.put("2", new Produto("2", 3, "Rato"));
        produtos.put("3", new Produto("3", 5, "Pneu"));
        produtos.put("4", new Produto("4", 7, "Aerofólio"));
        produtos.put("5", new Produto("5", 15, "Pessego"));

        System.out.println("Produtos em estoque:");
        for (Produto p : produtos.values()) System.out.println(p);

        String codigoBusca = "1";
        Produto p = produtos.get(codigoBusca);
        if (p != null) System.out.println("Produto encontrado: " + p);
        else System.out.println("Produto não encontrado!");

    }
}
