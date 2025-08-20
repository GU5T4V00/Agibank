import java.util.*;
/*
3. Classe Aluno – Média e Situação
Crie a classe Aluno com:
nome (String)
nota1 (double)
nota2 (double)
Métodos:
double calcularMedia()
String verificarSituacao() → retorna "Aprovado", "Reprovado" ou "Recuperação" com base na média.
void exibirRelatorio()
Objetivo: instanciar um ou mais alunos e apresentar o boletim com notas e situação final.
 */
public class EX03 {
    public String nome;
    public double nota1;
    public double nota2;

    public EX03(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    public String verificarSituacao(){
        double media = calcularMedia();
        if (media >=7){
            return ("-----Você foi aprovado(a)!!!-----");
        }else if(media >=5){
            return ("-----Precisará refazer a prova!!!-----");
        }else{
            return ("-----Você foi reprovado(a)!!!-----");
        }
    }
    public void exibirRelatorio() {
        double media = calcularMedia();
        System.out.println("----- Boletim -----");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Nota da Prova 1: " + this.nota1);
        System.out.println("Nota da Prova 2: " + this.nota2);
        System.out.println("Média Final: " + media);
        System.out.println("Situação: " + verificarSituacao());
        System.out.println("-------------------\n");
    }
    public static void main(String[] args) {
        EX03 aluno1 = new EX03("Gustavo", 8.5, 7.0);
        EX03 aluno2 = new EX03("Maria", 3.5, 4.5);
        EX03 aluno3 = new EX03("João", 6.0, 6.5);

        aluno1.exibirRelatorio();
        aluno2.exibirRelatorio();
        aluno3.exibirRelatorio();
    }
}
