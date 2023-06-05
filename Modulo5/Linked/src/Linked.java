import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

    public class Linked {

        public static void main(String[] args) {
            List<String> colecao = new LinkedList<>();
            //new ArrayList<>();

            colecao.add("Carro");
            colecao.add("Moto");
            colecao.add("Barco");
            colecao.add("Carro");

            System.out.println(colecao.get(0));
            System.out.println(colecao.get(2));

            for (String veiculo: colecao) {
                System.out.println(veiculo);
            }

            colecao.remove(0);


            for (int i = 0; i< colecao.size(); i++) {
                System.out.println(colecao.get(i));
            }
        }
    }
//Na linha 8 você pode usar tanto "ArrayList" quanto "HashSet"
//em hashset vc consegue obter valores unicos

