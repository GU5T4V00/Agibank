package br.com.DevsdoAgi.Projeto01;
//Saldo Acumulado = Contribuição mensal * (1 + taxa mensal)^((idade aposentadoria - idade atual) -1)/taxa mensal

import java.util.*;

public class HAKATON {
    public static double[][] SaldoFinal(int anos, double taxa, double contribuicaoMeses) {
        double SaldoAcumulado = contribuicaoMeses;
        double[][] saldoAnual = new double[anos][12];

        for (int i = 0; i < anos; i++) {
            for (int j = 0; j < 12; j++) {
                SaldoAcumulado = SaldoAcumulado + (SaldoAcumulado * (taxa/100));
                System.out.print("Seu saldo no mês " + (j +1 ) + " foi de: ");
                System.out.printf("R$%.2f \n", SaldoAcumulado);

                saldoAnual[i][j] = SaldoAcumulado;

            }
        }

        return saldoAnual;
    }

    public static void main(String[] args) {
        //****Variáveis****

        int idade, idadeApo, meses, anos;
        double contribuicaoMeses, taxa, porcent;

        //****Coleta de dados****

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade atual:\n");
        idade = sc.nextInt();

        System.out.print("Insira a idade desejada para a aposentadoria:\n");
        idadeApo = sc.nextInt();

        anos = idadeApo - idade;

        System.out.print("Informe sua contribuição mensal:\n");
        contribuicaoMeses = sc.nextDouble();

        System.out.print("Informe a taxa de juros anual esperada:\n");
        taxa = sc.nextFloat();

        SaldoFinal(anos, taxa, contribuicaoMeses);
    }
}
