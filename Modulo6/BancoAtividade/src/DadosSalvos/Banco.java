package DadosSalvos;

import java.util.ArrayList;
import java.util.List;
public class Banco {
    private List<Conta> contasList = new ArrayList<>();

    public List<Conta> getContasList() {
        return contasList;
    }

    public void addNovaConta(Conta conta) {
        contasList.add(conta);
    }

    public void Transferir(Conta origem, Conta destino, double valor) {
        origem.sacar(valor);
        destino.depositar(valor);
    }

    public Conta getContaByNumero(String numero) {
        for (Conta conta : contasList) {
            if (conta.getNumero().equals(numero))
                return conta;
        }

        System.out.println("Conta com número " + numero + " não encontrada");
        return null;

    }
}
