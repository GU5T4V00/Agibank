package br.com.DevsdoAgi.Projeto01;
import java.util.*;

public class EX02 {
}
interface IDescontavel {
    double calcularPrecoFinal(double precoBase);
}
class ProdutoComum implements IDescontavel {
    @Override
    public double calcularPrecoFinal(double precoBase) {
        if (precoBase < 0) throw new IllegalArgumentException("Preço base não pode ser negativo.");
        return precoBase * 0.95; // 5% de desconto
    }
}
class ProdutoPromocional implements IDescontavel {
    @Override
    public double calcularPrecoFinal(double precoBase) {
        if (precoBase < 0) throw new IllegalArgumentException("Preço base não pode ser negativo.");
        return precoBase * 0.80; // 20% de desconto
    }
}
class MainProduto {
    public static void main(String[] args) {
        double base = 200.00;

        IDescontavel prodDesc1 = new ProdutoComum();
        IDescontavel prodDesc2 = new ProdutoPromocional();

        System.out.printf("Preço base: R$ %.2f%n", base);
        System.out.printf("Produto Comum (5%%): R$ %.2f%n", prodDesc1.calcularPrecoFinal(base));
        System.out.printf("Produto Promocional (20%%): R$ %.2f%n", prodDesc2.calcularPrecoFinal(base));
    }
}
