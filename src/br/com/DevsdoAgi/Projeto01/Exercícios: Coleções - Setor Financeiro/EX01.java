import java.util.Set;
import java.util.Objects;
import java.util.HashSet;

/*
1. Clientes com Contas Únicas
Um banco precisa armazenar os números das contas bancárias dos clientes, garantindo que nenhuma conta seja duplicada.
Métodos sugeridos:
void adicionarConta(Set<Integer> contas, int numeroConta) – adiciona uma conta ao conjunto, caso ainda não exista.
boolean existeConta(Set<Integer> contas, int numeroConta) – verifica se a conta já está cadastrada.
void exibirContas(Set<Integer> contas) – exibe todas as contas cadastradas.
*/
public class ContaUnicaMain {
    public static void main(String[] args){
        Set<Integer> contas = new HashSet<>();

        ContaUnicaMain.adicionarConta(contas, 12345);
        ContaUnicaMain.adicionarConta(contas, 12345); // tentativa de duplicata
        ContaUnicaMain.adicionarConta(contas, 98765);

        System.out.println("Existe 12345? " + ContaUnicaMain.existeConta(contas, 12345));
        System.out.println("Existe 11111? " + ContaUnicaMain.existeConta(contas, 11111));

        ContaUnicaMain.exibirContas(contas);
    }
    public static void adicionarConta(Set<Integer> contas, int numeroConta){
        Objects.requireNonNull(contas, "O conjunto de contas não pode ser nulo");
        if(numeroConta <= 0){
            throw new IllegalArgumentException("Número da conta deve ser positivo");
        }

        boolean adicionou = contas.add(numeroConta);
        if (adicionou){
            System.out.println("Conta " + numeroConta + " adicionada com sucesso.");
        }else{
            System.out.println("Conta " + numeroConta + " já existe - não adicionada.");
        }
    }

    // verifica se a conta já está cadastrada.
    public static boolean existeConta(Set<Integer> contas, int numeroConta){
        Objects.requireNonNull(contas, "O conjunto de contas não pode ser null");
        return contas.contains(numeroConta);
    }
    public static void exibirContas(Set<Integer> contas){
        Objects.requireNonNull(contas , "O conjunto de contas não pode ser null");
        System.out.println("Contas cadastradas (" + contas.size() + "):");
        for (Integer c: contas){
            System.out.println("- " + c);
        }
    }
}
