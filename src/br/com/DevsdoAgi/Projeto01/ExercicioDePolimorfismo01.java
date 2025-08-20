package br.com.DevsdoAgi.Projeto01;

public class ExercicioDePolimorfismo01 {
    public double valor;

    public void processarPagamento(){
        System.out.println("Processando pagamento genérico... valor: " + this.valor);
    }
}
class ExercicioDePolimorfismo01CartaoCredito extends ExercicioDePolimorfismo01 {
    public String numeroDoCartao;
    @Override
    public void processarPagamento(){
        System.out.println("Pagamento pelo cartão: " + this.numeroDoCartao);
        System.out.println("Processando pagamento no cartão... valor: " + this.valor);
    }
}
class ExercicioDePolimorfismo01Pix extends ExercicioDePolimorfismo01 {
    public String chavePix;
    @Override
    public void processarPagamento(){
        System.out.println("Pagamento para a chave pix: " + this.chavePix);
        System.out.println("Processando pagamento genérico... valor: " + this.valor);
    }
}
