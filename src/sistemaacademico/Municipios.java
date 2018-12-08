package sistemaacademico;

import java.util.ArrayList;

public class Municipios {
    ArrayList <ElementoDescritivo>  municipios;
  
    public Municipios() {
        ElementoDescritivo  elementoDescritivo;
        
        this.municipios = new ArrayList<ElementoDescritivo>();
        elementoDescritivo = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0000000, "DS", "Desconhecido");
        this.municipios.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5201405, "AGO", "Aparecida de Goiânia");
        this.municipios.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5208707, "GYN", "Goiânia");
        this.municipios.add(elementoDescritivo);    
    }
 
    public ArrayList<ElementoDescritivo> getMunicipios() {
        return (this.municipios);
    }
   
    public ElementoDescritivo getMunicipios(int index) {
        if ((index >= 0) && (index < municipios.size())) {
            return (this.municipios.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
  
    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.municipios.size()); i++) {
            if (this.municipios.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }

    public int size() {
        return(this.municipios.size());
    }

    public void show(int index) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("Municípios");
        System.out.println("------------------");
        System.out.println("Código..........: " + this.getMunicipios(index).getCodigo());
        System.out.println("Descr. Abreviada: " + this.getMunicipios(index).getDescricaoAbreviada());
        System.out.println("Descr. Completa.: " + this.getMunicipios(index).getDescricaoCompleta());
        System.out.println("------------------");
    }
}
