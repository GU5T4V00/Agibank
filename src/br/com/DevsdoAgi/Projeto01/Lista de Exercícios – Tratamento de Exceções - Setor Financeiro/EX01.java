import java.util.Scanner;

/*
1. Controle de Saldo de Contas
Crie um programa que armazene os saldos de 10 contas bancárias em um vetor.
 O usuário deve poder buscar o saldo de uma conta pelo índice do vetor.
Se o usuário inserir um índice inválido, capture e trate ArrayIndexOutOfBoundsException.
Exemplo de Entrada:
Digite o índice da conta: 12
Saída Esperada:
Erro: Conta não encontrada!
👉 Dica: Use try { ... } catch (ArrayIndexOutOfBoundsException e) { ... }.
 */

public class ControleDeContas {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        // Vetor com saldo fictícios de 10 contas
        double[] contas = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        try{
            System.out.println("Digite o índice da conta (0 a 9): ");
            int indice = sc.nextInt();

            // Pode gerar ArrayIndexOutOfBoundsException
            double saldo = contas[indice];
            System.out.printf("Saldo da conta %d: R$%.2f%n", indice, saldo);
        }catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("ERRO: Conta não encontrada ou não existe.");
        }
        sc.close();
    }
}
