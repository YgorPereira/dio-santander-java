package ListaDeTarefas;

import ListaDeTarefas.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // mostrando o tamanho da lista
        System.out.println("O número de elementos dentro da lista é: " + listaTarefas.obterNumeroTotalTarefas());

        // adicionando tarefas
        listaTarefas.adicionarTarefa("Caminhar por 10 minutos");
        listaTarefas.adicionarTarefa("Limpar o quarto");
        listaTarefas.adicionarTarefa("Limpar o quarto"); // adicionando uma tarefa repetida
        listaTarefas.adicionarTarefa("Praticar Java");

        // exibindo a lista
        listaTarefas.obterDescricoesTarefas();

        // mostrando o tamanho pós adição
        System.out.println("O número de elementos dentro da lista é: " + listaTarefas.obterNumeroTotalTarefas());

        // removendo tarefas
        listaTarefas.removerTarefa("Limpar o quarto");

        // exibindo lista pós remoção
        listaTarefas.obterDescricoesTarefas();
        
        // mostrando o tamanho pós remoção
        System.out.println("O número de elementos dentro da lista é: " + listaTarefas.obterNumeroTotalTarefas());

    }

}
