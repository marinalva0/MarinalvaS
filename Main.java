import model.Aluno;
import model.Coodenador;
import model.Pessoa;
import model.Professo;
import servico.PessoaService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa p= new Professo();
        PessoaService ps = new PessoaService();

        System.out.println("Digite o nome ");
        p.setNome(scanner.next());
        System.out.println("Digite a idade ");
        p.setIdade(scanner.nextInt());

        ps.cadastrarPessoa(p);
        System.out.println(ps.list());
        System.out.println("Digite o nome da pessoa que deseja atualiza");
        String nome = scanner.next();
        System.out.println("Digite o novo nome da pessoa");
        String nomeNovo = scanner.next();
        ps.atualizar(nome, nomeNovo);



    }
}