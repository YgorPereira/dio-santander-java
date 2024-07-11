package exemplo_interfaces;

import exemplo_interfaces.equipamentos.copiadora.Copiadora;
import exemplo_interfaces.equipamentos.copiadora.Xerox;
import exemplo_interfaces.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interfaces.equipamentos.digitalizadora.Scanner;
import exemplo_interfaces.equipamentos.impressora.Deskjet;
import exemplo_interfaces.equipamentos.impressora.Impressora;
import exemplo_interfaces.equipamentos.impressora.Laserjet;
import exemplo_interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora1 = new Deskjet();
        impressora1.imprimir();

        Impressora impressora2 = new Laserjet();
        impressora2.imprimir();

        // Impressora impressora3 = new EquipamentoMultifuncional();
        // impressora3.imprimir();

        // Digitalizadora digitalizadora = new Scanner();
        // digitalizadora.digitalizar();

        // Copiadora copiadora = new Xerox();
        // copiadora.copiar();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        Impressora impressora = em;
        // copiadora.copiar();
        // digitalizadora.digitalizar();
        // impressora.imprimir();
        em.copiar();
        em.digitalizar();
        em.imprimir();
        
    }
}
