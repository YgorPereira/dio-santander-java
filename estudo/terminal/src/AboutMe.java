import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         try {
            
        // Possível erro: não informar nome e sobrenome.
        System.out.println("Qual o seu nome? ");
        String nome = scanner.next();

        System.out.println("E seu sobrenome? ");
        String sobrenome = scanner.next();

        // Possível erro: informar um caractere NÃO númerico
        System.out.println("Quanto nos você tem? ");
        int idade = scanner.nextInt();

        // Possível erro: as casas decimais serem divididas por um vírgula invés de um ponto(conforme o padrão americano).
        System.out.println("Qual a sua altura? ");
        double altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E " + altura + " de altura");
         }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser númericos...");
        }
    }
}