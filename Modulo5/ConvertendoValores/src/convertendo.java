public class convertendo {
    public static void main(String[] args) {



        int[] valores = new int[6];

        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;
        valores[4] = 30;
        valores[5] = 35;

        ///Do menor para o maior

        System.out.println("Do menor para o maior:");

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        // Do maior para o menor

        System.out.println("Do maior para o menor:");

        int[] valoresReverso = new int[valores.length];
        int posicaoMaxima = valores.length - 1;
        for (int i = posicaoMaxima; i  >= 0; i--) {


            System.out.println(valores[i]);
            valoresReverso[posicaoMaxima -i] = valores[i];
        }
        /*Atribuindo valores[i] a  ValoresReverso na posição descrescente.
        neste exemplo ele faz com que valores[i] seja atribuido
         ao vetor valoresReverso, assim o for pode ser escrito com i++ ao em
         vez de i--, pois "valoresReverso" já é considerar um vetor de ordem de
         menor para maior
         */
        System.out.println("Normalizando o for de valoresReverso");
        for (int i = 0; i < valoresReverso.length; i++) {
            System.out.println(valoresReverso[i]);
        }
    }
}
