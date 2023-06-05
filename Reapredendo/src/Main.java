/*
A ideia desse código é criar a classe produto que vai armazenar
informações dos produtos.  será o sistema de gerenciamente de pedido de venda

OBS: aqui não necessariamente vamos declarar váriavéis, apenas vamos atribuir
valores a elas, ou atribuir uma instância/objeto,
juntamente a isso vamos fazer todo o processo lógico de checagem de produtos

Vale lembrar que uma instância é uma unidade de algo. uma classe repsenta uma entidade
a classe pessoa pode ter várias pessoas, então se quisermos falar de uma pessoa em
especifico, precisamos instanciar ela.

Uma vez que vc declara uma nova pessoa dessa classe váriavel pessoa. você precisa
especificar as informações. Será aqui que iremos instanciar.

e sempre é necessário importar a classe do que vc quer instanciar
 */

import db.ProdutosDB;
import models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ProdutosDB produtosDB = new ProdutosDB();

    public static void main(String[] args) throws Exception {

        System.out.println("---PEDIDO DE VENDAS----");

        int option;
        do {

            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual operação você deseja realizar:");
            option = scanner.nextInt();
            //após digitar 1 ele irá executar este abaixo
            process(option);
        } while (option != 0);
    }
/*
throws exception é usado no main para permitir o metodo process(option)
e usado no public static para permitir o metodo parse
 */
    public static void process(int option) throws Exception {
        switch(option) {
            case 1: {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Qual a descrição que você deseja dar ao novo produto?");
                String descricao = scanner.nextLine(); //Comando de associação

                System.out.print("Qual o ID você deseja dar ao novo produto?");
                int id = scanner.nextInt(); // comando de associação

                System.out.println("Qual o preço do produto?");
                double preco = scanner.nextDouble();

                System.out.println("Qual a data de validade do produto?");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id, descricao, preco, dataValidade);

                produtosDB.addNovoProduto(novoProduto);

                break;


                //instanciando o produto, ou seja a unidade.
                //note que foi preciso criar uma string para converter ela para o tipo Date
                //e após isso armazenar em DataValidade se atente a estrutura da linha 66


            }

            case 2: {
                List<Produto> listaDeProdutos = produtosDB.getProdutosList();

                for(Produto produto : listaDeProdutos) {

                    System.out.println("---ID:" + produto.getId());
                    System.out.println("---Descrição:" + produto.getDescricao());
                    System.out.println("---Preço:" + produto.getPreco());
                    System.out.println("---Data de validade:" + produto.getDataValidade());
                    System.out.println("------------------------------");

                }
                break;

            }
            }

            }

        }


