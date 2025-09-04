import java.util.List;

/*
Exercício 2 – Filtrar números maiores que 10
Operadores: ->, >, >=, filter
Tipo de retorno: Stream<Integer>
*/

public class EX02 {
    public static void main(String[] args){
        // Lista de saldos
        List<Integer> inteiros = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17);
        List<Integer> inteirosMaioresQue10 = inteiros.stream().filter(v -> v > 10).toList();
        System.out.println("Os numeros maiores que 10 são: " + inteirosMaioresQue10);
    }
}
