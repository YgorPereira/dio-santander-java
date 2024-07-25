import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista com numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Usar o Consumer com expressão lambda para imprimir os numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o consumer para imprimir os números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
        // a implementação com lambda feita no método a seguir funciona da mesma forma que
        // método imprimirNumeroPar
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}