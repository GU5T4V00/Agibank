package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
5. Classe Funcionario – Folha de Pagamento
Crie a classe Funcionario com:
nome (String)
salarioBruto (double)
descontoINSS (double)
descontoIR (double)
Métodos:
double calcularSalarioLiquido()
void exibirFolhaPagamento()
Objetivo: calcular o salário líquido de um funcionário e imprimir a folha de pagamento com os descontos aplicados.
*/

public class EX05 {
}
class Funcionario {
    Scanner sc = new Scanner(System.in);
    public String nome;
    private double salarioBruto;
    private double descontoDoInss;
    private double descontoIR;

    public Funcionario() {
        this.nome = "Não Informado";
        this.salarioBruto = 0.00;
        this.descontoDoInss = 0.00;
        this.descontoIR = 0.00;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    public void setDescontoDoInss(double descontoDoInss){
        this.descontoDoInss = descontoDoInss;
    }

    public double getDescontoDoInss(){
        return this.descontoDoInss;
    }

    public void setDescontoIR(double descontoIR){
        this.descontoIR = descontoIR;
    }

    public double getDescontoIR(){
        return this.descontoIR;
    }

    public double calcularSalarioLiquido(){
        return ((getSalarioBruto() - getDescontoDoInss())-getDescontoIR());
    }

    public void exibirFolhaPagamento(){
        System.out.println("Folha de Pagamento");
        System.out.println("-NOME: " + this.nome);
        System.out.println("-SALÁRIO BRUTO: " + this.getSalarioBruto());
        System.out.println("-DESCONTO INSS: " + this.getDescontoDoInss());
        System.out.println("-DESCONTO IR: " + this.getDescontoIR());
        System.out.printf("SALÁRIO LIQUIDO: R$%.2f", calcularSalarioLiquido());
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Funcionario colab1 = new Funcionario();
        System.out.println("Informe o nome do colaborador: ");
        colab1.nome = sc.nextLine();
        System.out.println("Informe o salário do colaborador: ");
        double sb =  sc.nextDouble();
        colab1.setSalarioBruto(sb);
        System.out.println("Informe o Desconto INSS do colaborador: ");
        double di =  sc.nextDouble();
        colab1.setDescontoDoInss(di);
        System.out.println("Informe o Desconto IR do colaborador: ");
        double dr =  sc.nextDouble();
        colab1.setDescontoIR(dr);
        colab1.exibirFolhaPagamento();
    }
}
