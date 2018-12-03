package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: ElementoDescritivo
* Objetivo...: Representa um elemento (com descrições abreviada e completa) que  
*              será acessado por seu código (chave primária).
* Observacoes:
*/
public class ElementoDescritivo {
    private int                     codigo;
    private String                  descricaoAbreviada;
    private String                  descricaoCompleta;
    
    public ElementoDescritivo() {
        this.setCodigo(0);
        this.setDescricaoAbreviada("");
        this.setDescricaoCompleta("");
    }
    /**
     * @return O código do elemento descritivo.
     */
    public int getCodigo() {
        return codigo;
    }
    
    /**
     * @param codigo Atribui valor para o código do elemento descritivo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return A descrição abreviada do elemento descritivo.
     */
    public String getDescricaoAbreviada() {
        return descricaoAbreviada;
    }
    
    /**
     * @param descricaoAbreviada Atribui valor para a descrição abrevidada do elemento descritivo.
     */
    public void setDescricaoAbreviada(String descricaoAbreviada) {
        this.descricaoAbreviada = descricaoAbreviada;
    }

    /**
     * @return A descrição completa do elemento descritivo.
     */
    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    /**
     * @param descricaoCompleta Atribui valor para a descrição do elemento descritivo.
     */
    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }
    /**
    * @param codigo Atribui valor para o código do elemento descritivo.
    * @param descricaoAbreviada Atribui valor para a descrição abreviada do elemento descritivo.
    * @param descricaoCompleta Atribui valor para a descrição completa do elemento descritivo.
    */
    public void setElementoDescritivo(int codigo, String descricaoAbreviada, String descricaoCompleta) {
        this.setCodigo(codigo);
        this.setDescricaoAbreviada(descricaoAbreviada);
        this.setDescricaoCompleta(descricaoCompleta);
    }
}
