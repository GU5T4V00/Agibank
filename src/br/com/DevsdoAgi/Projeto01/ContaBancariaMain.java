package br.com.DevsdoAgi.Projeto01;

import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args){
        ContaBancaria hola= new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número da conta");
        int numeroDeContas =sc.nextInt();
        for(int i = 1; i<= numeroDeContas; i++){
            hola.titular = "gusta";
            hola.numeroConta = String.valueOf(i);
        }
        hola.depositar();
        hola.exibirSaldo();
    }
}
