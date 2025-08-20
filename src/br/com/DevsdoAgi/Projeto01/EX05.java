package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class EX05 {
    public static float CalcularJurosCompostos(float RE, float IM, int ME){
        for (int i = 1; i < ME; i++) {
            RE = RE + (RE * IM);
            System.out.print("O seu rendimento total no mês " + i + " foi de: ");
            System.out.printf("%.2f kwanzas\n", RE);
        }
        return RE;
    }

    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe o Valor de investimento: ");
        float RE = Scan.nextFloat();
        System.out.println("Informe o Valor de Taxa: ");
        float IM = Scan.nextFloat();
        IM = IM/200;
        System.out.println("Informe o número de meses: ");
        int ME = Scan.nextInt();
        CalcularJurosCompostos(RE, IM, ME);
    }
}