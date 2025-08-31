package br.com.DevsdoAgi.Projeto01;

import java.util.*;

/*
4. Relatório de Empréstimos
Um banco armazena os valores dos empréstimos ativos em um Map<String, List<Double>>, onde a chave é o CPF do cliente e o valor é uma lista com os valores das parcelas.
Métodos sugeridos:
void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double ) – adiciona uma nova parcela ao cliente.
double totalDevedor(Map<String, List<Double>> emprestimos, String cpf) – retorna o total devedor de um cliente.
void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos) – exibe o total devedor de todos os clientes.
*/

public class EX04 {
}

class Cliente {
    private Map<String, List<Double>> clientes = new HashMap<>();
    private String cpf;
    private List<Double> parcelas;

    public Cliente(String cpf){
        this.cpf = cpf;
        this.parcelas = new ArrayList<>();
    }

    public Cliente(){
        this.cpf = "Desconhecido";
        this.parcelas = new ArrayList<>();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    

    // ✅ Adiciona um cliente no Map
    public void adicionarCliente(Map<String, List<Double>> clientes, String cpf){
        if(clientes.containsKey(cpf)){
            System.out.println("O CPF: "+ cpf + " já foi cadastrado");
        }else{
            clientes.put(cpf, new ArrayList<>(Arrays.asList()));
            System.out.println("Você foi cadastrado com sucesso");
        }
    }

    // ✅ Depositar em uma conta
    public void adicionarParcela(Map<String, List<Double>> emprestimos, Scanner sc) {
        System.out.println("Quantas parcelas vai adicionar?");
        int parcelas = sc.nextInt();

        emprestimos.putIfAbsent(getCpf(), new ArrayList<>());

        List<Double> parcelasCliente = emprestimos.get(getCpf());

        for (int i = 1; i <= parcelas ; i++) {
            System.out.println("Digite o valor da parcela " + i + ":");
            double parcelito = sc.nextDouble();
            parcelasCliente.add(parcelito);
        }

        System.out.println("Parcelas adicionadas ao CPF: " + getCpf());
    }

    public double totalDevedor(Map<String, List<Double>> emprestimos, String cpf){
        // Recupera a lista de parcelas desse CPF
        List<Double> parcelas = emprestimos.get(cpf);

        // Caso o CPF não exista ou não tenha parcelas
        if (parcelas == null){
            return 0.0;
        }

        double total = 0.0;
        // Percorre todas as parcelas e soma
        for(double valor : parcelas){
            total += valor;
        }

        return total;
    }

    // ✅ Exibir todos os saldos
    public void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos) {
        List<Double> parcelas = emprestimos.get(getCpf());

        if (parcelas == null) {
            System.out.println("Nenhum empréstimo encontrado para o CPF: " + getCpf());
            return;
        }

        System.out.println("CLIENTE: " + getCpf());
        System.out.println("EMPRÉSTIMOS EFETUADOS:");
        // Chama o método que imprime as parcelas
        for (int i = 0; i < parcelas.size(); i++) {
            System.out.println("Parcela Nº " + (i + 1) + ": R$ " + parcelas.get(i));
        }
        System.out.println("DIVIDA TOTAL: " + totalDevedor(emprestimos, getCpf()));
    }
}

class ClientesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> emprestimos = new HashMap<>();
        Cliente cliente = new Cliente();

        int opcao;

        do {
            System.out.println("\n====== MENU BANCO ======");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Adicionar Parcelas");
            System.out.println("3 - Mostrar Total Devedor de um Cliente");
            System.out.println("4 - Exibir Relatório de Todos os Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida!");
                sc.nextLine(); // limpar buffer
                opcao = -1;
            }
            sc.nextLine(); // limpar o '\n' do nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = sc.nextLine();
                    cliente.setCpf(cpf);
                    cliente.adicionarCliente(emprestimos, cpf);
                    break;

                case 2:
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfParcela = sc.nextLine();
                    cliente.setCpf(cpfParcela);
                    cliente.adicionarParcela(emprestimos, sc);
                    break;

                case 3:
                    System.out.print("Digite o CPF para consultar: ");
                    String cpfConsulta = sc.nextLine();
                    double total = cliente.totalDevedor(emprestimos, cpfConsulta);
                    System.out.println("Dívida total do cliente " + cpfConsulta + ": R$ " + total);
                    break;

                case 4:
                    System.out.println("\n====== RELATÓRIO GERAL ======");
                    for (String cpfCliente : emprestimos.keySet()) {
                        cliente.setCpf(cpfCliente);
                        cliente.exibirRelatorioDevedor(emprestimos);
                        System.out.println("----------------------------");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
