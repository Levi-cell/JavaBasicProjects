public class Carro {

    //// CONSTRUTOR DO PROFESSOR COM UM EXEMPLO A MAIS CRIADO POR MIM
   private String placa;
   private String cor;
   private Integer portas;

   private String marca;

   public Carro(String placa, String cor, Integer portas, String marca) {
       this.placa = placa;
       this.cor = cor;
       this.portas = portas;
       this.marca = marca;
   }

   public String getPlaca(){
       return placa;
   }

   public void setPlaca(String placa) {
       this.placa = placa;
   }

   public String getCor() {
       return cor;
   }

   public void  setCor(String cor){
       this.cor= cor;
   }

   public Integer getPortas(){
       return portas;
   }

   public void setPortas(Integer portas){
       this.portas = portas;
   }

   public String getMarca(){
       return marca;
   }

   public void setMarca(){
       this.marca = marca;
   }


    //// DECLARAÇÃO DAS VÁRIAVEIS, Pneus, preco, calotas, parafusos
    private Integer Pneus;

    private Integer preco;

    private Integer calotas;

    private Integer parafusos;

    ///get set pneus

         public Integer getPneus(){
             return Pneus;
         }
         public void setPneus( Integer qtdPneus) {
             Pneus = qtdPneus;
         }

    ////get set preco

           public Integer getPreco() {
              return preco;
        }

          public void setPreco(Integer valuePrice) { //função de set não retorna valor, apenas atribui por isso "void"
        preco = valuePrice;

        }

    ////get set CALOTAS


           public Integer getCalotas(){
               return calotas;
           }

           public void setCalotas(Integer qtdCalotas) {
               calotas = qtdCalotas;
           }

   ////get set parafusos


           public Integer getParafusos(){
               return parafusos;
           }

           public void setParafusos(Integer qtdParafusos){
               parafusos = qtdParafusos;
           }


           ///// função print
    public void imprimeValores() {
        System.out.println("Quantidade de Pneus " + " " + getPneus());
        System.out.println("QUantidade de calotas " + " " + getCalotas());
        System.out.println("Quantidade de parafusos pneu" + " " + getParafusos());
        System.out.println("Preço do carro" + " " + getPreco());




    }
}
