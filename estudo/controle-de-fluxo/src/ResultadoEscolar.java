public class ResultadoEscolar {
    public static void main (String[] args){
        double nota = 5;

        // Utilizando as estruturas condicionais if, else if e else:
        // if(nota >= 7)
        //     System.out.println("Aprovado");

        // else if(nota >= 5 && nota < 7)
        //     System.out.println("Em recuperação");

        // else
        //     System.out.println("Reprovado");


        // Utilizanod os operadores ternários:

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}