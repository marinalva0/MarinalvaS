package servico;
import model.Pessoa;

import java.util.ArrayList;

public class PessoaService {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();


    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("Cadastrada com sacesso!");
    }

    public ArrayList<Pessoa> list() {
        return pessoas;
    }

    public void atualizar(String nome, String novoNome){
        for (Pessoa pessoa : pessoas){
            if (pessoa.getNome().equalsIgnoreCase(nome)){
                pessoa.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
            }else {
                System.out.println("pessoa não foi cadastrada.");
            }
        }
    }
}