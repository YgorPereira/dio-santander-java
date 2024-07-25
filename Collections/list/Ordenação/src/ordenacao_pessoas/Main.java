package ordenacao_pessoas;

public class Main {
    public static void main(String[] args) {
        // criando a lista de pessoas
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();

        // adicionando pessoas a lista
        listaPessoas.adcionarPessoa("Ygor", 18, 1.65);
        listaPessoas.adcionarPessoa("Luana", 18, 1.60);
        listaPessoas.adcionarPessoa("Yuri", 22, 1.55);
        listaPessoas.adcionarPessoa("Murilo", 20, 1.80);

        // imprimindo a lista ordenada por idade
        System.out.println("Lista ordendada por idade: " + listaPessoas.ordenarPorIdade());

        // imprimindo a lista ordenada por altura
        System.out.println("Lista ordendada por altura: " + listaPessoas.ordenarPorAltura());
    }
}
