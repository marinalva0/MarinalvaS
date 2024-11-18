package model;

public final class Aluno extends Professo {
    private double matricula;

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o model.Aluno");
    }

    @Override
    public void responsabilidade() {
        System.out.println("É Estudar !");
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
