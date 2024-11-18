package model;

public  class Professo extends Pessoa {
    private String especialidade;



    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o professor !");

    }

    @Override
    public void responsabilidade() {
        System.out.println("É encinar x: ");
    }
    @Override
    public void calculaSalario(){
        System.out.println("O salario ");
    }

    @Override
    public void aplicarBonus() {
        System.out.println("Bonos de 20% !");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
