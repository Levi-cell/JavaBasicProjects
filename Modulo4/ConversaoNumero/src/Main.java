public class Main {
    public static void main(String[] args) {


        int valor1 = 12;

        long valorLong = valor1;

        System.out.println(valorLong);

        int valorInt = (int)valorLong; //cast

        System.out.println(valorInt);

        double valorDouble = valorInt;
        System.out.println(valorDouble);

        long outroLong = (long)valorDouble;
        System.out.println(outroLong);



    }
}