package livraria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LivrariaOnline {
    // atributo
    private Map<String, Livro> livrariaOnlineMap;

    // constructor
    public LivrariaOnline() {
        this.livrariaOnlineMap = new HashMap<>();
    }

    public void adicionarLivro (String link, String titulo, String autor, double preco){
        livrariaOnlineMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        if(!livrariaOnlineMap.isEmpty()){
            for(Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()){
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    chavesRemover.add(entry.getKey());
                }
            }
            for (String chave : chavesRemover) {
                livrariaOnlineMap.remove(chave);
            }
        } else {
            System.out.println("Vazio!");
        }
    }
}
