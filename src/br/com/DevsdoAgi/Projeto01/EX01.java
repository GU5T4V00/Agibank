package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class EX01 {

    // Método 1: primeira trinca de alta
    public static int[] T1(double[] precos){
        for (int i = 0 ; i <= precos.length - 3; i++){
            if (precos[i+1] > precos[i] &&
                    precos[i+2] > precos[i+1] &&
                    precos[i+3] <= precos[i+2]) { // Garantir que é só trinca, não maior
                return new int[]{i, i+1, i+2};
            }
        }
        return null;
    }
    // Método 2: primeira tendência de alta (3+ dias)
    public static int[] T2(double[] precos) {
        int cont = 0;
        int inicio = 0;

        for (int i = 0; i < precos.length - 1; i++) {
            if (precos[i+1] > precos[i]) {
                if (cont == 0) inicio = i;
                cont++;
                if (cont >= 3) {
                    int[] indices = new int[cont];
                    for (int j = 0; j < cont; j++) {
                        indices[j] = inicio + j;
                    }
                    return indices;
                }
            } else {
                cont = 0;
            }
        }
        return null;
    }

    // Método 3: todas as tendências de alta
    public static List<List<Integer>> T3(double[] precos) {
        List<List<Integer>> tendencias = new ArrayList<>();
        int cont = 0;
        int inicio = 0;

        for (int i = 0; i < precos.length - 1; i++) {
            if (precos[i+1] > precos[i]) {
                if (cont == 0) inicio = i;
                cont++;
            } else {
                if (cont >= 3) {
                    List<Integer> tendencia = new ArrayList<>();
                    for (int j = 0; j < cont; j++) {
                        tendencia.add(inicio + j);
                    }
                    tendencias.add(tendencia);
                }
                cont = 0;
            }
        }
        if (cont >= 3) {
            List<Integer> tendencia = new ArrayList<>();
            for (int j = 0; j < cont; j++) {
                tendencia.add(inicio + j);
            }
            tendencias.add(tendencia);
        }
        return tendencias;
    }

    // Teste
    public static void main(String[] args) {
        double[] precos = {10, 11, 12, 13, 12, 14, 15, 16, 17, 18};

        System.out.println("Primeira trinca: " + Arrays.toString(T1(precos)));
        System.out.println("Primeira tendência: " + Arrays.toString(T2(precos)));
        System.out.println("Todas as tendências: " + T3(precos));
    }
}
