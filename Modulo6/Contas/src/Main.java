import java.util.Scanner;



public class Main {


    public static void main(String[] args) throws Exception {




        ContaCorrente contaCorrente = new ContaCorrente(1244, 34, "Banco N",1000.0, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(14432, 45, "Banco C", 400.0, 11);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}