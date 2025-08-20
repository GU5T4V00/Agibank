package br.com.DevsdoAgi.Projeto01;

public class CintaBancariaMain {
    public static void main(String[] args){
        //Testar conta bancária
        CintaBancaria cb = new CintaBancaria();

        cb.setTitular("Kesede");
        cb.setNumeroConta("777");
        cb.depositar(999999999);
        cb.sacar(5000);
        cb.exibirExtrato();
    }
}
