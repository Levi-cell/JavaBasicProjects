import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Curso de Java");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Oi, qual e o seu nome?");
        String s = entrada.nextLine(); /*cria váriavel de entrada para o usario */

        System.out.println("Oi " + s + ", tudo bem?");
        String s1 = entrada.nextLine();

        System.out.println("fico feliz que esteja bem, também estou ótima, vai fazer o que amanhã gatinho?");
        String s2 = entrada.nextLine();

        System.out.println("ainn vc he gay, sai daqui, quero um homem de vdd");

    }
}