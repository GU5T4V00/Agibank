import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

/*
Transações em ordem decrescente
Reordenar os valores fornecidos (tipo double) da lista em ordem decrescente.
 */

public class EX01 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> saldos = List.of(-101.1, 5001.20, 1312.1, 2000.0, -3.7, 3070.40, 77.43);
        String decrescente = saldos.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" > "));
        System.out.printf("Lista em ordem decrescente: " + decrescente);
    }
}
