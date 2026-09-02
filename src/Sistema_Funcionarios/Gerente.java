package Sistemas_Funcionarios;

class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, String matricula, double salario, String setor) {
        super(nome, matricula, salario);
        this.setor = setor;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    @Override
    public void apresentar() {
        System.out.println("[Gerente] Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Setor: " + setor +
                " | Salário: R$ " + getSalario());
    }
}
