package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class ExercicioDeHeranca02Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ExercicioDeHeranca02 pod1 = new ExercicioDeHeranca02();
        System.out.println("Informe o código do produto: ");
        String cod1 = sc.nextLine();
        System.out.println("Informe o nome do produto");
        String nome1 = sc.nextLine();
        System.out.println("É um produto perecível?");
        String pere1 = sc.nextLine();
        pod1.setCodigo(cod1);
        pod1.setNome(nome1);

        // Comparação ignorando maiúsculas/minúsculas
        if (pere1.equalsIgnoreCase("sim")) {
            ;((ExercicioDeHeranca02_2)pod1).dataDeValidade = true;
        }
        if (pere1.equalsIgnoreCase("não")) {
            ;((ExercicioDeHeranca02_2)pod1).dataDeValidade = false;
        }
        // Polimorfismo → vai chamar da subclasse
        sc.close();
    }
}
