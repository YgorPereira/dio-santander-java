public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Luana", "Ygor", "Daniel", "Mariana", "Leonardo" };

        // Utilizando método padrão com valor do indice
        // for(int x = 0; x<alunos.length; x++){
        // System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        // }

        // Utilizando o método abreviado
        for (String aluno : alunos) { //o : faz com que armazene cada valor de alunos dentro da varíavel aluno conforme a repetição é feita
            System.out.println( "Nome do aluno é " + aluno);
        }
    }
}