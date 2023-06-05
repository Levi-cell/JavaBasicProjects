public class TestaConta {

    public static void main(String[] args) throws Exception {

        ContaCorrente cc1 =
                new ContaCorrente
                (22, 1, "Banco do Brasil", 100.00, 1000.00);


                System.out.println(cc1); //toString

        System.out.println("O saldo da conta corrente é R$"+cc1.getSaldo());

        ContaPoupanca p1 =
                new ContaPoupanca
                        (33, 3,"Banco Stander",10.00, 20, 0.05);

        System.out.println("O saldo da conta poupança é  R$" +p1.getSaldo());
        System.out.println("O dia de aniversário é" + " " +  p1.getDiaAniversario());
        System.out.println("A taxa de juros é " + " " + p1.getTaxaDeJuros());


    }
}
