package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class ExercicioDeHeranca02 {
    // Atributos comuns a todos os pagamentos
    private String codigo;
    private String nome;
    protected double preco;

    // Construtor
    public ExercicioDeHeranca02() {
    }

    // Getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
class ExercicioDeHeranca02_2 extends ExercicioDeHeranca02{
    Scanner sc = new Scanner(System.in);
    public boolean dataDeValidade;
    public double validade;

    // Construtor
    public ExercicioDeHeranca02_2() {

    }
    public boolean getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(boolean dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public double Vencimento(){
        if (dataDeValidade == true){
            System.out.println("Informe a data de vencimento do produto");
            validade = sc.nextDouble();
        }
        if (dataDeValidade == false){
            System.out.println("Produto não perecível");
        }
        return validade;
    }

    public void produtoFinal(){
        System.out.println("Nome do produto: " + getNome());
    }
}
