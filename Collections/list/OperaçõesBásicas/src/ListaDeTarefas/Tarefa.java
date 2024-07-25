package ListaDeTarefas;

public class Tarefa {
    // atributo
    private String descricao;

    // constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // metodo get
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
}
