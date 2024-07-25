package catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    // criando o catalogo de livros
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // metodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            {
                for (Livro l : livroList) {
                    if (l.getAutor().equalsIgnoreCase(autor)) {
                        livrosDoAutor.add(l);
                    }
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoIncial, int anoFinal) {
        List<Livro> livrosEntreAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoIncial && l.getAnoPublicacao() <= anoFinal) {
                    livrosEntreAnos.add(l);
                }
            }
        }
        return livrosEntreAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
