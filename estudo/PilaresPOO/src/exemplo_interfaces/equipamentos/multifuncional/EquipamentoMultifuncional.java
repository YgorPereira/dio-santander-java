package exemplo_interfaces.equipamentos.multifuncional;

// importando as interfaces
import exemplo_interfaces.equipamentos.copiadora.Copiadora;
import exemplo_interfaces.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interfaces.equipamentos.impressora.Impressora;

// utilizamos o implements para iplementar as interfaces necessárias
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    // definindo o comportamento dos métodos herdados das interfaces
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINOD VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    
}
