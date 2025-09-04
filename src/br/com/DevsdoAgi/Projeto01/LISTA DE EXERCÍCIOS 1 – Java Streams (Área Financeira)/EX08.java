import java.util.List;
import java.util.stream.Collectors;

/*
Concatenar valores positivos
Crie uma string única com todos os valores positivos da lista, separados por vírgula.
*/

public class EX08 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> saldos = List.of(-101.1, 100005001.20, 1312.1, 2000.0, -3.7, 3070.40, 77.43);
        String positivos = saldos.stream().filter(v -> v > 0).map(v -> String.format("R$%.2f", v)).collect(Collectors.joining(" || "));

        System.out.println("Os valores positivos de saldo são: " + positivos);
    }
}
