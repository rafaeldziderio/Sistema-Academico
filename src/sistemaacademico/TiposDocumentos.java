package sistemaacademico;
import java.util.ArrayList;

public class TiposDocumentos {
    private ArrayList<ElementoDescritivo> tiposDocumentos;
    
    public TiposDocumentos() {
        ElementoDescritivo  elementoDescritivo;
        
        tiposDocumentos     = new ArrayList<ElementoDescritivo>();
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        tiposDocumentos.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "RG", "Registro Geral");
        tiposDocumentos.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "CPF", "CPF/MF");
        tiposDocumentos.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "CP", "Carteira Profissional");
        tiposDocumentos.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "PST", "Passaporte");
        tiposDocumentos.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "OUT", "Outro");
        tiposDocumentos.add(elementoDescritivo); 
    }
    
    public ArrayList<ElementoDescritivo> getTiposDocumentos() {
        return (this.tiposDocumentos);
    }
    
    public ElementoDescritivo getTipoDocumento(int index) {
        if ((index >= 0) && (index < this.tiposDocumentos.size())) {
            return (this.tiposDocumentos.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
   
    public int indexOf(String str) {
        int i;
        for (i = 0; (i <= this.tiposDocumentos.size()); i++) {
            if (this.tiposDocumentos.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
    
    public int size() {
        return(this.tiposDocumentos.size());
    }    
}