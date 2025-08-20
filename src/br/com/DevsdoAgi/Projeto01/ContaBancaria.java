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
