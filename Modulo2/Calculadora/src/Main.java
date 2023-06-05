import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Estrtura do menu para selecionar a operação
        System.out.println("CALCULADORA SIMPLES");

        int opcao;

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("O que você deseja fazer? (0 para sair):");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
        }




    public static void Calculando(int opcao){
        // estrutura das operações
        switch(opcao) {
            case 0: {
                return;
            }
            case 1:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("SOMANDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número:");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int soma = numero1 + numero2;

                System.out.println("A soma dos dois número é:" + soma);
                break;
            }
            case 2:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("SUBTRAINDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número:");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int subtracao = numero1 - numero2;

                System.out.println("A subtração dos dois números é:" + subtracao);
                break;
            }

            case 3:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("MULTIPLICANDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número:");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int multi = numero1*numero2;

                System.out.println("A multiplicação dos dois números é:" + multi);
                break;
            }

            case 4:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("DIVIDINDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número:");
                double numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                double numero2 = scanner.nextInt();

                double divi = numero1/numero2;

                System.out.println("A divisão dos dois números é:" + divi);
                break;
            }
        }



    }


}