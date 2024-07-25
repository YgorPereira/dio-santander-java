import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        // instanciar novos devs
        Dev devYgor = new Dev("Ygor");
        Dev devLuana = new Dev("Luana");

        // intanciar novos conteudos sobre python
        Mentoria pythonMentoria = new Mentoria();
        pythonMentoria.setTitulo("python em projetos");
        pythonMentoria.setDescricao("como usar pyhton no seu projeto");
        pythonMentoria.setData(LocalDate.of(2024, 7, 28));

        Curso pythonCurso = new Curso();
        pythonCurso.setTitulo("python Sintaxe");
        pythonCurso.setDescricao("conhecendo a sintaxe de pyhton");
        pythonCurso.setCargaHoraria(50);

        // intanciar novos conteudos sobre java
        Mentoria javaMentoria = new Mentoria();
        javaMentoria.setTitulo("java em projetos");
        javaMentoria.setDescricao("como usar java no seu projeto");
        javaMentoria.setData(LocalDate.of(2024, 7, 28));

        Curso javaCurso = new Curso();
        javaCurso.setTitulo("java Sintaxe");
        javaCurso.setDescricao("conhecendo a sintaxe de java");
        javaCurso.setCargaHoraria(50);

        // instanciar novos Bootcamps de python e java
        Bootcamp bootcampPython = new Bootcamp("PythonCamp", "bootcamp de python");
        Bootcamp bootcampJava = new Bootcamp("JavaCamp", "bootcamp de java");

        // adicionar conteudos de python ao bootcamp
        bootcampPython.adicionarConteudo(pythonMentoria);
        bootcampPython.adicionarConteudo(pythonCurso);

        // adicionar conteudos de java ao bootcamp
        bootcampJava.adicionarConteudo(javaMentoria);
        bootcampJava.adicionarConteudo(javaCurso);

        // increver luana no bootcamp de java e progredir uma vez
        devLuana.inscreverBootcamp(bootcampJava);
        devYgor.progredir();

        // inscrever ygor no bootcamp de python e progredir uma vez
        devYgor.inscreverBootcamp(bootcampPython);
        devYgor.progredir();

        // imprimir informações dos conteúdos de java
        javaCurso.imprimirInformacoes();
        javaMentoria.imprimirInformacoes();

        // imprimir informações dos conteúdos de python
        pythonCurso.imprimirInformacoes();
        pythonMentoria.imprimirInformacoes();

        // imprimirInformacoes do bootcampJava
        bootcampJava.imprimirInformacoesBootcamp();

        // imprimirInformacoes do bootcampPython
        bootcampPython.imprimirInformacoesBootcamp();

        // checar alunos matriculados bootcamp java
        System.out.println(bootcampJava.getDevsInscritos());

        // checar alunos matriculados bootcamp python
        System.out.println(bootcampPython.getDevsInscritos());

        // imprimir perfis dos devs luana e ygor
        devLuana.exibirPerfil();
        devYgor.exibirPerfil();
    }
}
