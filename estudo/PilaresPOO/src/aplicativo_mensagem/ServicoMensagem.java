package aplicativo_mensagem;

/* Vamos definir a classe e os métodos enviarMensagem e receberMensagem como abstract para assim
as classes MSN, Facebook e Telgram possam herdar esses métodos e definir seu comportamento próprio
 */
public abstract class ServicoMensagem {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    /*
     * Os métodos validarConectadoInternet e salvarHistoricoMensagem não precisam
     * ser vistos por todos,
     * então não serão public, porém precisam ser vistos pelas classes filhas, então
     * não podemos definir como private, então utilizaremos a visibilidade
     * "protected", que disponibilizará que somente a classe e as classes filhas
     * tenha acesso a esses métodos
     */
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado á internet");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
}
