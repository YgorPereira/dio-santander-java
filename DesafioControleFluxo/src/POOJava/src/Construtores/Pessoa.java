package Construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    // Método construtor
    // O nome deve ser igual ao da classe
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
}
