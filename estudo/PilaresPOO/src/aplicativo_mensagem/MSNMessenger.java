package aplicativo_mensagem;

// MSN é um servico de mensagem, logo ele herda a classe ServicoMensagem, fazendo isso atavés do "extends ServicoMensagem"
public class MSNMessenger extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no MSN...");
        salvarHistoricoMensagem();
    }
}
