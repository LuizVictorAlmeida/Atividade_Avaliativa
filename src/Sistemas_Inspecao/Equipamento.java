package Sistemas_Inspecao;

class Equipamento {
    private String codigo;
    private String fabricante;
    private String localizacao;

    public Equipamento(String codigo, String fabricante, String localizacao) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.localizacao = localizacao;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public void realizarInspecao() {
        System.out.println("Realizando inspeção geral no equipamento: " + codigo);
    }

    public void registrarInspecao() {
        System.out.println("Inspeção registrada para o equipamento " + codigo + " na data atual.");
    }

    public void registrarInspecao(String inspector) {
        System.out.println("Inspeção registrada para o equipamento " + codigo + " pelo inspetor: " + inspector);
    }
}