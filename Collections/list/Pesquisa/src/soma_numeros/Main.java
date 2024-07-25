package soma_numeros;

public class Main {
    public static void main(String[] args) {
        // cria a lista de numeros
        SomaNumeros numerosList = new SomaNumeros();

        // adicionando números a lista
        numerosList.adicionarNumero(5);
        numerosList.adicionarNumero(10);
        numerosList.adicionarNumero(15);
        numerosList.adicionarNumero(20);

        // imprime a lista de numeros. Saída esperada: [5, 10, 15, 20]
        numerosList.exibirNumeros();

        // encontra o maior valor da lista. Saída esperada: 20
        System.out.println("Maior número: " + numerosList.encontrarMaiorNumero());

        //encontra o menor valor da lista. Saída esperada: 5
        System.out.println("Menor número: " + numerosList.encontrarMenorNumero());

        //soma os números da lista. Saída esperada: 50
        System.out.println("Soma do números: " + numerosList.calcularSoma());
    }
}
