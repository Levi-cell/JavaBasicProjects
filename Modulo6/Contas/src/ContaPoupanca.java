public class ContaPoupanca extends Conta {
    private int diaDeAniversario;

        public ContaPoupanca
                (int numero, int agencia, String banco, double saldo, int diaDeAniversario) {
            super(numero, agencia, banco, saldo);

            this.diaDeAniversario = diaDeAniversario;

        }

        public int getDiaDeAniversario(){
            return diaDeAniversario;
        }

        public void setDiaDeAniversario(int diaDeAniversario){
            this.diaDeAniversario =diaDeAniversario;
        }

        @Override
        public String toString(){
            return "ContaPoupanca{" + "\n" +
                    "diaDeAniversario=" + diaDeAniversario + "\n" +
                    "numero=" + getNumero() + "\n" +
                    "agencia=" + getAgencia() + "\n" +
                    "banco=" + getBanco() + "\n" +
                    "saldo=" + getSaldo() + "\n" +
                    '}';

        }

}
