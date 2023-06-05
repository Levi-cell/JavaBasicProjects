package um;

public class Primeiro {

    private static Integer variavel = 1;

    public final static Integer CONSTANTE = 10;

    private Integer escopoClasse = 1;

    public static Integer metodoEstatico() {
        return variavel;

    }

    public void metodoPublico() {
        System.out.println(escopoClasse);
        escopoClasse = 2;

        System.out.println(escopoClasse);


    }
    public void alteraVariavel() {
        System.out.println(escopoClasse);
        escopoClasse = escopoClasse +2;
        System.out.println(escopoClasse);
    }


}






    /*Apenas para deixar salvo a aula dele
    pois ele deletou isso na aula
    e é bom salvar para aprendizado
    se for apagar esse comentário, delete as duas
    ultimas chaves acima, essa parte do código se comunica com as pastas:
    Segunda.java, Quarta.java, Terceira.java, Principal.java

        Integer variavel = 1;
        System.out.println(variavel);

        variavel = 2;
        System.out.println(variavel);

    }

    private void metodoPrivado(){

    }

    protected void metodoProtected(){

    }

    void metodoDefault() {

    }

}

         */