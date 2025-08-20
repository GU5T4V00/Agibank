package br.com.DevsdoAgi.Projeto01;
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

public class ClienteVIP {
    private String nome;
    private String cpf;
    private double limiteCredito;
    private double divida;

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
        this.limiteCredito=limiteCredito;
    }

    public double getLimiteCredito(){
        if (1000.00 <= limiteCredito && limiteCredito >= 100000.00){
            System.out.println("Seu empréstimo foi aprovado!!");
            this.divida += limiteCredito;
        }else{
            System.out.println("Emprétimo fora dos limites estabelecidos para esse cliente");
        }
        return divida;
    }

    public void exibirInformacoes(){
        System.out.println("VIP: " + getNome());
        System.out.println("CPF do VIP: " + getCpf());
        System.out.println("Divida: " + this.divida);

    }
}
