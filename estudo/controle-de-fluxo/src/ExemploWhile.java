import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
                
            System.out.println("Valor do Doce: R$" + valorDoce + "Adicionado no carrinho");
            mesada -= valorDoce;
        }
        System.out.println("Joãozinho gastou toda a mesada em doces!");
    }
}