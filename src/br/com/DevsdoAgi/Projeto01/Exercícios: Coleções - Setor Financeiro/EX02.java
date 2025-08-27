import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

/*
2. Investidores em Produtos Exclusivos
Um banco oferece produtos de investimento exclusivos. Cada investidor pode ter acesso apenas a um produto único de cada tipo.
Métodos sugeridos:
void adicionarProduto(Set<String> produtos, String nomeProduto) – adiciona o produto ao conjunto, se não estiver presente.
void exibirProdutos(Set<String> produtos) – exibe todos os produtos adquiridos.
*/
public class InvestimentosUtils {

    // Adiciona o produto ao conjunto, se não estiver presente.
    public static void adicionarProduto(Set<String> produtos, String nomeProduto){
        Objects.requireNonNull(produtos, "O conjunto de produtos não pode ser null");
        Objects.requireNonNull(nomeProduto, "O nome do produto não pode ser nulo");

        if(nomeProduto.isBlank()){
            throw new IllegalArgumentException("O nome do produto não pode ser vazio");
        }

        boolean adicionou = produtos.add(nomeProduto);

        if (adicionou) {
            System.out.println("Produto \"" + nomeProduto + "\" adicionado com sucesso.");
        } else {
            System.out.println("Produto \"" + nomeProduto + "\" já está cadastrado - não adicionado.");
        }
    }

    // Exibe todos os produtos adquiridos.
    public static void exibirProdutos(Set<String> produtos) {
        Objects.requireNonNull(produtos, "O conjunto de produtos não pode ser nulo");

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto adquirido.");
            return;
        }

        System.out.println("Produtos adquiridos (" + produtos.size() + "):");
        for (String produto : produtos) {
            System.out.println("- " + produto);
        }
    }

    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();

        InvestimentosUtils.adicionarProduto(produtos, "CDB Premium");
        InvestimentosUtils.adicionarProduto(produtos, "Fundo Imobiliário XPTO");
        InvestimentosUtils.adicionarProduto(produtos, "INSS");
        InvestimentosUtils.adicionarProduto(produtos, "CDB Premium"); // duplicado

        InvestimentosUtils.exibirProdutos(produtos);
    }
}
