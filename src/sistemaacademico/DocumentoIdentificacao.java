package sistemaacademico;

public class DocumentoIdentificacao {
    /*
    * tipo                          <veja tipos de documentos >
    * numero                        1 .. 
    * complemento                   complemento do n�mero (por exemplo, letras)
    * orgaoExpedidor                orgão que expediu o documento
    * pais                          c�digo do pa�s emissor do documento
    */
    private int                     tipo;
    private long                    numero;
    private String                  complemento;
    private String                  orgaoExpedidor;
    private int                     pais;
}
