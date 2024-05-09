public class Operadores {
    public static void main(String[] args) throws Exception {

        // String nomeCompleto = "Ygor" + " Ruan" + " Pereira";

        int soma = 2 + 5;
        double subtracao = 12 - 3.11;
        int divisao = 212 / 6;
        int mutiplicacao = 120 * 12;

        String concatenacao = "?";
        concatenacao = 2.5 + 1.7 + "1"; // o resultado será 31, pois o programa soma os um e depois adiciona a string
                                        // "1". Ou seja, o java pode somar números com strings
        // concatenacao = 1 + "1" + 1 + 1; // a partir da primeira ocorrência de um
        // texto, o resto da operação será um concatenação, ou seja, as operações
        // aritmeticas não serão realizadas.
        // concatenacao = "1" + 1 + 1 + 1;
        // concatenacao = "1" + (1+1+1); //Caso a operação aritmética esteja dentro de
        // parantêses, ela ainda será efetuada mesmo depois da primeira ocorrência de um
        // texto.

        // int numero = 5; // esse valor já é positivo, mesmo sem o (+)
        // System.out.println(-numero); // o - antes da variável o imprime como negativo
        // sem alterar a variável declarada
        // numero = - numero; // isso converte a VARIÁVEL em negativo
        // numero = * -1; // para converte-lo um numero negativo para postivo, basta
        // mutiplica-lo por menos um;

        int numero = 8;
        // numero++; // O operador ++ soma 1 a variável mencionada;
        // numero--; // O operador -- subtrai 1 da variável mencionada
        // System.out.println(numero);

        boolean variavel = false;
        // System.out.println(!variavel); // O operador ! nega uma variável, logo, true
        // passará ser falso e falso passará a ser true;

        int a, b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso"; // Essa linha checa uma condiçã. O "?" funciona com o "if" e
                                                            // o ":" funciona como o "else".
        // System.out.println(resultado);

        // comparando numeros:
        int numero1 = 10;
        int numero2 = 15;

        boolean simNao = numero1 == numero2;
        // System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        // System.out.println("numero1 é diferente de numero2?" + simNao);

        simNao = numero1 > numero2;
        // System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 >= numero2;
        // System.out.println("numero1 é maior ou igual que numero2? " + simNao);

        simNao = numero1 < numero2;
        // System.out.println("numero1 é menor que numero2? " + simNao);

        if (numero1 <= numero2) {
            // System.out.println("numero1 é menor ou igual que numero2...");
        } // quando a condição está dentro de chaves {} só será executada se ela for
          // verdadeira(true).

        // comparando strings:
        String nomeUm = "Ygor";
        // String nomeDois = "Luana";

        // System.out.println(nomeUm != nomeDois);

        String nomeTres = new String("Ygor"); // criando um novo objeto.

        // System.out.println(nomeUm == nomeTres); // feito dessa forma, ela vai
        // resultar em "false", mesmo com os comparados sendo iguais, pois estamos
        // comparando uma variável, que é armazenada na stack memory, com um objeto,
        // armazenado na heap memory.

        System.out.println(nomeUm.equals(nomeTres)); // esse é a forma certa de compara a igualdade entre uma variável e um objeto, utilizando o método "equals()"
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1&&condicao2){
            System.out.println("as duas condições são verdadeiras!"); //isso só será imprimido se condição1 E condição2 forem verdadeiras.
        }
        System.out.println("fim");

        if(condicao1||condicao2){
            System.out.println("uma das duas condições são verdadeiras"); //isso só será imprimido se condição1 OU condição2 for verdadeira.
        }
    }
    

}
