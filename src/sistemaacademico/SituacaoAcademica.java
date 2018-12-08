package sistemaacademico;

import java.util.ArrayList;


public class SituacaoAcademica {
    private final int NUMERO_SITUACAO_ACADEMICA = 10;
    private ArrayList <ElementoDescritivo> situacaoAcademica;

    public SituacaoAcademica() {
        ElementoDescritivo  elementoDescritivo;
        
        this.situacaoAcademica           = new ArrayList<ElementoDescritivo>();
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecida");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "MAT", "Matriculado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "SUP", "Suspenso");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "TRC", "Trancado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "CAN", "Cancelado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "ABN", "Abandono");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(6, "JUB", "Jubilado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(7, "FRM", "Formado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(8, "JUD", "Judicializado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(9, "FAL", "Falecido");
        this.situacaoAcademica.add(elementoDescritivo);     
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(10, "OUT", "Outra");
        this.situacaoAcademica.add(elementoDescritivo); 
             
    }
   
    public ArrayList<ElementoDescritivo> getUfs() {
        return (this.situacaoAcademica);
    }

    public ElementoDescritivo getSituacaoAcademica(int index) {
        if ((index >= 0) && (index < situacaoAcademica.size())) {
            return (this.situacaoAcademica.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
  
    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.situacaoAcademica.size()); i++) {
            if (this.situacaoAcademica.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
   
    public int size() {
        return(this.situacaoAcademica.size());
    }
   
    public void show(int index) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("Situacao Acadêmica");
        System.out.println("------------------");
        System.out.println("Código..........: " + this.getSituacaoAcademica(index).getCodigo());
        System.out.println("Descr. Abreviada: " + this.getSituacaoAcademica(index).getDescricaoAbreviada());
        System.out.println("Descr. Completa.: " + this.getSituacaoAcademica(index).getDescricaoCompleta());
        System.out.println("------------------");
    }
}

