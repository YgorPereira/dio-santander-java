package dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void imprimirInformacoes() {
        System.out.println("====== CURSO " + getTitulo().toUpperCase() + "======");
        super.imprimirInformacoesConteudo();
        System.out.println("Carga horaria: " + getCargaHoraria());
        System.out.println("=======================================================");
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria
                + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

}
