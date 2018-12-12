package sistemaacademico;

import java.util.ArrayList;

public class TiposLogradouros {
    private ArrayList <ElementoDescritivo> tiposLogradouros;
   
    public TiposLogradouros() {
        ElementoDescritivo  elementoDescritivo;
        
        this.tiposLogradouros = new ArrayList<ElementoDescritivo>();
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DES", "Desconhecido");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "RUA", "Rua");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "AVN", "Avenida");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "ALM", "Alameda");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "BEC", "Beco");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "BLV", "Boulevard");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(6, "CAM", "Caminho");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(7, "CAS", "Cais");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(8, "CMP", "Campo");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(9, "ESC", "Escada");
        this.tiposLogradouros.add(elementoDescritivo);     
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(10, "ETR", "Estrada");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(11, "FAV", "Favela");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(12, "FAZ", "Fazenda");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(13, "FLT", "Floresta");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(14, "ILH", "Ilha");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(15, "JRD", "Jardim");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(16, "LAD", "Ladeira");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(17, "LRG", "Largo");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(18, "LTM", "Loteamento");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(19, "LUG", "Lugar");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(20, "MRR", "Morro");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(21, "PQE", "Parque");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(22, "PAS", "Passeio");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(23, "PRA", "Praia");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(24, "PRC", "Praça");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(25, "REC", "Recanto");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(26, "ROD", "Rodovia");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(27, "SRV", "Servidão");
        this.tiposLogradouros.add(elementoDescritivo);
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(28, "TRV", "Travessa");
        this.tiposLogradouros.add(elementoDescritivo);  
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(29, "VIA", "Via");
        this.tiposLogradouros.add(elementoDescritivo);  
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(30, "VIL", "Vila");
        this.tiposLogradouros.add(elementoDescritivo);  
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(31, "OUT", "Outro");
        this.tiposLogradouros.add(elementoDescritivo);  
    }
   
    public ArrayList<ElementoDescritivo> getTiposLogradouros() {
        return (this.tiposLogradouros);
    }

    public ElementoDescritivo getTiposLogradouros(int index) {
        if ((index >= 0) && (index < tiposLogradouros.size())) {
            return (this.tiposLogradouros.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
  
    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.tiposLogradouros.size()); i++) {
            if (this.tiposLogradouros.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
   
    public int size() {
        return(this.tiposLogradouros.size());
    }
   
    public void show(int index) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("Tipos de logradouros");
        System.out.println("------------------");
        System.out.println("Código..........: " + this.getTiposLogradouros(index).getCodigo());
        System.out.println("Descr. Abreviada: " + this.getTiposLogradouros(index).getDescricaoAbreviada());
        System.out.println("Descr. Completa.: " + this.getTiposLogradouros(index).getDescricaoCompleta());
        System.out.println("------------------");
    }
    
    public String tipo(int k) {
    	String a = "";
    	a = tiposLogradouros.get(k).getDescricaoCompleta();
    	return a;
    }
    
    public String imprimirLogradouro() {
    	String a = "";
    	for(ElementoDescritivo EL: tiposLogradouros) {
    		a = a + "Tipos Logradouros: " + EL.getCodigo() + " - " + EL.getDescricaoCompleta() + "\n";
    	}
    	return a;
    }
}
