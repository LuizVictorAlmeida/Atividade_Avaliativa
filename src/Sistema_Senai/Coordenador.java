package SistemaAcademico;

public class Coordenador extends Pessoa {
    private String areaResponsavel;

    public Coordenador(String nome, String cpf, int idade, String areaResponsavel) {
        super(nome, cpf, idade);
        this.areaResponsavel = areaResponsavel;
    }

    public String getAreaResponsavel() { return areaResponsavel; }
    public void setAreaResponsavel(String areaResponsavel) { this.areaResponsavel = areaResponsavel; }

    @Override
    public void apresentar() {
        System.out.println("[Coordenador] Nome: " + getNome() + " | Área: " + areaResponsavel);
    }
}