public class Main {
    public static void main(String[] args) {

        //Metodos da classe string

        String texto = "Mentorama - Java - Curso = Maio";
        String texto1 = "Mentorama - JAVA";
        System.out.println(texto.charAt(0));

        System.out.println(texto.compareTo(texto1));
        System.out.println(texto.compareToIgnoreCase(texto1));

        System.out.println(texto.equals(texto1));
        System.out.println(texto.equalsIgnoreCase(texto1));

        System.out.println(texto.startsWith("Men"));
        System.out.println(texto1.endsWith("JAVA"));

        String[] textos = texto.split("-");
        for (String t: textos) {
            System.out.println(t.toUpperCase());
            //System.out.println(t.toLowerCase());
            //System.out.println("." + t.trim() + ".");
        }
        String vazia = "";
        System.out.println(vazia.isEmpty());

        System.out.println(texto.substring(1, 4));

        System.out.println("Carro ".concat("Veloz"));



    }
}
