package sistemaacademico;

import java.util.ArrayList;

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
    TiposDocumentos Tipo = new TiposDocumentos(); //Isso para ter acesso ao Arraylist criado de tipos
    
    public DocumentoIdentificacao(int tipo, long numero, String complemento, String orgaoExpedidor, int pais) {
    	this.tipo = tipo;
    	this.numero = numero;
    	this.complemento = complemento;
    	this.orgaoExpedidor = orgaoExpedidor;
    	this.pais = pais;
    }

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}
    
	@Override
	public String toString() {
		return ("Tipo: " + getTipo() + ";\nNumero: " + getNumero() + ";\nComplemento: " + getComplemento() 
				+ ";\nOrgao Expedidor: " + getOrgaoExpedidor() + ";\nPais: " + getPais() + ";");
	}
    
}
