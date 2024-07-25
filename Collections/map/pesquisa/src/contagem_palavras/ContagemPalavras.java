package contagem_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    // atributo
    private Map<String, Integer> contagemPalavrasMap;

    // constructor
    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    // toString
    @Override
    public String toString() {
        return "ContagemPalavras [contagemPalavrasMap=" + contagemPalavrasMap + "]";
    }

    // metodos
    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("A lista de palavras está vazia");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotalPalavras = 0;
        if (!contagemPalavrasMap.isEmpty()) {
            for (int contagem : contagemPalavrasMap.values()) {
                contagemTotalPalavras += contagem;
            }
        } else {
            System.out.println("A lista de palavras está vazia");
        }
        return contagemTotalPalavras;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int contagemPalavraMaisFrequente = 0;
        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > contagemPalavraMaisFrequente) {
                    palavraMaisFrequente = entry.getKey();
                    contagemPalavraMaisFrequente = entry.getValue();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        // instanciando ContagemPalavras
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // adicionando palavras
        contagemPalavras.adicionarPalavra("Python", 12);
        contagemPalavras.adicionarPalavra("Java", 82);
        contagemPalavras.adicionarPalavra("JavaScript", 35);
        contagemPalavras.adicionarPalavra("C++", 65);
        contagemPalavras.adicionarPalavra("C#", 48);
        System.out.println(contagemPalavras);
        System.out.println("--------------------------");

        // removendo palavras
        contagemPalavras.removerPalavra("C++");
        contagemPalavras.removerPalavra("JavaScrip");
        System.out.println(contagemPalavras);
        System.out.println("--------------------------");

        // exibindo a contagem total de palavras
        System.out.println(contagemPalavras.exibirContagemPalavras());
        System.out.println("--------------------------");

        // encontrando a palavra que aparece com mais frequência
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

    }
}
