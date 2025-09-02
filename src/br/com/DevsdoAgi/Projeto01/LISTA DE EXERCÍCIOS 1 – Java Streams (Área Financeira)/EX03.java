import java.util.List;
import java.util.stream.Collectors;

/*
3. Listar saldos negativos
Com uma lista de saldos(tipo double), filtre
e liste aqueles valores que são negativos.
 */

public class EX03 {
    public static void main(String[] args) {
        List<Double> lista = List.of(-23.54, 100.23, -2300.45, 500.00, -698.22, 459.87);

        List<Double> numerosNegativos = lista.stream().filter(v -> v < 0).collect(Collectors.toList());

        System.out.println("Os saldos negativos são respectivamente: " +
                numerosNegativos.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining("|| ")));

    }
}
