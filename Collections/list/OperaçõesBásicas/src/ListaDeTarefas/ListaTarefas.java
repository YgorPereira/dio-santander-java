package ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>(); // cria uma lista vazia
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao)); // adiciona uma decricao a lista
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // cria uma lista vazia
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t); 
            }
        }
        tarefaList.removeAll(tarefasParaRemover); // remove a lista tarefarParaRemover de tarefaList
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size(); // o metodo size() conta o tamanho da lista
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList); // imprimi a lista toda
    }

}
