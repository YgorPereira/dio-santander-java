public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.50;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //para tonar essa igualdade possível, devemos adicionar uma casta para igualar os tipos da classe, assim sendo o (short) depois do sinal de igual.

        final double VALOR_DE_PI = 3.14;
        //  VALOR_DE_PI = 2.1; esse comando será inválido por ser declarado como final na linha anterior.
        System.out.print( VALOR_DE_PI);
    }
}
