public class Cliente {
    // atributos
    private String nome;
    private String cpf;

    // constructor cliente
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
