package CarrinhoDeCompras;

import CarrinhoDeCompras.CarrinhoCompras;

public class Main {
public static void main(String[] args) {
    CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

    // exibindo o carrinho de compras
    carrinhoCompras.exibirItens();

    // adicionando itens
    carrinhoCompras.adicionarItem("coca", 5.0, 2);
    carrinhoCompras.adicionarItem("chocolate", 3.50, 4);
    carrinhoCompras.adicionarItem("bolacha", 4.0, 5);

    // exibindo o carrinho de compras pós adição
    carrinhoCompras.exibirItens();

    // calculando valor total pós adição
    System.out.println("valor total: " + carrinhoCompras.calcularValorTotal());

    // removendo cocas
    carrinhoCompras.removerItem("coca");

    // exibindo o carrinho de compras pós remoção
    carrinhoCompras.exibirItens();

    // calculando valor total pós remoção
    System.out.println("valor total: " + carrinhoCompras.calcularValorTotal());
}
}
