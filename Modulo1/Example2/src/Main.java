/*
Objetivos:

-Solicitar o nome completo do usuário
-Solicitar a rua
-Solicitar o número
-Solicitar o bairro
-Solicitar a cidade
-Solicitar o estado
-Solicitar o CEP

-Exibir todas as informações
 */

//Importantdo algumas bibliotecas:


import java.util.Scanner;


//Inicio do código

public class Main {
    public static void main(String[] args) {
        System.out.println("---CADASTRO DE USUÁRIOS---");

        Scanner scanner = new Scanner(System.in);
        //conecta a biblioteca scanner ao código


        System.out.print("Digite seu nome completo:");
        String nome = scanner.nextLine();
        //Pega o nome

        System.out.print("Digite a rua: ");
        String rua =scanner.nextLine();
        //pega a rua

        System.out.print("Digite seu número:");
        String numero = scanner.nextLine();
        //pega o numero

        System.out.print("Digite seu bairro:");
        String bairro = scanner.nextLine();
        //pega o bairro

        System.out.print("Digite a cidade:");
        String cidade = scanner.nextLine();
        //pega a cidade

        System.out.print("digite seu estado:");
        String estado = scanner.nextLine();
        //pega o estado

        System.out.print("digite o CEP:");
        String CEP = scanner.nextLine();
        //pega o CEP


        ///exibir as informaçãoes juntas
        System.out.println("Nome completo: " + nome);
        System.out.println("Endereço: " + rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado);
        System.out.println("CEP: " + CEP);
        /* outra forma:
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + CEP);

        */



    }
}