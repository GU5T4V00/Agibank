import java.util.List;

/*
Exercício 3 – Somar todos os elementos
Operadores: +, reduce
Tipo de retorno: Integer
*/

public class EX03 {
    public static void main(String[] args){
        // Lista de saldos
        List<Integer> inteiros = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17);
        Integer somaDosInteiros = inteiros.stream().reduce(0, (a, b) -> a + b);
        System.out.println("O resultado da soma é de: " + somaDosInteiros);
    }
}
