package ordenacao_numero;

public class Main {
    public static void main(String[] args) {
        // criando a lista de numeros
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        // adicionando numeros
        listaNumeros.adicionarNumero(39);
        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(18);
        listaNumeros.adicionarNumero(21);
        listaNumeros.adicionarNumero(14);

        // imprimindo a lista em ordem crescente. Saida esperada: [10, 14, 18, 21, 39]
        System.out.println("Números em ordem crescente: " + listaNumeros.ordenarCrescente());

        // imprimindo a lista em ordem decrescente. Saida esperada: [39, 21, 18, 14, 10]
        System.out.println("Números em ordem decrescente: " + listaNumeros.ordenarDecrescente());
    }
}
