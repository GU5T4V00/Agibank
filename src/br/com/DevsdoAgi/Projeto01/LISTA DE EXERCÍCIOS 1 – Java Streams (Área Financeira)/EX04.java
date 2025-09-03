import java.util.List;

/*
Média dos saldos
Calcule a média de todos os saldos fornecidos. Se a lista estiver vazia, o resultado deve ser 0.
 */

public class EX04 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> saldos = List.of(-101.1, 5001.20, 1312.1, 2000.0, -3.7, 3070.40, 6409.6);
        double media = saldos.stream().mapToDouble(Double::doubleValue).average().orElse(0.00);
        System.out.printf("A média de seus saldos é de: R$%.2f", media);
    }
}
