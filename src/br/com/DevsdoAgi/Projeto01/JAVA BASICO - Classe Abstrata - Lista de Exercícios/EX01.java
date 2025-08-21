package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
1. Conta Bancária (Taxa x Rendimento)
Crie a classe abstrata Conta com atributos numero e saldo e o método abstrato void atualizarMensal().
Crie as subclasses:
ContaCorrente → desconta R$ 15,00 de taxa mensal.
ContaPoupanca → aumenta o saldo em 0,5%.
No Main, crie uma conta corrente e uma poupança, faça depósito inicial e aplique a atualização mensal.
*/

public class EX01 {
}
abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public abstract void atualizarMensal();
}
class ContaCorrente extends Conta{
    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }
    @Override
    public void atualizarMensal(){
        saldo -= 15.00;
    }
}

class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }
    @Override
    public void atualizarMensal(){
        saldo += (saldo*0.005);
    }
}

class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cc = new ContaCorrente(1, 1000);
        Conta cp = new ContaPoupanca(1, 1000);
        System.out.println("Por quantos meses desseja fazer a simulação?");
        int meses = sc.nextInt();
        for (int i = 1; i <= meses; i++) {
            cc.atualizarMensal();
            cp.atualizarMensal();
        }
        System.out.println("Aqui está seu resumo após o(s) " + meses + " mesês: ");
        System.out.printf("Saldo atual da sua conta corrente: %.2f \n", cc.saldo);
        System.out.printf("Saldo atual da sua conta poupança: %.2f \n", cp.saldo);
    }
}
