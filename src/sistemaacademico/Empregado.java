package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Empregado
* Objetivo...: Representar um(a) empregado(a) qualquer de uma instituição de ensino.
* Observacoes:
*/
public abstract class Empregado extends Pessoa {
    long                            matricula;
    int                             regimeEmprego;
    int                             regimeRemuneracao;
    
    //
    // Normalmente um empregado está "lotado" num centro centro de custo, unidade
    // e departamento...
    // Exemplo:     centro de custo : UFG - Câmpus I (Praça Universitária) 
    //              unidade:        Escola de Engenharia 
    //              departamento:   Engenharia da Computação
    //
    int                             centroCusto;
    int                             unidade;
    int                             departamento; 

    double                          cargaHorariaDiaria;     // Máximo de 10h
    double                          cargaHorariaSemanal;    // Máximo de 44h
    double                          cargaHorariaQuinzenal;  // Máximo de 100h
    double                          cargaHorariaMensal;     // Máximo de 250h

    double                          remuneracaoBasica;          // Todos podem ser 0 (zero)
    double                          remuneracaoComplementar;    // ou mais...
    double                          remuneracaoAdicional;
    double                          remuneracaoGratificada;
    
    int                             titulacaoMaxima;        // Código da titulação
   
    
}
