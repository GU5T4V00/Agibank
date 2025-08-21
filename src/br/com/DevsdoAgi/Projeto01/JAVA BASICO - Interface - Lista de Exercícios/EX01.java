package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
 Exercício 1 — Financeiro: Pagamento de Serviços
Tema: Interface
Interfaces e Classes: IPagamento, PagamentoBoleto, PagamentoCartao
Enunciado:
Crie uma interface chamada IPagamento com o seguinte método:
public void processarPagamento(double valor);
Em seguida, implemente duas classes:
PagamentoBoleto, que imprime:
"Pagamento de R$valor realizado via boleto bancário."
PagamentoCartao, que imprime:
"Pagamento de R$valor realizado via cartão de crédito."
Crie uma classe MainPagamento que permita testar ambas as implementações.
 */
public class EX01{
}

interface IPagamento{
    void processarPagamento(double valor);
}
class PagamentoBoleto implements IPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " relizado via boleto bancário");
    }
}
class PagamentoCartao implements IPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " realizado via cartão de crédito");
    }
}

class Main {
    public static void main(String[] args) {
       IPagamento pag1 = new PagamentoBoleto();
       IPagamento pag2 = new PagamentoCartao();

       pag1.processarPagamento(500.0);
       pag2.processarPagamento(750.0);
    }
}
