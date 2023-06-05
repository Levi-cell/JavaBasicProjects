public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome){
        this.nome= nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getSaudacao(){
        return "Prazer! Meu nome é " + getNomeCompleto() + "e tenho " + getIdade() + " anos de idade ";

    }

}
