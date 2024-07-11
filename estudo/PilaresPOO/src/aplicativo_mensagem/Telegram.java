package aplicativo_mensagem;

// Telegram é um servico de mensagem, logo ele herda a classe ServicoMensagem, fazendo isso atavés do "extends ServicoMensagem"
public class Telegram extends ServicoMensagem {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no Telegram...");
        salvarHistoricoMensagem();
    }
}
