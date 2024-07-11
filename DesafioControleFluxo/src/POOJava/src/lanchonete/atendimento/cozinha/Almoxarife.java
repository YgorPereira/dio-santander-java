package lanchonete.atendimento.cozinha;

public class Almoxarife {
    
    // Somente o almoxarife deve saber o método de controlar entrada e saida
    // private
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }

    // private
    private void controlarSaida(){
        System.out.println("Controlando a saida dos itens");
    }

    // quando o método é definido sem public ou private na frente, ele automaticamente é definido como default. Métodos default são visiveis somente para classes do mesmo pacote
    // OS métodos a seguir devem ser visiveis somente para a equipe da cozinha:
    // default
    void entregarIngredientes(){
        System.out.println("Entregrando Ingredientes");
        controlarSaida();
    }

    // default
    void trocarGas(){
        System.out.println("Almoxarife trocando o gás");
    }
}
