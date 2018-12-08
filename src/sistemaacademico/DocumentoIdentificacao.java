package sistemaacademico;

public class DocumentoIdentificacao {
    /*
    * tipo                          <veja tipos de documentos >
    * numero                        1 .. 
    * complemento                   complemento do número (por exemplo, letras)
    * orgaoExpedidor                orgÃ£o que expediu o documento
    * pais                          código do país emissor do documento
    */
    private int                     tipo;
    private long                    numero;
    private String                  complemento;
    private String                  orgaoExpedidor;
    private int                     pais;
}
