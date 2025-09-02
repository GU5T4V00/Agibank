import java.util.List;

/*
Total de transações acima de R$ 5.000
Dada uma lista de valores (tipos double) em uma única classe, calcule a soma de
 todos os valores que excedem R$ 5.000,00.
 */

public class EX01 {
    public static void main(String[] args){
        // Lista de transações
        List<Double> valores = List.of(101.1, 5001.20, 121312.1, 2000.0, 3.7, 3070.40, 6409.6);
        // Soma apenas os valores acima de 5000
        double acimade5000 = valores.stream().filter(valor -> valor > 5000).mapToDouble(Double::doubleValue).sum();

        System.out.println("Valor total da soma de todas as contas acima de R$5.000,00: R$" + acimade5000);
    }
}
