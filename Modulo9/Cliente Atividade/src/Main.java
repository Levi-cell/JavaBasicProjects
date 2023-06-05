import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    static AddCliente addcliente = new AddCliente();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("-------- Bem vindo(a) --------");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes cadastrados");
            System.out.println("3 - Estatísticas");
            System.out.println("0 - Sair");
            System.out.print("Qual operação você deseja realizar? ");
            opcao = Integer.parseInt(scanner.next());

            menu(opcao);
        } while(opcao != 0);
    }
    public static void menu(int opcao) throws Exception {
        Scanner scanner = new Scanner(System.in);
        switch(opcao) {
            case 1:
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.next();
                System.out.print("Informe o total de compras realizadas pelo mesmo: ");
                int compras = Integer.parseInt(scanner.next());

                Cliente cliente = new Cliente(nome, compras);
                addcliente.addNovoCliente(cliente);

                System.out.println("Cliente cadastrado com sucesso!");

                break;
            case 2:
                List<Cliente> clientes = addcliente.getClientesList();
                for (Cliente cli : clientes) {
                    System.out.println("Cliente: " + cli.getNome());
                    System.out.println("Total de compras: " + cli.getCompras());
                    System.out.println("-----------------------------------");
                }

                break;
            case 3:
                double media = addcliente.getClientesList().stream()
                        .mapToDouble(Cliente::getCompras)
                        .average().getAsDouble();
                System.out.println("Média do total de compras: " + media);
                String maior = addcliente.getClientesList().stream()
                        .max(Comparator.comparing(Cliente::getCompras)).get().getNome();
                int cliMaior = addcliente.getClientesList().stream()
                        .max(Comparator.comparing(Cliente::getCompras)).get().getCompras();
                System.out.println("O cliente " + maior + " teve o maior número de compras: " + cliMaior);
                String menor = addcliente.getClientesList().stream()
                        .min(Comparator.comparing(Cliente::getCompras)).get().getNome();
                int cliMenor = addcliente.getClientesList().stream()
                        .min(Comparator.comparing(Cliente::getCompras)).get().getCompras();
                System.out.println("O cliente " + menor + " teve o menor número de compras: " + cliMenor);

                break;
            case 0:
                System.out.println("Programa finalizado!");

                break;
            default:
                System.out.println("Opção inválida!");

                break;

        }
    }
}