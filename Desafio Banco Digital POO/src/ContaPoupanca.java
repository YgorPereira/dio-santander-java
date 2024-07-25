public class ContaPoupanca extends Conta {
    // constructor
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    // metodos
    public void imprimirInformaçõesPoupanca() {
        System.out.println("======= INFORMAÇÕES DA CONTA POUPANÇA =======");
        super.imprimirInformaçõesComuns();
    }

    public void imprimirTransacoesPoupanca() {
        System.out.println("======= TRANSAÇÕES DA CONTA POUPANÇA =======");
        super.imprimirTransacoes();
    }

    public void imprimirSaldoPoupanca() {
        System.out.println("======= SALDO DA CONTA POUPANÇA =======");
        super.imprimirSaldo();
    }
}
