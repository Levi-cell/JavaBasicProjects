/*
Informando e declarando os atributos da classe produto

Para os atributos de uma classe serem acessíveis em outro pacote
 eles devem ter um getter e setter.

 this indica que a nomenclatura do argumento é igual ao nome do atributo.

 */
package models;
import java.util.Date;

public class Produto {

    private int id;
    private String descricao;
    private double preco;
    private Date dataValidade;

    public Produto(int id, String descricao, double preco, Date dataValidade){
        this.id = id;//
        this.descricao = descricao;//
        this.preco = preco;
        this.dataValidade = dataValidade;

        // utilizando essa forma, você não é obrigado a usar Set.
    }

    //ESTRUTURA DO SETTER:

    // lembrando Set é  opcional nesse caso

    public void setId(int id){
        this.id = id;

    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(Double preco) {
        this.preco = preco;

    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;

    }


    //ESTRUTURA DO GETTER:
    public int getId() {

        return id;
    }
    public String getDescricao() {
        return descricao;

    }
    public double getPreco() {

        return preco;
    }
    public Date getDataValidade(){

        return dataValidade;
    }
}
