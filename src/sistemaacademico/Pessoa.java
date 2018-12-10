package sistemaacademico;

import java.util.Date;

public abstract class Pessoa {
    DocumentoIdentificacao documento;  
    
    public Pessoa() {
    	
    }
    public Pessoa(DocumentoIdentificacao documento, String prenome, String sobrenome) 
    {
		this.documento = documento;
		this.prenome = prenome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.municipioNascimento = municipioNascimento;
		this.ufNascimento = ufNascimento;
		this.paisNascimento = paisNascimento;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneComercial = telefoneComercial;
		this.telefoneAlternativo = telefoneAlternativo;
		this.emailPessoal = emailPessoal;
		this.emailComercial = emailComercial;
		this.emailAlternativo = emailAlternativo;
	}
    
	private String prenome;                // Exemplo: Maria Luiza
    private String sobrenome;              // da Silva Ferreira Prado
    private Date dataNascimento;
    private long municipioNascimento;    // Código do munícipio
    private int ufNascimento;
    private int paisNascimento;
    private int estadoCivil;            // Código do estado civil
    private Endereco endereco;
    private Telefone telefoneResidencial;
    private Telefone telefoneComercial;
    private Telefone telefoneAlternativo;
    private Email emailPessoal;           // e-mails podem ser deixados em branco
    private Email emailComercial;
    private Email emailAlternativo;
    
    
    
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
	public long getMunicipioNascimento() {
		return municipioNascimento;
	}
	public void setMunicipioNascimento(long municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}
	public int getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(int ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public int getPaisNascimento() {
		return paisNascimento;
	}
	public void setPaisNascimento(int paisNascimento) {
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
			int numero, String quadra, String lote, String bairro, long municipio, int unidadeFederacao, int pais,
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
	public void setTelefoneResidencial(int tipo, int classe, int ddi, int ddd, int numero, int ramal) {
		this.telefoneResidencial = new Telefone(tipo, classe, ddi, ddd, numero, ramal);
	}
	public void setTelefoneComercial(int tipo, int classe, int ddi, int ddd, int numero, int ramal) {
		this.telefoneComercial = new Telefone(tipo, classe, ddi, ddd, numero, ramal);
	}
	public void setTelefoneAlternativo(int tipo, int classe, int ddi, int ddd, int numero, int ramal) {
		this.telefoneAlternativo = new Telefone(tipo, classe, ddi, ddd, numero, ramal);
	}
	public String getEmailPessoal() {
		return emailPessoal.toString();
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
	
	public abstract void cadastrar();
    public abstract void alterar(DocumentoIdentificacao documento);
    public abstract void excluir(DocumentoIdentificacao documento);
    public abstract Pessoa consultar(DocumentoIdentificacao documento);
}
