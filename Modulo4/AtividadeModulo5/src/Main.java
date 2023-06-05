
import com.sun.source.doctree.SystemPropertyTree;


/*

Nota:

Essa atividade é do modulo 5 do mentorama, porém aqui no git está como modulo 4 já que o modulo 1 só é instalação de
plataforma

Não entendi muito bem, se o senhor puder me dar um outro exemplo em um exércicio ficaria grato

Apenas apliquei a estrutura do wrapper nesse exércicio de Calculo do IMC porém a aplicação dele não foi muito relevante
uma vez que logo depois eu atribuo um valor de entrada a variável usando a classe scanner
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //primeira interação
        String continuar;
        System.out.println(" Bem vindo, vamos calcular seu IMC ? Digite qualquer tecla para continuar:");
        Scanner primeiro = new Scanner(System.in);
        continuar = primeiro.next();

        //pedir o peso

        Integer valor= 13;

        double peso = valor;
        do {
            System.out.println("Digite o seu peso em kg:");
            Scanner segundo = new Scanner(System.in);
            peso = segundo.nextDouble();
            if(peso<0) {
                System.out.println("Peso negativo não pode, tente novamente:");
            }
        }while(peso<0);


        //pedir a altura

        Integer valor1= Integer.valueOf(12);
        double altura = valor1;
        do {
            System.out.println("informe sua altura em metros:");
            Scanner terceiro = new Scanner(System.in);
            altura = terceiro.nextDouble();
            if(altura<0){
                System.out.println("Altura negativa não pode,tente novamente: ");
            }
        }while(altura<0);

        //Preparando o usúario
        String conferindo;
        System.out.println(" Já estamos com seu IMC, Digite qualquer tecla para continuar:");
        Scanner quarto = new Scanner(System.in);
        conferindo = quarto.next();



        Integer valor2 = 20;
        double IMC = valor;

        IMC = peso / (Math.pow(altura, 2)); // ou apenas IMC = peso/(altura*altura);
     /*
     Uma outra forma:

        switch (IMC) {
            case (IMC >= 0 && IMC <= 16):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta com magreza grave, coma mais.");
                break;

             case (IMC > 16 && IMC <= 17):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta com magreza moderada, como mais um pouco.");
                break;

            case (IMC > 17 && IMC <= 18.5):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta com magreza Leve, como só mais um pouco.");
                break;

            case (IMC > 18.5 && IMC <= 25):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta saudável, continue assim.");
                break;

            case (IMC > 25 && IMC <= 30):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta com Sobrepeso, tenta dar uma maneirada.");
                break;

            case (IMC > 30 && IMC <= 35):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta com obesidade grau 1, faz uma dieta.");
                break;

            case (IMC > 35 && IMC <= 40):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println("Você ta com obesidade grau 2, faz uma dieta e exércicios fisícos.");
                break;

            case (IMC > 40):
                System.out.println("Seu IMC é de:" + "" + IMC);
                System.out.println(" Você ta com obesidade grau 3, faz uma dieta rigida e exércicios fisícos diariamente.");
                break;

        }
        */


        if (IMC >= 0 && IMC <= 16) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com magreza grave, coma mais.");

        } else if (IMC > 16 && IMC <= 17) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com magreza moderada, como mais um pouco.");

        } else if (IMC > 17 && IMC <= 18.5) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com magreza Leve, como só mais um pouco.");

        } else if (IMC > 18.5 && IMC <= 25) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta saudável, continue assim.");

        } else if (IMC > 25 && IMC <= 30) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com Sobrepeso, tenta dar uma maneirada.");

        } else if (IMC > 30 && IMC <= 35) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com obesidade grau 1, faz uma dieta.");

        } else if (IMC > 35 && IMC <= 40) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com obesidade grau 2, faz uma dieta e exércicios fisícos.");

        } else if (IMC > 40) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println(" Você ta com obesidade grau 3, faz uma dieta rigida e exércicios fisícos diariamente.");
        }


        String averigue;
        System.out.println("Para qualquer dúvida, digite qualquer tela para conferir a tabela do IMC");
        Scanner quinto = new Scanner(System.in);
        averigue = quinto.next();

        System.out.println("IMC menor que 16, Magreza Grave.");
        System.out.println("IMC entre 16 e 17, Magreza Moderada.");
        System.out.println("IMC entre 17 e 18.5, Magreza Leve.");
        System.out.println("IMC entre 18.5 e 25, Saudável.");
        System.out.println("IMC entre 25 e 30, Sobrepeso.");
        System.out.println("IMC entre 30 e 35, Obesidade Grau 1.");
        System.out.println("IMC entre 35 e 40, Obesidade Grau 2(severa).");
        System.out.println("IMC maior que 40, Obesidade Grau 3(mórbida).");


    }


}


/*
Estudo de estrutura:


public class Main {
    public static void main(String[] args) {

        Integer valor0 = Integer.valueOf(4);

        int valor1 = valor0;

        System.out.println(valor1);

        valor1 = 13;
        System.out.println(valor1);



         unboxing e autoboxing



        Integer p = 6;

        int p1 = p;

        System.out.println(p);
        System.out.println(p1);

        p1 = 23;
        System.out.println(p1);


    }
}

*/