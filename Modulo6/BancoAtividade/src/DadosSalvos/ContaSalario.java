package DadosSalvos;

public class ContaSalario extends Conta implements Tributavel {
    private double salario;

    public ContaSalario(String numero, int agencia, String banco, double saldo, double salario) {
        super(numero, agencia, banco, saldo);
        this.salario = salario;
    }
    public double getSaldo() {
        return this.saldo + this.salario;
    }

    @Override
    public double getImposto() {
        return 100 + (salario * 0.01);
    }
}
