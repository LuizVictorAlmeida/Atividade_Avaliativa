package Sistemas_Funcionarios;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public void apresentar() {
        System.out.println("Funcionário: " + nome + " | Matrícula: " + matricula + " | Salário: R$ " + salario);
    }

    public double calcularBonus() {
        return this.salario * 0.10;
    }

    public double calcularBonus(double porcentagemAdicional) {
        return this.salario * (0.10 + porcentagemAdicional);
    }
}