import java.util.ArrayList;


public class Colecoes {

    public static void main(String[] args) {

        ArrayList<String> colecao = new ArrayList<>();
        //Set<String> colecao = new HashSet<>();

        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");



        System.out.println(colecao.get(0));
        System.out.println(colecao.get(2));
     ///forma otimizada de percorrer una lista

        colecao.remove(0);
        for (String veiculo: colecao) {
            System.out.println(veiculo);
        }

        colecao.remove(0);

     ///forma universal

        for (int i = 0; i< colecao.size(); i++) {
            System.out.println(colecao.get(i));
        }

    }
}
//Na linha 8 você pode usar tanto "ArrayList" quanto "HashSet"
//em hashset vc consegue obter valores unicos