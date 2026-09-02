package SistemaAcademico;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void emitirCracha() {
        System.out.println("Crachá básico emitido para: " + nome);
    }
    public void emitirCracha(String modelo) {
        System.out.println("Crachá [" + modelo + "] emitido para: " + nome);
    }
}
