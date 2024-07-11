package lanchonete;

// importando as outras classes
import lanchonete.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    
    // definindo objetos:
    Atendente atendente = new Atendente();
    Almoxarife almoxarife = new Almoxarife();
    Cozinheiro cozinheiro = new Cozinheiro();
    Cliente cliente = new Cliente();

    // métodos:
    public void clientePedindo(){
        cliente.fazerPedido();
    }

    public void pedidoPronto(){
        cozinheiro.adicionarComboNoBalcao();
    }

    public void entregandoPedido(){
        atendente.servindoMesa();
    }

    public void finalizandoPagamento(){
        cliente.pagarConta();
        atendente.receberPagamento();
    }

}
