/*
 * essa é a classe usada para realizar os testes dos métodos definidos
 */

public class Main {
    public static void main(String[] args) {
        // instanciar um novo Banco
        Banco santander = new Banco("santander");

        // instanciar novos Clientes
        Cliente ygor = new Cliente("ygor", "santander");
        Cliente luana = new Cliente("luana", "santander");

        // instanciar novas Contas
        ContaCorrente ygorCorrente = new ContaCorrente(ygor, santander);
        ContaPoupanca ygorPoupanca = new ContaPoupanca(ygor, santander);
        ContaCorrente luanaCorrente = new ContaCorrente(luana, santander);

        // imprimir informações de luanaCorrente e ygorPoupanca
        luanaCorrente.imprimirInformaçõesCorrente();
        ygorPoupanca.imprimirInformaçõesPoupanca();

        // depositar em ygorCorrente
        ygorCorrente.depositar(500.00);
        ygorCorrente.imprimirSaldo();

        // sacar de ygorCorrente
        ygorCorrente.sacar(50.0);
        ygorCorrente.imprimirSaldo();

        // tentar sacar valor maior que saldo de ygorCorrente
        ygorCorrente.sacar(8000.00);

        // transferir de ygorCorrente para ygorPoupanca
        ygorCorrente.transferir(50.00, ygorPoupanca);
        ygorCorrente.imprimirSaldo();

        // transferir de uma conta do cliente ygor para a cliente luana
        ygorCorrente.transferir(50, luanaCorrente);

        // imprimir historico de transacoes de ygorCorrente
        ygorCorrente.imprimirTransacoesCorrente();

        /*
         * Nas linhas abaixos os métodos de Banco serão testados a partir
         * do Banco santander que já foi instanciado na linha 8
         */

        // imprimir todas as contas registradas no banco
        santander.imprimirContas();

        // imprimir informações da conta com o número correspondente
        santander.imprimirContaPorNumero(3);
    }
}