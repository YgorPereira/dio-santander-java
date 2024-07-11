package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // Alguns métodos devem ser vistos somente pela própria classe, para esse métodos, definimos sua visibilidade como private, assim só a classe terá acesso.
    // os seguintes métodos devem ser vistos somente pelo cozinheiro:

    // private
    private void lavarIngredientes(){
        System.out.println("Lavando os ingredientes");
    }
    
    // private
    private void preparandoLanche(){
        System.out.println("Preparando o lanche");
    }

    // private
    private void preparandoBebida(){
        System.out.println("Preparando a bebida");
    }

    // private
    private void preparandoCombo(){
        preparandoBebida();
        preparandoLanche();
    }

    // todo o estabelecimento deve ver os métodos a seguir:
    // public
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }   

    // public
    public void adicionarBebidaNoBalcao(){
        System.out.println("ADICIONANDO BEBIDA NO BALCÃO");
    }

    // public
    public void adicionarComboNoBalcao(){
        adicionarBebidaNoBalcao();
        adicionarLancheNoBalcao();
    }
}
