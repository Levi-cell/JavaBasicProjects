import db.PresencasDB;
import nomes.AlunoPresenca;
import nomes.Alunos;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static Alunos listaDeAlunos = new Alunos();
    static PresencasDB presencasDB = new PresencasDB();

    public static void main(String[] args) throws Exception {

        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar novo Aluno");
            System.out.println("2 - Registrar chamada");
            System.out.println("3 - Exibir presenças em lista");
            System.out.println("4 - Exibir diário de classe em tabela");
            System.out.println("5 - Exibir lista de alunos cadastrados");
            System.out.println("6 - Para teste - Preencher 3 chamadas automaticamente");
            System.out.println("0 - Sair");
            System.out.print("O que deseja fazer: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            menu(opcao);

        } while (opcao != 0);
    }

    public static void menu(int opcao) throws Exception {

        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1: { // Cadastrar novo aluno
                System.out.print("Digite o nome do novo aluno: ");
                String nome = scanner.nextLine();
                listaDeAlunos.addNovoAluno(nome);
                break;
            }
            case 2: { // Registrar chamada
                if (listaDeAlunos.getListaAlunos().isEmpty()) {
                    System.out.println("Lista de Alunos está vazia. Cadastre alguns alunos.");
                } else {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.print("Considerar data de hoje? digite sim ou não: ");
                    String opcaoData = scanner.next();

                    String data;
                    if (opcaoData.equals("sim") || (opcaoData.equals("s"))) {  //ideia autoral kkk
                        Calendar dataHoje = Calendar.getInstance();
                        Date dataDate = dataHoje.getTime();
                        data = sdf.format(dataDate);
                        System.out.println("Considerando a data de hoje: " + data);
                    } else {
                        System.out.print("Digite a data da chamada (dd/mm/aaaa): ");
                        data = scanner.next();
                    }
                    List<AlunoPresenca> presencas = new ArrayList<>();

                    for( String nome : listaDeAlunos.getListaAlunos()) {
                        System.out.println(nome + "Está presente ? digite sim ou não ");
                        String presencaxx = scanner.next();
                        String presenca = "Ausente";
                        if(presencaxx.equals("sim") || (presencaxx.equals("s"))) {
                            presenca = "Presente";
                        }

                        AlunoPresenca alunoPresenca = new AlunoPresenca(nome, presenca);
                        presencas.add(alunoPresenca);
                    }
                    presencasDB.addNovaChamada(data, presencas);
                    System.out.println("Chamada do dia " + data + " registrada com sucesso.");
                }

                break;
            }
            case 3 : { // Exibir presenças em lista
                System.out.println("Lista das Presenças Registradas:");

                for (Date data : presencasDB.getDiarioClasse().keySet()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.println("Data: " + sdf.format(data));

                    List<AlunoPresenca> presencas = presencasDB.getDiarioClasse().get(data);

                    for (AlunoPresenca aluno : presencas) {
                        System.out.print(aluno.getNome() + ": " + aluno.getPresente() + " | ");
                    }
                    System.out.println("");
                    System.out.println("---------------------------------------");
                }
                break;
            }
            case 4 : { // Exibir diário de classe em tabela
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("---------------- DIÁRIO DE CLASSE ---------------- ");
                System.out.print("| Nomes/Datas | ");

                Date[] datasOrdenadas = new Date[presencasDB.getDiarioClasse().size()];
                int i = 0;
                for (Date data : presencasDB.getDiarioClasse().keySet()) { // Gerar vetor com datas
                    datasOrdenadas[i] = data;
                    i++;
                }
                Arrays.sort(datasOrdenadas);
                for (Date data : datasOrdenadas) {
                    System.out.print(sdf.format(data) + " | "); // Imprimindo datas ordenadas
                }
                System.out.println("");
                for (String nomeLinha : listaDeAlunos.getListaAlunos()) {
                    System.out.print("| " + nomeLinha);
                    for (int j = 0 ; j < (12-nomeLinha.length()); j++) {
                        System.out.print(" ");// 8 espaços, nome com 4 letras
                    }
                    System.out.print("|  ");
                    for (Date data : datasOrdenadas) {
                        List<AlunoPresenca> presencas = presencasDB.getDiarioClasse().get(data);
                        String presencaCelula = null;
                        for (AlunoPresenca aluno : presencas) {
                            String nome = aluno.getNome();
                            if (nome == nomeLinha) {
                                presencaCelula = aluno.getPresente();
                                System.out.print(presencaCelula + "  |  ");
                            }
                        }
                        if (presencaCelula == null) {
                            System.out.print("Não Reg.  |  ");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("--------------------------------------------------");
                break;
            }
            case 5 : { // Exibir lista de alunos
                System.out.println("-- Lista de Alunos Cadastrados:");
                System.out.println(listaDeAlunos.getListaAlunos());
                break;
            }
            case 6 : { // Para teste - Preencher 3 nomes automaticamente
                listaDeAlunos.addNovoAluno("Pedro");
                listaDeAlunos.addNovoAluno("Alice");
                listaDeAlunos.addNovoAluno("Matheus");

                List<AlunoPresenca> presencas = new ArrayList<>();
                AlunoPresenca alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(0),"Presente");
                presencas.add(alunoPresenca);
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(1),"Presente");
                presencas.add(alunoPresenca);
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(2),"Presente");
                presencas.add(alunoPresenca);
                presencasDB.addNovaChamada("10/05/2023",presencas);

                presencas = new ArrayList<>();
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(0),"AUSENTE ");
                presencas.add(alunoPresenca);
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(1),"AUSENTE ");
                presencas.add(alunoPresenca);
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(2),"AUSENTE ");
                presencas.add(alunoPresenca);
                presencasDB.addNovaChamada("09/05/2023",presencas);

                presencas = new ArrayList<>();
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(0),"Presente");
                presencas.add(alunoPresenca);
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(1),"Presente");
                presencas.add(alunoPresenca);
                alunoPresenca = new AlunoPresenca(listaDeAlunos.getListaAlunos().get(2),"AUSENTE ");
                presencas.add(alunoPresenca);
                presencasDB.addNovaChamada("05/05/2023",presencas);

                break;
            }

            case 0 : {
                System.out.println("Sistema encerrado.");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
        }
    }
}