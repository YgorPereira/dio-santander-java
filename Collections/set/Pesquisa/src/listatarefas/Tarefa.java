package listatarefas;

public class Tarefa {
    // atributos
    private String descricao;
    private boolean concluida;

    // constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    // getters
    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    // setter concluida
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // toString 
    @Override
    public String toString() {
        return "[descricao: " + descricao + ", concluida:" + concluida + "]";
    }

    
}
