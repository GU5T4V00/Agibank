package br.com.DevsdoAgi.Projeto01;

import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o produto?");
        String nomeDoItem = sc.nextLine();
        Produto banana= new Produto();
        banana.nome = nomeDoItem;
        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - Adicionar Produto ao Estoque");
        System.out.println("2 - Remover Produto do Estoque");
        System.out.println("3 - Adicionar Preço");
        System.out.println("4 - Exibir Dados");
        System.out.println("5 - Encerrar");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                banana.adicionarEstoque();
                break;
            case 2:
                banana.removerEstoque();
                break;
            case 3:
                banana.colocarPreco();
                break;
            case 4:
                banana.exibirDados();
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;
        }
    }

    public static class ClienteVIP {
    }
}
