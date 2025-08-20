package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
2. Classe ContaBancaria – Operações Financeiras
Crie a classe ContaBancaria com os atributos:
titular (String)
numeroConta (String)
saldo (double)
Métodos:
void depositar(double valor)
void sacar(double valor)
void exibirSaldo()
Objetivo: criar duas contas bancárias, realizar saques e depósitos e exibir os saldos atualizados.

 */
public class EX02 {
    public String titular;
    public String numeroConta;
    public double saldo;

    public EX02() {
        this.titular = "Desconhecido";
        this.numeroConta = "0";
        this.saldo = 0.0;
    }

    public EX02(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
    }
    public void sacar(double saque){
        if(saldo < saque){
            System.out.println("Você não possui valor suficiente para concluir essa operação");
        }else{
            saldo -= saque;
        }
    }
    public void exibirSaldo() {
        System.out.println("Conta: " + this.numeroConta + " | Titular: " + this.titular + " | Saldo: R$" + this.saldo);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX02 cliente1 = new EX02("Gustavo", "1", 1000);

        System.out.println("Qual valor desseja depositar?");
        double deposito = sc.nextDouble();
        System.out.println("Qual valor desseja sacar?");
        double saque = sc.nextDouble();
        cliente1.depositar(deposito);
        cliente1.sacar(saque);
        cliente1.exibirSaldo();
    }
}
