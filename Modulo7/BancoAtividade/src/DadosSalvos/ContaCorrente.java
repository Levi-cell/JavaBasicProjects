package DadosSalvos;

public class ContaCorrente extends Conta implements Tributavel{
    private double chequeEspecial;

    public ContaCorrente(String numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    @Override
    public double getImposto() {
        return 0.1*getSaldo();
        //desta forma ? 
    }
}