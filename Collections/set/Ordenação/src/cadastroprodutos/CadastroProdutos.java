package cadastroprodutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributos
    private Set<Produto> cadastroProdutosSet;

    // constructor
    public CadastroProdutos() {
        this.cadastroProdutosSet = new HashSet<>();
    }

    // metodos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        cadastroProdutosSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(cadastroProdutosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco= new TreeSet<>(new ComparatorPreco());
        produtosPorPreco.addAll(cadastroProdutosSet);
        return produtosPorPreco;
    }

    // testando metodos
    public static void main(String[] args) {
        // instanciando um novo CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // adicionando produtos
        cadastroProdutos.adicionarProduto(1, "coca", 5.50, 6);
        cadastroProdutos.adicionarProduto(2, "pepsi", 4.50, 3);
        cadastroProdutos.adicionarProduto(2, "ovo", 2.00, 5); // cod repetido -> não será adicionado
        cadastroProdutos.adicionarProduto(3, "hersheys", 3.75, 2);
        cadastroProdutos.adicionarProduto(4, "monster", 7.80, 1);

        // exibindo produtos por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // exibindo produtos por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
