package br.com.DevsdoAgi.Projeto01;

public class ExercicioDePolimorfismo02 {
    public double valorAplicado;

    public double calcularRendimento(){
        return 0;
    }
}
class Poupanca extends ExercicioDePolimorfismo02{
    @Override
    public double calcularRendimento(){
        valorAplicado += valorAplicado*0.005;
        return valorAplicado;
    }
}
class CDB extends ExercicioDePolimorfismo02{
    @Override
    public double calcularRendimento(){
        valorAplicado += valorAplicado*0.01;
        return valorAplicado;
    }
}
