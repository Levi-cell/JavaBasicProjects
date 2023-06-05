public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Lucas", "Santos");
        pessoa1.setIdade(25);

        System.out.println(pessoa1.getSaudacao());
    }
}