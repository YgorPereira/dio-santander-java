package listaalunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // atributo
    private Set<Aluno> gerenciadorAlunosSet;

    // cosntructor
    public GerenciadorAlunos() {
        this.gerenciadorAlunosSet = new HashSet<>();
    }

    // metodos
    public void adicionarAluno(String nome, Long matricula, double media) {
        gerenciadorAlunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!gerenciadorAlunosSet.isEmpty()) {
            for (Aluno a : gerenciadorAlunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                }
            }
            if (alunoParaRemover != null) {
                System.out.println("removendo aluno do sistema...");
                gerenciadorAlunosSet.remove(alunoParaRemover);
            } else {
                System.out.println("Aluno não encontrado...");
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(gerenciadorAlunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComaparatorMedia());
        alunosPorMedia.addAll(gerenciadorAlunosSet);
        return alunosPorMedia;
    }

    public void exibirAlunos() {
        System.out.println(gerenciadorAlunosSet);
    }

    // testando os metodos no metodo main
    public static void main(String[] args) {
        // instanciando a nova coleção
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // adicionando alunos e imprimindo a coleção
        gerenciadorAlunos.adicionarAluno("Rafaela", 123456L, 7.2);
        gerenciadorAlunos.adicionarAluno("Joao", 123456L, 7.2); // mesma matricula -> não será adicionado
        gerenciadorAlunos.adicionarAluno("Marcelo", 45627L, 6.8);
        gerenciadorAlunos.adicionarAluno("Joana", 45729L, 9.5);
        gerenciadorAlunos.adicionarAluno("Maria", 519371L, 5.2);
        gerenciadorAlunos.adicionarAluno("Luis", 901638L, 10.0);
        gerenciadorAlunos.exibirAlunos();

        // removendo alunos por matricula e imprimindo
        gerenciadorAlunos.removerAluno(123456L);
        gerenciadorAlunos.removerAluno(519371L);
        gerenciadorAlunos.exibirAlunos();

        // exibindo por ordem alfabetica
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // exibindo por ordem de notas
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
