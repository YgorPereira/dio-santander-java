package exemplos_pilares;

// Utilizando o "extends Veiculo" faz com que a classe moto herde as caracteristicas e métodos da classe veiculo, como o a String chassi e seus métodos get and set, isso é o uso da herança
public class Moto extends Veiculo {

    // O método ligar de carro e moto são herdados da classe veículo, porém se comportam de forma diferente, pois, o método é a abstrato e a forma como ele se comporta é definido dentro da classe. Isso é polimorfismo.
    public void ligar() {
        System.out.println("MOTO LIGANDO");
    }

}
