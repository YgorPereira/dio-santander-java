package catalogo_livros;

import catalogo_livros.CatalogoLivros;

public class Main {
    public static void main(String[] args) {
    // criando a lista catalogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // adicionando livros a lista
    catalogoLivros.adicionarLivro("Jogos Vorazes", "Suzane Collins", 2008);
    catalogoLivros.adicionarLivro("A Maldição do titã", "Rick Riordan", 2007);
    catalogoLivros.adicionarLivro("O martelo de Thor", "Rick Riordan", 2016);
    catalogoLivros.adicionarLivro("It", "Stephen King", 1986);

    // pesquisando por autor
    System.out.println(catalogoLivros.pesquisarPorAutor("Rick Riordan"));

    // pesquisando entre anos
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2007, 2008));

    // pesquisando por titulo
    System.out.println(catalogoLivros.pesquisarPorTitulo("Jogos Vorazes"));
    }
}
