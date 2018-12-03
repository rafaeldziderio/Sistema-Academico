package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Docente
* Objetivo...: Representar um(a) docente que exerce a função de coordenação 
*              (ou vice-coordenação) de um curso.
* Observacoes:
*/
public class Coordenador extends Docente {
    int                             classeCoordenacao;
    double                          cargaDiaria;        // Máxima de 10h
    double                          cargaSemanal;       // Máxima de 44h
    double                          cargaQuinzenal;     // Máxima de 100h
    double                          cargaMensal;        // Máxima de 250h
}