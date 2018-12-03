
package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Endereço
* Objetivo...: Representar um endereço de um logradouro qualquer.
* Observacoes:
*/
public class Endereco {
    int                             tipoLogradouro;         
    int                             codigoLogradouro;       // É o CEP do logradouro
    String                          descricaoLogradouro;
    String                          complementoLogradouro;  // Por exemplo: esquina com Rua 26.
    int                             numero;                 // 0 quando inexistente
    String                          quadra;                 
    String                          lote;                         
    String                          bairro;
    long                            municipio;
    int                             unidadeFederacao;
    int                             pais;
    String                          referencia;             // Ponto de referência do endereço.
}


