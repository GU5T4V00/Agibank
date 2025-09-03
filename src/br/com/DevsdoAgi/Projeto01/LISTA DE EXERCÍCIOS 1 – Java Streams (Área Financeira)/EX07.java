import java.util.List;

/*
Verificar alta significativa
Verifique se algum valor na lista é maior que R$ 100.000,00.
*/

public class EX07 {
    public static void main(String[] args){
        // Lista de saldos
        List<Double> saldos = List.of(-101.1, 100005001.20, 1312.1, 2000.0, -3.7, 3070.40, 77.43);
        double limite = 100_000.00;
        boolean verific = false;

        // percorre cada saldo
        for (double a : saldos) {
            if (a > limite) {
                verific = true;
                break; // já encontrou, não precisa continuar
            }
        }

        if (verific) {
            System.out.println("Há valor acima de R$ 100.000,00!");
        } else {
            System.out.println("Não há valores acima de R$ 100.000,00.");
        }

    }
}
