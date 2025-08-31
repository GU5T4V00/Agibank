import java.util.*;

/*

*/

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
                case 1: cadastrarCliente(sc);break;
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

    private static void cadastrarCliente(Scanner sc) {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();
        Cliente novoCliente = new Cliente(nome, cpf);

        if (clientes.contains(novoCliente)) {
            System.out.println("Cliente já cadastrado com esse CPF.");
        } else {
            clientes.add(novoCliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    private static void cadastrarConta(Scanner sc) {
        System.out.print("Informe o CPF do cliente: ");
        String cpf = sc.nextLine();
        Cliente clienteEncontrado = null;

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente não encontrado!");
        } else {
            Conta novaConta = new Conta(numeroConta++, clienteEncontrado);
            contas.put(novaConta.getNumero(), novaConta);
            System.out.println("Conta criada com sucesso! Número: " + novaConta.getNumero());
        }

    }
    private static void deposito(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        Conta conta = contas.get(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.print("Valor do depósito: ");
        double valor = sc.nextDouble();
        String a = sc.nextLine();

        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso.");
    }

    private static void saque(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        String a = sc.nextLine();

        Conta conta = contas.get(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.print("Valor do saque: ");
        double valor = sc.nextDouble();
        String b = sc.nextLine();
        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private static void transferencia(Scanner sc) {
        System.out.print("Conta de origem: ");
        int origem = sc.nextInt();
        System.out.print("Conta de destino: ");
        int destino = sc.nextInt();

        Conta contaOrigem = contas.get(origem);
        Conta contaDestino = contas.get(destino);

        if (contaOrigem == null || contaDestino == null) {
            System.out.println("Uma das contas não foi encontrada.");
            return;
        }

        System.out.print("Valor da transferência: ");
        double valor = sc.nextDouble();
        String a = sc.nextLine();

        if (contaOrigem.transferir(valor, contaDestino)) {
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private static void consultarSaldo(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        String a = sc.nextLine();
        Conta conta = contas.get(numero);

        if (conta != null) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void extrato(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        String a = sc.nextLine();
        Conta conta = contas.get(numero);

        if (conta != null) {
            conta.mostrarExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void listarClientes() {
        System.out.println("\n=== Lista de Clientes ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}

