package agendacontatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // instanciar novo Set do tipo contato
    private Set<Contato> agendaContatosSet;

    // constructor
    public AgendaContatos() {
        this.agendaContatosSet = new HashSet<>();
    }

    // adicionar objeto a coleção
    public void adicionarContato(String nome, int numero){
        agendaContatosSet.add(new Contato(nome, numero));
    }

    // imprimir coleção
    public void exibirContatos() {
        System.out.println(agendaContatosSet);
    }

    // pequisando objeto pelo atributo nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : agendaContatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    // atualizando o atributo número de um objeto
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatosSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    // testando os metodos
    public static void main(String[] args) {
        // instanciando uma nova agenda de contatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // exibindo a agenda de contatos vazia. Saída esperada: []
        agendaContatos.exibirContatos();

        // adicionando novos contatos a agenda
        agendaContatos.adicionarContato("pedro", 123);
        agendaContatos.adicionarContato("joao", 321);
        agendaContatos.adicionarContato("joao", 451); // atributo nome repetido -> não será adicionado a agenda
        agendaContatos.adicionarContato("larissa", 780);

        // exibindo a agenda de contatos pós adição. Saída esperada: [[pedro, 123], [joao, 321], [larissa, 780]]
        agendaContatos.exibirContatos();

        // buscado contato por nome e imprimindo. Saída esperada: [joao, 451]
        System.out.println(agendaContatos.pesquisarPorNome("joao"));

        // atualizando número de um contato e imprmindo o contato atualizado. Saída esperada: [larissa, 777]
        System.out.println(agendaContatos.atualizarNumeroContato("larissa", 777));
    }
}
