package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinhoList;

    public CarrinhoCompras() {
        this.carrinhoList = new ArrayList<>(); // cria a array carrinho de compras
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade)); // adiciona um novo item
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>(); // cria uma lista de itens para remover
        for (Item i : carrinhoList) { // laço para passar por cada item
            if (i.getNome().equalsIgnoreCase(nome)) { // verifica se o nome é igual ao parametro
                itensParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensParaRemover); // remove itens com nome igual ao parametro
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : carrinhoList) { // laço para passar por cada item
            valorTotal += i.getPreco() * i.getQuantidade(); // soma o valor total com o preco vezes a quantidade de cada item                     
        }
        return valorTotal; // retorna o valor total
    }

    public void exibirItens() {
        System.out.println(carrinhoList); // exibe o carrinho de compras
    }
}
