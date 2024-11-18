import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();
        Gato g = new Gato();
        Cachorro c = new Cachorro();

        System.out.println("Nome do seu Animal de Estimação?");
        a.setNome(sc.next());
        System.out.println("Infome a Raça do seu Animal?");
        a.setRaça(sc.next());
        System.out.println("Seu Animal Faz Cominhada todos os Dias?");
        a.setCaminha(sc.next());
        System.out.println("Seu gato mia muito?");
        g.setmia(sc.next());
        System.out.println("Nossa como seu cachoro late");
        c.setlate(sc.next());


        System.out.println(a.getNome());
        System.out.println(a.getRaça());
        System.out.println(a.getCaminha());
        System.out.println(g.getmia());
        System.out.println(c.getlate());

    }
}