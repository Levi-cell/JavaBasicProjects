import java.util.ArrayList;
import java.util.List;

public class AddCliente {
    private List<Cliente> clientesList = new ArrayList<>();

    public List<Cliente> getClientesList() {
        return clientesList;
    }

    public void addNovoCliente (Cliente cliente) {
        clientesList.add(cliente);
    }
}