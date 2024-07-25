package conjuntosConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributo
    private Set<Convidado> convidadoSet;

    // criar a coleção em formato de HashSet
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // adicionar um objeto ao HashSet
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // remover um unico objeto da seleção
    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    // contar objetos dentro da coleção
    public int contarConvidados() {
        return convidadoSet.size();
    }

    // impimir a coleçaõ
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        // instanciando novo ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // contando convidados. Saída esperada: 0
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " na lista");

        // adicionando 4 convidados(objetos) a lista de convidados(coleção Set)
        conjuntoConvidados.adicionarConvidado("Ygor", 1234);
        conjuntoConvidados.adicionarConvidado("Luana", 5678);
        conjuntoConvidados.adicionarConvidado("Yago", 5678); // código de convite repetido -> não é adicionado
        conjuntoConvidados.adicionarConvidado("Yuri", 8901);

        // contando convidados. Saída esperada: 3
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " na lista");

        // imprimindo convidados. Saída esperada: [[Ygor, 1234], [Luana, 5678], [Yuri, 8901]] (em ordem aleatória)
        conjuntoConvidados.exibirConvidados();

        // removendo convidadcom o código 8901
        conjuntoConvidados.removerConvidado(8901);

        // contando convidados pós remoção. Saída esperada: 2
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " na lista");

        // imprimindo convidados. Saída esperada: [[Ygor, 1234], [Luana, 5678]] (em ordem aleatória)
        conjuntoConvidados.exibirConvidados();

    }
}
