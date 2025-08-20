package br.com.DevsdoAgi.Projeto01;

import java.util.*;
public class EX09 {
    public static double MediaMovel(double[][] precos, int l, int c){
        for (int i = 0; i <= l - 1; i++) {
            for (int i1 = 0; i1 <= c - 1; i1++) {
                Scanner Scan1 = new Scanner(System.in);
                System.out.print("Celula atual:\n Linha: "+ l + "Coluna: " + c +  " \n");
                System.out.print("Insira o valor a ser inserido \n");
                precos[i][i1] = Scan1.nextDouble();
            }
        }
        System.out.println("A sua matriz final é: ");
        for (int i2 = 0; i2 <= l - 1; i2++) {
            System.out.print("\n");
            for (int i3 = 0; i3 <= c - 1; i3++) {
                System.out.printf("%.2f, ", (precos[i2][i3]));
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int l;
        int c;
        System.out.print("Insira o valor de linhas:\n");
        l = Scan.nextInt();
        System.out.print("Insira o valor de colunas:\n");
        c = Scan.nextInt();
        double[][] precos = new double[l][c];
        MediaMovel(precos, l, c);
    }
}

