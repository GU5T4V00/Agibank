package br.com.DevsdoAgi.Projeto01;

public class CintaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

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
