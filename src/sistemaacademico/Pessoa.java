package sistemaacademico;

import java.util.Date;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Pessoa
* Objetivo...: Representar uma pessoa qualquer.
* Observacoes: Exige-se que a pessoa tenha um identificador único, ou seja, 
*              duas pessoas não podem ter o mesmo tipo e número de identificador
*              
*/
public abstract class Pessoa {
    DocumentoIdentificacao          documento;              
    private String                  prenome;                // Exemplo: Maria Luiza
    private String                  sobrenome;              // da Silva Ferreira Prado
    
    private Date                    dataNascimento;
    private long                    municipioNascimento;    // Código do município
    private int                     ufNascimento;
    private int                     paisNascimento;
    
    private int                     estadoCivil;            // Código do estado civil
    private Endereco                endereco;
    private Telefone                telefoneResidencial;
    private Telefone                telefoneComercial;
    private Telefone                telefoneAlternativo;
    private Email                   emailPessoal;           // e-mails podem ser deixados em branco
    private Email                   emailComercial;
    private Email                   emailAlternativo;
    
    public abstract void cadastrar();
    public abstract void alterar(DocumentoIdentificacao documento);
    public abstract void excluir(DocumentoIdentificacao documento);
    public abstract Pessoa consultar(DocumentoIdentificacao documento);
}
