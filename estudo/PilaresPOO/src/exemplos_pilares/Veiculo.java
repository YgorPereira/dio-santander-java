package exemplos_pilares;

// o "abstract" define a classe como abstrata, o que disponibiliza que a classe forneça métodos que serão herdadas, porém serão definidas como se comportar de forma diferente em cada classe. Isso é a abstração
public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Isso define o método como abstrato, abrindo a possibilidade para o polimorfismo de outras classes que herdam esse método da classe principal veículo.
    public abstract void ligar();

}
