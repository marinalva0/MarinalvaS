package model;

public abstract class Pessoa{
    protected String nome;
    protected int idade;



    public abstract void quemSouEu();
    public abstract void responsabilidade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void calculaSalario();
    public abstract void aplicarBonus();
}
