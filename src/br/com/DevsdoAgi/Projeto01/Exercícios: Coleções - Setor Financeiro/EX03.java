package br.com.DevsdoAgi.Projeto01;

import java.util.*;

/*
3. Saldo de Clientes
Armazene os saldos dos clientes em um Map<String, Double>, onde a chave é o número da conta e o valor é o saldo.
Métodos sugeridos:
void adicionarCliente(Map<String, Double> contas, int numeroConta, double saldoInicial) – cadastra um cliente.
void depositar(Map<String, Double> contas, int numeroConta, double valor) – atualiza o saldo após um depósito.
void exibirSaldos(Map<String, Double> contas) – exibe todos os clientes com seus saldos.
*/

public class EX03 {
}

class Clientes {

    // ✅ Adiciona um cliente no Map
    public void adicionarCliente(Map<String, Double> contas, int numeroConta, double saldoInicial){
        String chave = String.valueOf(numeroConta);
        if(contas.containsKey(chave)){
            System.out.println("Conta " + numeroConta + " já existe");
        }else{
            contas.put(chave, saldoInicial);
            System.out.println("Conta " + numeroConta + "criada com sucesso.\nSeu saldo iniciaL É DE: R$" + saldoInicial);
        }
    }

    // ✅ Depositar em uma conta
    public void depositar(Map<String, Double> contas, int numeroConta, double valor) {
        String chave = String.valueOf(numeroConta);
        if (contas.containsKey(chave)) {
            double novoSaldo = contas.get(chave) + valor;
            contas.put(chave, novoSaldo);
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Conta " + numeroConta + " não encontrada!");
        }
    }

    // ✅ Exibir todos os saldos
    public void exibirSaldos(Map<String, Double> contas) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("=== Saldos dos Clientes ===");
            for (Map.Entry<String, Double> entry : contas.entrySet()) {
                System.out.println("Conta: " + entry.getKey() + " | Saldo: R$" + entry.getValue());
            }
        }
    }
}

class ClientesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clientes clienteService = new Clientes();

        Map<String, Double> contas = new HashMap<>();

        // 🚀 Testando
        clienteService.adicionarCliente(contas, 101, 500.0);
        clienteService.adicionarCliente(contas, 102, 1000.0);

        clienteService.depositar(contas, 101, 200.0);
        clienteService.depositar(contas, 103, 50.0); // Conta inexistente

        clienteService.exibirSaldos(contas);

        sc.close();
    }
}
