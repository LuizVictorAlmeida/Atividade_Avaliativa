package Sistemas_Funcionarios;

class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String matricula, double salario, String linguagemPrincipal) {
        super(nome, matricula, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() { return linguagemPrincipal; }
    public void setLinguagemPrincipal(String linguagemPrincipal) { this.linguagemPrincipal = linguagemPrincipal; }

    @Override
    public void apresentar() {
        System.out.println("[Desenvolvedor] Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Linguagem: " + linguagemPrincipal +
                " | Salário: R$ " + getSalario());
    }
}