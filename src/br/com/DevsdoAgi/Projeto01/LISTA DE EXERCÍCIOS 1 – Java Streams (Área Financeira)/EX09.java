import java.util.List;

/*
Somar apenas valores positivos.
Calcule a soma exclusiva dos valores positivos na lista.
*/

public class EX09 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> saldos = List.of(-101.1, 15001.20, 1312.1, 2000.0, -3.7, 3070.40, 77.43);
        double somaDosPositivos = saldos.stream().filter(v -> v >0).reduce(0.0, Double::sum);

        System.out.printf("A soma dos valores positivos é: R$%.2f", somaDosPositivos);
    }
}
