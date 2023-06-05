public class Main {
    public static void main(String[] args) {

        int[] valores = new int[5];

        valores[0] = 10;
        valores[1] = 12;
        valores[2] = 13;
        valores[3] = 14;
        valores[4] = 15;

        for(int i = 0; i < valores.length; i++){
            System.out.println("Valor:" + valores[i]);
        }

        Cliente[] clientes = new Cliente[3];

        clientes[0] = new Cliente("Lucas", "lucas@gmail.com");
        clientes[1] = new Cliente("Matheus", "Matheus@gmail.com");
        clientes[2] = new Cliente("Marcio", "marcio@hotmail.com");

        for(int i = 0; i < clientes.length; i++) {
            System.out.println("Olá, " + clientes[i].getNome() + " - O email é: " + clientes[i].getEmail());
        }
    }
}