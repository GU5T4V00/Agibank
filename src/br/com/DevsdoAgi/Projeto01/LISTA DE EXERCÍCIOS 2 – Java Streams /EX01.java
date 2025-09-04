import java.util.List;

/*
Exercício 1 – Filtrar números pares
Operadores: ->, ==, %, filter
Tipo de retorno: Stream<Integer>
*/

public class EX01 {
    public static void main(String[] args){
        // Lista de saldos
        List<String> estados = List.of("São Paulo", "Minas Gerais", "Acre", "Mato Grosso", "Paraná");
        estados.stream().forEach(v -> System.out.println("Eu sou do estado de " + v));
    }
}
