public class ContaCorrente extends Conta {

    private double chequeEspecial;


    public ContaCorrente
            (int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);

        this.chequeEspecial = chequeEspecial;

    }





    public double getChequeEspecial(){

        return chequeEspecial;
    }

    public void setChqueEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString(){
        return "ContaCorrente{" + "\n" +
                "chequeEspecial=" + chequeEspecial + "\n" +
                "numero=" + getNumero() + "\n" +
                "agencia=" + getAgencia() + "\n" +
                "banco=" + getBanco() + "\n" +
                "saldo=" + getSaldo() + "\n" +
                '}';

    }
}
