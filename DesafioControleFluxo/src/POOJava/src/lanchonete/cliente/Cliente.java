package lanchonete.cliente;

public class Cliente {
    // public
    public void fazerPedido(){
        System.out.println("Cliente fazendo o pedido");
    }

    // Consultar o saldo é uma ação sigilosa e que só o cliente deve ter acesso, logo será uma método privado
    // private
    private void consultarSaldo(){
        System.out.println("Cleinte consultando o saldo da conta");
    }

    // public
    public void pagarConta(){
        System.out.println("Cliente pagando a conta");
    }
}

