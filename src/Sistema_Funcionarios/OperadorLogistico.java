package Sistemas_Funcionarios;

class OperadorLogistico extends Funcionario {
    private String turno;

    public OperadorLogistico(String nome, String matricula, double salario, String turno) {
        super(nome, matricula, salario);
        this.turno = turno;
    }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    @Override
    public void apresentar() {
        System.out.println("[Operador Logístico] Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Turno: " + turno +
                " | Salário: R$ " + getSalario());
    }
}