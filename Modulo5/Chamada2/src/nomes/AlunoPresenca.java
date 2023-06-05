package nomes;

public class AlunoPresenca {
    private String presente;
    private String nome;

    public AlunoPresenca(String nome, String presente) {
        this.nome = nome;
        this.presente = presente;
    }

    public String getPresente() {
        return presente;
    }

    public String getNome() {
        return nome;
    }
}