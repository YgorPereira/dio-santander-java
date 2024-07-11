package Construtores;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa ygor = new Pessoa("ygor", "12345678910");

        ygor.setEndereco("Rua das andorinhas, 42");

        System.out.println("o usuário " + ygor.getNome() + " do cpf " + ygor.getCpf() + " mora na " + ygor.getEndereco());
    }
}
