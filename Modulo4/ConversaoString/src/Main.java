public class Main {
    public static void main(String[] args) {
        ////Objetos de texto tipo string
        char vetores[] = {'p', 'i', 'c', 'a'};
        String texto = String.valueOf(vetores);
        System.out.println(texto);

        long longConvertido = 69;
        String valor = String.valueOf(longConvertido);

        System.out.println(valor);

        Double valorDouble = Double.valueOf(valor);

        System.out.println(valorDouble);
    }}
