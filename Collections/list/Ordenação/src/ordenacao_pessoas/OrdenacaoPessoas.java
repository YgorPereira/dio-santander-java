package ordenacao_pessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // atributo 
    private List<Pessoa> pessoasList;

    // constructor
    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    // metodos
    public void adcionarPessoa(String nomeString, int idade, double altura) {
        pessoasList.add(new Pessoa(nomeString, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorAltura());
        return pessoasPorAltura;
    }

}
