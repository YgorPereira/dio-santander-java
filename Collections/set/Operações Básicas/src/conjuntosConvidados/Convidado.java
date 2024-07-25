package conjuntosConvidados;

public class Convidado{
    // atributos
    private String nome;
    private int codigoConvite;

    // constructor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // métorodo toString
    @Override
    public String toString() {
        return "[nome: " + nome + ", codigo do convite: " + codigoConvite + "]";
    }

    // hash and equals que define codigoConvite como parametro para não permitir a adição de elementos duplicados
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    
}