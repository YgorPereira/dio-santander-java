import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuctionExample {
    public static void main(String[] args) {
        // criar uma lista com números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // criar uma function para dobrar os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // criar uma lista de numeros dobrados
        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        // imprimir os numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
