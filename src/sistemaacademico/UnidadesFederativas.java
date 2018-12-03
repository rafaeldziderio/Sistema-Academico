package sistemaacademico;
import java.util.ArrayList;
public class  UnidadesFederativas {
    private ArrayList<ElementoDescritivo>           ufs;
        
    public UnidadesFederativas() {
        ElementoDescritivo  elementoDescritivo;
        
        this.ufs            = new ArrayList();
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "AC", "Acre");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "AL", "Alagoas");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "AM", "Amazonas");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "AP", "Amapá");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "BA", "Bahia");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(6, "CE", "Ceará");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(7, "DF", "Distrito Federal");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(8, "ES", "Espírito Santo");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(9, "GO", "Goiás");
        this.ufs.add(elementoDescritivo);     
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(10, "MA", "Santa Catarina");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(11, "MG", "Minas Gerais");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(12, "MS", "Mato Grosso do Sul");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(13, "MT", "Mato Grosso");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(14, "PA", "Pará");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(15, "PB", "Paraíba");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(16, "PE", "Pernambuto");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(17, "PI", "Piauí");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(18, "PR", "Paraná");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(19, "RJ", "Rio de Janeiro");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(20, "RN", "Rio Grande do Norte");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(21, "RO", "Rondônia");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(22, "RR", "Roraima");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(23, "RS", "Rio Grande do Sul");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(24, "SC", "Santa Catarina");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(25, "SE", "Sergipe");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(26, "SP", "São Paulo");
        this.ufs.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(27, "TO", "Tocantins");
        this.ufs.add(elementoDescritivo);         
    }
    /**
     * @return A coleção das siglas das unidades da federação brasileira.
     */
    public ArrayList<ElementoDescritivo> getUfs() {
        return (this.ufs);
    }
    /**
     *
     * @param index Índice, na coleção de unidades da federação, que se deseja recuperar.
     * @return A UF desejada ou, se inexistente, um elemento vazio.
     */
    public ElementoDescritivo getUfs(int index) {
        if ((index >= 0) && (index < ufs.size())) {
            return (this.ufs.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
    /**
     * 
     * @param str Sigla da unidade da federação a ser localizada na coleção de UFs.
     * @return O índice, na coleção de UFs, onde está localizada a unidade 
     *         desejada ou -1 se inexistente.
     */
    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.ufs.size()); i++) {
            if (this.ufs.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
    /**
     * @return Tamanho da coleção de unidades federativas.
    */
    public int size() {
        return(this.ufs.size());
    }
    /**
     * 
     * @param index Índice da uniade federativa desejado para exibição.
     */    
    public void show(int index) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("Unidade Federativa");
        System.out.println("------------------");
        System.out.println("Código..........: " + this.getUfs(index).getCodigo());
        System.out.println("Descr. Abreviada: " + this.getUfs(index).getDescricaoAbreviada());
        System.out.println("Descr. Completa.: " + this.getUfs(index).getDescricaoCompleta());
        System.out.println("------------------");
    }
}
