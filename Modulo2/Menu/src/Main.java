import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Menu:



            System.out.println("|  MENU                       |");
            System.out.println("| Opções:                     |");
            System.out.println("|        1. Opcção 1          |");
            System.out.println("|        2. Opcção 2          |");
            System.out.println("|        3. Opcção 3          |");
            Scanner menu = new Scanner(System.in); //abosorve um valor de entrada do usúario

            System.out.println("Selecione uma opção:");
            int opcao = menu.nextInt();
            ///obriga o usario a digitar uma número se n o programa ira dar erro

        switch (opcao) {

            case 1:
                System.out.println("Opcao 1 selecionada");
                break;

            case 2:
                System.out.println("Opcao 2 selecionada");
                break;

            case 3:
                System.out.println("Sair");
                break;

            default:
                System.out.println("seleção inválida");
                break;



        }



    }
}