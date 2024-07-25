package ordenacao_numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // atributo
    private List<Integer> listaNumeros;

    // contructor
    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // metodos
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> numerosCrescentes = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(numerosCrescentes);
            return numerosCrescentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDecrescente() {
        List<Integer> numerosDecrescentes = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            numerosDecrescentes.sort(Collections.reverseOrder());
            return numerosDecrescentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
