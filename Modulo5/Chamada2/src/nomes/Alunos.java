package nomes;
// para a opção 1
import java.util.List;
import java.util.ArrayList;

public class Alunos {

    // ArrayList com a lista dos nomes dos Alunos
    private List<String> listaAlunos = new ArrayList<>();

    public List<String> getListaAlunos()
    {
        return listaAlunos;
    }

    public void addNovoAluno(String nome)
    {
        listaAlunos.add(nome);
    }

}