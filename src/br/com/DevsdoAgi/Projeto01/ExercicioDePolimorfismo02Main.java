package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class ExercicioDePolimorfismo02Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos investimentos deseja fazer? ");
        int investimentos = sc.nextInt();
        double[] vetordeinvestimentos = new double[investimentos];
        double[] vetorderesultadoinvestimentos = new double[investimentos];
        for (int i = 0; i < vetordeinvestimentos.length; i++) {
            System.out.println("Qual investimento gostaria de investir? ");
            System.out.println("1- Poupança\n2- CDB\n");
            int tipoinvest = sc.nextInt();
            System.out.println("Informe o investimento " + (i+1));
            vetordeinvestimentos[i] = sc.nextDouble();
            System.out.println("Por quantos meses?");
            int meses = sc.nextInt();
            for (int j = 0; j <= meses ; j++) {
                if (tipoinvest == 1){
                    Poupanca inv1 = new Poupanca();
                    inv1.valorAplicado = vetordeinvestimentos[i];
                    for (int k = 0; k < meses; k++) {
                        inv1.calcularRendimento();
                    }
                    vetorderesultadoinvestimentos[i] = inv1.valorAplicado;
                }
                if (tipoinvest == 2){
                    CDB inv1 = new CDB();
                    inv1.valorAplicado = vetordeinvestimentos[i];
                    for (int l = 0; l < meses; l++) {
                        inv1.calcularRendimento();
                    }
                    vetorderesultadoinvestimentos[i] = inv1.valorAplicado;
                }
            }
        }
        System.out.println("Seus investimentos iniciais comparados com os finais: ");
        System.out.print("Investimentos Iniciais: ");
        for (int a = 0; a < vetordeinvestimentos.length; a++) {
            System.out.print(vetordeinvestimentos[a]+ " || ");
        }
        System.out.print("\n");
        System.out.print("Finais: ");
        for (int b = 0; b < vetordeinvestimentos.length; b++) {
            System.out.printf("%.2f || ", vetorderesultadoinvestimentos[b]);
        }
    }
}
