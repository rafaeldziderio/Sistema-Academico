package sistemaacademico;

import java.util.ArrayList;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: SituacaoDisciplina
* Objetivo...: Representa as possíveis situações em que uma disciplina pode estar.
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class SituacaoDisciplina{
    private final int                           NUMERO_SITUACAO_DISCIPLINA = 5;
    private ArrayList <ElementoDescritivo>      situacaoDisciplina;
    /**
     * Implementar de maneira semelhante à UnidadeFederativa.
     * 
   Cod. Descrição Comp.   Descrição Abreviada
    00 - Desconhecida       DS
    01 - Aberta             ABR          (ou seja, com matrícula aberta para ela)
    02 - Ativa              ATV          (em funcionamento, mas não permite matrículas)
    03 - Inativa            INT          (não permite matricula)
    04 - Concluída          CON          (disciplina já ofertada e encerrada)
    05 - Outra              OUT          
   * 
   */
    
}
    