package dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    private void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    private void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    private void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    private String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        } else {
            System.out.println("O dicionario está vazio");
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        // instanciando Dicionario
        Dicionario dicionario = new Dicionario();

        // adicionando palavras e definicoes no dicionario
        dicionario.adicionarPalavra("Cão", "Um animal de estimação que late.");
        dicionario.adicionarPalavra("Casa", "Um lugar onde as pessoas vivem");
        dicionario.adicionarPalavra("Livro", "Um conjunto de páginas com histórias ou informações");
        dicionario.adicionarPalavra("Bola", "Um objeto redondo usado para brincar");
        dicionario.adicionarPalavra("Árvore", "Uma planta alta com tronco, galhos e folhas");
        dicionario.exibirPalavras();

        // removendo palavras
        dicionario.removerPalavra("Árvore");
        dicionario.removerPalavra("Livro");
        dicionario.exibirPalavras();

        // pesquisando por palavra e mostrando sua definição
        System.out.println("A definição de é: " + dicionario.pesquisarPorPalavra("Casa"));
    }
}