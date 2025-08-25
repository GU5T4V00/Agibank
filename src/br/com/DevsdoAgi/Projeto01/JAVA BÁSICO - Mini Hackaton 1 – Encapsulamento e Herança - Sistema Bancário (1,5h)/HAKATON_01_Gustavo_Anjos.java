package br.com.DevsdoAgi.Projeto01;
import java.util.*;

/*
Tema: Cadastro de Funcionários de Banco
Objetivo:
Criar um sistema simples de funcionários com atributos encapsulados e uso de herança.
Passos do Desafio:
Crie a classe Funcionario:
Atributos privados: nome, salario.
Construtor para inicializar.
Getters e setters para os atributos.
Crie as subclasses:
Gerente → herda de Funcionario, possui um bônus fixo de R$ 2000.
Analista → herda de Funcionario, possui um bônus fixo de R$ 1000.
Na Main:
Crie 1 gerente e 1 analista.
Mostre o nome, salário e bônus de cada um.
 */

// Apenas para ditar o nome do arquivo de forma que não interfira na compreensão do código
public class HAKATON_01_Gustavo_Anjos {
}

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario() {
        this.nome = "Não Informado";
        this.salario = 0.00;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNome(){
        return this.salario;
    }

    public abstract void exibirFuncionario();
}

class Analista extends Funcionario{
    public Analista() {
        this.nome = "Não Informado";
        this.salario = 0.00;
    }
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    public void cargo(){
        this.salario += 1000;
    }

    @Override
    public void exibirFuncionario(){
        System.out.println("==========");
        System.out.println("Colaborador: " + this.nome);
        System.out.println("Cargo: Analista");
        System.out.println("Salário: " + this.salario);
        System.out.println("==========");
    }
}

class Gerente extends Funcionario{
    public Gerente() {
        this.nome = "Não Informado";
        this.salario = 0.00;
    }
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public void cargo(){
        this.salario += 2000;
    }
    @Override
    public void exibirFuncionario(){
        System.out.println("==========");
        System.out.println("Colaborador: " + this.nome);
        System.out.println("Cargo: Gerente");
        System.out.println("Salário: " + this.salario);
        System.out.println("==========");
    }
}
class Main{
    public static void main(String[] args) {
        double salariobase = 0;
        Scanner sc = new Scanner(System.in);
        Analista analista1 = new Analista();
        Gerente gerente1 = new Gerente();
        System.out.println("==========BEM-VINDO==========");
        boolean executando = true;
        while(executando){
            System.out.println("Informe agora o salário base de um funcionário:");
            salariobase = sc.nextDouble();
            if (salariobase <= 0) {
                System.out.println("Valor invalido, não é possivel inserir valor 0 ou negativo para salário\n");
            }else{
                executando = false;
            }
        }

        executando = true;
        while(executando){
            System.out.println("\n--- MENU ---");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir um Analista");
            System.out.println("2 - Inserir um Gerente");
            System.out.println("3 - Lista de Funcionários");
            int opcao = sc.nextInt();
            String enter = sc.nextLine();
            switch(opcao){
                case 0:
                    executando = false;
                    System.out.println("Operação finalizada. Volte sempre ❤️");
                    break;
                case 1:
                    System.out.println("Informe o nome do colaborador: ");
                    String analista = sc.nextLine();
                    analista1.setNome(analista);
                    analista1.setSalario(salariobase);
                    analista1.cargo();
                    break;
                case 2:
                    System.out.println("Informe o nome do colaborador: ");
                    String gerente = sc.nextLine();
                    gerente1.setNome(gerente);
                    gerente1.setSalario(salariobase);
                    gerente1.cargo();
                    break;
                case 3:
                    analista1.exibirFuncionario();
                    gerente1.exibirFuncionario();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
