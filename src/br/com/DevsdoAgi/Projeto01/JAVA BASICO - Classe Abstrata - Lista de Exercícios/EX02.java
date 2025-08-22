import java.util.*;
/*
2. Cartão de Pagamento
Crie a classe abstrata Cartao com atributos numero e limite e o método abstrato void processarCompra(double valor).
Crie as subclasses:
CartaoCredito → compra reduz do limite disponível.
CartaoDebito → compra reduz diretamente do saldo (atributo adicional saldoConta).
No Main, simule compras nos dois tipos de cartão e mostre os saldos/limites finais.
*/

public class EX02 {
}
abstract class Cartao {
    protected int numero;
    protected double limite;

    public Cartao(int numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }
    public abstract void calculoCompra();
}
class CartaoCredito extends Cartao{
    public ContaCorrente(int numero, double limite) {
        super(numero, limite);
    }
    @Override
    public void calculoCompra(){
        limite -= compra;
    }
}

class CartaoDebito extends Cartao{
    public ContaCorrente(int numero) {
        super(numero);
    }
    @Override
}


class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cc = new CartaoCredito(1, 1000);
        Conta cd = new CartaoDebito(1);
        System.out.println("Insira o valor da compra que deseja fazer");
        double compra = sc.nextDouble();
        if (cc.limite > compra){
            System.out.printf("Compra aprovada!! O seu limite atual é de: " + cc.calculoCompra());
        }
        System.out.printf("Saldo atual da sua conta corrente: %.2f \n", cc.saldo);
        System.out.printf("Saldo atual da sua conta poupança: %.2f \n", cp.saldo);
    }
}
