import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Representa uma operação que não aceita nenhuma argumento e retorna um resultado do tipo T.
 * É comumento usada para criar ou fornecer novos objetos de um determinado tipo 
 */

public class SupplierExample {
    // usando o suplier com o lambda para fornecer uma exa saudação personalizada
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        // usar o supplier para obter uma lista com 5 saudacoes
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}