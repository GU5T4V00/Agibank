package br.com.DevsdoAgi.Projeto01;
import java.util.*;
/*
4. Classe Carro – Consumo de Combustível
Crie a classe Carro com os atributos:
modelo (String)
consumoPorKm (double) → quantos km por litro
Métodos:
double calcularConsumo(double distancia) → retorna a quantidade de litros necessária para uma viagem.
void exibirDados()
Objetivo: calcular o consumo de combustível para uma viagem, dado o modelo e a eficiência do carro.
*/

public class EX04 {
}
class Carro {
    Scanner sc = new Scanner(System.in);
    public String modelo;
    public double consumoPorKm;
    public double distancia;

    public double calcularConsumo(){
        return (distancia/consumoPorKm);
    }

    public void exibirDados(){
        System.out.println("Informe a distância à ser calculada: ");
        distancia = sc.nextDouble();
        System.out.print("O carro informado, de modelo: " + this.modelo + ", faz um total de ");
        System.out.printf("%.2fKm/l ", this.consumoPorKm);
        System.out.println(" e considerando a distância de " + this.distancia + " para esse veículo, o total de gasolina gasto será de: ");
        System.out.printf("%.2fL de combustível", calcularConsumo());
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        System.out.println("Informe o modelo do veículo: ");
        carro1.modelo = sc.nextLine();
        System.out.println("Informe quantos KM o veículo faz por litro: ");
        carro1.consumoPorKm = sc.nextDouble();
        carro1.exibirDados();
    }
}
