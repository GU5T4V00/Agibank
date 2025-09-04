import java.util.List;

/*
Produto multiplicativo das taxas de câmbio.
Com uma lista de taxas (tipo double), calcule o produto acumulado de todas — ou seja, multiplique todos os valores.
*/

public class EX010 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> taxas = List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10);
        double multiplicacaoDasTaxas = taxas.stream().reduce(1.0, (a,b) -> a*b);
        System.out.printf("A multiplicação de todas as taxas é de: R$%.2f", multiplicacaoDasTaxas);
    }
}
