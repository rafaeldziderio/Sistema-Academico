package sistemaacademico;

//import java.util.ArrayList;

public class DocumentoIdentificacao {
   
	
    private String                  tipo1;
    private long                    numero;
    private String                  complemento;
    private int tipo;
    private String                  orgaoExpedidor;
    private int                     pais;
    //Isso para ter acesso ao Arraylist criado de tipos
    
    public DocumentoIdentificacao() {
    	
    }
    
    public DocumentoIdentificacao(int tipo, long numero, String complemento, String orgaoExpedidor, int pais) {
    	TiposDocumentos Tipo = new TiposDocumentos();
    	setTipo1(Tipo.tipoD(tipo));
    	this.numero = numero;
    	this.complemento = complemento;
    	this.orgaoExpedidor = orgaoExpedidor;
    	this.pais = pais;
    	this.tipo=tipo;
    }

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
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
	
    public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return ("Tipo: " + getTipo1() + ";\nNumero: " + getNumero() + ";\nComplemento: " + getComplemento() 
				+ ";\nOrgao Expedidor: " + getOrgaoExpedidor() + ";\nPais: " + getPais() + ";");
	}

	
    
}
