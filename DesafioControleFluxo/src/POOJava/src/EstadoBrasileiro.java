public enum EstadoBrasileiro {

    SAO_PAULO("SP" , "São Paulo", 12),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
    PIAUI("PI", "Piaui", 39),
    MARANHAO("MA", "Maranhão", 85);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }

}
