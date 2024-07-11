package lanchonete.atendimento;

public class Atendente {
    // default
    void pegarLancheNaCozinha(){
        System.out.println("Atendente pegando lanche na cozinha");
    }

    // public
    public void servindoMesa(){
        pegarLancheNaCozinha();
        System.out.println("Atendente servindo mesa");
    }

    // public
    public void receberPagamento(){
        System.out.println("Atendente recebendo pagamento");
    }

    // a ação de trocar gás não deve ser vísivel para o estabelecimento 
    // default
    void trocarGas(){
        System.out.println("Atendente trocando o gás");
    }
}
