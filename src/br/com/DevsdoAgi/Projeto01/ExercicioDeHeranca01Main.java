package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class ExercicioDeHeranca01Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ExercicioDeHeranca01_1 conta1 = new ExercicioDeHeranca01_1(1000, 1000*2);
        System.out.println("Informe seu nome");
        String user1 = sc.nextLine();
        System.out.println("Informe o chegue desejado");
        double xeque = sc.nextDouble();

        conta1.setTitular(user1);
        conta1.processarPagamento(); // Polimorfismo → vai chamar da subclasse
        conta1.sacarComChequeEspecial();
        sc.close();
    }
}
