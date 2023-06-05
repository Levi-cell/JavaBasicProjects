package DadosSalvos;

import java.util.List;
import java.util.Scanner;

public class Main {

    //Menu
    static Banco bank = new Banco();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("------ Bem-vindo(a) ------");
            System.out.println(" ");
            System.out.println("1 - Cadastrar Conta Corrente");
            System.out.println("2 - Cadastrar Conta Poupança");
            System.out.println("3 - Cadastrar Conta Salário");
            System.out.println("4 - Realizar transferência");
            System.out.println("5 - Listar contas cadastradas");
            System.out.println("0 - Sair");
            System.out.print("Qual operação você deseja realizar? ");
            opcao = Integer.parseInt(scanner.next());

            menu(opcao);
        } while (opcao != 0);
    }

    //Opções
    public static void menu(int opcao) throws Exception {
        Scanner scanner = new Scanner(System.in);
        switch(opcao) {
            case 1:
                System.out.print("Digite o número da conta: ");
                String numero = scanner.next();
                System.out.print("Digite a agência: ");
                int agencia = Integer.parseInt(scanner.next());
                System.out.print("Indique o banco: ");
                String banco = scanner.next();
                System.out.print("Indique o saldo inicial da conta: ");
                double saldo = Double.parseDouble(scanner.next());
                System.out.print("Indique o valor do cheque especial: ");
                double chequeEspecial = Double.parseDouble(scanner.next());

                ContaCorrente cc1 = new ContaCorrente(numero, agencia, banco, saldo, chequeEspecial);
                bank.addNovaConta(cc1);

                System.out.println(" ");
                System.out.println("Nova conta corrente cadastrada com sucesso!");

                break;

            case 2:
                System.out.print("Digite o número da conta: ");
                numero = scanner.next();
                System.out.print("Digite a agência: ");
                agencia = Integer.parseInt(scanner.next());
                System.out.print("Indique o banco: ");
                banco = scanner.next();
                System.out.print("Indique o saldo inicial da conta: ");
                saldo = Double.parseDouble(scanner.next());
                System.out.print("Digite o dia do aniversário: ");
                int diaAniversario = Integer.parseInt(scanner.next());
                System.out.print("Indique o juros: ");
                double juros = Double.parseDouble(scanner.next());

                ContaPoupanca cp1 = new ContaPoupanca(numero, agencia, banco, saldo, diaAniversario, juros);
                bank.addNovaConta(cp1);

                System.out.println(" ");
                System.out.println("Nova conta poupança cadastrada com sucesso!");

                break;

            case 3:
                System.out.print("Digite o número da conta: ");
                numero = scanner.next();
                System.out.print("Digite a agência: ");
                agencia = Integer.parseInt(scanner.next());
                System.out.print("Indique o banco: ");
                banco = scanner.next();
                System.out.print("Indique o saldo inicial da conta: ");
                saldo = Double.parseDouble(scanner.next());
                System.out.print("Indique o salário: ");
                double salario = Double.parseDouble(scanner.next());

                ContaSalario cs1 = new ContaSalario(numero, agencia, banco, saldo, salario);
                bank.addNovaConta(cs1);

                System.out.println(" ");
                System.out.println("Conta salário cadastrada com sucesso!");

                break;

            case 4:
                System.out.print("Indique a conta origem pelo número: ");
                String origem = scanner.next();
                System.out.print("Indique a conta destino pelo número: ");
                String destino = scanner.next();
                System.out.print("Indique o valor a ser transferido: ");
                double valor = Double.parseDouble(scanner.next());

                Conta contaOrigem = bank.getContaByNumero(origem);
                Conta contaDestino = bank.getContaByNumero(destino);
                bank.Transferir(contaOrigem, contaDestino, valor);

                System.out.println(" ");
                System.out.println("R$" + valor + " foram transferidos da conta " + contaOrigem.getNumero() + " para a conta " + contaDestino.getNumero() + " com sucesso!");

                break;

            case 5:
                List<Conta> contas = bank.getContasList();
                for (Conta conta : contas) {
                    System.out.println("Número: " + conta.getNumero());
                    System.out.println("Agência: " + conta.getAgencia());
                    System.out.println("Banco: " + conta.getBanco());
                    System.out.println("Saldo: " + conta.getSaldo());
                    System.out.println("Impostos: " + conta.getImposto());
                    System.out.println("------------------------------------");
                }

                break;

            case 0:
                System.out.println("Operações finalizadas!");

                break;

            default:
                System.out.println("Opção inválida!");

                break;
        }
    }
}