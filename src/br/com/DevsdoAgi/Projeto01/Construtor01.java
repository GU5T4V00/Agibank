package br.com.DevsdoAgi.Projeto01;
/*
Exercício 1 – Conta Bancária (Finanças)
Crie a classe ContaBancaria com os atributos privados:
titular (String)

numeroConta (String)

saldo (double)

Implemente os seguintes construtores:
Um construtor sem parâmetros que inicialize titular e numeroConta com strings vazias e saldo com zero.

Um construtor que receba titular e numeroConta, inicializando saldo com zero.

Um construtor que receba todos os três atributos.
 */
public class Construtor01 {
    private String titular;
    private String numeroConta;
    private double saldo = 0;

    public Construtor01(){
        this.titular = "Desconhecido";
        this.numeroConta = "0";
        this.saldo = 0;
    }

    public Construtor01(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public Construtor01(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirResultados(){
        System.out.println("Sua conta:");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Seu saldo: " + this.saldo);
    }
}
