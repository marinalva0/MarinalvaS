import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Fucionario F = new Fucionario();
        Gerente G = new Gerente();
        Programador p = new Programador();

        System.out.println("Qual o seu nome");
        F.setNome(sc.next());
        System.out.println("Data de nascimento" );
        F.setNascimento(sc.next());
        System.out.println("Imforme sua renda au mes");
        F.setSalario(sc.nextDouble());
        System.out.println("Mostra o projeto");
        G.setProjeto(sc.next());
        System.out.println("atualizaçã do projeto");
        G.setInformaprojeto(sc.next());
        System.out.println("linguagem do projeto");
        p.setlinguagem(sc.next());
        System.out.println("informaçõe do projeto");
        p.setInformalinguagem(sc.next());


        System.out.println(F.getNome());
        System.out.println(F.getNascimento());
        System.out.println(F.getSalario());
        System.out.println(G.getProjeto());
        System.out.println(G.getInformaprojeto());
        System.out.println(p.getlinguagem());
        System.out.println(p.getInformalinguagem());

     }
    }
