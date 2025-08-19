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

package br.com.DevsdoAgi.Projeto01;

import java.util.Scanner;

public class ContaBancaria {
    Scanner sc = new Scanner(System.in);
    public String titular;
    public String numeroConta;
    public Double saldo;
    
    public void depositar(){
        System.out.println("Informe a quantia desejada para depósito: ");
        saldo =  + sc.nextDouble();
    }
    public void sacar(){
        System.out.println("Informe a quantia desejada para depósito: ");
        saldo =  - sc.nextDouble();
    }
    public void exibirSaldo(){
        System.out.println("O titular é: " + this.titular);
        System.out.println("Seu número da conta: " + this.numeroConta);
        System.out.printf("Saldo atual: R$" + this.saldo);


    }
}
