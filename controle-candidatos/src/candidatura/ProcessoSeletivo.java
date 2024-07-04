package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900);
        // analisarCandidato(2200);
        // analisarCandidato(2000);
        // selecaoCandidatos();
        // imprimirSelecionados();

        String[] candidatos = { "Ygor", "Luana", "Daniel", "Geron", "Leo" };
        for (String candidato : candidatos) {
            ligarCandidato(candidato);
        }
    }

    // case 4
    static void ligarCandidato(String candidato ) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando =! atendeu;
            if (continuarTentando){
                tentativasRealizadas ++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " em " + tentativasRealizadas + " tentativas" );
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato);
        }
    }

    // método auxiliar case 4
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    // case 3
    static void imprimirSelecionados() {
        String[] candidatos = { "Ygor", "Luana", "Daniel", "Geron", "Leo" };
        System.out.println("Imprimindo a lista de candidatos selecionados informando o índice do elemento: ");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada para interação for each: ");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    // case 2
    static void selecaoCandidatos() {
        String[] candidatos = { "Ygor", "Luana", "Daniel", "Geron", "Leo", "Caduco", "Hayashi" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga...");
            }

            candidatoAtual++;
        }
    }

    // método auxiliar case 2
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2300);
    }

    // case 1
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}