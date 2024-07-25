package agenda_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatoMap;

    // constructor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // metodos
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("A agenda está vazia!");
        }
        return numeroPorNome;
    }

    // metodo main para testar os métodos
    public static void main(String[] args) {
        // instanciando AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // adicionando Contatos a agenda
        agendaContatos.adicionarContato("Amelia", 12345678);
        agendaContatos.adicionarContato("Maria", 87654321);
        agendaContatos.adicionarContato("Joao", 10111213);
        agendaContatos.adicionarContato("Lucas", 90807060);
        agendaContatos.exibirContatos();

        // removendo contato por nome
        agendaContatos.removerContato("Lucas");
        agendaContatos.exibirContatos();

        // pesquisando contato por nome e retornando número
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maria"));
    }
}
