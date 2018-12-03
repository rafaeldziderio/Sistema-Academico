package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: DocumentoIdentificacao
* Objetivo...: Representa um documento de identificação de uma Pessoa
* Observacoes:
*/
public class DocumentoIdentificacao {
    /*
    * tipo                          <veja tipos de documentos possíveis>
    * numero                        1 .. 
    * complemento                   complemento do número (por exemplo, letras)
    * orgaoExpedidor                orgão que expediu o documento
    * pais                          código do país emissor do documento
    */
    private int                     tipo;
    private long                    numero;
    private String                  complemento;
    private String                  orgaoExpedidor;
    private int                     pais;
}
