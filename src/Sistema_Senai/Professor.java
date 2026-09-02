package SistemaAcademico;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, int idade, String disciplina) {
        super(nome, cpf, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    @Override
    public void apresentar() {
        System.out.println("[Professor] Nome: " + getNome() + " | Disciplina: " + disciplina);
    }
}