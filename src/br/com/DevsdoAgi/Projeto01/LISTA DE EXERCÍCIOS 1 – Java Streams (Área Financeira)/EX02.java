import java.util.List;
import java.util.Optional;

/*
Maior depósito realizado
Dada uma lista de valores de depósito (tipo double), determine o maior valor absoluto.
 */

public class EX02 {
    public static void main(String[] args){
        // Lista de depositos
        List<Double> depositos = List.of(101.1, 5001.20, 1312.1, 2000.0, 3.7, 3070.40, 6409.6);

        Optional<Double> maior = depositos.stream().max(Double::compare);
        System.out.println("O maior depósito realizado foi de: R$" + maior.get());
    }
}
