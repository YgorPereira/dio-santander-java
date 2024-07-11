package aplicativo_mensagem;

public class ComputadorUsuario {
    public static void main(String[] args) {

        ServicoMensagem appMensagem = null;

        String appEscolhido = "telegram";

        if(appEscolhido == "msn"){
            System.out.println("MSN: ");
            appMensagem = new MSNMessenger();
        } else if(appEscolhido == "facebook") {
            System.out.println("Facebook: ");
            appMensagem = new FacebookMessenger();
        } else{
            System.out.println("Telegram: ");
            appMensagem = new Telegram();
        }

        appMensagem.enviarMensagem();
        System.out.println();
        appMensagem.receberMensagem();
    }
}