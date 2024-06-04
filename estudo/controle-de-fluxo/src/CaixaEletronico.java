public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 20.00;
        double valorSolicitado = 18.00;

        if (valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: R$" + saldo);
        }

        else
            System.out.println("Saldo insuficiente");
    }
}
