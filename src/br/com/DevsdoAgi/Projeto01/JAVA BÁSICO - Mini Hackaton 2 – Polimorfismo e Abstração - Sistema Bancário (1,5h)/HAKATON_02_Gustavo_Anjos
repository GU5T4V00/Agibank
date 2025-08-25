package br.com.DevsdoAgi.Projeto01;
import java.util.*;

/*
Tema: Relatório de Investimentos
Objetivo:
Criar um sistema onde diferentes tipos de investimento herdam de uma classe abstrata e usam polimorfismo para calcular rendimento.
Passos do Desafio:
Crie a classe abstrata Investimento:
Atributo valorInicial.
Construtor para inicializar.
Método abstrato calcularRendimento().
Crie duas subclasses:
RendaFixa → retorna valorInicial * 1.05 (5% de rendimento).
RendaVariavel → retorna valorInicial * 1.10 (10% de rendimento).
Na Main:
Crie uma lista de investimentos (contendo os dois tipos).
Percorra a lista chamando calcularRendimento().
Exiba o valor de cada investimento após o rendimento.
 */

// Apenas para ditar o nome do arquivo de forma que não interfira na compreensão do código
public class HAKATON_02_Gustavo_Anjos {
}

abstract class Investimento {
    protected double valorInicial;

    public Investimento() {
        this.valorInicial = 0.00;
    }

    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void setValorInicial(double salario){
        this.valorInicial = salario;
    }

    public double getValorInicial(){
        return this.valorInicial;
    }

    public abstract void calcularRendimento();
}

class RendaFixa extends Investimento{
    public RendaFixa() {
        this.valorInicial = 0.00;
    }
    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void calcularRendimento(){
        this.valorInicial = this.valorInicial*1.05;
    }
}

class RendaVariavel extends Investimento{
    public RendaVariavel() {
        this.valorInicial = 0.00;
    }
    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }
    @Override
    public void calcularRendimento(){
        this.valorInicial = this.valorInicial*1.10;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetInvest = {0, 0, 0, 0};
        double rend1 = 0;
        double rend2 = 0;
        double rend3 = 0;
        double rend4 = 0;
        Investimento A1 = new RendaFixa();
        Investimento A2 = new RendaVariavel();
        Investimento A3 = new RendaFixa();
        Investimento A4 = new RendaVariavel();
        int contador = 0;

        System.out.println("Bem-vindo ao Agibank!");

        boolean executando = true;
        while(executando){
            System.out.println("\n--- MENU ---");
            System.out.println("0 - Sair");
            System.out.println("1 - Realizar um Investimento (Limite 4)");
            System.out.println("2 - Consultar investimentos");
            int opcao = sc.nextInt();

            switch(opcao){
                case 0:
                    executando = false;
                    System.out.println("Operação finalizada. Volte sempre ❤️");
                    break;

                case 1:
                    contador++;
                    switch (contador){
                        case 1:
                            System.out.println("Qual o valor do investimento desejado?");
                            double investA1 = sc.nextDouble();
                            A1.setValorInicial(investA1);
                            A1.calcularRendimento();
                            vetInvest[0] = A1.getValorInicial();
                            rend1 = A1.getValorInicial() - investA1;
                            break;
                        case 2:
                            System.out.println("Qual o valor do investimento desejado?");
                            double investA2 = sc.nextDouble();
                            A2.setValorInicial(investA2);
                            A2.calcularRendimento();
                            vetInvest[1] = A2.getValorInicial();
                            rend2 = A2.getValorInicial() - investA2;
                            break;
                        case 3:
                            System.out.println("Qual o valor do investimento desejado?");
                            double investA3 = sc.nextDouble();
                            A3.setValorInicial(investA3);
                            A3.calcularRendimento();
                            vetInvest[2] = A3.getValorInicial();
                            rend3 = A3.getValorInicial() - investA3;
                            break;
                        case 4:
                            System.out.println("Qual o valor do investimento desejado?");
                            double investA4 = sc.nextDouble();
                            A4.setValorInicial(investA4);
                            A4.calcularRendimento();
                            vetInvest[3] = A4.getValorInicial();
                            rend4 = A4.getValorInicial() - investA4;
                            break;
                        default:
                            System.out.println("Excedeu o limite de tentativas");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("A seguir temos o vetor dos investimentos realizados: ");
                    for (int j = 0; j < 4; j++) {
                        System.out.println("Investimento: " + (j + 1) + "============");
                        System.out.printf("%.2f\n", (vetInvest[j]));
                        switch (j){
                            case 0:
                                System.out.printf("Teve um rendimento de : R$%.2f\n", rend1);
                                break;
                            case 1:
                                System.out.printf("Teve um rendimento de : R$%.2f\n", rend2);
                                break;
                            case 2:
                                System.out.printf("Teve um rendimento de : R$%.2f\n", rend3);
                                break;
                            case 3:
                                System.out.printf("Teve um rendimento de : R$%.2f\n", rend4);
                                break;
                        }
                    }

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
