package sistemaacademico;

import java.util.Date;

public abstract class Pessoa {
    DocumentoIdentificacao documento;  
    TiposLogradouros tipo = new TiposLogradouros();
	Municipios municipioO = new Municipios();
   
   
    
	private String prenome;                // Exemplo: Maria Luiza
    private String sobrenome;              // da Silva Ferreira Prado
    private Date dataNascimento;
    private String municipioNascimento;    // Código do munícipio
    private String ufNascimento;
    private String paisNascimento;
    private int estadoCivil;            // Código do estado civil
    private Endereco endereco;
    private Telefone telefoneResidencial;
    private Telefone telefoneComercial;
    private Telefone telefoneAlternativo;
    private Email emailPessoal;           // e-mails podem ser deixados em branco
    private Email emailComercial;
    private Email emailAlternativo;
    private int uf;
    
    
    
    
	public int getUf() {
		return uf;
	}
	public void setUf(int uf) {
		this.uf = uf;
	}
	public String getPrenome() {
		return prenome;
	}
	public void setPrenome(String prenome) {
		this.prenome = prenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getMunicipioNascimento() {
		return municipioNascimento;
	}
	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}
	public String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public String getPaisNascimento() {
		return paisNascimento;
	}
	public void setPaisNascimento(String paisNascimento) {
		this.paisNascimento = paisNascimento;
	}
	
	public int getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public DocumentoIdentificacao getDocumento(){
		return documento;
	}
	public void setDocumento(int tipo, long numero, String complemento, String orgaoExpedidor, int pais) {
		this.documento = new DocumentoIdentificacao(tipo, numero, complemento, orgaoExpedidor, pais);
	}
	public String getEndereco() {
		return endereco.toString();
	}
	public void setEndereco(int tipoLogradouro, int codigoLogradouro, String descricaoLogradouro, String complementoLogradouro,
			int numero, String quadra, String lote, String bairro, long municipio, int unidadeFederacao, String pais,
			String referencia) {
		this.endereco = new Endereco(tipoLogradouro, codigoLogradouro, descricaoLogradouro, complementoLogradouro, numero, 
				quadra, lote, bairro, municipio, unidadeFederacao, pais, referencia);
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial.toString();
	}
	public String getTelefoneComercial() {
		return telefoneComercial.toString();
	}
	public String getTelefoneAlternativo() {
		return telefoneAlternativo.toString();
	}
	public void setTelefoneResidencial(int tipo, int classe, int ddi, int ddd, long numero, int ramal) {
		this.telefoneResidencial = new Telefone(tipo, classe, ddi, ddd, numero, ramal);
	}
	public void setTelefoneComercial(int tipo, int classe, int ddi, int ddd, long numero, int ramal) {
		this.telefoneComercial = new Telefone(tipo, classe, ddi, ddd, numero, ramal);
	}
	public void setTelefoneAlternativo(int tipo, int classe, int ddi, int ddd, long numero, int ramal) {
		this.telefoneAlternativo = new Telefone(tipo, classe, ddi, ddd, numero, ramal);
	}
	public String getEmailPessoal() {
		return emailPessoal.toString();
	}
	public Email getEmail() {
		return emailPessoal;
	}
	public void setEmailPessoal(String prefixo, String sufixo) {
		this.emailPessoal = new Email(prefixo, sufixo);
	}
	public String getEmailComercial() {
		return emailComercial.toString();
	}
	public void setEmailComercial(String prefixo, String sufixo) {
		this.emailComercial = new Email(prefixo, sufixo);
	}
	public String getEmailAlternativo() {
		return emailAlternativo.toString();
	}
	public void setEmailAlternativo(String prefixo, String sufixo) {
		this.emailAlternativo = new Email(prefixo, sufixo);
	}
	public int getTipoLogradouro() {
		return endereco.getTipoLogradouro();
	}


	public void setTipoLogradouro(int tipoLogradouro) {
		endereco.setTipoLogradouro(tipoLogradouro);
	}


	public int getCodigoLogradouro() {
		return endereco.getCodigoLogradouro();
	}


	public void setCodigoLogradouro(int codigoLogradouro) {
		endereco.setCodigoLogradouro(codigoLogradouro);
	}


	public String getDescricaoLogradouro() {
		return endereco.getDescricaoLogradouro();
	}


	public void setDescricaoLogradouro(String descricaoLogradouro) {
		endereco.setDescricaoLogradouro(descricaoLogradouro);
	}


	public String getComplementoLogradouro() {
		return endereco.getComplementoLogradouro();
	}


	public void setComplementoLogradouro(String complementoLogradouro) {
		endereco.setComplementoLogradouro(complementoLogradouro);
	}


	public int getNumero() {
		return endereco.getNumero();
	}


	public void setNumero(int numero) {
		endereco.setNumero(numero);
	}


	public String getQuadra() {
		return endereco.getQuadra();
	}


	public void setQuadra(String quadra) {
		endereco.setQuadra(quadra);
	}


	public String getLote() {
		return endereco.getBairro();
	}


	public void setLote(String lote) {
		endereco.setLote(lote);
	}


	public String getBairro() {
		return endereco.getBairro();
	}


	public void setBairro(String bairro) {
		endereco.setBairro(bairro);
	}


	public long getMunicipio() {
		return endereco.getMunicipio();
	}


	public void setMunicipio(long municipio) {
		endereco.setMunicipio(municipio);
	}


	public int getUnidadeFederacao() {
		return endereco.getUnidadeFederacao();
	}


	public void setUnidadeFederacao(int unidadeFederacao) {
		endereco.setUnidadeFederacao(unidadeFederacao);
	}


	public String getPais() {
		return endereco.getPais();
	}


	public void setPais(String pais) {
		endereco.setPais(pais);
	}


	public String getReferencia() {
		return endereco.getReferencia();
	}


	public void setReferencia(String referencia) {
		endereco.setReferencia(referencia);
	}


	public String getTipoL() {
		return endereco.getTipoL();
	}


	public void setTipoL(int tipoLogradouro) {
		
		endereco.setTipoL(tipoLogradouro);
	}


	public String getM() {
		return endereco.getM();
	}


	public void setM(String m) {
		 endereco.setM(m);
	}


	public String getEstado() {
		return endereco.getEstado();
	}


	public void setEstado(String estado) {
		endereco.setEstado(estado);
	}
	
	public abstract void cadastrar();
    public abstract void alterar(DocumentoIdentificacao documento);
    public abstract void excluir(DocumentoIdentificacao documento);
    public abstract void consultar(DocumentoIdentificacao documento);
}

