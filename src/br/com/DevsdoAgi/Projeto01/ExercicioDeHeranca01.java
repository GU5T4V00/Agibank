package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class ExercicioDeHeranca01 {
    // Atributos comuns a todos os pagamentos
    private String titular;
    private String numeroConta;
    protected double saldo;

    // Construtor
    public ExercicioDeHeranca01(double saldo) {
        this.saldo = saldo;
    }

    // Método genérico para processar pagamento
    public void processarPagamento() {
        System.out.println("Processando pagamento genérico de R$ " + saldo);
    }

    // Getters e setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
// Subclasse
class ExercicioDeHeranca01_1 extends ExercicioDeHeranca01{
    private double chequeEspecial;
    public ExercicioDeHeranca01_1(double saldo, double chequeEspecial) {
        super(saldo); // chama o construtor da classe mãe
        this.chequeEspecial = chequeEspecial;
    }

    // Sobrescrita do método (Polimorfismo)
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento no CARTÃO de R$ " + saldo);
    }

    public boolean sacarComChequeEspecial() {
        if (chequeEspecial <= saldo) {
            saldo -= chequeEspecial;
            System.out.println("Saque aprovado! Seu saldo agora é: R$ " + saldo);
            return true;
        } else {
            System.out.println("Você não pode sacar esse valor. Limite disponível: R$ " + chequeEspecial);
            return false;
        }
    }
}