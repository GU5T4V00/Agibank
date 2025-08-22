package br.com.DevsdoAgi.Projeto01;
import java.util.*;

/*
OOP - Exercício Aplicado – Sistema Bancário 
Objetivo
Criar um pequeno sistema bancário com contas e clientes, aplicando todos os conceitos básicos de orientação a objetos em Java.
1ª Etapa – Desenvolvimento (2h15 min)
Implemente as seguintes classes
1. Classe Cliente
Atributos privados: nome, cpf.
Construtor para inicializar.
Métodos getters e setters.
2. Interface OperacoesBancarias
public interface OperacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
}
3. Classe Conta (abstrata)
Atributos privados: numeroConta, saldo, titular.
Construtor para inicializar.
Implementa métodos de depositar e sacar.
Método abstrato aplicarJuros().
4. Classe ContaCorrente (herda de Conta)
Implementar aplicarJuros() → não faz nada, apenas mensagem.
5. Classe ContaPoupanca (herda de Conta)
Implementar aplicarJuros() → saldo = saldo * 1.01 (juros de 1%).
6. Classe Main
Criar um cliente.
Criar uma Conta Corrente e uma Conta Poupança para ele.
Fazer algumas operações (depósito, saque, aplicar juros).
Mostrar os saldos no console.
*/

class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public Cliente() {
        this.nome = "Desconhecido";
        this.cpf = "Desconhecido";
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return this.cpf;
    }
    public void adicionarContas(Conta conta){
        contas.add(conta);
    }
    public List<Conta> getContas(){
        return contas;
    }
}

interface OperacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
}

abstract class Conta implements OperacoesBancarias {
    protected int numeroConta;
    protected double saldo;
    protected Cliente clienteTitular;

    public Conta(int numeroConta, double saldo, Cliente clienteTitular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clienteTitular = clienteTitular;
        clienteTitular.adicionarContas(this);
    }

    public abstract String getTipoConta();

    public Conta() {
        this.numeroConta = 0;
        this.saldo = 0.00;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }

    public abstract void aplicarJuros();

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}

class ContaCorrente extends Conta {
    public ContaCorrente(int numeroConta, double saldo, Cliente clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Conta corrente não possui taxa de juros. Saldo permanece: " + getSaldo());
    }
    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(int numeroConta, double saldo, Cliente clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    @Override
    public void aplicarJuros() {
        double saldo = getSaldo();
        saldo = saldo * 1.01; // Correção: juros de 1%
        setSaldo(saldo);
        System.out.println("Juros aplicados! Novo saldo: " + getSaldo());
    }
    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Gustavo", "12345678900");

        System.out.println("Bem-vindo ao Agibank, " + cliente1.getNome() + "!");

        boolean executando = true;
        while(executando){
            System.out.println("\n--- MENU ---");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Consultar Contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Aplicar Juros");
            System.out.println("6 - Mostrar saldos");
            int opcao = sc.nextInt();

            switch(opcao){
                case 0:
                    executando = false;
                    System.out.println("Operação finalizada. Volte sempre ❤️");
                    break;

                case 1:
                    System.out.println("Qual tipo de conta deseja criar?");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    int tipo = sc.nextInt();

                    int numeroConta = cliente1.getContas().size() + 1;
                    Conta novaConta;
                    if(tipo == 1){
                        novaConta = new ContaCorrente(numeroConta, 0, cliente1);
                    } else {
                        novaConta = new ContaPoupanca(numeroConta, 0, cliente1);
                    }
                    System.out.println("Conta criada com sucesso! Número: " + numeroConta);
                    break;

                case 2:
                    System.out.println("--- Contas do cliente " + cliente1.getNome() + " ---");
                    for(Conta c : cliente1.getContas()){
                        System.out.println("Conta nº " + c.getNumeroConta() + " | Tipo: " + c.getClass().getSimpleName() + " | Saldo: " + c.getSaldo());
                    }
                    break;

                case 3:
                    System.out.println("Informe o número da conta para depósito:");
                    int nDep = sc.nextInt();
                    System.out.println("Informe o valor:");
                    double vDep = sc.nextDouble();
                    cliente1.getContas().get(nDep-1).depositar(vDep);
                    System.out.println("Depósito realizado! Novo saldo: " + cliente1.getContas().get(nDep-1).getSaldo());
                    break;

                case 4:
                    System.out.println("Informe o número da conta para saque:");
                    int nSaq = sc.nextInt();
                    System.out.println("Informe o valor:");
                    double vSaq = sc.nextDouble();
                    cliente1.getContas().get(nSaq-1).sacar(vSaq);
                    System.out.println("Operação concluída! Saldo atual: " + cliente1.getContas().get(nSaq-1).getSaldo());
                    break;

                case 5:
                    System.out.println("Informe o número da conta para aplicar juros:");
                    int nJuros = sc.nextInt();
                    cliente1.getContas().get(nJuros-1).aplicarJuros();
                    break;

                case 6:
                    System.out.println("Contas de " + cliente1.getNome() + ":");
                    for (Conta conta : cliente1.getContas()) {
                        System.out.printf("Número: %d | Tipo: %s | Saldo: R$ %.2f%n",
                                conta.getNumeroConta(),
                                conta.getTipoConta(),
                                conta.getSaldo());
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
