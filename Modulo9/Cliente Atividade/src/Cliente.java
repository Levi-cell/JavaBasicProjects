public class Cliente {
    private String nome;
    private int compras;

    public String getNome() {
        return nome;
    }

    public int getCompras() {
        return compras;
    }

    public Cliente(String nome, int compras) {
        this.nome = nome;
        this.compras = compras;
    }

}