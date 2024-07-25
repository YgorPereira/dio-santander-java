package agenda_eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // atributo
    private Map<LocalDate, Evento> agendaEventosMap;

    // constructor
    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    // metodos
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda() {
        Map<LocalDate, Evento> eventos = new TreeMap<>(agendaEventosMap);
        return eventos;
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventos = new TreeMap<>(agendaEventosMap);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : agendaEventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento é: " + entry.getValue() + "e acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    // metodo mais
    public static void main(String[] args) {
        // instanciando AgendaEventos
         AgendaEventos agendaEventos = new AgendaEventos();

        //  adicionando eventos a agenda eventos
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 27), "TrapFestival", "Matue");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 2, 12), "SertanejoFestival", "Ana Castela");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 01), "MPBfestival", "Vitor Kley");
        System.out.println("-------------------");

        // exibindo a agendo em ordem de data
        System.out.println(agendaEventos.exibirAgenda());
        System.out.println("-------------------");


        // exibindo o proximo evento com base na data atual
        agendaEventos.obterProximoEvento();
        System.out.println("-------------------");

    }
}
