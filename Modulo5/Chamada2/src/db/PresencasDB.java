package db;

import nomes.AlunoPresenca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;

public class PresencasDB {
    // HashMap contendo a data como chave e uma lista de presenças como valor:
    private Map<Date, List<AlunoPresenca>>diarioClasse = new HashMap<>();

    public Map<Date, List<AlunoPresenca>> getDiarioClasse() {
        return diarioClasse;
    }

    public void addNovaChamada (String data, List<AlunoPresenca> alunoPresenca) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataConvertida = sdf.parse(data);
        this.diarioClasse.put(dataConvertida, alunoPresenca);
    }

}