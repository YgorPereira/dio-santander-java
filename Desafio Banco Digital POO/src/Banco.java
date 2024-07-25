import java.util.ArrayList;
import java.util.List;

/*
 * Essa é a classe que define os métodos que serão utilizados pelos funcionários do banco 
 * para a administração de contas abertas no banco.
 */

public class Banco {
    // atributos
    private String nome;
    private List<Conta> contas;

    // constructor
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    // métodos
    public void adicionarConta(Conta contaNova) {
        contas.add(contaNova);
    }

    public void imprimirContas() {
        System.out.println("======= EXBINDO TODAS AS CONTAS =======");
        if (!contas.isEmpty()) {
            for (Conta conta : contas) {
                conta.imprimirInformaçõesComuns();
                System.out.println("---");
            }
        } else {
            System.out.println("Nenhuma conta foi aberta.");
        }
    }

    public void imprimirContaPorNumero(int numeroContaPesquisado) {
        if (!contas.isEmpty()) {
            for (Conta c : contas) {
                if (c.getNumeroConta() == numeroContaPesquisado) {
                    System.out.println("===== CONTA NÚMERO " + numeroContaPesquisado + " =====");
                    c.imprimirInformaçõesComuns();
                }
            }
        } else {
            System.out.println("Nenhuma conta foi aberta.");
        }
    }
}
