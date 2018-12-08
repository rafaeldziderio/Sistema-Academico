package sistemaacademico;

import java.util.Date;

public abstract class Pessoa {
    DocumentoIdentificacao documento;              
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
	
	public abstract void cadastrar();
    public abstract void alterar(DocumentoIdentificacao documento);
    public abstract void excluir(DocumentoIdentificacao documento);
    public abstract Pessoa consultar(DocumentoIdentificacao documento);
}
