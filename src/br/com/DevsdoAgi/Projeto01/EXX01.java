package br.com.DevsdoAgi.Projeto01;
/*
1. Crie um método para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um método que calcule a soma total de todos os elementos da matriz.
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz);

 */
import java.util.*;
public class EXX01 {
    public static double Preencher(double[][] precos, int l, int c){
        for (int i = 0; i <= l - 1; i++) {
            for (int i1 = 0; i1 <= c - 1; i1++) {
                Scanner Scan1 = new Scanner(System.in);
                System.out.print("Celula atual:\n Linha: "+ l + "Coluna: " + c +  " \n");
                System.out.print("Insira o valor a ser inserido \n");
                precos[i][i1] = Scan1.nextDouble();
            }
        }
        return 0;
    }

    public static double Entregar(double[][] precos, int l, int c){
        double p = 0;
        for (int i2 = 0; i2 <= l - 1; i2++) {
            for (int i3 = 0; i3 <= c - 1; i3++) {
                p = p + (precos[i2][i3]);
            }
        }
        System.out.println(p);
        return p;
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
        Preencher(precos, l, c);
        Entregar(precos, l, c);
    }
}
