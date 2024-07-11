package exemplos_pilares;

// Utilizando o "extends Veiculo" faz com que a classe carro herde as caracteristicas e métodos da classe veiculo, como o a String chassi e seus métodos get and set, isso é o uso da herança
public class Carro extends Veiculo {
    // O método ligar de carro e moto são herdados da classe veículo, porém se comportam de forma diferente, pois, o método é a abstrato e a forma como ele se comporta é definido dentro da classe. Isso é polimorfismo.
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    // definindo os métodos confereCambio e confereCombustivel como privates e os chamando no método ligar, que é public, estamos praticando o encapsulamento, onde os dois primeiros métodos deixam de ser vísiveis para as classes filhas, porém os chamamos em um método publico, que é vísivel para outras classes. "Nem tudo precisa ser visível..."
    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio() {
        System.out.println("Conferindo cambior em P");
    }
}
