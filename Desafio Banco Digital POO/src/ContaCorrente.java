public class ContaCorrente extends Conta {
    // constructor
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    // metodos
    public void imprimirInformaçõesCorrente() {
        System.out.println("======= INFORMAÇÕES DA CONTA CORRENTE =======");
        super.imprimirInformaçõesComuns();
    }

    public void imprimirTransacoesCorrente() {
        System.out.println("======= TRANSAÇÕES DA CONTA CORRENTE =======");
        super.imprimirTransacoes();
    }

    public void imprimirSaldoCorrente(){
        System.out.println("======= SALDO DA CONTA CORRENTE =======");
        super.imprimirSaldo();
    }
}
