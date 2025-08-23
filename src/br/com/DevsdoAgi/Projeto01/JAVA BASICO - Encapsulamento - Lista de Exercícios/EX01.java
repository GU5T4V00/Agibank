package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
1. Conta Bancária (Setor Financeiro)
Crie a classe ContaBancaria com os seguintes atributos privados:
titular (String)
numeroConta (String)
saldo (double)
Implemente os métodos getters e setters, garantindo que:
o saldo não pode ser alterado diretamente (sem setSaldo)
o método depositar(double valor) só aceita valores positivos
o método sacar(double valor) só permite saque se houver saldo suficiente
Crie um método exibirExtrato() para mostrar os dados da conta e o saldo atual.
*/

public class EX01 {
}
class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public void setTitular(String titular){
        this.titular=titular;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }

    // metodo depositar que aceita apenas numeros positivos

    public void depositar(double valor){
        if (valor>0){
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido!!!");
        }
    }

    // metodo sacar será possivel apenas remover dinheiro

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    //Crie um metodo exibirExtrato()
    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + this.saldo);

    }
}

class ContaBancariaMain {
    public static void main(String[] args){
        //Testar conta bancária
        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Kesede");
        cb.setNumeroConta("777");
        cb.depositar(99999);
        cb.sacar(5000);
        cb.exibirExtrato();
    }
}
