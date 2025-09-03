import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

/*
Contar transações altas
Conte quantos valores em uma lista são maiores que R$ 1.000,00.
 */

public class EX06 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> saldos = List.of(-101.1, 5001.20, 1312.1, 2000.0, -3.7, 3070.40, 77.43);
        List<Double> valoresAltos = saldos.stream().filter(v -> v > 1000.00).toList();
        System.out.printf("Lista dos valores elevados: " + valoresAltos);
    }
}
