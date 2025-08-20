package br.com.DevsdoAgi.Projeto01;
/*
3. Crie um método que calcule o total de saldos de uma matriz 3x2 (clientes x meses) e outro método que calcule o saldo médio por cliente (média das linhas).
double calcularSaldoTotal(double[][] matriz);
double[] calcularMediaPorCliente(double[][] matriz);
 */
import java.util.*;
public class EXX03 {
    public static double Preencher(double[][] saldos, int l, int c){
        for (int i = 0; i <= l - 1; i++) {
            for (int i1 = 0; i1 <= c - 1; i1++) {
                Scanner Scan1 = new Scanner(System.in);
                System.out.print("Celula atual:\n Linha: "+ i + " Coluna: " + i1 +  " \n");
                System.out.print("Insira o valor a ser inserido \n");
                saldos[i][i1] = Scan1.nextDouble();
            }
        }
        return 0;
    }

    public static double MediaSaldo(double[][] saldos, int l, int c){
        double saldo1 = 0;
        double saldo2 = 0;
        for (int i2 = 0; i2 <= l - 1; i2++) {
            int a = i2 + 1;
            saldo1 = 0;
            for (int i3 = 0; i3 <= c - 1; i3++){
                switch (l){
                    case 1:
                        saldo1 = saldo1 + (saldos[i2][i3]);
                        saldo2 = saldo1/c;
                        break;
                    case 2:
                        saldo1 = saldo1 + (saldos[i2][i3]);
                        saldo2 = saldo1/c;
                        break;
                    case 3:
                        saldo1 = saldo1 + (saldos[i2][i3]);
                        saldo2 = saldo1/c;
                        break;
                    case 4:
                        saldo1 = saldo1 + (saldos[i2][i3]);
                        saldo2 = saldo1/c;
                        break;
                }
            }
            System.out.print("O saldo médio do cliente " + a );
            System.out.printf(" foi de: %.2f", saldo2);
            System.out.print("\n");
        }
        return saldo1;
    }

    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int l;
        int c;
        System.out.print("Insira o valor de linhas:\n");
        l = Scan.nextInt();
        System.out.print("Insira o valor de colunas:\n");
        c = Scan.nextInt();
        double[][] saldos = new double[l][c];
        Preencher(saldos, l, c);
        MediaSaldo(saldos, l, c);
    }
}