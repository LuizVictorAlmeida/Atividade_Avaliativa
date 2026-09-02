package SistemaAcademico;

    public class Aluno extends Pessoa {
    private String curso;
    private int semestre;

    public Aluno(String nome, String cpf, int idade, String curso, int semestre) {
        super(nome, cpf, idade);
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    @Override
    public void apresentar() {
        System.out.println("[Aluno] Nome: " + getNome() + " | Curso: " + curso + " | Semestre: " + semestre + "º");
    }
}