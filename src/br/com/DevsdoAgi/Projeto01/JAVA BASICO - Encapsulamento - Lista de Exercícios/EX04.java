package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
4. Carrinho de Compras (Setor Varejo)
Crie a classe ItemCarrinho com os atributos privados:
produto (String)
quantidade (int)
precoUnitario (double)
Implemente os métodos de acesso e validação:
Quantidade não pode ser menor que 1
Preço unitário deve ser positivo
Adicione um método calcularSubtotal() que retorna quantidade * precoUnitario.
*/

public class EX04{
}
class ItemCarrinho {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    public boolean bool1;
    public boolean bool2;

    public ItemCarrinho() {
        this.produto = "Desconhecido";
        this.quantidade = 0;
        this.precoUnitario = 0.00;
        this.bool1 = true;
        this.bool2 = true;
    }

    public void setProduto(String produto){
        this.produto=produto;
    }
    public String getProduto(){
        return this.produto;
    }

    public void setQuantidade(int quantidade){
        if (1 <= quantidade){
            this.quantidade = quantidade;
            this.bool1 = false;
        }else{
            System.out.println("Valor inserido é invalido, não é possível cadastras um produto com quantidade 0, insira valores inteiros maiores ou iguais à 1");
        }
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public void setPrecoUnitario(double precoUnitario){
        if(0 < precoUnitario){
            this.precoUnitario = precoUnitario;
            this.bool2 = false;
        }else{
            System.out.println("Valor do produto não pode ser negativo, insira outro valor");
        }
    }

    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public double calcularSubtotal(){
        return (this.quantidade*this.precoUnitario);
    }

    public void carrinhoDeCompras(){
        System.out.println("PRODUTO: " + getProduto());
        System.out.println("QUANTIDADE: " + getQuantidade());
        System.out.println("PREÇO UNITÁRIO: " + getPrecoUnitario());
        System.out.printf("PREÇO TOTAL: %.2f", calcularSubtotal());

    }
}
class ItemCarrinhoMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ItemCarrinho carrinho1 = new ItemCarrinho();
        System.out.println("Informe o nome do Produto: ");
        String np = sc.nextLine();
        carrinho1.setProduto(np);
        while(carrinho1.bool1){
            System.out.println("Informe a quantidade: ");
            int qp = sc.nextInt();
            carrinho1.setQuantidade(qp);
        }
        while(carrinho1.bool2){
            System.out.println("Informe o Preço Unitário: ");
            double pu = sc.nextDouble();
            carrinho1.setPrecoUnitario(pu);
        }
        carrinho1.carrinhoDeCompras();
    }
}
