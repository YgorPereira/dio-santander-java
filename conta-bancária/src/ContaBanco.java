import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado pro criar uma conta em nosso banco, sua agência é " + numeroAgencia + ",conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
