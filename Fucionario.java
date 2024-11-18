public class Fucionario {
    protected String nome;
    protected String nascimento;
    protected double salario;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;

    }
    public void setNascimento(String nascimento){
        this.nascimento =  nascimento;
    }
    public String getNascimento(){
        return nascimento;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}
