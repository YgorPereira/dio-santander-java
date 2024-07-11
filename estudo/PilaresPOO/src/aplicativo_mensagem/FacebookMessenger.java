package aplicativo_mensagem;

// Faceboook é um servico de mensagem, logo ele herda a classe ServicoMensagem, fazendo isso atavés do "extends ServicoMensagem"
public class FacebookMessenger extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no Facebook...");
        salvarHistoricoMensagem();
    }
    
}  