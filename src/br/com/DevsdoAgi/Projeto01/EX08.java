package br.com.DevsdoAgi.Projeto01;

import java.util.*;

public class EX08 {
    public static double MediaMovel(double[] precos, int dias){
        for (int i = 0; i < dias - 1; i++) {
            Scanner Scan = new Scanner(System.in);
            System.out.print("Insira o valor de diário \n");
            precos[i] = Scan.nextDouble();
            System.out.println("O número: " + precos[i] + " foi atrbuído \n");

        }
        System.out.println("O vetor final é: ");
        for (int i = 0; i < dias - 1; i++) {
            System.out.printf("%.2f, ", precos[i]);
        }
        return dias;
    }

    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int dias;
        System.out.print("Insira o valor de dias\n");
        dias = Scan.nextInt();
        double[] precos = new double[dias -1];
        MediaMovel(precos, dias);
    }
}
