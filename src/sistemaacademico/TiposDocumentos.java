package sistemaacademico;
import java.util.ArrayList;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: TiposDocumentos
* Objetivo...: Representa os possíveis tipos de documentos que uma pessoa pode
*              ter para identificar-se
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class TiposDocumentos {
    private ArrayList<ElementoDescritivo>           tiposDocumentos;
    
    public TiposDocumentos() {
        ElementoDescritivo  elementoDescritivo;
        
        tiposDocumentos     = new ArrayList();
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
    
    /**
     * @return A coleção de tipos de documentos.
     */
    public ArrayList<ElementoDescritivo> getTiposDocumentos() {
        return (this.tiposDocumentos);
    }
    /**
     *
     * @param index Índice, na coleção de tipos de documentos, que se deseja recuperar.
     * @return O tipo de documento desejado ou, se inexistente, um elemento vazio.
     */
    public ElementoDescritivo getTipoDocumento(int index) {
        if ((index >= 0) && (index < this.tiposDocumentos.size())) {
            return (this.tiposDocumentos.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
    /**
     * 
     * @param str A descricao abreviada do tipo de documento a localizado na 
     *            coleção de tipos de documentos.
     * @return O índice, na coleção de tipos de documentos, onde está localizado
     *         o tipo de documento desejado ou -1 se inexistente.
     */
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
