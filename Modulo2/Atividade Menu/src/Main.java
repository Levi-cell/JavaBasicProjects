import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Menu:


        int opcao;
         do {
             System.out.println("|  MENU                       |");
             System.out.println("| Opções:                     |");
             System.out.println("|        1. Opção 1           |");
             System.out.println("|        2. Opção 2           |");
             System.out.println("|        3. Opção 3           |");
             Scanner menu = new Scanner(System.in); //abosorve um valor de entrada do usúario

             System.out.println("Selecione uma opção:");

             opcao = menu.nextInt();

             switch(opcao) {

                 case 1:
                     System.out.println( "Opção 1 selecionada");
                     break;

                 case 2:
                     System.out.println( "Opção 2 Selecionada");
                     break;


             }

             }  while (opcao != 3) ;
            System.out.println("Programa finalizado");
        }

}