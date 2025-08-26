import java.util.Scanner;

/*
2. Cálculo de Média Móvel de Ativos
Receba os preços de uma ação nos últimos 10 dias e calcule a média móvel de 3 dias.
Se houver menos de 3 valores no vetor, lance IllegalArgumentException.
Se os preços forem informados incorretamente, capture NumberFormatException.
Fórmula da Média Móvel:
MM=(Patual+Panterior1+Panterior2)/3
Exemplo de Entrada:
{100.0, 102.0, 101.0, 103.0, 105.0}
Saída Esperada:
Média Móvel (dia 3): 101.0
Média Móvel (dia 4): 102.0
Média Móvel (dia 5): 103.
👉 Dica: Valide o tamanho do vetor antes de calcular.
 */

public class CalculodeMediaMoveldeAtivos {
    public static void main(String[] args){
        try(Scanner sc =  new Scanner(System.in)){
            System.out.println("Digite os preços (10 valores), separados por vírgula ou espaço.");
            System.out.println("Exemplo: 100 101 102 103 104 105");
            String entrada = sc.nextLine();

            try{
                double[] precos = parsePrecos(entrada);
                double[] mm3 = CalculodeMedia(precos);

                for (int i = 0; i < mm3.length; i++) {
                    // i=0 corresponde corresponde ao dia 3, i=1 ao dia 4, etc.
                    int dia = i+3;
                    System.out.println("Média Móvel (dia %d): %.1f%n", dia, mm3[i]);
                }
            }catch(NumberFormatException e){
                System.out.println("ERRO: preço informado em formato inválido");
            }catch(IllegalArgumentException e){
                System.out.println("ERRO: " + e.getMessage());
            }
        }
    }
    // Converte a linha digitada em um vetor de double.
    // Aceita vírgulas, espaços e até chaves { ... } do exemplo.
    static double[] parsePrecos(String entrada) throws NumberFormatException{
        if(entrada == null) throw new IllegalArgumentException("Nenhum preço informado");

        String limpa = entrada.replace("{", "").replace("}", "").trim();

        // divide por vírgula ou espaços (um ou mais)
        String[] tokens = limpa.split("[,\\s]+");
        if (tokens.length == 1 && tokens[0].isEmpty()){
            throw new IllegalArgumentException();
        }

        double[] precos = new double[tokens.length];
        for (int i = 0; i < ; i++) {
            
        }
    }
}
