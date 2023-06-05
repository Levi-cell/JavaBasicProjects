public class Matriz {
///Fazer um calendário mesnal baseado que 1 mês tem 5 semanas e 7 dias.
    public static void main(String[] args) {
        int[][] calendario = new int[5][7];//5 linhas e 7 colunas /
        int dia = 0;


            for (int i = 0; i < 5; i++) {


                for (int x = 0; x < 7; x++) {
                    dia++;
                    if(dia<=31) calendario[i][x] = dia;
                    else break;
                    calendario[i][x] = dia; //a posição ou ponto(i.x) corresponde a um dia

                }
            }

            for(int i = 0; i < calendario.length; i++) {
                // só deve ser percorrido uma coluna imaginaria de 5 semanas
                for (int x = 0; x < calendario[i].length; x++) {


                    //só deve ser percorrido 7 dias de forma linear
                    if (calendario[i][x] != 0) {
                       System.out.print(calendario[i][x] + " ");

                    }else break;



                }
                System.out.println("");
            }


    }
}
