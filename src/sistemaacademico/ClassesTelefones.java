package sistemaacademico;

import java.util.ArrayList;

public class ClassesTelefones {
    private ArrayList <ElementoDescritivo>      classesTelefones;
    /**
     * Implementar de maneira semelhante à UnidadesFederativas.
     * 
     * Cód.  Descrição Completa                Descr. Abreviada
     *  00 - Desconhecida 			DS
        01 - Comercial                          COM
        02 - Residencial			RES
        03 - Alternativo / Recado		REC
        04 - Outro				OUT
     */

    public ClassesTelefones() {
        ElementoDescritivo  elementoDescritivo;
        
        classesTelefones     = new ArrayList<ElementoDescritivo>();
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        classesTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "RG", "Registro Geral");
        classesTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "CPF", "CPF/MF");
        classesTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "CP", "Carteira Profissional");
        classesTelefones.add(elementoDescritivo); 
        
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "PST", "Passaporte");
        classesTelefones.add(elementoDescritivo); 
        
    }
    
    public ArrayList<ElementoDescritivo> getClassesTelefones() {
        return (this.classesTelefones);
    }
    
    public ElementoDescritivo getTipoDocumento(int index) {
        if ((index >= 0) && (index < this.classesTelefones.size())) {
            return (this.classesTelefones.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
   
    public int indexOf(String str) {
        int i;
        for (i = 0; (i <= this.classesTelefones.size()); i++) {
            if (this.classesTelefones.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
    
    public int size() {
        return(this.classesTelefones.size());
    }    
    public String imprimirCT() {
    	String a = "";
    	for(ElementoDescritivo EL: classesTelefones) {
    		a = a + "Classes de Telefones: " + EL.getCodigo() + " - " + EL.getDescricaoCompleta() + "\n";
    	}
    	return a;
    }
}
