package palavrasUnicas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributo
    private Set<String> palavrasUnicas;

    // constructor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    // toString
    @Override
    public String toString() {
        return "[" + palavrasUnicas + "]";
    }

    // metodos
    public void adiconarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            System.out.println("A palavra " + palavra + " está presente no conjunto.");
        } else {
            System.out.println("A palavra " + palavra + " não esta presente no conjunto.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    // testando os metodos no metodo main
    public static void main(String[] args) {
        // instanciando o Set
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        // imprimindo o conjunto de palavras vazio. Saída esperada: []
        palavrasUnicas.exibirPalavrasUnicas();

        // adicionando palavras ao conjunto
        palavrasUnicas.adiconarPalavra("chocolate");
        palavrasUnicas.adiconarPalavra("avião");
        palavrasUnicas.adiconarPalavra("sapato");
        palavrasUnicas.adiconarPalavra("estrela");
        palavrasUnicas.adiconarPalavra("estrela");
        palavrasUnicas.adiconarPalavra("praia");

        // imprimindo o conjunto de palavras pós adição. Saída esperada: [chocolate,
        // avião, sapato, estrela, praia] (em ordem aleatória)
        palavrasUnicas.exibirPalavrasUnicas();

        // removendo palavras do conjunto
        palavrasUnicas.removerPalavra("chocolate");
        palavrasUnicas.removerPalavra("avião");
        palavrasUnicas.removerPalavra("sapato");

        // imprimindo o conjunto de palavras pós adição. Saída esperada: [estrela,
        // praia] (em ordem aleatória)
        palavrasUnicas.exibirPalavrasUnicas();

    }
}