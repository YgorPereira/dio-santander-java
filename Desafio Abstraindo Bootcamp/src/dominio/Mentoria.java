package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void imprimirInformacoes() {
        System.out.println("====== MENTORIA " + getTitulo().toUpperCase() + "======");
        super.imprimirInformacoesConteudo();
        System.out.println("Data: " + getData());
        System.out.println("=======================================================");
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
