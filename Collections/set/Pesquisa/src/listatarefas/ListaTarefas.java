package listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // atributo Set
    private Set<Tarefa> listaTarefasSet;

    // constructor HashSet
    public ListaTarefas() {
        this.listaTarefasSet = new HashSet<>();
    }

    // metodos
    public void adicionarTarefa(String descricao) {
        listaTarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!listaTarefasSet.isEmpty()) {
            for (Tarefa t : listaTarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            listaTarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void exibirTarefas() {
        System.out.println(listaTarefasSet);
    }

    public int contarTarefas() {
        return listaTarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConluidas = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (t.isConcluida()) {
                tarefasConluidas.add(t);
            }
        }
        return tarefasConluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarPendente = t;
            }
        }
        if (tarefaParaMarcarPendente != null) {
            tarefaParaMarcarPendente.setConcluida(false);
        } else {
            System.out.println("Tarefa não encontrada na lista!");
        }
    }

    public void limparListaTarefas() {
        if (listaTarefasSet.isEmpty()) {
            System.out.println("A lista de tarefa está vaza");
        } else {
            System.out.println("Limpando lista de tarefas...");
            listaTarefasSet.clear();
        }
    }

    // testando metodos
    public static void main(String[] args) {
        // intancinado a lista de tarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // adicionando tarefas a lista
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Consultar o Trello");
        listaTarefas.adicionarTarefa("Fazer landing page");

        // exibindo a lista
        listaTarefas.exibirTarefas();

        // removendo tarefa
        listaTarefas.removerTarefa("Estudar Python");
        listaTarefas.exibirTarefas();

        // contando tarefas
        System.out.println(listaTarefas.contarTarefas());

        // obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // marcando tarefas como concluidas
        listaTarefas.marcarTarefaConcluida("Consultar o Trello");
        listaTarefas.marcarTarefaConcluida("Fazer landing page");

        // obtendo tarefas concluidas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // marcando tarefa como pendentes
        listaTarefas.marcarTarefaPendente("Fazer landing page");

        // obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // exibindo a lista
        listaTarefas.exibirTarefas();
    }
}
