package br.com.DevsdoAgi.Projeto01;

public class ExercicioDePolimorfismo01Main {
    public static void main(String[] args){
        int[] vetinho = {1, 2, 2, 1, 2, 1, 1};

        for (int i = 0; i < vetinho.length; i++) {
            ExercicioDePolimorfismo01 exercicioDePolimorfismo01;
            if(vetinho[i] == 1){
                exercicioDePolimorfismo01 = new ExercicioDePolimorfismo01CartaoCredito();
                ((ExercicioDePolimorfismo01CartaoCredito) exercicioDePolimorfismo01).numeroDoCartao = "1234-5678-9999-0000";
                exercicioDePolimorfismo01.valor = 100;
            }
            else if(vetinho[i] == 2){
                exercicioDePolimorfismo01 = new ExercicioDePolimorfismo01Pix();
                ((ExercicioDePolimorfismo01Pix) exercicioDePolimorfismo01).chavePix = "usuario@pix.com";
                exercicioDePolimorfismo01.valor = 100;
            }
            else{
                exercicioDePolimorfismo01 = new ExercicioDePolimorfismo01();
                exercicioDePolimorfismo01.valor = 100;
            }
            // Chama o método polimórfico
            exercicioDePolimorfismo01.processarPagamento();
            System.out.println("------------------");
        }
    }
}
