package sistemaacademico;

import java.util.ArrayList;

public class TiposTelefones{
    private ArrayList <ElementoDescritivo>      tiposTelefones;

    public TiposTelefones() {
        ElementoDescritivo  elementoDescritivo;
        
        tiposTelefones = new ArrayList<ElementoDescritivo>();
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        tiposTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "FIXO", "Fixo");
        tiposTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "CEL", "Celular");
        tiposTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "VoIP", "VoIP");
        tiposTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "OUT", "Outro");
        tiposTelefones.add(elementoDescritivo); 
        
    }
    
    public ArrayList<ElementoDescritivo> getTiposTelefones() {
        return (this.tiposTelefones);
    }
    
    public ElementoDescritivo getTipoTelefone(int index) {
        if ((index >= 0) && (index < this.tiposTelefones.size())) {
            return (this.tiposTelefones.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
   
    public int indexOf(String str) {
        int i;
        for (i = 0; (i <= this.tiposTelefones.size()); i++) {
            if (this.tiposTelefones.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
    
    public int size() {
        return(this.tiposTelefones.size());
    }    
    public String imprimirTT() {
    	String a = "";
    	for(ElementoDescritivo EL: tiposTelefones) {
    		a = a + "Tipos de telefones: " + EL.getCodigo() + " - " + EL.getDescricaoCompleta() + "\n";
    	}
    	return a;
    }
    public String tipoT(int k) {
    	String a = "";
    	for(int i=0;i<size();i++) {
    		if(k==tiposTelefones.get(i).getCodigo()) {
    			a = tiposTelefones.get(i).getDescricaoCompleta();
    		}
    	}
    	return a;
    }
    
}

