public class TestaConta {

    public static void main(String[] args) throws Exception {
        Conta contas[] = new Conta[3];

        ContaCorrente cc =
                new ContaCorrente
                (22, 1, "Banco do Brasil", 100.00, 1000.00);
        ContaPoupanca cp =
                new ContaPoupanca
                        (2, 1, "Banco do Brasil", 100,20,0.05);
        ContaSalario cs=
        new ContaSalario
                (3, 1, "Banco do Brasil", 100,3);


       System.out.println(cp);
       cp.depositar(400);
       System.out.println(cp);
       System.out.println("O saldo atual é :" + cp.getSaldo(25));
        }

    }

