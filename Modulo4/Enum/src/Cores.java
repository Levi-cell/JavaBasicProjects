public enum Cores {

    VERMELHO("Vermelho"),
    AZUL("Azul"),
    AMARELO("Amarelo"),
    VERDE("Verde");


    private String texto;
    Cores(String texto) {
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }

}
