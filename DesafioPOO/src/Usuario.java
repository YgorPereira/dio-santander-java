import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

    // testando funcoes do Navegador:
    iphone.adicionarNovaAba();
    iphone.exibirPagina("www.youtube.com");
    iphone.atualizarPagina();

    // testando funcoes do AparelhoTelefone:
    iphone.ligar("(10)98765-4321");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    // testando funcoes do ReprodutorMusical:
    iphone.selecionarMusica("Veigh - Orações");
    iphone.tocar();
    iphone.pausar();
    }
}
