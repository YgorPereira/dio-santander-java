import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome? ");
        String nome = scanner.next();

        System.out.println("E seu sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("Quanto nos você tem? ");
        int idade = scanner.nextInt();

        System.out.println("Qual a sua altura? ");
        double altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E " + altura + " de altura");
    }
}