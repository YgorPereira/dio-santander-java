package soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // atributo
    private List<Integer> listaNumeros;

    // contructor
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // toString
    @Override
    public String toString() {
        return "[" + listaNumeros + "]";
    }

    // metodos
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero); 
    }

    public int calcularSoma() {
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (int numero : listaNumeros) {
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (int numero : listaNumeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (int numero : listaNumeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(listaNumeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
