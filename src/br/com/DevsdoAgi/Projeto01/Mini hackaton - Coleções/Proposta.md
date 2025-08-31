Coleções de Objetos - Hackaton - Banco Digital

Contexto
Você é responsável por criar um sistema bancário simplificado, permitindo:
Cadastrar clientes e contas.


Realizar depósitos, saques e transferências.


Consultar saldo e extrato de cada conta.


O sistema deve ser interativo via menu, pronto para rodar na Main. O foco é uso correto de coleções e boas práticas de orientação a objetos.

Coleções a usar
Entidade
Coleção
Motivo
Clientes
Set<Cliente>
Garantir unicidade pelo CPF
Contas
Map<Integer, Conta>
Permitir acesso rápido pelo número da conta
Transações
List<Transacao>
Manter ordem cronológica do histórico, duplicatas permitidas


Entidades
Cliente


id (int)


nome (String)


cpf (String) → unicidade


Conta


numero (int)


titular (Cliente)


saldo (double)


extrato (List<Transacao>)


Transacao


id (int)


tipo (Depósito, Saque, Transferência)


valor (double)


data (LocalDateTime)


contaOrigem e contaDestino (necessário para transferência)



Menu Principal
Cadastrar cliente


Solicitar nome e CPF


Adicionar ao Set<Cliente>


Evitar duplicidade pelo CPF


Cadastrar conta


Selecionar cliente (CPF)


Criar conta com saldo inicial = 0


Adicionar ao Map<Integer, Conta>


Depósito


Informar número da conta


Solicitar valor


Atualizar saldo


Registrar transação no extrato


Saque


Informar número da conta


Solicitar valor


Verificar saldo suficiente


Atualizar saldo


Registrar transação no extrato


Transferência


Informar contas origem e destino


Solicitar valor


Verificar saldo


Atualizar saldos


Registrar transação em ambas contas


Consultar saldo


Informar número da conta


Exibir saldo atual


Extrato da conta


Listar todas as transações na ordem cronológica


Listar clientes


Exibir todos os clientes cadastrados


Sair



Regras de Negócio
Um cliente pode ter múltiplas contas.


Contas são acessadas por número.


Extrato deve exibir: Data, Tipo, Valor, Conta Origem/Destino.


Evitar duplicidade de clientes usando Set.


Operações inválidas (saldo insuficiente, conta inexistente) devem gerar mensagem de erro.



Esqueleto do Hackaton (estrutura inicial)
Cada classe deve estar em um arquivo .java

import java.util.*;

public class BancoDigitalHackaton {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1: cadastrarCliente(sc); break;
                case 2: cadastrarConta(sc); break;
                case 3: deposito(sc); break;
                case 4: saque(sc); break;
                case 5: transferencia(sc); break;
                case 6: consultarSaldo(sc); break;
                case 7: extrato(sc); break;
                case 8: listarClientes(); break;
                case 9: rodando = false; break;
                default: System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    // ==================== MÉTODOS (a serem implementados) =

    private static void cadastrarCliente(Scanner sc) {
        // Dica: pedir nome e CPF, criar objeto Cliente
        // Adicionar no Set de clientes
        // Garantir que CPF não esteja duplicado (Set já ajuda nisso)
    }

    private static void cadastrarConta(Scanner sc) {
        // Dica: solicitar CPF do cliente
        // Verificar se cliente existe no Set
        // Criar Conta e adicionar no Map de contas usando numeroConta como chave
    }

    private static void deposito(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar se conta existe
        // Adicionar valor ao saldo da conta
        // Registrar transação no extrato da conta
    }

    private static void saque(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar saldo suficiente
        // Subtrair valor do saldo
        // Registrar transação no extrato da conta
    }

    private static void transferencia(Scanner sc) {
        // Dica: solicitar conta origem, conta destino e valor
        // Verificar saldo na conta origem
        // Atualizar saldos de ambas as contas
        // Registrar transação em ambas contas
    }

    private static void consultarSaldo(Scanner sc) {
        // Dica: solicitar número da conta
        // Exibir saldo atual
    }

    private static void extrato(Scanner sc) {
        // Dica: solicitar número da conta
        // Listar todas as transações registradas na conta
    }

    private static void listarClientes() {
        // Dica: percorrer Set de clientes e exibir informações
    }
}

// ==================== CLASSES (esqueleto) ====================

class Cliente {
    private String nome, cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }

    @Override
    public boolean equals(Object o) {
        // Dica: sobrescrever equals usando cpf
        return false; // substituir
    }

    @Override
    public int hashCode() {
        // Dica: sobrescrever hashCode consistente com equals
        return 0; // substituir
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}

class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    // Dicas para os métodos a implementar:
    // - depositar(double valor): adicionar ao saldo, registrar transação
    // - sacar(double valor): verificar saldo, subtrair valor, registrar transação
    // - transferir(double valor, Conta destino): verificar saldo, atualizar saldos, registrar transações em ambas contas
    // - mostrarExtrato(): percorrer lista de transações e imprimir
}

class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;
    private int contaOrigem, contaDestino;

    public Transacao(String tipo, double valor, int contaOrigem, int contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return data + " | " + tipo + " | Valor: " + valor + " | Origem: " + contaOrigem + " | Destino: " + contaDestino;
    }
}

✅ O que você deve implementar:
Implementar métodos de Conta (depositar, sacar, transferir, mostrarExtrato) usando as dicas fornecidas.


Completar os métodos do menu (interação com usuário e chamadas de métodos de Conta/Cliente).


Sobrescrever equals e hashCode corretamente em Cliente para garantir unicidade no Set.


Testar o sistema com várias contas e transações para validar a lógica.

