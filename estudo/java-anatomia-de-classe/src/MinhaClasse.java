public class MinhaClasse {
    public static void main(String[] args) {
        // System.out.print("\nOlá Github! Essa é minha primeira classe em java!");
        // String meuNome = "Ygor";

        // int anoAniversario = 2006;

        // boolean sim = true;

        // anoAniversario = 2005;

        String primeiroNome = "Ygor";
        String segundoNome = "Ruan";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
