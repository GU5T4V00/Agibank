package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
3. Cliente VIP (Setor Financeiro)
Crie a classe ClienteVip com os atributos privados:
nome (String)
cpf (String)
limiteCredito (double)
Implemente os métodos get e set, validando que:
O limite de crédito deve estar entre R$ 1.000,00 e R$ 100.000,00
Crie o método exibirCliente() para mostrar os dados de forma formatada.
*/

public class EX03{
}
class ClienteVIP {
    private String nome;
    private String cpf;
    private double limiteCredito;
    public boolean hola;

    public ClienteVIP() {
        this.nome = "Desconhecido";
        this.cpf = "Desconhecido";
        this.limiteCredito = 0;
        this.hola = true;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setLimiteCredito(double limiteCredito){
        if (1000.00 <= limiteCredito && 100000.00 >= limiteCredito){
            this.limiteCredito=limiteCredito;
            this.hola = false;
        }else{
            System.out.println("Emprétimo fora dos limites estabelecidos para esse cliente");
        }
    }

    public double getLimiteCredito(){
        return this.limiteCredito;
    }

    public void exibirInformacoes(){
        System.out.println("VIP: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Limite: " + getLimiteCredito());

    }
}
class ClienteVIPMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ClienteVIP VIP1 = new ClienteVIP();
        System.out.println("Informe o nome do VIP: ");
        String nv = sc.nextLine();
        VIP1.setNome(nv);
        System.out.println("Informe o CPF: ");
        String cp = sc.nextLine();
        VIP1.setCpf(cp);
        while(VIP1.hola){
            System.out.println("Informe o Limite de Crédito: ");
            double lc = sc.nextDouble();
            VIP1.setLimiteCredito(lc);
        }
        VIP1.exibirInformacoes();
    }
}
