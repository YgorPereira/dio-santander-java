package aparelho;

import funcoes.AparelhoTelefone;
import funcoes.Navegador;
import funcoes.ReprodutorMusical;

public class Iphone implements Navegador, AparelhoTelefone, ReprodutorMusical {

    // Funções do Navegador:
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador");
    }

    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    // Funções do AparelhoTelefone:
    public void ligar(String numero) {
        System.out.println("ligando para o número" + numero);
    }

    public void atender() {
        System.out.println("Atendendo telefone...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz...");
    }

    // Funções do ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}
