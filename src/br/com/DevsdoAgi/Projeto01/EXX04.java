package br.com.DevsdoAgi.Projeto01;
import java.io.PrintStream;
import java.util.*;
/*
4. Dada uma matriz 2x3 com preços de produtos em 2 lojas, crie um método para encontrar o menor preço de cada produto (mínimo por coluna).
double[] encontrarMenorPrecoPorProduto(double[][] matriz);
*/
public class EXX04 {
    public static double[][] Preencher(double[][] matriz, int l, int c){
        for (int i = 0; i <= l - 1; i++) {
            for (int i1 = 0; i1 <= c - 1; i1++) {
                Scanner Scan1 = new Scanner(System.in);
                System.out.print("Celula atual:\n Linha: "+ i + " Coluna: " + i1 +  " \n");
                System.out.print("Insira o valor a ser inserido \n");
                matriz[i][i1] = Scan1.nextDouble();
            }
        }
        return matriz;
    }

    public static PrintStream EncontrarMenorPrecoPorProduto(double[][] matriz){
        double[] MenorPreco=new double[matriz[0].length];
        for (int p = 0; p < matriz[0].length; p++) {
            MenorPreco[p]=matriz[0][p];
            for (int l = 0; l < matriz.length; l++) {
                if (matriz[l][p] < MenorPreco[p]){
                    MenorPreco[p]=matriz[l][p];
                }
            }
        }
        return System.out.printf("Menores preços %f",MenorPreco);
    }
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int l;
        int c;
        System.out.print("Insira o valor de linhas:\n");
        l = Scan.nextInt();
        System.out.print("Insira o valor de colunas:\n");
        c = Scan.nextInt();
        double[][] matriz = new double[l][c];
        Preencher(matriz, l, c);
        EncontrarMenorPrecoPorProduto(matriz);
    }
}
