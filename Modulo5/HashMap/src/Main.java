import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        com hashmap vc consegue fazer uma lista que pode ser alterada de acordo
         com a chave de cada produto.
         */

        HashMap<String, String> map = new HashMap<>();   //treemap
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");

        System.out.println(map.get("C"));

        map.remove("M");

        System.out.println(map.get("M"));
    }
}