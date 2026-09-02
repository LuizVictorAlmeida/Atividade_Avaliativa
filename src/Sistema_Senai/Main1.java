package SistemaAcademico;
public class Main1 {
    public static void main(String[] args) {
        // Polimorfismo: Vetor da classe pai contendo instâncias das subclasses
        Pessoa[] pessoas = {
                new Aluno("Guilherme Henrique", "123.456.789-00", 16, "Análise e Dev. de Sistemas", 3),
                new Professor("Paulo Langone", "987.654.321-11", 24, "Programação Orientada a Objetos"),
                new Coordenador("Rafael Orrico", "456.789.123-22", 45, "Tecnologia da Informação")
        };

        System.out.println("--- Polimorfismo: Método apresentar() ---");
        for (Pessoa p : pessoas) {
            p.apresentar();
        }

        System.out.println("\n--- Sobrecarga (Overload): Método emitirCracha() ---");
        pessoas[0].emitirCracha();                  // Sem parâmetro
        pessoas[0].emitirCracha("Acesso Especial"); // Com parâmetro
    }
}