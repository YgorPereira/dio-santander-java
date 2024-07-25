package estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // atributo
    private Map<Long, Produto> estoqueProdutosMap;

    // constructor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // metodos
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double valorProdutoMaisCaro = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > valorProdutoMaisCaro) {
                    produtoMaisCaro = p;
                    valorProdutoMaisCaro = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double valorProdutoMaisBarato = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < valorProdutoMaisBarato) {
                    produtoMaisBarato = p;
                    valorProdutoMaisBarato = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return produtoMaisBarato;
    }

    // metodo main
    public static void main(String[] args) {
        // instanciando um EstoqueProdutos
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // adicionando produtos ao estoque
        estoqueProdutos.adicionarProduto(12, "Coca", 10, 7.50);
        estoqueProdutos.adicionarProduto(82, "Arroz", 18, 12.00);
        estoqueProdutos.adicionarProduto(31, "Salsicha", 10, 11.90);
        estoqueProdutos.exibirProdutos();
        System.out.println("----------------------------");

        // calculando o valor total do estoque
        System.out.println("O estoque vale: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("----------------------------");

        // obtendo o produto mais barato
        System.out.println("O produto mais barato do estoque é: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("----------------------------");

        // obtendo o produto mais caro
        System.out.println("O produto mais caro do estoque é: " + estoqueProdutos.obterProdutoMaisCaro());

    }
}
