import db.EstoquesDB;
import db.PedidosVendaDB;
import db.ProdutosDB;
import db.UsuariosDB;
import models.*;
import validadores.ValidadorPedidoVenda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuariosDB usuariosDB = new UsuariosDB();
    static EstoquesDB estoquesDB = new EstoquesDB();
    static PedidosVendaDB pedidosVendaDB = new PedidosVendaDB();

    public static void main(String[] args) throws Exception {


        System.out.println("--- PEDIDO DE VENDAS ---");

        int option;

        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("3 - Cadastrar usuário ADMINISTRADOR");
            System.out.println("4 - Cadastrar usuário CLIENTE");
            System.out.println("5 - Listar todos os usuarios ");
            System.out.println("6 - Cadastrar novo estoque de produtos ");
            System.out.println("7 - Apresentar todos os estoques");
            System.out.println("8 - Criar pedido de venda");
            System.out.println("9 - Listar produtos de venda");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual operação você deseja realizar:");
            option = scanner.nextInt();

            process(option);
        }while(option != 0);
    }

    public static void process(int option)throws Exception{
        switch(option){
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual descrição você deseja dar ao novo produto:");
                String descricao = scanner.nextLine();

                System.out.println("Qual o ID você deseja dar ao novo produto:");
                int id = scanner.nextInt();

                System.out.println("Qual o preço: ");
                double preco = scanner.nextDouble();

                System.out.println("Qual a data de validade");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id, descricao, preco, dataValidade);

                produtosDB.addNovoProduto(novoProduto);

                break;


            }

            case 2: {
                List<Produto> listaDeprodutos = produtosDB.getProdutoList();

                for(Produto produto : listaDeprodutos) {
                    System.out.println("----Descricao:" + " " + produto.getId());
                    System.out.println("----Descricao:" + " " + produto.getDescricao());
                    System.out.println("---Preço:" + produto.getPreco());
                    System.out.println("---Data de validade" + produto.getDataValidade());
                    System.out.println("--------------------------------");

                }

                break;


            }

            case 3: {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual o nome do usuário ADMINISTRADOR:");
                String nome = scanner.nextLine();

                Admin novoAdmin = new Admin(nome);
                usuariosDB.addNovoUsuario(novoAdmin);


                break;
            }

            case 4: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual o nome do usuário CLIENTE:");
                String nome = scanner.nextLine();

                Cliente novoCliente = new Cliente(nome);
                usuariosDB.addNovoUsuario(novoCliente);


                break;
            }

            case 5:{

                System.out.println("----------------------------------------");
                System.out.println("--------Listando USUÁRIOS CADASTRADOS");
                System.out.println("----------------------------------------");
                for(Usuario usuario : usuariosDB.getUsuarioList()) {
                    System.out.println("ID:" + usuario.getId());
                    System.out.println("Nome:" + usuario.getNome());
                    System.out.println("Tipo:" + usuario.getTipoUsuario());
                    System.out.println("----------------------------------------");
                }

                break;
            }

            case 6:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("----------------------------------------");
                System.out.println("------CADASTRANDO ESTOQUE DE PROD-------");
                System.out.println("----------------------------------------");

                System.out.println("Qual o identificador do estoque:");
                String id = scanner.next();

                System.out.println("Qual o produto que será adicionado ao estoque(informe o ID:)");
                int produtoId = scanner.nextInt();

                Produto produto = produtosDB.getProdutoPorID(produtoId);
                System.out.println("PRODUTO ID:" + produto.getId());
                System.out.println("PRODUTO DESCRIÇÃO:" + produto.getDescricao());
                System.out.println("PRODUTO VALIDADE:" + produto.getDataValidade());

                System.out.println("Qual a quantidade de produtos a ser adicionada no estoque:");
                int quantidade = scanner.nextInt();

                Estoque novoEstoque = new Estoque(id, produto, quantidade);
                estoquesDB.addNovoEstoque(novoEstoque);
                break;

            }

            case 7: {

                System.out.println("----------------------------------------");
                System.out.println("--------LISTANDO ESTOQUES CADASTRADOS");
                System.out.println("----------------------------------------");
                for(Estoque estoque : estoquesDB.getEstoques()) {
                    System.out.println("ID:" + estoque.getId());
                    System.out.println("PRODUTO:" + estoque.getProduto().getDescricao());
                    System.out.println("PREÇO:" + estoque.getProduto().getPreco());
                    System.out.println("QUANTIDADE:" + estoque.getQuantidade());
                    System.out.println("----------------------------------------");
                }

                break;


            }

            case 8: {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Informe o ID do cliete:");
                int idCliente = scanner.nextInt();

                Cliente cliente = (Cliente) usuariosDB.getUsuarioPorID(idCliente);
                System.out.println("ID:" + cliente.getId());
                System.out.println("Nome:" + cliente.getNome());
                System.out.println("Tipo:" + cliente.getTipoUsuario());
                System.out.println("--------------------------------");

                System.out.print("Informe o identificador do estoque");
                String idEstoque = scanner.next();
                Estoque estoque = estoquesDB.getEstoqueByid(idEstoque);
                System.out.println("ESTOQUE ID:" + estoque.getId());
                System.out.println("PRODUTO DESCRIÇÃO:" + estoque.getProduto().getDescricao());
                System.out.println("PRODUTO VALIDADE:" + estoque.getProduto().getDataValidade());
                System.out.println("--------------------------------");

                System.out.println("Informe a quantidade ser vendida:  ");
                int quantidade = scanner.nextInt();


                PedidoVenda novoPedido = new PedidoVenda(cliente, estoque, quantidade);

                ValidadorPedidoVenda validadorPedidoVenda = new ValidadorPedidoVenda(novoPedido);

                if(validadorPedidoVenda.ehValido()) {

                    pedidosVendaDB.addNovoPedidoVenda(novoPedido);
                } else {
                    System.out.println(validadorPedidoVenda.getErros());
                }

                break;
            }

            case 9: {

                System.out.println("----------------------------------------");
                System.out.println("--------LISTANDO PEDIDOS DE VENDA");
                System.out.println("----------------------------------------");
                for(PedidoVenda pedidoVenda : pedidosVendaDB.getPedidoVendas()) {
                    System.out.println("ID:" + pedidoVenda.getId());
                    System.out.println("CLIENTE:" + pedidoVenda.getCliente().getNome());
                    System.out.println("PRODUTO:" + pedidoVenda.getEstoque().getProduto().getDescricao() );
                    System.out.println("QUANTIDADE:" + pedidoVenda.getQuantidade());
                    System.out.println("----------------------------------------");
                }
                break;
            }


        }
    }


}

