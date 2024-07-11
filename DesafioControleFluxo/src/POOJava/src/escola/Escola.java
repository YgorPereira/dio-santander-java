package escola;

import escola.Aluno;

public class Escola {
    public static void main(String[] args) {
        Aluno ygor = new Aluno();
        ygor.setNome("Ygor Ruan Pereira");
        ygor.setIdade(18);
        ygor.setSexo("Masculino");

        System.out.println("O aluno " + ygor.getNome() + " tem " + ygor.getIdade() + " anos e é do sexo " + ygor.getSexo());
    }
}
