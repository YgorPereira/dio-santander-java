import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* 
 * essa é a Classe Pai que define atributos e métodos que serão 
 * reutilizados pelas classe filhas ContaPoupanca e ContaCorrente, 
 * logo essas classes não terão atributos próprios, pois herdarão da Classe Pai
 */

public abstract class Conta {
    // atributos
    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> transacoes;
    protected Banco banco;

    // auxiliares
    private static final int agenciaPadrao = 1;
    private static int sequencial = 1;

    // constructor
    protected Conta(Cliente cliente, Banco banco) {
        this.agencia = agenciaPadrao;
        this.numeroConta = sequencial++;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<String>();
        banco.adicionarConta(this);
    }

    // metodos
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            transacoes.add("- R$" + decimalFormat.format(valor));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    };

    public void depositar(double valor) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        saldo += valor;
        transacoes.add("+ R$" + decimalFormat.format(valor));
    };

    protected void imprimirSaldo() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("Saldo: R$" + decimalFormat.format(saldo));
    };

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    };

    public void imprimirInformaçõesComuns() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("- Nome do titular: " + cliente.getNome());
        System.out.println("- CPF do titular: " + cliente.getCpf());
        System.out.println("- Numero da conta: " + numeroConta);
        System.out.println("- Numero da agencia: " + agencia);
        System.out.println("Saldo: R$" + decimalFormat.format(saldo));
    };

    protected void imprimirTransacoes() {
        if (!transacoes.isEmpty()) {
            for (String transacao : transacoes) {
                System.out.println(transacao);
            }
        } else {
            System.out.println("Não foi feita nenhuma transação");
        }
    }

    // getter numeroConta
    public int getNumeroConta() {
        return numeroConta;
    }
}
