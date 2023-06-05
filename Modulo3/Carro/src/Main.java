public class Main {
    public static void main(String... args) {

        Carro carro = new Carro("Placa: C20-0451"," cor vermelha", 4, "Gol" );
        System.out.println(carro.getPlaca());
        System.out.println(carro.getCor());
        System.out.println(carro.getPortas());
        System.out.println(carro.getMarca());
        carro.setPneus(4);
        carro.setParafusos(16);
        carro.setCalotas(4);
        carro.setPreco(5000);


        carro.imprimeValores();

    }
}