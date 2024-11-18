import model.Aluno;
import model.Professo;

public class Disciplina {
    private String  nome;
    private Aluno aluno;
    private Professo professor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professo getProfessor() {
        return professor;
    }

    public void setProfessor(Professo professor) {
        this.professor = professor;
    }


    @Override
    public String toString() {
        return "Disciplina{" +
                "nome ='" + nome + '\'' +
                ", aluno =" + aluno +
                ", professor = " + professor +"}";

    }

    public void cadastroAluno(Aluno aluno){
        this.aluno = aluno;
    }
    public void cadastroProfessor(Professo professo){
        this.professor = professo;
    }
    public void cadastarDisciplina(Disciplina disciplina){

    }
}
