package sistemaacademico;

public class ElementoDescritivo {
    private long codigo;
    private String descricaoAbreviada;
    private String descricaoCompleta;
    
    public ElementoDescritivo() {
        this.setCodigo(0);
        this.setDescricaoAbreviada("");
        this.setDescricaoCompleta("");
    }
 
    public long getCodigo() {
        return codigo;
    }
    
  
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

   
    public String getDescricaoAbreviada() {
        return descricaoAbreviada;
    }
    

    public void setDescricaoAbreviada(String descricaoAbreviada) {
        this.descricaoAbreviada = descricaoAbreviada;
    }


    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }


    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public void setElementoDescritivo(int codigo, String descricaoAbreviada, String descricaoCompleta) {
        this.setCodigo(codigo);
        this.setDescricaoAbreviada(descricaoAbreviada);
        this.setDescricaoCompleta(descricaoCompleta);
    }
}
