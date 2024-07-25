package agenda_eventos;

import java.util.Collection;

public class Evento {
    // atributos
    private String nomeEvento;
    private String nomeAtracao;
    
    // constructor
    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    // getters
    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    // toString
    @Override
    public String toString() {
        return "Evento [nomeEvento=" + nomeEvento + ", nomeAtracao=" + nomeAtracao + "]";
    }

}
